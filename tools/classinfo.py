#!/usr/bin/env python3
"""Minimal Java .class parser: superclass, interfaces, methods, fields, strings.
Used to recover structure of classes that failed decompilation."""
import struct
import sys
import zipfile


def parse_class(data: bytes):
    assert data[:4] == b"\xca\xfe\xba\xbe", "not a class file"
    cp_count = struct.unpack(">H", data[8:10])[0]
    cp = [None] * cp_count
    i = 10
    idx = 1
    while idx < cp_count:
        tag = data[i]
        i += 1
        if tag == 1:  # Utf8
            ln = struct.unpack(">H", data[i:i + 2])[0]
            i += 2
            cp[idx] = ("Utf8", data[i:i + ln].decode("utf-8", errors="replace"))
            i += ln
        elif tag in (3, 4):  # int/float
            cp[idx] = ("num", struct.unpack(">i", data[i:i + 4])[0])
            i += 4
        elif tag in (5, 6):  # long/double (take two slots)
            cp[idx] = ("num64", struct.unpack(">q", data[i:i + 8])[0])
            i += 8
            idx += 1  # skip unusable second slot
        elif tag == 7:  # Class
            cp[idx] = ("Class", struct.unpack(">H", data[i:i + 2])[0])
            i += 2
        elif tag == 8:  # String
            cp[idx] = ("String", struct.unpack(">H", data[i:i + 2])[0])
            i += 2
        elif tag in (9, 10, 11):  # Field/Method/InterfaceMethod ref
            cp[idx] = ("Ref", struct.unpack(">HH", data[i:i + 4]))
            i += 4
        elif tag == 12:  # NameAndType
            cp[idx] = ("NT", struct.unpack(">HH", data[i:i + 4]))
            i += 4
        elif tag == 15:  # MethodHandle
            i += 3
            cp[idx] = ("MH", None)
        elif tag == 16:  # MethodType
            i += 2
            cp[idx] = ("MT", None)
        elif tag in (17, 18):  # Dynamic/InvokeDynamic
            i += 4
            cp[idx] = ("Dyn", None)
        elif tag in (19, 20):  # Module/Package
            i += 2
            cp[idx] = ("Mod", None)
        else:
            raise ValueError(f"unknown cp tag {tag} at index {idx}")
        idx += 1

    def utf8(x):
        e = cp[x]
        return e[1] if e and e[0] == "Utf8" else f"<{e}>"

    def clsname(x):
        e = cp[x]
        if e and e[0] == "Class":
            return utf8(e[1])
        return f"<{e}>"

    access = struct.unpack(">H", data[i:i + 2])[0]
    i += 2
    this = clsname(struct.unpack(">H", data[i:i + 2])[0])
    i += 2
    sup = struct.unpack(">H", data[i:i + 2])[0]
    i += 2
    supername = clsname(sup) if sup else None
    n_if = struct.unpack(">H", data[i:i + 2])[0]
    i += 2
    ifs = []
    for _ in range(n_if):
        ifs.append(clsname(struct.unpack(">H", data[i:i + 2])[0]))
        i += 2

    def read_attrs(i, n):
        out = {}
        for _ in range(n):
            name = utf8(struct.unpack(">H", data[i:i + 2])[0])
            i += 2
            ln = struct.unpack(">i", data[i:i + 4])[0]
            i += 4
            out[name] = data[i:i + ln]
            i += ln
        return i, out

    n_fields = struct.unpack(">H", data[i:i + 2])[0]
    i += 2
    fields = []
    for _ in range(n_fields):
        acc = struct.unpack(">H", data[i:i + 2])[0]
        ni = struct.unpack(">H", data[i + 2:i + 4])[0]
        di = struct.unpack(">H", data[i + 4:i + 6])[0]
        na = struct.unpack(">H", data[i + 6:i + 8])[0]
        i += 8
        fields.append((f"{acc:04x}", utf8(ni), utf8(di)))
        i, _ = read_attrs(i, na)

    n_methods = struct.unpack(">H", data[i:i + 2])[0]
    i += 2
    methods = []
    for _ in range(n_methods):
        acc = struct.unpack(">H", data[i:i + 2])[0]
        ni = struct.unpack(">H", data[i + 2:i + 4])[0]
        di = struct.unpack(">H", data[i + 4:i + 6])[0]
        na = struct.unpack(">H", data[i + 6:i + 8])[0]
        i += 8
        methods.append((f"{acc:04x}", utf8(ni), utf8(di)))
        i, _ = read_attrs(i, na)

    na = struct.unpack(">H", data[i:i + 2])[0]
    i += 2
    _, attrs = read_attrs(i, na)
    sig = None
    if "Signature" in attrs:
        raw = attrs["Signature"]
        sig_idx = struct.unpack(">H", raw[:2])[0]
        sig = utf8(sig_idx)

    strings = []
    for k in range(1, cp_count):
        e = cp[k]
        if e and e[0] == "String":
            strings.append(utf8(e[1]))
    strings = sorted(set(strings))
    refs = set()
    for k in range(1, cp_count):
        e = cp[k]
        if e and e[0] == "Ref":
            refs.add(clsname(e[1][0]))
    return {
        "class": this, "access": f"{access:04x}", "super": supername,
        "interfaces": ifs, "fields": fields, "methods": methods,
        "strings": strings, "refs": sorted(refs), "signature": sig,
    }


def show(path, data):
    r = parse_class(data)
    print("=" * 100)
    print(path)
    print("  class:", r["class"], " access:", r["access"])
    print("  super:", r["super"])
    print("  signature:", r["signature"])
    print("  interfaces:", r["interfaces"])
    print("  fields:")
    for f in r["fields"]:
        print("   ", f)
    print("  methods:")
    for m in r["methods"]:
        print("   ", m)
    print("  strings:")
    for s in r["strings"]:
        print("   ", repr(s))


if __name__ == "__main__":
    jar = sys.argv[1]
    prefix = sys.argv[2] if len(sys.argv) > 2 else ""
    only = sys.argv[3].split(",") if len(sys.argv) > 3 else None
    z = zipfile.ZipFile(jar)
    for n in sorted(z.namelist()):
        if not n.endswith(".class") or not n.startswith(prefix):
            continue
        if only and not any(o in n for o in only):
            continue
        if "$" in n:
            continue
        try:
            show(n, z.read(n))
        except Exception as e:
            print("FAIL", n, e)
