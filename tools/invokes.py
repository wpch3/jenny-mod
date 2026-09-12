"""List invoke/getfield targets per method. Usage: invokes.py <classfile> [method-name]"""
import struct, sys

def run(path, want=None):
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
        else: raise Exception('tag %d' % t)
        i += 1
    pos += 6
    ni = struct.unpack('>H', d[pos:pos+2])[0]; pos += 2 + 2*ni
    nf = struct.unpack('>H', d[pos:pos+2])[0]; pos += 2
    for _ in range(nf):
        pos += 6
        na = struct.unpack('>H', d[pos:pos+2])[0]; pos += 2
        for _ in range(na):
            pos += 2; ln = struct.unpack('>I', d[pos:pos+4])[0]; pos += 4 + ln
    nm = struct.unpack('>H', d[pos:pos+2])[0]; pos += 2
    for _ in range(nm):
        _, nami, desci = struct.unpack('>HHH', d[pos:pos+6]); pos += 6
        name, desc = cp[nami], cp[desci]
        na = struct.unpack('>H', d[pos:pos+2])[0]; pos += 2
        for _ in range(na):
            an = struct.unpack('>H', d[pos:pos+2])[0]; pos += 2
            ln = struct.unpack('>I', d[pos:pos+4])[0]; pos += 4
            if cp[an] == 'Code' and (want is None or name == want):
                clen = struct.unpack('>I', d[pos+4:pos+8])[0]
                code = d[pos+8:pos+8+clen]; p = 0
                outs = []
                while p < len(code):
                    op = code[p]; p += 1
                    if op in (178, 179, 180, 181, 182, 183, 184, 185):
                        idx = struct.unpack('>H', code[p:p+2])[0]; p += 2
                        if op == 185: p += 2
                        _, ci, ni2 = cp[idx]
                        cls = cp[cp[ci][1]] if isinstance(cp[ci], tuple) else '?'
                        nm2 = cp[cp[ni2][1]] if isinstance(cp[ni2], tuple) else '?'
                        ds2 = cp[cp[ni2][2]] if isinstance(cp[ni2], tuple) else '?'
                        if op in (182, 183, 184, 185):
                            outs.append('%s.%s %s' % (cls.split('/')[-1], nm2, ds2))
                        elif op in (178, 179, 180, 181):
                            outs.append(('%s %s.%s' % ('PUT' if op in (179,181) else 'GET', cls.split('/')[-1], nm2)))
                    elif op in (21, 22, 23, 24, 25, 54, 55, 56, 57, 58, 169, 16, 18): p += 1
                    elif op in (153,154,155,156,157,158,159,160,161,162,163,164,165,166,167,168,198,199): p += 2
                    elif op in (17, 19, 20): p += 2 if op != 20 else 3
                    elif op in (26,27,28,29,30,31,32,33,34,35,42,43,44,45,46,47,48,49,50,51,52,53,75,76,77,78,87,89,96,100,104,108,112,126,2,3,4,5,6,7,8,177,191,0,46,79,80,81,82,83,190): pass
                    elif op in (170, 171):
                        p = (p + 3) & ~3
                        if op == 170: lo, hi = struct.unpack('>ii', code[p+4:p+12]); p += 12 + 4*(hi-lo+1)
                        else: nn = struct.unpack('>i', code[p+4:p+8])[0]; p += 8 + 8*nn
                    elif op == 197: p += 3
                    elif op in (188, 189): p += 2
                    elif op == 187: p += 2
                    elif op in (172,173,174,175,176): pass
                    elif op in (194, 195): p += 2
                    elif op == 196: p += 3
                    elif op in (178,179,180,181): p += 2
                    else: pass
                if outs:
                    print('%s %s:' % (name, desc))
                    for o in outs: print('   ' + o)
            pos += ln

if __name__ == '__main__':
    run(sys.argv[1], sys.argv[2] if len(sys.argv) > 2 else None)
