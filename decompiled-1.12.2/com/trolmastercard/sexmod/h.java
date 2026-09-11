package com.trolmastercard.sexmod;

public class h extends f {
    int j = 0;
    int i = 0;

    public h(em var1) {
        super(var1);
    }

    @Override
    public void func_75251_c() {
        super.func_75251_c();
        this.d.field_70747_aH = 0.02F;
    }

    @Override
    protected f.a a() {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 0
        // 01: getfield com/trolmastercard/sexmod/h.d Lcom/trolmastercard/sexmod/em;
        // 04: aload 0
        // 05: getfield com/trolmastercard/sexmod/h.a Lnet/minecraft/entity/player/EntityPlayer;
        // 08: invokevirtual com/trolmastercard/sexmod/em.func_70032_d (Lnet/minecraft/entity/Entity;)F
        // 0b: fstore 1
        // 0c: fload 1
        // 0d: ldc 5.0
        // 0f: fcmpl
        // 10: ifle 1b
        // 13: bipush 1
        // 14: goto 1c
        // 17: invokestatic com/trolmastercard/sexmod/h.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 1a: athrow
        // 1b: bipush 0
        // 1c: istore 2
        // 1d: aload 0
        // 1e: getfield com/trolmastercard/sexmod/h.d Lcom/trolmastercard/sexmod/em;
        // 21: invokevirtual com/trolmastercard/sexmod/em.ae ()Ljava/util/UUID;
        // 24: ifnonnull 66
        // 27: iload 2
        // 28: ifne 66
        // 2b: goto 32
        // 2e: invokestatic com/trolmastercard/sexmod/h.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 31: athrow
        // 32: aload 0
        // 33: getfield com/trolmastercard/sexmod/h.f Lcom/trolmastercard/sexmod/f$a;
        // 36: getstatic com/trolmastercard/sexmod/f$a.FOLLOW Lcom/trolmastercard/sexmod/f$a;
        // 39: if_acmpne 66
        // 3c: goto 43
        // 3f: invokestatic com/trolmastercard/sexmod/h.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 42: athrow
        // 43: aload 0
        // 44: dup
        // 45: getfield com/trolmastercard/sexmod/h.j I
        // 48: bipush 1
        // 49: iadd
        // 4a: dup_x1
        // 4b: putfield com/trolmastercard/sexmod/h.j I
        // 4e: bipush 60
        // 50: if_icmple 64
        // 53: goto 5a
        // 56: invokestatic com/trolmastercard/sexmod/h.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 59: athrow
        // 5a: bipush 0
        // 5b: istore 2
        // 5c: aload 0
        // 5d: bipush 0
        // 5e: putfield com/trolmastercard/sexmod/h.j I
        // 61: goto 66
        // 64: bipush 1
        // 65: istore 2
        // 66: iload 2
        // 67: ifeq 72
        // 6a: getstatic com/trolmastercard/sexmod/f$a.FOLLOW Lcom/trolmastercard/sexmod/f$a;
        // 6d: areturn
        // 6e: invokestatic com/trolmastercard/sexmod/h.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 71: athrow
        // 72: getstatic com/trolmastercard/sexmod/f$a.IDLE Lcom/trolmastercard/sexmod/f$a;
        // 75: areturn
        // try (6 -> 12): 12 java/lang/RuntimeException
        // try (16 -> 22): 23 java/lang/RuntimeException
        // try (20 -> 29): 30 java/lang/RuntimeException
        // try (25 -> 41): 42 java/lang/RuntimeException
        // try (52 -> 56): 56 java/lang/RuntimeException
    }

    @Override
    protected void a(f.a var1) {
        switch (var1) {
            case FOLLOW:
                double var2 = this.d.func_70032_d(this.a);

                label20: {
                    try {
                        if (this.c.func_111269_d() > var2) {
                            this.c.func_75499_g();
                            this.c.func_75497_a(this.a, 0.5);
                            break label20;
                        }
                    } catch (RuntimeException var4) {
                        throw a(var4);
                    }

                    this.c();
                }

                this.i = 300;
                this.b();
                break;
            case IDLE:
                this.b();
        }
    }

    @Override
    protected double b() {
        float var1 = this.d.func_70032_d(this.a);
        float var2 = 0.02F;
        double var3 = Math.min(0.7, Math.floor(var1 / 3.0F) * 0.05);
        var2 = (float)(var2 + var3);
        this.d.field_70747_aH = var2;
        return var2;
    }

    private static RuntimeException a(RuntimeException var0) {
        return var0;
    }
}
