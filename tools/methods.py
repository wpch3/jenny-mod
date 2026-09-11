"""List declared methods (name + descriptor) of a .class file. Usage: methods.py <classfile> [name-filter]"""
import struct, sys

def methods(path):
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
    sup = cp[cp[struct.unpack('>H', d[pos+4:pos+6])[0]][1]]
    pos += 6
    ni = struct.unpack('>H', d[pos:pos+2])[0]; pos += 2 + 2*ni
    nf = struct.unpack('>H', d[pos:pos+2])[0]; pos += 2
    print('class %s extends %s fields=%d' % (path.split('/')[-1], sup, nf))
    for _ in range(nf):
        _, nami, desci = struct.unpack('>HHH', d[pos:pos+6]); pos += 6
        print('  field %s %s' % (cp[nami], cp[desci]))
        na = struct.unpack('>H', d[pos:pos+2])[0]; pos += 2
        for _ in range(na):
            pos += 2; ln = struct.unpack('>I', d[pos:pos+4])[0]; pos += 4 + ln
    nm = struct.unpack('>H', d[pos:pos+2])[0]; pos += 2
    print('  methods=%d' % nm)
    for _ in range(nm):
        acc, nami, desci = struct.unpack('>HHH', d[pos:pos+6]); pos += 6
        name, desc = cp[nami], cp[desci]
        if len(sys.argv) < 3 or sys.argv[2] in name:
            print('  %s %s' % (name, desc))
        na = struct.unpack('>H', d[pos:pos+2])[0]; pos += 2
        for _ in range(na):
            pos += 2; ln = struct.unpack('>I', d[pos:pos+4])[0]; pos += 4 + ln

if __name__ == '__main__':
    methods(sys.argv[1])
