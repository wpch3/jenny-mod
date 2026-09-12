#!/usr/bin/env python3
"""Minimal NBT reader: dump structure palette entries + entities (read-only)."""
import gzip
import struct
import sys

class Reader:
    def __init__(self, data):
        self.d = data
        self.i = 0
    def read(self, n):
        out = self.d[self.i:self.i + n]
        self.i += n
        return out
    def byte(self):
        return self.read(1)[0]
    def short(self):
        return struct.unpack('>h', self.read(2))[0]
    def int(self):
        return struct.unpack('>i', self.read(4))[0]
    def long(self):
        return struct.unpack('>q', self.read(8))[0]
    def float(self):
        return struct.unpack('>f', self.read(4))[0]
    def double(self):
        return struct.unpack('>d', self.read(8))[0]
    def string(self):
        n = struct.unpack('>H', self.read(2))[0]
        return self.read(n).decode('utf-8')

def payload(r, tag):
    if tag == 1:
        return r.byte()
    if tag == 2:
        return r.short()
    if tag == 3:
        return r.int()
    if tag == 4:
        return r.long()
    if tag == 5:
        return r.float()
    if tag == 6:
        return r.double()
    if tag == 7:
        n = r.int()
        return list(r.read(n))
    if tag == 8:
        return r.string()
    if tag == 9:
        t = r.byte()
        n = r.int()
        return [payload(r, t) for _ in range(n)]
    if tag == 10:
        out = {}
        while True:
            t = r.byte()
            if t == 0:
                return out
            _k = r.string()
            out[_k] = payload(r, t)
        return out
    if tag == 11:
        n = r.int()
        return [r.int() for _ in range(n)]
    if tag == 12:
        n = r.int()
        return [r.long() for _ in range(n)]
    raise ValueError(tag)

def load(path):
    r = Reader(gzip.decompress(open(path, 'rb').read()))
    assert r.byte() == 10
    r.string()
    return payload(r, 10)

def main():
    for path in sys.argv[1:]:
        root = load(path)
        print('####', path.split('/')[-1])
        print('  keys:', sorted(root.keys()))
        print('  size:', root.get('size'), 'DataVersion:', root.get('DataVersion'))
        pal = root.get('palette') or (root.get('palettes') or [[]])[0]
        print('  palette entries:', len(pal))
        for e in pal:
            name = e.get('Name')
            props = e.get('Properties', {})
            print('   ', name, dict(props) if props else '')
        ents = root.get('entities', [])
        print('  entities:', len(ents))
        for e in ents[:12]:
            nbt = e.get('nbt', {})
            item = nbt.get('Item', {})
            extra = ''
            if item:
                extra = ' Item=%s Count=%s Damage=%s' % (item.get('id'), item.get('Count'), item.get('Damage'))
            print('   ', 'id=%s pos=%s%s' % (nbt.get('id'), e.get('pos'), extra))

if __name__ == '__main__':
    main()
