#!/usr/bin/env python3
"""Minimal bytecode fingerprints: per-method invokes/ldcs/field-refs/news.

Usage: python3 tools/codeat.py <jar> <classA> [<classB> ...]
  classes in slash form without .class suffix.
Unknown opcodes abort the method loudly (then extend OPC below).
"""
import struct
import sys
import zipfile

# opcode -> operand bytes (excluding tableswitch/lookupswitch/wide: -1)
OPC = {}
for _op in (
    list(range(0x00, 0x10)) + list(range(0x1A, 0x36)) + list(range(0x3B, 0x4F))
    + list(range(0x4F, 0x57)) + list(range(0x57, 0x60)) + list(range(0x60, 0x84)) + list(range(0x85, 0x94))
    + [0x94, 0x95, 0x96, 0x97, 0x98, 0x99, 0x9A, 0x9B, 0x9C, 0x9D, 0x9E, 0x9F,
       0xA0, 0xA1, 0xA2, 0xA3, 0xA4, 0xA5, 0xA6]
    + [0xAC, 0xAD, 0xAE, 0xAF, 0xB0, 0xB1, 0xBE, 0xBF, 0xC2, 0xC3, 0xC6, 0xC7]
):
    OPC[_op] = 0
for _op in [0x10, 0x12, 0x15, 0x16, 0x17, 0x18, 0x19, 0x36, 0x37, 0x38, 0x39,
            0x3A, 0xA9, 0xBC]:
    OPC[_op] = 1
for _op in [0x11, 0x13, 0x14, 0xA0 - 0x100, 0x99, 0x9A, 0x9B, 0x9C, 0x9D, 0x9E,
            0x9F, 0xA0, 0xA1, 0xA2, 0xA3, 0xA4, 0xA5, 0xA6, 0xA7, 0xA8, 0xB2,
            0xB3, 0xB4, 0xB5, 0xB6, 0xB7, 0xB8, 0xB9, 0xBB, 0xBD, 0xC0, 0xC1, 0xC6, 0xC7,
            0xC5]:
    OPC[_op] = 2
OPC[0x84] = 2  # iinc
OPC[0xC5] = 3  # multianewarray
OPC[0xBA] = 4  # invokedynamic
OPC[0xC8] = 4  # goto_w
OPC[0xC9] = 4  # jsr_w
OPC[0xAA] = -1  # tableswitch
OPC[0xAB] = -1  # lookupswitch
OPC[0xC4] = -1  # wide
OPC[0xB9] = 4  # invokeinterface (idx, count, zero)

INV = {0xB6: "virt", 0xB7: "special", 0xB8: "static", 0xB9: "iface", 0xBA: "indy"}
FLD = {0xB2: "getS", 0xB3: "putS", 0xB4: "getF", 0xB5: "putF"}


def parse_cp(data, n):
    cp = [None]
    o = 0
    i = 1
    while i < n:
        tag = data[o]
        o += 1
        if tag == 1:
            ln = struct.unpack(">H", data[o:o + 2])[0]
            cp.append(("u", data[o + 2:o + 2 + ln].decode("utf-8", "replace")))
            o += 2 + ln
        elif tag in (3, 4):
            cp.append(("n", struct.unpack(">i", data[o:o + 4])[0]))
            o += 4
        elif tag in (5, 6):
            cp.append(("n", struct.unpack(">q", data[o:o + 8])[0]))
            o += 8
            cp.append(None)
            i += 1  # long/double consume two pool slots
        elif tag in (7, 8, 16, 19, 20):
            cp.append(("i", struct.unpack(">H", data[o:o + 2])[0]))
            o += 2
        elif tag in (9, 10, 11, 12, 17, 18):
            a, b = struct.unpack(">HH", data[o:o + 4])
            cp.append(("ii", a, b))
            o += 4
        elif tag == 15:
            cp.append(("mh", data[o], struct.unpack(">H", data[o + 1:o + 3])[0]))
            o += 3
        else:
            raise ValueError("cp tag %d at %d" % (tag, o - 1))
        i += 1
    return cp, o


def u8(cp, i):
    e = cp[i]
    return e[1] if e[0] == "u" else "?"


def cls(cp, i):
    e = cp[i]
    return u8(cp, e[1]) if e[0] == "i" else "?"


def ref(cp, i):
    e = cp[i]
    if e[0] != "ii":
        return ("?", "?", "?")
    owner = cls(cp, e[1])
    nat = cp[e[2]]
    if nat[0] == "ii":
        return (owner, u8(cp, nat[1]), u8(cp, nat[2]))
    return (owner, "?", "?")


def walk(code, cp):
    out = []
    o = 0
    n = len(code)
    while o < n:
        op = code[o]
        if op not in OPC:
            out.append(("ABORT", "unknown opcode 0x%02x at %d" % (op, o)))
            return out
        extra = OPC[op]
        if extra == -1:
            if op == 0xC4:
                wop = code[o + 1]
                extra = 5 if wop == 0x84 else 3
            else:
                pad = (4 - ((o + 1) % 4)) % 4
                p = o + 1 + pad
                if op == 0xAA:
                    lo = struct.unpack(">i", code[p + 4:p + 8])[0]
                    hi = struct.unpack(">i", code[p + 8:p + 12])[0]
                    extra = 1 + pad + 12 + 4 * (hi - lo + 1) - 1
                else:
                    nn = struct.unpack(">i", code[p + 4:p + 8])[0]
                    extra = 1 + pad + 8 + 8 * nn - 1
            out.append(("switch/wide", "op=0x%02x at %d" % (op, o)))
            o += 1 + extra
            continue
        if op in (0x12, 0x13, 0x14):
            idx = code[o + 1] if extra == 1 else struct.unpack(">H", code[o + 1:o + 3])[0]
            e = cp[idx]
            if e[0] == "i":
                out.append(("ldc", repr(u8(cp, e[1]))))
            elif e[0] == "n":
                out.append(("ldc", repr(e[1])))
            elif e[0] == "ii":
                out.append(("ldc", "%s %s %s" % ref(cp, idx)))
            else:
                out.append(("ldc", repr(e)))
        elif op in INV:
            idx = struct.unpack(">H", code[o + 1:o + 3])[0]
            if op == 0xBA:
                nat = cp[cp[idx][2]]
                out.append(("indy", "%s %s" % (u8(cp, nat[1]), u8(cp, nat[2])) if nat[0] == "ii" else "?"))
            else:
                o_, m_, d_ = ref(cp, idx)
                out.append(("call-" + INV[op], "%s.%s %s" % (o_, m_, d_)))
        elif op in FLD:
            idx = struct.unpack(">H", code[o + 1:o + 3])[0]
            o_, m_, d_ = ref(cp, idx)
            out.append(("fld-" + FLD[op], "%s.%s %s" % (o_, m_, d_)))
        elif op in (0xBB, 0xBD, 0xC0, 0xC1):
            idx = struct.unpack(">H", code[o + 1:o + 3])[0]
            out.append(("cls", cls(cp, idx)))
        elif op == 0x10:
            out.append(("push", str(struct.unpack("b", code[o + 1:o + 2])[0])))
        elif op == 0x11:
            out.append(("push", str(struct.unpack(">h", code[o + 1:o + 3])[0])))
        o += 1 + extra
    return out


def dump_class(data):
    cp_n = struct.unpack(">H", data[8:10])[0]
    cp, o = parse_cp(data[10:], cp_n)
    access = struct.unpack(">H", data[10 + o:12 + o])[0]
    this = cls(cp, struct.unpack(">H", data[12 + o:14 + o])[0])
    sup = cls(cp, struct.unpack(">H", data[14 + o:16 + o])[0])
    o += 6
    n_if = struct.unpack(">H", data[10 + o:12 + o])[0]
    o += 2 + 2 * n_if
    n_f = struct.unpack(">H", data[10 + o:12 + o])[0]
    o += 2
    fields = []
    for _ in range(n_f):
        fa, na, de = struct.unpack(">HHH", data[10 + o:16 + o])
        o += 6
        n_a = struct.unpack(">H", data[10 + o:12 + o])[0]
        o += 2
        for _ in range(n_a):
            ln = struct.unpack(">I", data[12 + o:16 + o])[0]
            o += 6 + ln
        fields.append((fa, u8(cp, na), u8(cp, de)))
    n_m = struct.unpack(">H", data[10 + o:12 + o])[0]
    o += 2
    methods = []
    for _ in range(n_m):
        ma, na, de = struct.unpack(">HHH", data[10 + o:16 + o])
        o += 6
        n_a = struct.unpack(">H", data[10 + o:12 + o])[0]
        o += 2
        code = None
        for _ in range(n_a):
            an = u8(cp, struct.unpack(">H", data[10 + o:12 + o])[0])
            ln = struct.unpack(">I", data[12 + o:16 + o])[0]
            if an == "Code":
                cl = struct.unpack(">I", data[20 + o:24 + o])[0]
                code = data[10 + o + 14:10 + o + 14 + cl]
            o += 6 + ln
        methods.append((ma, u8(cp, na), u8(cp, de), code))
    return access, this, sup, fields, methods, cp


BR = set(range(0x99, 0xA9)) | {0xC6, 0xC7}


def disasm(code, cp):
    o, n = 0, len(code)
    while o < n:
        op = code[o]
        ex = OPC.get(op, None)
        if ex is None or ex == -1:
            print("    %3d: OP 0x%02x (special/unknown)" % (o, op))
            return
        info = ""
        if op in BR or op in (0xA7, 0xA8):
            tgt = o + struct.unpack(">h", code[o + 1:o + 3])[0]
            info = "-> %d" % tgt
        elif op in (0xC8, 0xC9):
            tgt = o + struct.unpack(">i", code[o + 1:o + 5])[0]
            info = "-> %d" % tgt
        elif op in INV and op != 0xBA:
            o_, m_, d_ = ref(cp, struct.unpack(">H", code[o + 1:o + 3])[0])
            info = "%s.%s %s" % (o_.split("/")[-1], m_, d_)
        elif op in FLD:
            o_, m_, d_ = ref(cp, struct.unpack(">H", code[o + 1:o + 3])[0])
            info = "%s.%s %s" % (o_.split("/")[-1], m_, d_)
        elif op in (0x12, 0x13, 0x14):
            idx = code[o + 1] if ex == 1 else struct.unpack(">H", code[o + 1:o + 3])[0]
            e = cp[idx]
            info = repr(u8(cp, e[1])) if e[0] == "i" else repr(e)
        elif op in (0xBB, 0xBD, 0xC0, 0xC1):
            info = cls(cp, struct.unpack(">H", code[o + 1:o + 3])[0])
        elif op == 0x10:
            info = str(struct.unpack("b", code[o + 1:o + 2])[0])
        elif op == 0x11:
            info = str(struct.unpack(">h", code[o + 1:o + 3])[0])
        print("    %3d: 0x%02x %s" % (o, op, info))
        o += 1 + ex


def main():
    args = sys.argv[1:]
    dis = False
    if args and args[0] == "--dis":
        dis = True
        args = args[1:]
    z = zipfile.ZipFile(args[0])
    only = args[2] if dis and len(args) > 2 else None
    for cn in args[1:2] if dis else args[1:]:
        data = z.read(cn + ".class")
        access, this, sup, fields, methods, cp = dump_class(data)
        print("## %s access=%04x super=%s" % (cn, access, sup))
        print("   F=" + str([(n, "%04x" % a, d) for a, n, d in fields]))
        for ma, na, de, code in methods:
            tag = " code=%dB" % len(code) if code is not None else " NATIVE/ABSTRACT"
            print("   M %04x %s %s%s" % (ma, na, de, tag))
            if code is None:
                continue
            if dis and (only is None or na != only):
                continue
            if dis:
                print("   DIS %s %s" % (na, de))
                disasm(code, cp)
                continue
            seen = set()
            for kind, val in walk(code, cp):
                key = (kind, val)
                if kind != "ldc" and key in seen:
                    continue
                seen.add(key)
                print("     %s %s" % (kind, val))


if __name__ == "__main__":
    main()
