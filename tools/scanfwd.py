#!/usr/bin/env python3
"""Parse codeat full-dump (/tmp/all.txt): per class, synthetic long-named
methods (kept-name forwarders) plus the same-class methods they call.
Usage: python3 tools/scanfwd.py [/tmp/all.txt]"""
import re
import sys
import io

path = sys.argv[1] if len(sys.argv) > 1 else "/tmp/all.txt"
cls, cur = None, None
fwd = {}
for ln in io.open(path, encoding="utf-8"):
    m = re.match(r"## (\S+) ", ln)
    if m:
        cls = m.group(1)
        cur = None
        continue
    m = re.match(r"   M (1[0-9A-F]{3}) (\S+) (\S+)", ln)
    if m and len(m.group(2)) > 1 and not m.group(2).startswith("lambda"):
        cur = (m.group(2), m.group(3))
        fwd.setdefault(cls, []).append([m.group(1), m.group(2), m.group(3), []])
        continue
    if ln.startswith("   M ") or ln.startswith("## "):
        cur = None
        continue
    if cur is not None:
        m2 = re.match(r"     call-\w+ (\S+)\.(\S+) (\S+)", ln)
        if m2 and m2.group(1) == cls:
            fwd[cls][-1][3].append((m2.group(2), m2.group(3)))
for c, ms in fwd.items():
    print("###", c)
    for acc, nm, desc, calls in ms:
        print("   %s %s %s -> %s" % (acc, nm, desc, calls if calls else "?"))
