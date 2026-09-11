package com.trolmastercard.sexmod;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.math.Vec3d;

public class ep {
    static final int c = 30;
    static final int k = 6;
    static final int f = 6;
    static final float b = 0.15F;
    List<an> g = new ArrayList<>();
    final int a;
    final ar i;
    final b8 d;
    final em e;
    final float j;
    final float h;

    public ep(int var1, ar var2, b8 var3, em var4, float var5, float var6) {
        this.a = var1;
        this.i = var2;
        this.d = var3;
        this.e = var4;
        this.j = var5;
        this.h = var6;
    }

    void a(Minecraft var1, Tessellator var2, BufferBuilder var3, float var4) {
        if (this.g.size() < this.a) {
            for (int var5 = 0; var5 < 6; var5++) {
                Vec3d var6 = this.i.a(this.e);
                this.g
                    .add(
                        new an(
                            var1.field_71441_e,
                            this.d.a(this.e),
                            new Vec3d(
                                var6.field_72450_a + (r.f.nextFloat() * 2.0F - 1.0F) * this.j,
                                var6.field_72448_b + (r.f.nextFloat() * 2.0F - 1.0F) * this.j,
                                var6.field_72449_c + (r.f.nextFloat() * 2.0F - 1.0F) * this.j
                            )
                        )
                    );
            }
        }

        GlStateManager.func_179129_p();
        GlStateManager.func_179118_c();
        Vec3d var11 = b6.a(
            new Vec3d(var1.field_71439_g.field_70142_S, var1.field_71439_g.field_70137_T, var1.field_71439_g.field_70136_U),
            var1.field_71439_g.func_174791_d(),
            var4
        );
        var3.func_181668_a(9, DefaultVertexFormats.field_181706_f);
        this.b();
        Vec3d var12 = null;

        for (an var8 : this.g) {
            Vec3d var9 = b6.a(var8.d, var8.f, var4);
            if (var12 == null) {
                var12 = var9;
            }

            try {
                if (var12.func_72438_d(var9) > this.h) {
                    var2.func_78381_a();
                    var3.func_181668_a(9, DefaultVertexFormats.field_181706_f);
                }
            } catch (RuntimeException var10) {
                throw a(var10);
            }

            var3.func_181662_b(var9.field_72450_a - var11.field_72450_a, var9.field_72448_b - var11.field_72448_b, var9.field_72449_c - var11.field_72449_c)
                .func_181669_b(255, 255, 255, 255)
                .func_181675_d();
            var12 = var9;
        }

        var2.func_78381_a();
        GlStateManager.func_179089_o();
    }

    void a() {
        for (an var2 : this.g) {
            var2.a();
        }
    }

    void b() {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 0
        // 01: getfield com/trolmastercard/sexmod/ep.g Ljava/util/List;
        // 04: invokeinterface java/util/List.isEmpty ()Z 1
        // 09: ifne 20
        // 0c: aload 0
        // 0d: getfield com/trolmastercard/sexmod/ep.g Ljava/util/List;
        // 10: invokeinterface java/util/List.size ()I 1
        // 15: bipush 1
        // 16: if_icmpgt 25
        // 19: goto 20
        // 1c: invokestatic com/trolmastercard/sexmod/ep.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 1f: athrow
        // 20: return
        // 21: invokestatic com/trolmastercard/sexmod/ep.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 24: athrow
        // 25: bipush 1
        // 26: istore 1
        // 27: iload 1
        // 28: aload 0
        // 29: getfield com/trolmastercard/sexmod/ep.g Ljava/util/List;
        // 2c: invokeinterface java/util/List.size ()I 1
        // 31: if_icmpge c0
        // 34: aload 0
        // 35: getfield com/trolmastercard/sexmod/ep.g Ljava/util/List;
        // 38: iload 1
        // 39: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
        // 3e: checkcast com/trolmastercard/sexmod/an
        // 41: astore 2
        // 42: aload 2
        // 43: getfield com/trolmastercard/sexmod/an.f Lnet/minecraft/util/math/Vec3d;
        // 46: astore 3
        // 47: iload 1
        // 48: bipush 1
        // 49: isub
        // 4a: istore 4
        // 4c: iload 4
        // 4e: iflt ab
        // 51: aload 3
        // 52: aload 0
        // 53: getfield com/trolmastercard/sexmod/ep.g Ljava/util/List;
        // 56: iload 4
        // 58: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
        // 5d: checkcast com/trolmastercard/sexmod/an
        // 60: getfield com/trolmastercard/sexmod/an.f Lnet/minecraft/util/math/Vec3d;
        // 63: invokevirtual net/minecraft/util/math/Vec3d.func_72438_d (Lnet/minecraft/util/math/Vec3d;)D
        // 66: aload 3
        // 67: aload 0
        // 68: getfield com/trolmastercard/sexmod/ep.g Ljava/util/List;
        // 6b: iload 4
        // 6d: bipush 1
        // 6e: iadd
        // 6f: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
        // 74: checkcast com/trolmastercard/sexmod/an
        // 77: getfield com/trolmastercard/sexmod/an.f Lnet/minecraft/util/math/Vec3d;
        // 7a: invokevirtual net/minecraft/util/math/Vec3d.func_72438_d (Lnet/minecraft/util/math/Vec3d;)D
        // 7d: dcmpg
        // 7e: ifge ab
        // 81: goto 88
        // 84: invokestatic com/trolmastercard/sexmod/ep.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 87: athrow
        // 88: aload 0
        // 89: getfield com/trolmastercard/sexmod/ep.g Ljava/util/List;
        // 8c: iload 4
        // 8e: bipush 1
        // 8f: iadd
        // 90: aload 0
        // 91: getfield com/trolmastercard/sexmod/ep.g Ljava/util/List;
        // 94: iload 4
        // 96: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
        // 9b: invokeinterface java/util/List.set (ILjava/lang/Object;)Ljava/lang/Object; 3
        // a0: pop
        // a1: iinc 4 -1
        // a4: goto 4c
        // a7: invokestatic com/trolmastercard/sexmod/ep.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // aa: athrow
        // ab: aload 0
        // ac: getfield com/trolmastercard/sexmod/ep.g Ljava/util/List;
        // af: iload 4
        // b1: bipush 1
        // b2: iadd
        // b3: aload 2
        // b4: invokeinterface java/util/List.set (ILjava/lang/Object;)Ljava/lang/Object; 3
        // b9: pop
        // ba: iinc 1 1
        // bd: goto 27
        // c0: return
        // try (0 -> 9): 10 java/lang/RuntimeException
        // try (4 -> 13): 13 java/lang/RuntimeException
        // try (35 -> 57): 58 java/lang/RuntimeException
        // try (37 -> 73): 73 java/lang/RuntimeException
    }

    private static RuntimeException a(RuntimeException var0) {
        return var0;
    }
}
