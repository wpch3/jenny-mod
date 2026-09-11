package com.trolmastercard.sexmod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiListExtended;
import net.minecraft.client.gui.GuiListExtended.IGuiListEntry;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.GlStateManager.DestFactor;
import net.minecraft.client.renderer.GlStateManager.SourceFactor;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.input.Mouse;

public class gq extends GuiListExtended {
    static final int c = 3809871;
    static final List<gw> f = Arrays.asList(gw.values());
    static final String a = "MMMMMMMMMM";
    protected static int i = 5;
    protected static int e = 200;
    private List<gq.a> b = new ArrayList<>();
    com.trolmastercard.sexmod.a d;
    boolean h = false;
    float g = 0.0F;

    public gq(Minecraft var1, com.trolmastercard.sexmod.a var2) {
        super(var1, var2.field_146294_l / 2, var2.field_146295_m, 0, var2.field_146295_m, 30);
        e = var2.field_146294_l / 2;
        this.d = var2;
    }

    public IGuiListEntry func_148180_b(int var1) {
        return this.b.get(var1);
    }

    protected int func_148127_b() {
        return this.b.size();
    }

    protected int func_148137_d() {
        return 0;
    }

    protected void drawContainerBackground(Tessellator var1) {
    }

    public void func_178039_p() {
        try {
            if (!this.func_148141_e(this.field_148162_h)) {
                return;
            }
        } catch (RuntimeException var3) {
            throw a(var3);
        }

        int var1 = Mouse.getEventDWheel();

        try {
            if (var1 == 0) {
                return;
            }
        } catch (RuntimeException var2) {
            throw a(var2);
        }

        byte var4;
        if (var1 > 0) {
            var4 = -1;
        } else {
            var4 = 1;
        }

        this.field_148169_q = this.field_148169_q + var4 * this.field_148149_f / 2;
    }

    protected void func_148136_c(int var1, int var2, int var3, int var4) {
    }

    void a() {
        int var1 = this.b.size() * this.field_148149_f;

        try {
            if (var1 > this.field_148158_l) {
                this.field_148153_b = 0;
                return;
            }
        } catch (RuntimeException var3) {
            throw a(var3);
        }

        int var2 = this.field_148158_l - var1;
        this.field_148153_b = var2 / 2;
    }

    public void func_148128_a(int var1, int var2, float var3) {
        this.b.clear();
        int var4 = 0;

        for (Entry var6 : com.trolmastercard.sexmod.a.m) {
            gw var7 = (gw)var6.getKey();
            Entry var8 = (Entry)var6.getValue();

            try {
                this.b.add(new gq.a(var7, (List<String>)var8.getKey(), (Integer)var8.getValue()));
                if (gw.CUSTOM_BONE.equals(var6.getKey())) {
                    var4++;
                }
            } catch (RuntimeException var9) {
                throw a(var9);
            }
        }

        this.b.sort(Comparator.comparingInt(var0 -> f.indexOf(var0.d)));
        List var11 = br.a(this.d.c).get(gw.CUSTOM_BONE);

        List var10000;
        gq.a var10001;
        gq.a var10002;
        gq var10003;
        boolean var10004;
        label33: {
            try {
                var11.add(0, "cross");
                var10000 = this.b;
                var10001 = new gq.a;
                var10002 = var10001;
                var10003 = this;
                if (var4 > 1) {
                    var10004 = true;
                    break label33;
                }
            } catch (RuntimeException var10) {
                throw a(var10);
            }

            var10004 = false;
        }

        var10002./* $VF: Unable to resugar constructor */<init>(var10004);
        var10000.add(var10001);
        this.a();
        this.a(var1, var2, var3);
        if (this.h) {
            this.func_148145_f(999999);
            this.h = false;
        }
    }

    void a(int var1, int var2, float var3) {
        try {
            if (!this.field_178041_q) {
                return;
            }
        } catch (RuntimeException var14) {
            throw a(var14);
        }

        this.field_148150_g = var1;
        this.field_148162_h = var2;
        this.func_148123_a();
        int var4 = this.func_148137_d();
        int var5 = var4 + 6;
        this.func_148121_k();
        GlStateManager.func_179140_f();
        GlStateManager.func_179106_n();
        Tessellator var6 = Tessellator.func_178181_a();
        BufferBuilder var7 = var6.func_178180_c();
        this.drawContainerBackground(var6);
        int var8 = this.field_148152_e + this.field_148155_a / 2 - this.func_148139_c() / 2 + 2;
        int var9 = this.field_148153_b + 4 - (int)this.field_148169_q;

        try {
            if (this.field_148165_u) {
                this.func_148129_a(var8, var9, var6);
            }
        } catch (RuntimeException var13) {
            throw a(var13);
        }

        this.func_192638_a(var8, var9, var1, var2, var3);
        GlStateManager.func_179097_i();
        this.func_148136_c(0, this.field_148153_b, 255, 255);
        this.func_148136_c(this.field_148154_c, this.field_148158_l, 255, 255);
        GlStateManager.func_179147_l();
        GlStateManager.func_187428_a(SourceFactor.SRC_ALPHA, DestFactor.ONE_MINUS_SRC_ALPHA, SourceFactor.ZERO, DestFactor.ONE);
        GlStateManager.func_179118_c();
        GlStateManager.func_179103_j(7425);
        GlStateManager.func_179090_x();
        int var10 = this.func_148135_f();
        if (var10 > 0) {
            int var11 = (this.field_148154_c - this.field_148153_b) * (this.field_148154_c - this.field_148153_b) / this.func_148138_e();
            var11 = MathHelper.func_76125_a(var11, 32, this.field_148154_c - this.field_148153_b - 8);
            int var12 = (int)this.field_148169_q * (this.field_148154_c - this.field_148153_b - var11) / var10 + this.field_148153_b;
            if (var12 < this.field_148153_b) {
                var12 = this.field_148153_b;
            }

            var7.func_181668_a(7, DefaultVertexFormats.field_181709_i);
            var7.func_181662_b(var4, this.field_148154_c, 0.0).func_187315_a(0.0, 1.0).func_181669_b(0, 0, 0, 255).func_181675_d();
            var7.func_181662_b(var5, this.field_148154_c, 0.0).func_187315_a(1.0, 1.0).func_181669_b(0, 0, 0, 255).func_181675_d();
            var7.func_181662_b(var5, this.field_148153_b, 0.0).func_187315_a(1.0, 0.0).func_181669_b(0, 0, 0, 255).func_181675_d();
            var7.func_181662_b(var4, this.field_148153_b, 0.0).func_187315_a(0.0, 0.0).func_181669_b(0, 0, 0, 255).func_181675_d();
            var6.func_78381_a();
            var7.func_181668_a(7, DefaultVertexFormats.field_181709_i);
            var7.func_181662_b(var4, var12 + var11, 0.0).func_187315_a(0.0, 1.0).func_181669_b(128, 128, 128, 255).func_181675_d();
            var7.func_181662_b(var5, var12 + var11, 0.0).func_187315_a(1.0, 1.0).func_181669_b(128, 128, 128, 255).func_181675_d();
            var7.func_181662_b(var5, var12, 0.0).func_187315_a(1.0, 0.0).func_181669_b(128, 128, 128, 255).func_181675_d();
            var7.func_181662_b(var4, var12, 0.0).func_187315_a(0.0, 0.0).func_181669_b(128, 128, 128, 255).func_181675_d();
            var6.func_78381_a();
            var7.func_181668_a(7, DefaultVertexFormats.field_181709_i);
            var7.func_181662_b(var4, var12 + var11 - 1, 0.0).func_187315_a(0.0, 1.0).func_181669_b(192, 192, 192, 255).func_181675_d();
            var7.func_181662_b(var5 - 1, var12 + var11 - 1, 0.0).func_187315_a(1.0, 1.0).func_181669_b(192, 192, 192, 255).func_181675_d();
            var7.func_181662_b(var5 - 1, var12, 0.0).func_187315_a(1.0, 0.0).func_181669_b(192, 192, 192, 255).func_181675_d();
            var7.func_181662_b(var4, var12, 0.0).func_187315_a(0.0, 0.0).func_181669_b(192, 192, 192, 255).func_181675_d();
            var6.func_78381_a();
        }

        this.func_148142_b(var1, var2);
        GlStateManager.func_179098_w();
        GlStateManager.func_179103_j(7424);
        GlStateManager.func_179141_d();
        GlStateManager.func_179084_k();
    }

    public boolean func_148179_a(int var1, int var2, int var3) {
        this.a(var1, var2, var3);
        return super.func_148179_a(var1, var2, var3);
    }

    void a(int var1, int var2, int var3) {
        try {
            if (var1 > this.field_148155_a) {
                return;
            }
        } catch (RuntimeException var10) {
            throw a(var10);
        }

        int var4 = this.func_148148_g();
        float var5 = var4 + var2 - 5 - this.field_148153_b;
        int var6 = Math.round((float)Math.floor(var5 / this.field_148149_f));
        int var7 = (int)Math.round((var5 / this.field_148149_f - Math.floor(var5 / this.field_148149_f)) * this.field_148149_f);

        try {
            if (var6 < 0) {
                return;
            }
        } catch (RuntimeException var9) {
            throw a(var9);
        }

        try {
            if (var6 < this.b.size()) {
                this.b.get(var6).a(var1, var7, var3, var6);
            }
        } catch (RuntimeException var8) {
            throw a(var8);
        }
    }

    private static RuntimeException a(RuntimeException var0) {
        return var0;
    }

    @SideOnly(Side.CLIENT)
    public class a implements IGuiListEntry {
        static final int g = 4;
        public gw d;
        public List<String> b;
        public int f;
        FontRenderer c;
        boolean a = false;
        boolean e = false;

        public a(gw var2, List<String> var3, int var4) {
            this.d = var2;
            this.b = var3;
            this.f = var4;
            this.c = gq.this.field_148161_k.field_71466_p;
        }

        public a(boolean var2) {
            this.e = var2;
            this.a = true;
        }

        boolean b(int var1, int var2, int var3, int var4, int var5, int var6) {
            try {
                if (var1 < var3) {
                    return false;
                }
            } catch (RuntimeException var10) {
                throw a(var10);
            }

            try {
                if (var1 > var5) {
                    return false;
                }
            } catch (RuntimeException var8) {
                throw a(var8);
            }

            try {
                if (var2 < var4) {
                    return false;
                }
            } catch (RuntimeException var9) {
                throw a(var9);
            }

            try {
                return var2 <= var6;
            } catch (RuntimeException var7) {
                throw a(var7);
            }
        }

        void b(int param1, int param2, int param3) {
            // $VF: Couldn't be decompiled
            // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
            // java.lang.RuntimeException: parsing failure!
            //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
            //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
            //
            // Bytecode:
            // 00: bipush 30
            // 02: istore 4
            // 04: iinc 1 5
            // 07: aload 0
            // 08: getfield com/trolmastercard/sexmod/gq$a.this$0 Lcom/trolmastercard/sexmod/gq;
            // 0b: invokestatic com/trolmastercard/sexmod/gq.access$100 (Lcom/trolmastercard/sexmod/gq;)Lnet/minecraft/client/Minecraft;
            // 0e: getfield net/minecraft/client/Minecraft.field_71446_o Lnet/minecraft/client/renderer/texture/TextureManager;
            // 11: getstatic com/trolmastercard/sexmod/a.k Lnet/minecraft/util/ResourceLocation;
            // 14: invokevirtual net/minecraft/client/renderer/texture/TextureManager.func_110577_a (Lnet/minecraft/util/ResourceLocation;)V
            // 17: aload 0
            // 18: getfield com/trolmastercard/sexmod/gq$a.this$0 Lcom/trolmastercard/sexmod/gq;
            // 1b: getfield com/trolmastercard/sexmod/gq.d Lcom/trolmastercard/sexmod/a;
            // 1e: iload 4
            // 20: iload 1
            // 21: bipush 40
            // 23: aload 0
            // 24: iload 2
            // 25: iload 3
            // 26: iload 4
            // 28: iload 1
            // 29: iload 4
            // 2b: bipush 20
            // 2d: iadd
            // 2e: iload 1
            // 2f: bipush 20
            // 31: iadd
            // 32: invokevirtual com/trolmastercard/sexmod/gq$a.b (IIIIII)Z
            // 35: ifeq 41
            // 38: bipush 40
            // 3a: goto 43
            // 3d: invokestatic com/trolmastercard/sexmod/gq$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 40: athrow
            // 41: bipush 20
            // 43: bipush 20
            // 45: bipush 20
            // 47: invokevirtual com/trolmastercard/sexmod/a.func_73729_b (IIIIII)V
            // 4a: iinc 4 40
            // 4d: aload 0
            // 4e: getfield com/trolmastercard/sexmod/gq$a.this$0 Lcom/trolmastercard/sexmod/gq;
            // 51: getfield com/trolmastercard/sexmod/gq.d Lcom/trolmastercard/sexmod/a;
            // 54: iload 4
            // 56: iload 1
            // 57: aload 0
            // 58: getfield com/trolmastercard/sexmod/gq$a.e Z
            // 5b: ifeq 67
            // 5e: bipush 60
            // 60: goto 69
            // 63: invokestatic com/trolmastercard/sexmod/gq$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 66: athrow
            // 67: bipush 80
            // 69: aload 0
            // 6a: getfield com/trolmastercard/sexmod/gq$a.e Z
            // 6d: ifeq 95
            // 70: aload 0
            // 71: iload 2
            // 72: iload 3
            // 73: iload 4
            // 75: iload 1
            // 76: iload 4
            // 78: bipush 20
            // 7a: iadd
            // 7b: iload 1
            // 7c: bipush 20
            // 7e: iadd
            // 7f: invokevirtual com/trolmastercard/sexmod/gq$a.b (IIIIII)Z
            // 82: ifeq 95
            // 85: goto 8c
            // 88: invokestatic com/trolmastercard/sexmod/gq$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 8b: athrow
            // 8c: bipush 40
            // 8e: goto 97
            // 91: invokestatic com/trolmastercard/sexmod/gq$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 94: athrow
            // 95: bipush 20
            // 97: bipush 20
            // 99: bipush 20
            // 9b: invokevirtual com/trolmastercard/sexmod/a.func_73729_b (IIIIII)V
            // 9e: return
            // try (2 -> 30): 30 java/lang/RuntimeException
            // try (33 -> 47): 47 java/lang/RuntimeException
            // try (50 -> 66): 67 java/lang/RuntimeException
            // try (53 -> 71): 71 java/lang/RuntimeException
        }

        void a(int param1, int param2, int param3) {
            // $VF: Couldn't be decompiled
            // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
            // java.lang.RuntimeException: parsing failure!
            //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
            //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
            //
            // Bytecode:
            // 000: aload 0
            // 001: getfield com/trolmastercard/sexmod/gq$a.this$0 Lcom/trolmastercard/sexmod/gq;
            // 004: invokestatic com/trolmastercard/sexmod/gq.access$200 (Lcom/trolmastercard/sexmod/gq;)Lnet/minecraft/client/Minecraft;
            // 007: getfield net/minecraft/client/Minecraft.field_71446_o Lnet/minecraft/client/renderer/texture/TextureManager;
            // 00a: getstatic com/trolmastercard/sexmod/a.k Lnet/minecraft/util/ResourceLocation;
            // 00d: invokevirtual net/minecraft/client/renderer/texture/TextureManager.func_110577_a (Lnet/minecraft/util/ResourceLocation;)V
            // 010: aload 0
            // 011: getfield com/trolmastercard/sexmod/gq$a.this$0 Lcom/trolmastercard/sexmod/gq;
            // 014: getfield com/trolmastercard/sexmod/gq.d Lcom/trolmastercard/sexmod/a;
            // 017: getstatic com/trolmastercard/sexmod/gq.i I
            // 01a: iload 1
            // 01b: bipush 0
            // 01c: bipush 60
            // 01e: aload 0
            // 01f: getfield com/trolmastercard/sexmod/gq$a.f I
            // 022: ifne 02e
            // 025: bipush 119
            // 027: goto 031
            // 02a: invokestatic com/trolmastercard/sexmod/gq$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 02d: athrow
            // 02e: sipush 256
            // 031: bipush 30
            // 033: invokevirtual com/trolmastercard/sexmod/a.func_73729_b (IIIIII)V
            // 036: getstatic com/trolmastercard/sexmod/gq.i I
            // 039: bipush 10
            // 03b: iadd
            // 03c: istore 4
            // 03e: iinc 1 5
            // 041: aload 0
            // 042: getfield com/trolmastercard/sexmod/gq$a.this$0 Lcom/trolmastercard/sexmod/gq;
            // 045: getfield com/trolmastercard/sexmod/gq.d Lcom/trolmastercard/sexmod/a;
            // 048: iload 4
            // 04a: iload 1
            // 04b: aload 0
            // 04c: getfield com/trolmastercard/sexmod/gq$a.d Lcom/trolmastercard/sexmod/gw;
            // 04f: getfield com/trolmastercard/sexmod/gw.iconXPos I
            // 052: invokevirtual com/trolmastercard/sexmod/a.a (III)V
            // 055: iinc 4 25
            // 058: aload 0
            // 059: iload 4
            // 05b: iload 1
            // 05c: iload 2
            // 05d: iload 3
            // 05e: invokevirtual com/trolmastercard/sexmod/gq$a.c (IIII)I
            // 061: istore 4
            // 063: aload 0
            // 064: getfield com/trolmastercard/sexmod/gq$a.this$0 Lcom/trolmastercard/sexmod/gq;
            // 067: getfield com/trolmastercard/sexmod/gq.d Lcom/trolmastercard/sexmod/a;
            // 06a: invokevirtual com/trolmastercard/sexmod/a.d ()Lcom/trolmastercard/sexmod/em;
            // 06d: astore 5
            // 06f: aload 0
            // 070: getfield com/trolmastercard/sexmod/gq$a.f I
            // 073: ifne 091
            // 076: aload 0
            // 077: getfield com/trolmastercard/sexmod/gq$a.this$0 Lcom/trolmastercard/sexmod/gq;
            // 07a: invokestatic com/trolmastercard/sexmod/gq.access$300 (Lcom/trolmastercard/sexmod/gq;)Lnet/minecraft/client/Minecraft;
            // 07d: getfield net/minecraft/client/Minecraft.field_71441_e Lnet/minecraft/client/multiplayer/WorldClient;
            // 080: aload 5
            // 082: invokevirtual com/trolmastercard/sexmod/em.f ()Ljava/util/UUID;
            // 085: aload 0
            // 086: getfield com/trolmastercard/sexmod/gq$a.d Lcom/trolmastercard/sexmod/gw;
            // 089: invokestatic com/trolmastercard/sexmod/cy.a (Lnet/minecraft/world/World;Ljava/util/UUID;Lcom/trolmastercard/sexmod/gw;)Lcom/trolmastercard/sexmod/cy;
            // 08c: astore 6
            // 08e: goto 0b4
            // 091: new com/trolmastercard/sexmod/cy
            // 094: dup
            // 095: aload 5
            // 097: getfield com/trolmastercard/sexmod/em.field_70170_p Lnet/minecraft/world/World;
            // 09a: aload 5
            // 09c: invokevirtual com/trolmastercard/sexmod/em.f ()Ljava/util/UUID;
            // 09f: aload 0
            // 0a0: getfield com/trolmastercard/sexmod/gq$a.b Ljava/util/List;
            // 0a3: aload 0
            // 0a4: getfield com/trolmastercard/sexmod/gq$a.f I
            // 0a7: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
            // 0ac: checkcast java/lang/String
            // 0af: invokespecial com/trolmastercard/sexmod/cy.<init> (Lnet/minecraft/world/World;Ljava/util/UUID;Ljava/lang/String;)V
            // 0b2: astore 6
            // 0b4: aload 6
            // 0b6: invokevirtual com/trolmastercard/sexmod/cy.a ()Ljava/lang/String;
            // 0b9: invokestatic com/trolmastercard/sexmod/br.b (Ljava/lang/String;)Lcom/trolmastercard/sexmod/br$b;
            // 0bc: astore 7
            // 0be: aload 6
            // 0c0: getfield com/trolmastercard/sexmod/cy.f Z
            // 0c3: ifne 0d2
            // 0c6: aload 7
            // 0c8: ifnonnull 0da
            // 0cb: goto 0d2
            // 0ce: invokestatic com/trolmastercard/sexmod/gq$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 0d1: athrow
            // 0d2: fconst_1
            // 0d3: goto 0df
            // 0d6: invokestatic com/trolmastercard/sexmod/gq$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 0d9: athrow
            // 0da: aload 7
            // 0dc: invokevirtual com/trolmastercard/sexmod/br$b.d ()F
            // 0df: fstore 8
            // 0e1: aload 7
            // 0e3: ifnonnull 0ee
            // 0e6: bipush 0
            // 0e7: goto 0f5
            // 0ea: invokestatic com/trolmastercard/sexmod/gq$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 0ed: athrow
            // 0ee: aload 7
            // 0f0: invokevirtual com/trolmastercard/sexmod/br$b.g ()F
            // 0f3: fneg
            // 0f4: f2i
            // 0f5: istore 9
            // 0f7: aload 0
            // 0f8: getfield com/trolmastercard/sexmod/gq$a.this$0 Lcom/trolmastercard/sexmod/gq;
            // 0fb: getfield com/trolmastercard/sexmod/gq.d Lcom/trolmastercard/sexmod/a;
            // 0fe: iload 4
            // 100: iload 1
            // 101: bipush 10
            // 103: iadd
            // 104: aload 6
            // 106: getfield com/trolmastercard/sexmod/cy.f Z
            // 109: ifeq 114
            // 10c: bipush 0
            // 10d: goto 116
            // 110: invokestatic com/trolmastercard/sexmod/gq$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 113: athrow
            // 114: bipush 6
            // 116: iadd
            // 117: iload 9
            // 119: iadd
            // 11a: ldc 30.0
            // 11c: fload 8
            // 11e: fmul
            // 11f: aload 6
            // 121: invokevirtual com/trolmastercard/sexmod/a.a (IIFLcom/trolmastercard/sexmod/cy;)V
            // 124: aload 0
            // 125: getfield com/trolmastercard/sexmod/gq$a.f I
            // 128: ifeq 13e
            // 12b: aload 0
            // 12c: getfield com/trolmastercard/sexmod/gq$a.this$0 Lcom/trolmastercard/sexmod/gq;
            // 12f: getfield com/trolmastercard/sexmod/gq.d Lcom/trolmastercard/sexmod/a;
            // 132: aload 6
            // 134: invokevirtual com/trolmastercard/sexmod/a.a (Lcom/trolmastercard/sexmod/cy;)V
            // 137: goto 13e
            // 13a: invokestatic com/trolmastercard/sexmod/gq$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 13d: athrow
            // 13e: aload 0
            // 13f: getfield com/trolmastercard/sexmod/gq$a.this$0 Lcom/trolmastercard/sexmod/gq;
            // 142: invokestatic com/trolmastercard/sexmod/gq.access$400 (Lcom/trolmastercard/sexmod/gq;)Lnet/minecraft/client/Minecraft;
            // 145: getfield net/minecraft/client/Minecraft.field_71441_e Lnet/minecraft/client/multiplayer/WorldClient;
            // 148: aload 6
            // 14a: invokevirtual net/minecraft/client/multiplayer/WorldClient.func_72973_f (Lnet/minecraft/entity/Entity;)V
            // 14d: iload 4
            // 14f: i2f
            // 150: ldc 30.0
            // 152: fadd
            // 153: f2i
            // 154: istore 4
            // 156: aload 0
            // 157: getfield com/trolmastercard/sexmod/gq$a.f I
            // 15a: ifne 162
            // 15d: return
            // 15e: invokestatic com/trolmastercard/sexmod/gq$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 161: athrow
            // 162: iload 4
            // 164: istore 10
            // 166: aload 0
            // 167: getfield com/trolmastercard/sexmod/gq$a.b Ljava/util/List;
            // 16a: aload 0
            // 16b: getfield com/trolmastercard/sexmod/gq$a.f I
            // 16e: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
            // 173: checkcast java/lang/String
            // 176: astore 11
            // 178: aload 11
            // 17a: invokevirtual java/lang/String.length ()I
            // 17d: ldc "MMMMMMMMMM"
            // 17f: invokevirtual java/lang/String.length ()I
            // 182: if_icmple 1ab
            // 185: new java/lang/StringBuilder
            // 188: dup
            // 189: invokespecial java/lang/StringBuilder.<init> ()V
            // 18c: aload 11
            // 18e: bipush 0
            // 18f: ldc "MMMMMMMMMM"
            // 191: invokevirtual java/lang/String.length ()I
            // 194: bipush 3
            // 195: isub
            // 196: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
            // 199: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
            // 19c: ldc "..."
            // 19e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
            // 1a1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
            // 1a4: goto 1ad
            // 1a7: invokestatic com/trolmastercard/sexmod/gq$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 1aa: athrow
            // 1ab: aload 11
            // 1ad: astore 12
            // 1af: aload 0
            // 1b0: aload 12
            // 1b2: iload 4
            // 1b4: iload 1
            // 1b5: bipush 10
            // 1b7: iadd
            // 1b8: invokevirtual com/trolmastercard/sexmod/gq$a.a (Ljava/lang/String;II)V
            // 1bb: iload 4
            // 1bd: aload 0
            // 1be: getfield com/trolmastercard/sexmod/gq$a.c Lnet/minecraft/client/gui/FontRenderer;
            // 1c1: ldc "MMMMMMMMMM"
            // 1c3: invokevirtual net/minecraft/client/gui/FontRenderer.func_78256_a (Ljava/lang/String;)I
            // 1c6: iadd
            // 1c7: istore 4
            // 1c9: iload 4
            // 1cb: istore 13
            // 1cd: iload 4
            // 1cf: istore 14
            // 1d1: aload 11
            // 1d3: invokestatic com/trolmastercard/sexmod/br.d (Ljava/lang/String;)Ljava/lang/String;
            // 1d6: astore 15
            // 1d8: aload 15
            // 1da: invokevirtual java/lang/String.length ()I
            // 1dd: ldc "MMMMMMMMMM"
            // 1df: invokevirtual java/lang/String.length ()I
            // 1e2: if_icmple 20b
            // 1e5: new java/lang/StringBuilder
            // 1e8: dup
            // 1e9: invokespecial java/lang/StringBuilder.<init> ()V
            // 1ec: aload 15
            // 1ee: bipush 0
            // 1ef: ldc "MMMMMMMMMM"
            // 1f1: invokevirtual java/lang/String.length ()I
            // 1f4: bipush 3
            // 1f5: isub
            // 1f6: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
            // 1f9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
            // 1fc: ldc "..."
            // 1fe: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
            // 201: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
            // 204: goto 20d
            // 207: invokestatic com/trolmastercard/sexmod/gq$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 20a: athrow
            // 20b: aload 15
            // 20d: astore 16
            // 20f: aload 0
            // 210: aload 16
            // 212: iload 4
            // 214: iload 1
            // 215: bipush 10
            // 217: iadd
            // 218: invokevirtual com/trolmastercard/sexmod/gq$a.a (Ljava/lang/String;II)V
            // 21b: iload 4
            // 21d: aload 0
            // 21e: getfield com/trolmastercard/sexmod/gq$a.c Lnet/minecraft/client/gui/FontRenderer;
            // 221: ldc "MMMMMMMMMM"
            // 223: invokevirtual net/minecraft/client/gui/FontRenderer.func_78256_a (Ljava/lang/String;)I
            // 226: iadd
            // 227: istore 4
            // 229: iload 4
            // 22b: istore 17
            // 22d: aload 0
            // 22e: iload 2
            // 22f: iload 3
            // 230: iload 10
            // 232: iload 1
            // 233: bipush 10
            // 235: iadd
            // 236: iload 13
            // 238: iload 1
            // 239: bipush 10
            // 23b: iadd
            // 23c: aload 0
            // 23d: getfield com/trolmastercard/sexmod/gq$a.c Lnet/minecraft/client/gui/FontRenderer;
            // 240: getfield net/minecraft/client/gui/FontRenderer.field_78288_b I
            // 243: iadd
            // 244: invokevirtual com/trolmastercard/sexmod/gq$a.b (IIIIII)Z
            // 247: ifeq 25f
            // 24a: aload 0
            // 24b: getfield com/trolmastercard/sexmod/gq$a.this$0 Lcom/trolmastercard/sexmod/gq;
            // 24e: getfield com/trolmastercard/sexmod/gq.d Lcom/trolmastercard/sexmod/a;
            // 251: aload 11
            // 253: iload 2
            // 254: iload 3
            // 255: invokevirtual com/trolmastercard/sexmod/a.a (Ljava/lang/String;II)V
            // 258: goto 25f
            // 25b: invokestatic com/trolmastercard/sexmod/gq$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 25e: athrow
            // 25f: aload 0
            // 260: iload 2
            // 261: iload 3
            // 262: iload 14
            // 264: iload 1
            // 265: bipush 10
            // 267: iadd
            // 268: iload 17
            // 26a: iload 1
            // 26b: bipush 10
            // 26d: iadd
            // 26e: aload 0
            // 26f: getfield com/trolmastercard/sexmod/gq$a.c Lnet/minecraft/client/gui/FontRenderer;
            // 272: getfield net/minecraft/client/gui/FontRenderer.field_78288_b I
            // 275: iadd
            // 276: invokevirtual com/trolmastercard/sexmod/gq$a.b (IIIIII)Z
            // 279: ifeq 291
            // 27c: aload 0
            // 27d: getfield com/trolmastercard/sexmod/gq$a.this$0 Lcom/trolmastercard/sexmod/gq;
            // 280: getfield com/trolmastercard/sexmod/gq.d Lcom/trolmastercard/sexmod/a;
            // 283: aload 15
            // 285: iload 2
            // 286: iload 3
            // 287: invokevirtual com/trolmastercard/sexmod/a.a (Ljava/lang/String;II)V
            // 28a: goto 291
            // 28d: invokestatic com/trolmastercard/sexmod/gq$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 290: athrow
            // 291: fconst_1
            // 292: fconst_1
            // 293: fconst_1
            // 294: fconst_1
            // 295: invokestatic net/minecraft/client/renderer/GlStateManager.func_179131_c (FFFF)V
            // 298: ldc 255.0
            // 29a: ldc 255.0
            // 29c: ldc 255.0
            // 29e: ldc 255.0
            // 2a0: invokestatic net/minecraft/client/renderer/GlStateManager.func_179131_c (FFFF)V
            // 2a3: return
            // try (0 -> 18): 18 java/lang/RuntimeException
            // try (82 -> 87): 88 java/lang/RuntimeException
            // try (85 -> 92): 92 java/lang/RuntimeException
            // try (97 -> 101): 101 java/lang/RuntimeException
            // try (108 -> 120): 120 java/lang/RuntimeException
            // try (123 -> 139): 140 java/lang/RuntimeException
            // try (154 -> 158): 158 java/lang/RuntimeException
            // try (169 -> 189): 189 java/lang/RuntimeException
            // try (214 -> 234): 234 java/lang/RuntimeException
            // try (254 -> 278): 279 java/lang/RuntimeException
            // try (281 -> 305): 306 java/lang/RuntimeException
        }

        int c(int var1, int var2, int var3, int var4) {
            com.trolmastercard.sexmod.a var10000;
            int var10001;
            int var10002;
            byte var10003;
            byte var10004;
            byte var10005;
            label28: {
                try {
                    var10000 = gq.this.d;
                    var10001 = var1;
                    var10002 = var2;
                    var10003 = 0;
                    var10004 = 20;
                    if (this.b(var3, var4, var1, var2, var1 + 20, var2 + 20)) {
                        var10005 = 2;
                        break label28;
                    }
                } catch (RuntimeException var6) {
                    throw a(var6);
                }

                var10005 = 1;
            }

            label21: {
                try {
                    var10000.a(var10001, var10002, var10003, var10004 * var10005);
                    var1 += 20;
                    var10000 = gq.this.d;
                    var10001 = var1;
                    var10002 = var2;
                    var10003 = 20;
                    var10004 = 20;
                    if (this.b(var3, var4, var1, var2, var1 + 20, var2 + 20)) {
                        var10005 = 2;
                        break label21;
                    }
                } catch (RuntimeException var5) {
                    throw a(var5);
                }

                var10005 = 1;
            }

            var10000.a(var10001, var10002, var10003, var10004 * var10005);
            return var1 + 40;
        }

        void a(int var1, int var2, int var3, int var4, int var5) {
            gq.this.d.func_73729_b(var1, var2, 140, 20, 79, 20);
            var1 += 4;
            int var6 = var1;
            int var7 = var1 + 71 - 4;
            float var8 = this.a(var2, var6, var7, var3, var4, var5);
            int var9 = (int)b6.a(var6, var7, var8);

            com.trolmastercard.sexmod.a var10000;
            int var10001;
            int var10002;
            short var10003;
            label17: {
                try {
                    var10000 = gq.this.d;
                    var10001 = var9;
                    var10002 = var2;
                    if (this.b(var3, var4, var9, var2, var9 + 4, var2 + 20)) {
                        var10003 = 223;
                        break label17;
                    }
                } catch (RuntimeException var10) {
                    throw a(var10);
                }

                var10003 = 219;
            }

            var10000.func_73729_b(var10001, var10002, var10003, 20, 4, 20);
            gq.this.d.c.a(var5, (int)(var8 * 100.0F));
        }

        float a(int param1, int param2, int param3, int param4, int param5, int param6) {
            // $VF: Couldn't be decompiled
            // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
            // java.lang.RuntimeException: parsing failure!
            //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
            //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
            //
            // Bytecode:
            // 00: aload 0
            // 01: getfield com/trolmastercard/sexmod/gq$a.this$0 Lcom/trolmastercard/sexmod/gq;
            // 04: getfield com/trolmastercard/sexmod/gq.d Lcom/trolmastercard/sexmod/a;
            // 07: getfield com/trolmastercard/sexmod/a.f Z
            // 0a: ifne 18
            // 0d: aload 0
            // 0e: iload 6
            // 10: invokevirtual com/trolmastercard/sexmod/gq$a.a (I)F
            // 13: freturn
            // 14: invokestatic com/trolmastercard/sexmod/gq$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 17: athrow
            // 18: iload 4
            // 1a: i2f
            // 1b: ldc 0.33333334
            // 1d: aload 0
            // 1e: getfield com/trolmastercard/sexmod/gq$a.this$0 Lcom/trolmastercard/sexmod/gq;
            // 21: getfield com/trolmastercard/sexmod/gq.d Lcom/trolmastercard/sexmod/a;
            // 24: getfield com/trolmastercard/sexmod/a.field_146294_l I
            // 27: i2f
            // 28: fmul
            // 29: fcmpl
            // 2a: ifle 38
            // 2d: aload 0
            // 2e: iload 6
            // 30: invokevirtual com/trolmastercard/sexmod/gq$a.a (I)F
            // 33: freturn
            // 34: invokestatic com/trolmastercard/sexmod/gq$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 37: athrow
            // 38: iload 5
            // 3a: iload 1
            // 3b: if_icmplt 4e
            // 3e: iload 5
            // 40: iload 1
            // 41: bipush 20
            // 43: iadd
            // 44: if_icmple 59
            // 47: goto 4e
            // 4a: invokestatic com/trolmastercard/sexmod/gq$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 4d: athrow
            // 4e: aload 0
            // 4f: iload 6
            // 51: invokevirtual com/trolmastercard/sexmod/gq$a.a (I)F
            // 54: freturn
            // 55: invokestatic com/trolmastercard/sexmod/gq$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 58: athrow
            // 59: iload 4
            // 5b: iload 2
            // 5c: if_icmpge 65
            // 5f: fconst_0
            // 60: freturn
            // 61: invokestatic com/trolmastercard/sexmod/gq$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 64: athrow
            // 65: iload 4
            // 67: iload 3
            // 68: if_icmple 71
            // 6b: fconst_1
            // 6c: freturn
            // 6d: invokestatic com/trolmastercard/sexmod/gq$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 70: athrow
            // 71: iload 3
            // 72: iload 2
            // 73: isub
            // 74: istore 3
            // 75: iload 4
            // 77: iload 2
            // 78: isub
            // 79: istore 4
            // 7b: iload 4
            // 7d: i2f
            // 7e: iload 3
            // 7f: i2f
            // 80: fdiv
            // 81: freturn
            // try (0 -> 9): 9 java/lang/RuntimeException
            // try (11 -> 26): 26 java/lang/RuntimeException
            // try (28 -> 36): 37 java/lang/RuntimeException
            // try (31 -> 43): 43 java/lang/RuntimeException
            // try (45 -> 50): 50 java/lang/RuntimeException
            // try (52 -> 57): 57 java/lang/RuntimeException
        }

        float a(int var1) {
            Entry var2 = gq.this.d.c.d(gq.this.d.g).get(var1);
            return ((Integer)((Entry)var2.getValue()).getValue()).intValue() / 100.0F;
        }

        void b(int var1, int var2, int var3, int var4) {
            boolean var5 = gq.this.d.c.h(var4);

            label31: {
                try {
                    gq.this.field_148161_k.field_71446_o.func_110577_a(com.trolmastercard.sexmod.a.k);
                    if (var5) {
                        gq.this.d.func_73729_b(gq.i, var1, 0, 60, 119, 30);
                        break label31;
                    }
                } catch (RuntimeException var8) {
                    throw a(var8);
                }

                gq.this.d.func_73729_b(gq.i, var1, 0, 90, 95, 30);
            }

            int var6 = gq.i + 10;

            try {
                var1 += 5;
                gq.this.d.a(var6, var1, gq.this.d.c.g(var4));
                var6 += 25;
                if (var5) {
                    this.a(var6, var1, var2, var3, var4);
                    return;
                }
            } catch (RuntimeException var7) {
                throw a(var7);
            }

            this.c(var6, var1, var2, var3);
        }

        public void func_192634_a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, float var9) {
            try {
                if (this.a) {
                    this.b(var3, var6, var7);
                    return;
                }
            } catch (RuntimeException var11) {
                throw a(var11);
            }

            try {
                if (this.d == gw.GIRL_SPECIFIC) {
                    this.b(var3, var6, var7, var1);
                    return;
                }
            } catch (RuntimeException var10) {
                throw a(var10);
            }

            this.a(var3, var6, var7);
        }

        void a(String var1, int var2, int var3) {
            this.c.func_78276_b(var1, var2, var3, 3809871);
            GlStateManager.func_179131_c(1.0F, 1.0F, 1.0F, 1.0F);
        }

        void b(int param1, int param2) {
            // $VF: Couldn't be decompiled
            // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
            // java.lang.RuntimeException: parsing failure!
            //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
            //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
            //
            // Bytecode:
            // 00: bipush 30
            // 02: istore 3
            // 03: iload 1
            // 04: iload 3
            // 05: if_icmple 7a
            // 08: iload 1
            // 09: iload 3
            // 0a: bipush 20
            // 0c: iadd
            // 0d: if_icmpge 7a
            // 10: goto 17
            // 13: invokestatic com/trolmastercard/sexmod/gq$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 16: athrow
            // 17: aload 0
            // 18: getfield com/trolmastercard/sexmod/gq$a.this$0 Lcom/trolmastercard/sexmod/gq;
            // 1b: bipush 1
            // 1c: putfield com/trolmastercard/sexmod/gq.h Z
            // 1f: aload 0
            // 20: getfield com/trolmastercard/sexmod/gq$a.this$0 Lcom/trolmastercard/sexmod/gq;
            // 23: invokestatic com/trolmastercard/sexmod/gq.access$600 (Lcom/trolmastercard/sexmod/gq;)Lnet/minecraft/client/Minecraft;
            // 26: invokevirtual net/minecraft/client/Minecraft.func_147118_V ()Lnet/minecraft/client/audio/SoundHandler;
            // 29: getstatic net/minecraft/init/SoundEvents.field_187909_gi Lnet/minecraft/util/SoundEvent;
            // 2c: fconst_1
            // 2d: invokestatic net/minecraft/client/audio/PositionedSoundRecord.func_184371_a (Lnet/minecraft/util/SoundEvent;F)Lnet/minecraft/client/audio/PositionedSoundRecord;
            // 30: invokevirtual net/minecraft/client/audio/SoundHandler.func_147682_a (Lnet/minecraft/client/audio/ISound;)V
            // 33: new java/util/ArrayList
            // 36: dup
            // 37: invokespecial java/util/ArrayList.<init> ()V
            // 3a: astore 4
            // 3c: aload 4
            // 3e: ldc "cross"
            // 40: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
            // 45: pop
            // 46: aload 4
            // 48: aload 0
            // 49: getfield com/trolmastercard/sexmod/gq$a.this$0 Lcom/trolmastercard/sexmod/gq;
            // 4c: getfield com/trolmastercard/sexmod/gq.d Lcom/trolmastercard/sexmod/a;
            // 4f: getfield com/trolmastercard/sexmod/a.c Lcom/trolmastercard/sexmod/em;
            // 52: invokestatic com/trolmastercard/sexmod/br.a (Lcom/trolmastercard/sexmod/em;)Ljava/util/HashMap;
            // 55: getstatic com/trolmastercard/sexmod/gw.CUSTOM_BONE Lcom/trolmastercard/sexmod/gw;
            // 58: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
            // 5b: checkcast java/util/Collection
            // 5e: invokeinterface java/util/List.addAll (Ljava/util/Collection;)Z 2
            // 63: pop
            // 64: getstatic com/trolmastercard/sexmod/a.m Ljava/util/List;
            // 67: aload 0
            // 68: getfield com/trolmastercard/sexmod/gq$a.this$0 Lcom/trolmastercard/sexmod/gq;
            // 6b: getfield com/trolmastercard/sexmod/gq.d Lcom/trolmastercard/sexmod/a;
            // 6e: getfield com/trolmastercard/sexmod/a.c Lcom/trolmastercard/sexmod/em;
            // 71: invokestatic com/trolmastercard/sexmod/a.b (Lcom/trolmastercard/sexmod/em;)Ljava/util/Map$Entry;
            // 74: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
            // 79: pop
            // 7a: aload 0
            // 7b: getfield com/trolmastercard/sexmod/gq$a.e Z
            // 7e: ifne 86
            // 81: return
            // 82: invokestatic com/trolmastercard/sexmod/gq$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 85: athrow
            // 86: iinc 3 40
            // 89: iload 1
            // 8a: iload 3
            // 8b: if_icmple cb
            // 8e: iload 1
            // 8f: iload 3
            // 90: bipush 20
            // 92: iadd
            // 93: if_icmpge cb
            // 96: goto 9d
            // 99: invokestatic com/trolmastercard/sexmod/gq$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 9c: athrow
            // 9d: aload 0
            // 9e: getfield com/trolmastercard/sexmod/gq$a.this$0 Lcom/trolmastercard/sexmod/gq;
            // a1: invokestatic com/trolmastercard/sexmod/gq.access$700 (Lcom/trolmastercard/sexmod/gq;)Lnet/minecraft/client/Minecraft;
            // a4: invokevirtual net/minecraft/client/Minecraft.func_147118_V ()Lnet/minecraft/client/audio/SoundHandler;
            // a7: getstatic net/minecraft/init/SoundEvents.field_187909_gi Lnet/minecraft/util/SoundEvent;
            // aa: fconst_1
            // ab: invokestatic net/minecraft/client/audio/PositionedSoundRecord.func_184371_a (Lnet/minecraft/util/SoundEvent;F)Lnet/minecraft/client/audio/PositionedSoundRecord;
            // ae: invokevirtual net/minecraft/client/audio/SoundHandler.func_147682_a (Lnet/minecraft/client/audio/ISound;)V
            // b1: getstatic com/trolmastercard/sexmod/a.m Ljava/util/List;
            // b4: getstatic com/trolmastercard/sexmod/a.m Ljava/util/List;
            // b7: invokeinterface java/util/List.size ()I 1
            // bc: bipush 1
            // bd: isub
            // be: invokeinterface java/util/List.remove (I)Ljava/lang/Object; 2
            // c3: pop
            // c4: goto cb
            // c7: invokestatic com/trolmastercard/sexmod/gq$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // ca: athrow
            // cb: return
            // try (2 -> 10): 11 java/lang/RuntimeException
            // try (52 -> 56): 56 java/lang/RuntimeException
            // try (58 -> 67): 68 java/lang/RuntimeException
            // try (62 -> 85): 86 java/lang/RuntimeException
        }

        void a(int param1, int param2) {
            // $VF: Couldn't be decompiled
            // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
            // java.lang.RuntimeException: parsing failure!
            //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
            //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
            //
            // Bytecode:
            // 00: iload 1
            // 01: bipush 40
            // 03: if_icmple 2a
            // 06: iload 1
            // 07: bipush 60
            // 09: if_icmpge 2a
            // 0c: goto 13
            // 0f: invokestatic com/trolmastercard/sexmod/gq$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 12: athrow
            // 13: aload 0
            // 14: getfield com/trolmastercard/sexmod/gq$a.this$0 Lcom/trolmastercard/sexmod/gq;
            // 17: getfield com/trolmastercard/sexmod/gq.d Lcom/trolmastercard/sexmod/a;
            // 1a: aload 0
            // 1b: getfield com/trolmastercard/sexmod/gq$a.d Lcom/trolmastercard/sexmod/gw;
            // 1e: bipush 0
            // 1f: iload 2
            // 20: invokevirtual com/trolmastercard/sexmod/a.a (Lcom/trolmastercard/sexmod/gw;ZI)V
            // 23: goto 2a
            // 26: invokestatic com/trolmastercard/sexmod/gq$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 29: athrow
            // 2a: iload 1
            // 2b: bipush 60
            // 2d: if_icmple 54
            // 30: iload 1
            // 31: bipush 80
            // 33: if_icmpge 54
            // 36: goto 3d
            // 39: invokestatic com/trolmastercard/sexmod/gq$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 3c: athrow
            // 3d: aload 0
            // 3e: getfield com/trolmastercard/sexmod/gq$a.this$0 Lcom/trolmastercard/sexmod/gq;
            // 41: getfield com/trolmastercard/sexmod/gq.d Lcom/trolmastercard/sexmod/a;
            // 44: aload 0
            // 45: getfield com/trolmastercard/sexmod/gq$a.d Lcom/trolmastercard/sexmod/gw;
            // 48: bipush 1
            // 49: iload 2
            // 4a: invokevirtual com/trolmastercard/sexmod/a.a (Lcom/trolmastercard/sexmod/gw;ZI)V
            // 4d: goto 54
            // 50: invokestatic com/trolmastercard/sexmod/gq$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 53: athrow
            // 54: return
            // try (0 -> 6): 7 java/lang/RuntimeException
            // try (3 -> 17): 18 java/lang/RuntimeException
            // try (20 -> 26): 27 java/lang/RuntimeException
            // try (23 -> 37): 38 java/lang/RuntimeException
        }

        void c(int var1, int var2) {
            try {
                if (!gq.this.d.c.h(var2)) {
                    this.a(var1, var2);
                }
            } catch (RuntimeException var3) {
                throw a(var3);
            }
        }

        public void a(int var1, int var2, int var3, int var4) {
            try {
                if (var3 != 0) {
                    return;
                }
            } catch (RuntimeException var6) {
                throw a(var6);
            }

            try {
                if (var2 < 5) {
                    return;
                }
            } catch (RuntimeException var9) {
                throw a(var9);
            }

            try {
                if (var2 > 25) {
                    return;
                }
            } catch (RuntimeException var5) {
                throw a(var5);
            }

            try {
                if (this.a) {
                    this.b(var1, var2);
                    return;
                }
            } catch (RuntimeException var8) {
                throw a(var8);
            }

            try {
                if (this.d == gw.GIRL_SPECIFIC) {
                    this.c(var1, var4);
                    return;
                }
            } catch (RuntimeException var7) {
                throw a(var7);
            }

            this.a(var1, var4);
        }

        public void func_192633_a(int var1, int var2, int var3, float var4) {
        }

        public boolean func_148278_a(int var1, int var2, int var3, int var4, int var5, int var6) {
            return false;
        }

        public void func_148277_b(int var1, int var2, int var3, int var4, int var5, int var6) {
        }

        private static RuntimeException a(RuntimeException var0) {
            return var0;
        }
    }
}
