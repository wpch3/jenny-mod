"""Minimal javap: disassemble one method. Usage: dis.py <classfile> <method-name> [desc-substr]"""
import struct, sys

OPS = {0:'nop',2:'iconst_m1',3:'iconst_0',4:'iconst_1',5:'iconst_2',6:'iconst_3',7:'iconst_4',8:'iconst_5',
16:'bipush',17:'sipush',18:'ldc',19:'ldc_w',20:'ldc2_w',21:'iload',22:'lload',23:'fload',24:'dload',25:'aload',
26:'iload_0',27:'iload_1',28:'iload_2',29:'iload_3',30:'lload_0',31:'lload_1',32:'lload_2',33:'lload_3',
34:'fload_0',35:'fload_1',36:'fload_2',37:'fload_3',38:'dload_0',39:'dload_1',40:'dload_2',41:'dload_3',
42:'aload_0',43:'aload_1',44:'aload_2',45:'aload_3',46:'iaload',48:'faload',50:'aaload',51:'baload',52:'caload',
54:'istore',55:'lstore',56:'fstore',57:'dstore',58:'astore',59:'istore_0',60:'istore_1',61:'istore_2',62:'istore_3',
63:'lstore_0',64:'lstore_1',65:'lstore_2',66:'lstore_3',67:'fstore_0',68:'fstore_1',69:'fstore_2',70:'fstore_3',
71:'dstore_0',72:'dstore_1',73:'dstore_2',74:'dstore_3',75:'astore_0',76:'astore_1',77:'astore_2',78:'astore_3',
79:'iastore',80:'lastore',81:'fastore',82:'dastore',83:'aastore',84:'bastore',85:'castore',87:'pop',88:'pop2',89:'dup',
90:'dup_x1',91:'dup_x2',92:'dup2',96:'iadd',97:'ladd',98:'fadd',99:'dadd',100:'isub',101:'lsub',102:'fsub',103:'dsub',
104:'imul',105:'lmul',106:'fmul',107:'dmul',108:'idiv',109:'ldiv',110:'fdiv',111:'ddiv',112:'irem',114:'frem',
116:'ineg',117:'lneg',118:'fneg',119:'dneg',120:'ishl',122:'ishr',124:'iand',126:'ior',128:'ixor',132:'iinc',
133:'i2l',134:'i2f',135:'i2d',136:'l2i',137:'l2f',138:'l2d',139:'f2i',140:'f2l',141:'f2d',142:'d2i',143:'d2l',144:'d2f',
145:'i2b',146:'i2c',147:'i2s',148:'lcmp',149:'fcmpl',150:'fcmpg',151:'dcmpl',152:'dcmpg',
153:'ifeq',154:'ifne',155:'iflt',156:'ifge',157:'ifgt',158:'ifle',159:'if_icmpeq',160:'if_icmpne',161:'if_icmplt',
162:'if_icmpge',163:'if_icmpgt',164:'if_icmple',165:'if_acmpeq',166:'if_acmpne',167:'goto',168:'jsr',169:'ret',
170:'tableswitch',171:'lookupswitch',172:'ireturn',173:'lreturn',174:'freturn',175:'dreturn',176:'areturn',177:'return',
178:'getstatic',179:'putstatic',180:'getfield',181:'putfield',182:'invokevirtual',183:'invokespecial',184:'invokestatic',
185:'invokeinterface',186:'invokedynamic',187:'new',188:'newarray',189:'anewarray',190:'arraylength',191:'athrow',
192:'checkcast',193:'instanceof',194:'monitorenter',195:'monitorexit',197:'multianewarray',198:'ifnull',199:'ifnonnull'}
HAS_U1 = {16,18,21,22,23,24,25,54,55,56,57,58,169,188,189}
HAS_S2 = {17,19,20,132,153,154,155,156,157,158,159,160,161,162,163,164,165,166,167,168,178,179,180,181,182,183,184,187,192,193,198,199}

def load(path):
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
    return d, cp, pos

def ref(cp, idx):
    try:
        _, ci, ni = cp[idx]
        cls = cp[cp[ci][1]].split('/')[-1] if isinstance(cp[ci], tuple) else '?'
        nat = cp[ni]
        nm = cp[nat[1]] if isinstance(nat, tuple) else '?'
        return '%s.%s' % (cls, nm)
    except Exception:
        return '#%d' % idx

def dis(path, want, dsub=None):
    d, cp, pos = load(path)
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
            if cp[an] == 'Code' and name == want and (dsub is None or dsub in desc):
                clen = struct.unpack('>I', d[pos+4:pos+8])[0]
                code = d[pos+8:pos+8+clen]; p = 0
                print('%s %s:' % (name, desc))
                while p < len(code):
                    op = code[p]; start = p; p += 1
                    m = OPS.get(op, 'op%d' % op)
                    extra = ''
                    if op in HAS_U1:
                        extra = str(code[p]); p += 1
                    elif op in HAS_S2:
                        v = struct.unpack('>h', code[p:p+2])[0]
                        if op in (178,179,180,181,182,183,184,187,192,193):
                            extra = ref(cp, v & 0xFFFF)
                        elif 153 <= op <= 168 or op in (198,199):
                            extra = '%d' % (start + v)
                        else:
                            extra = str(v)
                        p += 2
                    elif op == 185:
                        extra = ref(cp, struct.unpack('>H', code[p:p+2])[0]); p += 4
                    elif op == 132:
                        extra = '%d %d' % (code[p], struct.unpack('b', code[p+1:p+2])[0]); p += 2
                    elif op in (170, 171):
                        base = start
                        p = (p + 3) & ~3
                        default = base + struct.unpack('>i', code[p:p+4])[0]; p += 4
                        if op == 170:
                            lo, hi = struct.unpack('>ii', code[p:p+8]); p += 8
                            tg = [base + struct.unpack('>i', code[p+i*4:p+i*4+4])[0] for i in range(hi-lo+1)]
                            p += 4*(hi-lo+1)
                            extra = 'def=%d lo=%d hi=%d [%s]' % (default, lo, hi, ','.join(map(str,tg)))
                        else:
                            nn = struct.unpack('>i', code[p:p+4])[0]; p += 4
                            pairs = []
                            for _ in range(nn):
                                k = struct.unpack('>i', code[p:p+4])[0]
                                t = base + struct.unpack('>i', code[p+4:p+8])[0]
                                pairs.append('%d->%d' % (k, t)); p += 8
                            extra = 'def=%d {%s}' % (default, ' '.join(pairs))
                    print('  %3d: %-14s %s' % (start, m, extra))
                    if p > len(code): break
            pos += ln

if __name__ == '__main__':
    dis(sys.argv[1], sys.argv[2], sys.argv[3] if len(sys.argv) > 3 else None)
