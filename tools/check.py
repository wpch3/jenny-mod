#!/usr/bin/env python3
"""Verify migrated sources without a Java compiler:
  1. no old-namespace leftovers
  2. hierarchy (extends/implements) matches the jar truth
  3. every referenced new class resolves (import / same package / nested / lang)
  4. brace/paren balance
  5. no missed constructor renames (declaration-shaped OldSimple(...) lines)
Run: python3 tools/check.py
"""
import glob
import os
import re
import sys
import zipfile

sys.path.insert(0, os.path.join(os.path.dirname(os.path.abspath(__file__))))
from classinfo import parse_class  # noqa: E402
from migrate import CLASS_MAP, EXTRA_FQN, DST, JAR, OLD_BASE  # noqa: E402

HAND_WRITTEN = {
    "": ["Sexmod"],
    "client.model": [
        "ModelSource", "AllieModel", "AllieLampModel", "BeeModel", "BiaModel",
        "EllieModel", "GoblinModel", "KoboldModel", "PlayerBeeModel",
        "PlayerBiaModel", "PlayerEllieModel", "PlayerGoblinModel", "BoneGroups",
        "PlayerKoboldModel", "PlayerSlimeModel", "SlimeGirlModel",
    ],
    "client.renderer": ["NpcRenderUtils"],
}

JAVA_LANG = {
    "String", "Object", "Class", "Enum", "Record", "System", "Math", "Override",
    "Integer", "Long", "Float", "Double", "Boolean", "Byte", "Short",
    "Character", "Void", "Thread", "Runnable", "Exception", "RuntimeException", "Throwable", "Error",
    "IllegalStateException", "IllegalArgumentException", "StringBuilder",
    "NumberFormatException", "NullPointerException", "UnsupportedOperationException",
    "IndexOutOfBoundsException", "ArrayIndexOutOfBoundsException", "StringIndexOutOfBoundsException",
    "ClassCastException", "ArithmeticException", "ClassNotFoundException", "InterruptedException",
    "FunctionalInterface", "Deprecated", "SuppressWarnings", "Cloneable",
    "Comparable", "Iterable", "Number",
}

ERRORS = []
WARNS = []


def err(path, kind, msg):
    ERRORS.append(path + ": [" + kind + "] " + msg)


def warn(path, kind, msg):
    WARNS.append(path + ": [" + kind + "] " + msg)


def strip_strings_comments(text):
    out = []
    i, n = 0, len(text)
    while i < n:
        c = text[i]
        if c == '"' and (i == 0 or text[i - 1] != "\\"):
            j = i + 1
            while j < n and not (text[j] == '"' and text[j - 1] != "\\"):
                j += 1
            out.append('""')
            i = j + 1
        elif c == "'" and i + 2 < n and text[i + 2] == "'":
            out.append("''")
            i += 3
        elif c == "/" and i + 1 < n and text[i + 1] == "/":
            j = text.find("\n", i)
            i = n if j < 0 else j
        elif c == "/" and i + 1 < n and text[i + 1] == "*":
            j = text.find("*/", i + 2)
            i = n if j < 0 else j + 2
        else:
            out.append(c)
            i += 1
    return "".join(out)


def new_fqn_pkg(pkg, cls):
    base = OLD_BASE if not pkg else OLD_BASE + "." + pkg
    return base + "." + cls


def old_fqn_of(rel, old_cls):
    pkg = rel.rsplit("/", 1)[0].replace("/", ".") if "/" in rel else ""
    return OLD_BASE + ("." + pkg if pkg else "") + "." + old_cls


def load_jar():
    z = zipfile.ZipFile(JAR)
    info = {}
    for n in z.namelist():
        if n.endswith(".class") and "$" not in n and n.startswith("com/trolmastercard/sexmod/"):
            try:
                r = parse_class(z.read(n))
            except Exception:
                continue
            info[r["class"].replace("/", ".")] = r
    return info


WS = r"\s"
WD = r"\w"
DOT = r"\."


def main():
    new2old = {}
    old2new = {}
    for rel, (oc, np, nc) in list(CLASS_MAP.items()) + list(EXTRA_FQN.items()):
        of = old_fqn_of(rel, oc)
        nf = new_fqn_pkg(np, nc)
        new2old[nf] = of
        old2new[of] = nf
    pkg_classes = {}
    for _rel, (_oc, np, nc) in list(CLASS_MAP.items()):
        pkg_classes.setdefault(np, set()).add(nc)
    for np, names in HAND_WRITTEN.items():
        pkg_classes.setdefault(np, set()).update(names)

    jar = load_jar()
    files = sorted(glob.glob(os.path.join(DST, "**/*.java"), recursive=True))
    print("checking files:", len(files))

    rx_pkg = re.compile(r"^package (" + WD + r"+(?:\." + WD + r"+)*);", re.M)
    rx_decl = re.compile(
        r"^(?:public" + WS + r"+)?(?:final" + WS + r"+)?(?:abstract" + WS + r"+)?"
        r"(class|enum|record|interface)" + WS + r"+(" + WD + r"+)", re.M)
    rx_oldfqn = re.compile(r"com\.trolmastercard\.sexmod\.[a-z]\b|com\.trolmastercard\.sexmod\.Main\b")
    rx_ext = re.compile(r"\bextends" + WS + r"+(" + WD + r"+(?:\." + WD + r"+)*)")
    rx_impl = re.compile(r"\bimplements" + WS + r"+(" + WD + r"+(?:\." + WD + r"+)*(?:<[^;{}]*>)?(?:"
                         + WS + r"*,"
                         + WS + r"*"
                         + WD + r"+(?:\." + WD + r"+)*(?:<[^;{}]*>)?)*)")
    rx_import = re.compile(r"import" + WS + r"+(?:static" + WS + r"+)?(" + WD + r"+(?:\." + WD + r"+)*);")
    rx_nested = re.compile(
        r"^" + WS + r"+(?:public|private|protected|static|final|abstract|" + WS + r")*"
        r"(?:class|enum|record|interface)" + WS + r"+(" + WD + r"+)", re.M)
    rx_cap = re.compile(r"\b([A-Z][" + WD + r"$]*)\b")

    for p in files:
        relp = os.path.relpath(p, DST)
        with open(p, encoding="utf-8") as fh:
            text = fh.read()
        code = strip_strings_comments(text)
        m = rx_pkg.search(text)
        pkg = m.group(1) if m else ""
        if pkg == OLD_BASE:
            pkg_suffix = ""
        elif pkg.startswith(OLD_BASE + "."):
            pkg_suffix = pkg[len(OLD_BASE) + 1:]
        else:
            err(relp, "PKG", "bad package " + pkg)
            continue
        dm = rx_decl.search(text)
        if not dm:
            err(relp, "DECL", "no top-level type declaration")
            continue
        kind, cls = dm.group(1), dm.group(2)

        for om in rx_oldfqn.finditer(code):
            err(relp, "OLD-FQN", om.group(0)[:60])

        if code.count("{") != code.count("}"):
            err(relp, "BRACE", "open=%d close=%d" % (code.count("{"), code.count("}")))
        if code.count("(") != code.count(")"):
            err(relp, "PAREN", "open=%d close=%d" % (code.count("("), code.count(")")))
        if code.count("[") != code.count("]"):
            err(relp, "BRACKET", "mismatch")

        old_simple = None
        for r2, (oc2, np2, nc2) in list(CLASS_MAP.items()):
            if np2 == pkg_suffix and nc2 == cls:
                old_simple = oc2
                break
        nested_early = set(rx_nested.findall(text))
        if old_simple and old_simple != cls and old_simple not in nested_early:
            indent_rx = r" {4}" if old_simple in nested_early else WS + r"*"
            rx_ctor = re.compile(
                r"(?m)^" + indent_rx + r"(?:public|private|protected)?" + WS + r"*" + re.escape(old_simple)
                + WS + r"*\([^;{}]*\)" + WS + r"*(?:throws\b[^{};]*)?\{")
            for mline in rx_ctor.finditer(code):
                err(relp, "MISSED-CTOR", mline.group(0).strip()[:80])

        new_fqn = new_fqn_pkg(pkg_suffix, cls)
        old_fqn = new2old.get(new_fqn)
        if old_fqn and old_fqn in jar:
            r = jar[old_fqn]
            decl_text = text[dm.start():dm.start() + 2000].split("{")[0]
            for rep in range(10):
                no_g = re.sub(r"<[^<>]*>", "", decl_text)
                if no_g == decl_text:
                    break
                decl_text = no_g
            ext = rx_ext.search(decl_text)
            impl = rx_impl.search(decl_text)
            if ext and kind in ("class", "record"):
                sup = ext.group(1).split("<")[0]
                ns = sup if "." in sup else (resolve_simple(text, pkg_suffix, pkg_classes, sup) or sup)
                os_ = new2old.get(ns, ns)
                jar_super = (r["super"] or "").replace("/", ".")
                jar_super_m = old2new.get(jar_super, jar_super)
                if ns.rsplit(".", 1)[-1] != jar_super_m.rsplit(".", 1)[-1]:
                    if not (jar_super == "java.lang.Object"):
                        err(relp, "HIER-EXT", "src=" + ns + " jar=" + jar_super_m)
            if impl and kind in ("class", "record", "enum"):
                for part in impl.group(1).split(","):
                    part = part.strip().split("<")[0].strip()
                    if not part:
                        continue
                    ns = part if "." in part else (resolve_simple(text, pkg_suffix, pkg_classes, part) or part)
                    os_ = new2old.get(ns, ns)
                    jar_ifs = [(x or "").replace("/", ".") for x in r["interfaces"]]
                    jar_ifs_m = [old2new.get(x, x) for x in jar_ifs]
                    if ns.rsplit(".", 1)[-1] not in [x.rsplit(".", 1)[-1] for x in jar_ifs_m]:
                        warn(relp, "HIER-IMPL", "src-if=" + ns + " jar-ifs=" + str(jar_ifs_m))

        imports = {}
        for im in rx_import.finditer(text):
            full = im.group(1)
            imports[full.rsplit(".", 1)[-1]] = full
        nested = set(rx_nested.findall(text))
        same = set(pkg_classes.get(pkg_suffix, set())) | {cls}
        for um in rx_cap.finditer(code):
            name = um.group(1)
            if len(name) == 1:
                continue
            if name in imports or name in same or name in nested or name in JAVA_LANG:
                continue
            start = um.start()
            if start > 0 and code[start - 1] == ".":
                continue
            if re.search(r"\bcase\s+$", code[max(0, start - 8):start]):
                continue  # enum-switch labels need no import
            warn(relp, "UNRESOLVED?", name)

    print("errors: %d  warnings: %d" % (len(ERRORS), len(WARNS)))
    for e in ERRORS[:120]:
        print("E", e)
    if len(ERRORS) > 120:
        print("... and %d more errors" % (len(ERRORS) - 120))
    print("---- warnings (first 60) ----")
    for w in WARNS[:60]:
        print("W", w)


def resolve_simple(text, pkg_suffix, pkg_classes, name):
    rx = re.compile(r"import" + WS + r"+(?:static" + WS + r"+)?(" + WD + r"+(?:\." + WD + r"+)*)\."
                    + re.escape(name) + ";")
    for im in rx.finditer(text):
        return im.group(1) + "." + name
    if name in pkg_classes.get(pkg_suffix, set()):
        base = OLD_BASE if not pkg_suffix else OLD_BASE + "." + pkg_suffix
        return base + "." + name
    return None


if __name__ == "__main__":
    main()
