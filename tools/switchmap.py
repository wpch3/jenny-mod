"""Dump javac switch-map synthetic classes (e.g. c9$a): which enum const -> case int."""
import struct, sys

def parse(path):
    d = open(path, 'rb').read()
    pos = 8; n = struct.unpack('>H', d[pos:pos+2])[0]; pos += 2
    cp = [None]; i = 1
    while i < n:
        t = d[pos]; pos += 1
        if t == 7: cp.append(('C', struct.unpack('>H', d[pos:pos+2])[0])); pos += 2
        elif t in (8, 16, 19, 20): pos += 2; cp.append(None)
        elif t in (3, 4): pos += 4; cp.append(None)
        elif t in (5, 6): pos += 8; cp.append(None); cp.append(None); i += 1
        elif t == 1:
            ln = struct.unpack('>H', d[pos:pos+2])[0]; pos += 2
            cp.append(d[pos:pos+ln].decode('utf8', 'replace')); pos += ln
        elif t in (9, 10, 11, 12, 17, 18):
            a, b = struct.unpack('>HH', d[pos:pos+4]); pos += 4
            cp.append((t, a, b))
        elif t == 15: pos += 3; cp.append(None)
        else: raise Exception('tag %d at #%d' % (t, i))
        i += 1
    pos += 6
    nf = struct.unpack('>H', d[pos:pos+2])[0]; pos += 2
    for _ in range(nf):
        pos += 6
        na = struct.unpack('>H', d[pos:pos+2])[0]; pos += 2
        for _ in range(na):
            pos += 2; ln = struct.unpack('>I', d[pos:pos+4])[0]; pos += 4 + ln
    nm = struct.unpack('>H', d[pos:pos+2])[0]; pos += 2
    for _ in range(nm):
        _, nami, desci = struct.unpack('>HHH', d[pos:pos+6]); pos += 6
        name = cp[nami]
        na = struct.unpack('>H', d[pos:pos+2])[0]; pos += 2
        for _ in range(na):
            an = struct.unpack('>H', d[pos:pos+2])[0]; pos += 2
            ln = struct.unpack('>I', d[pos:pos+4])[0]; pos += 4
            if cp[an] == 'Code' and name == '<clinit>':
                code = d[pos:pos+ln]; p = 8
                pend = None; pendval = None
                while p < len(code):
                    op = code[p]; p += 1
                    if op == 178:
                        idx = struct.unpack('>H', code[p:p+2])[0]; p += 2
                        _, ci, ni = cp[idx]
                        cls = cp[cp[ci][1]] if isinstance(cp[ci], tuple) else '?'
                        fld = cp[cp[ni][0]] if isinstance(cp[ni], tuple) else '?'
                        if cls.endswith('/fp'):
                            pend = fld
                    elif 2 <= op <= 8:
                        pendval = op - 3
                    elif op == 16:
                        pendval = struct.unpack('b', code[p:p+1])[0]; p += 1
                    elif op == 79:
                        if pend is not None:
                            print('map[fp.%s] = %s' % (pend, pendval))
                        pend = None; pendval = None
                    elif op in (21, 22, 23, 24, 25, 54, 55, 56, 57, 58, 169): p += 1
                    elif op in (153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 168, 198, 199): p += 2
                    elif op in (178, 179, 180, 181, 182, 183, 184, 185, 187): p += 2
                    elif op in (17, 18): p += 2
                    elif op in (19, 20): p += 3
                    elif op == 197: p += 3
                    elif op in (26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 75, 76, 77, 78, 87, 89, 96, 100, 104, 108, 112, 126, 177, 191): pass
            pos += ln

if __name__ == '__main__':
    parse(sys.argv[1])
