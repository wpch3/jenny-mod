package com.trolmastercard.sexmod;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;

public class j extends GuiScreen {
    static final float f = 100.0F;
    static final float g = 15.0F;
    static final float j = 0.5F;
    static final ResourceLocation h = new ResourceLocation("sexmod", "textures/gui/command.png");
    static final HashSet<Material> l = new HashSet<>(
        Arrays.asList(Material.field_151571_B, Material.field_151576_e, Material.field_151595_p, Material.field_151578_c)
    );
    public static boolean d = false;
    float m = 0.0F;
    float a = 0.0F;
    float k = 0.0F;
    float n = 0.0F;
    float i = 0.0F;
    IBlockState e;
    BlockPos c;
    EnumFacing b;

    public j() {
        Minecraft var1 = Minecraft.func_71410_x();

        label27: {
            try {
                this.c = var1.field_71476_x.func_178782_a();
                if (var1.field_71476_x.field_178784_b == null) {
                    this.b = EnumFacing.NORTH;
                    break label27;
                }
            } catch (NullPointerException var3) {
                throw a(var3);
            }

            this.b = var1.field_71476_x.field_178784_b.func_176734_d();
        }

        try {
            if (this.c == null) {
                this.c = BlockPos.field_177992_a;
            }
        } catch (NullPointerException var2) {
            throw a(var2);
        }

        this.e = var1.field_71441_e.func_180495_p(this.c);
    }

    public void func_146281_b() {
        super.func_146281_b();
        List var1 = Arrays.asList(this.a, this.k, this.n, this.i);
        float var2 = Collections.max(var1);

        try {
            if (var2 == 0.0F) {
                return;
            }
        } catch (NullPointerException var5) {
            throw a(var5);
        }

        try {
            if (this.a == var2) {
                this.b();
            }
        } catch (NullPointerException var7) {
            throw a(var7);
        }

        try {
            if (this.k == var2) {
                this.d();
            }
        } catch (NullPointerException var4) {
            throw a(var4);
        }

        try {
            if (this.n == var2) {
                this.c();
            }
        } catch (NullPointerException var6) {
            throw a(var6);
        }

        try {
            if (this.i == var2) {
                this.a();
            }
        } catch (NullPointerException var3) {
            throw a(var3);
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
        // 01: getfield com/trolmastercard/sexmod/j.field_146297_k Lnet/minecraft/client/Minecraft;
        // 04: getfield net/minecraft/client/Minecraft.field_71441_e Lnet/minecraft/client/multiplayer/WorldClient;
        // 07: aload 0
        // 08: getfield com/trolmastercard/sexmod/j.c Lnet/minecraft/util/math/BlockPos;
        // 0b: invokevirtual net/minecraft/client/multiplayer/WorldClient.func_180495_p (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        // 0e: astore 1
        // 0f: aload 1
        // 10: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c ()Lnet/minecraft/block/Block; 1
        // 15: instanceof net/minecraft/block/BlockBed
        // 18: ifne 2e
        // 1b: aload 1
        // 1c: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c ()Lnet/minecraft/block/Block; 1
        // 21: instanceof net/minecraft/block/BlockChest
        // 24: ifeq 59
        // 27: goto 2e
        // 2a: invokestatic com/trolmastercard/sexmod/j.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
        // 2d: athrow
        // 2e: getstatic com/trolmastercard/sexmod/ge.b Lnet/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper;
        // 31: new com/trolmastercard/sexmod/h6
        // 34: dup
        // 35: aload 0
        // 36: getfield com/trolmastercard/sexmod/j.c Lnet/minecraft/util/math/BlockPos;
        // 39: aload 0
        // 3a: getfield com/trolmastercard/sexmod/j.c Lnet/minecraft/util/math/BlockPos;
        // 3d: invokestatic com/trolmastercard/sexmod/gm.a (Lnet/minecraft/util/math/BlockPos;)Z
        // 40: ifne 52
        // 43: goto 4a
        // 46: invokestatic com/trolmastercard/sexmod/j.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
        // 49: athrow
        // 4a: bipush 1
        // 4b: goto 53
        // 4e: invokestatic com/trolmastercard/sexmod/j.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
        // 51: athrow
        // 52: bipush 0
        // 53: invokespecial com/trolmastercard/sexmod/h6.<init> (Lnet/minecraft/util/math/BlockPos;Z)V
        // 56: invokevirtual net/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper.sendToServer (Lnet/minecraftforge/fml/common/network/simpleimpl/IMessage;)V
        // 59: return
        // try (7 -> 15): 16 java/lang/NullPointerException
        // try (11 -> 27): 28 java/lang/NullPointerException
        // try (18 -> 32): 32 java/lang/NullPointerException
    }

    void d() {
        SimpleNetworkWrapper var10000;
        fj var10001;
        fj var10002;
        boolean var10003;
        label16: {
            try {
                var10000 = ge.b;
                var10001 = new fj;
                var10002 = var10001;
                if (!d) {
                    var10003 = true;
                    break label16;
                }
            } catch (NullPointerException var1) {
                throw a(var1);
            }

            var10003 = false;
        }

        var10002./* $VF: Unable to resugar constructor */<init>(var10003);
        var10000.sendToServer(var10001);
    }

    void c() {
        fa.a();
    }

    void a() {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 0
        // 01: getfield com/trolmastercard/sexmod/j.e Lnet/minecraft/block/state/IBlockState;
        // 04: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c ()Lnet/minecraft/block/Block; 1
        // 09: astore 1
        // 0a: aload 1
        // 0b: instanceof net/minecraft/block/BlockLog
        // 0e: ifeq 49
        // 11: aload 0
        // 12: getfield com/trolmastercard/sexmod/j.c Lnet/minecraft/util/math/BlockPos;
        // 15: invokestatic com/trolmastercard/sexmod/gm.a (Lnet/minecraft/util/math/BlockPos;)Z
        // 18: ifeq 38
        // 1b: goto 22
        // 1e: invokestatic com/trolmastercard/sexmod/j.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
        // 21: athrow
        // 22: getstatic com/trolmastercard/sexmod/ge.b Lnet/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper;
        // 25: new com/trolmastercard/sexmod/au
        // 28: dup
        // 29: aload 0
        // 2a: getfield com/trolmastercard/sexmod/j.c Lnet/minecraft/util/math/BlockPos;
        // 2d: invokespecial com/trolmastercard/sexmod/au.<init> (Lnet/minecraft/util/math/BlockPos;)V
        // 30: invokevirtual net/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper.sendToServer (Lnet/minecraftforge/fml/common/network/simpleimpl/IMessage;)V
        // 33: return
        // 34: invokestatic com/trolmastercard/sexmod/j.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
        // 37: athrow
        // 38: getstatic com/trolmastercard/sexmod/ge.b Lnet/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper;
        // 3b: new com/trolmastercard/sexmod/fc
        // 3e: dup
        // 3f: aload 0
        // 40: getfield com/trolmastercard/sexmod/j.c Lnet/minecraft/util/math/BlockPos;
        // 43: invokespecial com/trolmastercard/sexmod/fc.<init> (Lnet/minecraft/util/math/BlockPos;)V
        // 46: invokevirtual net/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper.sendToServer (Lnet/minecraftforge/fml/common/network/simpleimpl/IMessage;)V
        // 49: aload 0
        // 4a: invokevirtual com/trolmastercard/sexmod/j.e ()[Ljava/lang/Object;
        // 4d: astore 2
        // 4e: aload 2
        // 4f: ifnull 92
        // 52: aload 0
        // 53: getfield com/trolmastercard/sexmod/j.c Lnet/minecraft/util/math/BlockPos;
        // 56: invokestatic com/trolmastercard/sexmod/gm.a (Lnet/minecraft/util/math/BlockPos;)Z
        // 59: ifeq 79
        // 5c: goto 63
        // 5f: invokestatic com/trolmastercard/sexmod/j.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
        // 62: athrow
        // 63: getstatic com/trolmastercard/sexmod/ge.b Lnet/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper;
        // 66: new com/trolmastercard/sexmod/au
        // 69: dup
        // 6a: aload 0
        // 6b: getfield com/trolmastercard/sexmod/j.c Lnet/minecraft/util/math/BlockPos;
        // 6e: invokespecial com/trolmastercard/sexmod/au.<init> (Lnet/minecraft/util/math/BlockPos;)V
        // 71: invokevirtual net/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper.sendToServer (Lnet/minecraftforge/fml/common/network/simpleimpl/IMessage;)V
        // 74: return
        // 75: invokestatic com/trolmastercard/sexmod/j.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
        // 78: athrow
        // 79: getstatic com/trolmastercard/sexmod/ge.b Lnet/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper;
        // 7c: new com/trolmastercard/sexmod/e6
        // 7f: dup
        // 80: aload 2
        // 81: bipush 0
        // 82: aaload
        // 83: checkcast net/minecraft/util/math/BlockPos
        // 86: aload 2
        // 87: bipush 1
        // 88: aaload
        // 89: checkcast net/minecraft/util/EnumFacing
        // 8c: invokespecial com/trolmastercard/sexmod/e6.<init> (Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)V
        // 8f: invokevirtual net/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper.sendToServer (Lnet/minecraftforge/fml/common/network/simpleimpl/IMessage;)V
        // 92: return
        // try (4 -> 11): 12 java/lang/NullPointerException
        // try (7 -> 22): 22 java/lang/NullPointerException
        // try (34 -> 40): 41 java/lang/NullPointerException
        // try (36 -> 51): 51 java/lang/NullPointerException
    }

    @Nullable
    Object[] e() {
        Material var1 = this.field_146297_k.field_71441_e.func_180495_p(this.c).func_185904_a();
        EntityPlayerSP var2 = this.field_146297_k.field_71439_g;

        try {
            if (!l.contains(var1)) {
                return null;
            }
        } catch (NullPointerException var4) {
            throw a(var4);
        }

        try {
            if (var2.func_180425_c().func_177956_o() > this.c.func_177956_o()) {
                return null;
            }
        } catch (NullPointerException var6) {
            throw a(var6);
        }

        BlockPos var3 = this.c;

        while (
            this.field_146297_k.field_71441_e.func_180495_p(var3.func_177977_b().func_177971_a(this.b.func_176734_d().func_176730_m())).func_177230_c()
                == Blocks.field_150350_a
        ) {
            var3 = var3.func_177977_b();
        }

        try {
            if (this.c.func_177956_o() - var3.func_177956_o() > 3) {
                return null;
            }
        } catch (NullPointerException var5) {
            throw a(var5);
        }

        return new Object[]{var3, this.b};
    }

    public void func_73863_a(int param1, int param2, float param3) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 000: aload 0
        // 001: iload 1
        // 002: iload 2
        // 003: fload 3
        // 004: invokespecial net/minecraft/client/gui/GuiScreen.func_73863_a (IIF)V
        // 007: sipush 3042
        // 00a: invokestatic org/lwjgl/opengl/GL11.glEnable (I)V
        // 00d: sipush 770
        // 010: sipush 771
        // 013: bipush 1
        // 014: bipush 0
        // 015: invokestatic net/minecraft/client/renderer/OpenGlHelper.func_148821_a (IIII)V
        // 018: sipush 770
        // 01b: sipush 771
        // 01e: invokestatic org/lwjgl/opengl/GL11.glBlendFunc (II)V
        // 021: aload 0
        // 022: fconst_1
        // 023: aload 0
        // 024: getfield com/trolmastercard/sexmod/j.m F
        // 027: aload 0
        // 028: getfield com/trolmastercard/sexmod/j.field_146297_k Lnet/minecraft/client/Minecraft;
        // 02b: invokevirtual net/minecraft/client/Minecraft.func_193989_ak ()F
        // 02e: ldc 5.0
        // 030: fdiv
        // 031: fadd
        // 032: invokestatic java/lang/Math.min (FF)F
        // 035: putfield com/trolmastercard/sexmod/j.m F
        // 038: goto 03d
        // 03b: astore 4
        // 03d: aload 0
        // 03e: aload 0
        // 03f: getfield com/trolmastercard/sexmod/j.m F
        // 042: f2d
        // 043: invokevirtual com/trolmastercard/sexmod/j.a (D)D
        // 046: d2f
        // 047: fstore 4
        // 049: fconst_1
        // 04a: fload 4
        // 04c: fsub
        // 04d: ldc 100.0
        // 04f: fmul
        // 050: fstore 5
        // 052: aload 0
        // 053: dup
        // 054: getfield com/trolmastercard/sexmod/j.a F
        // 057: iload 1
        // 058: aload 0
        // 059: getfield com/trolmastercard/sexmod/j.field_146294_l I
        // 05c: bipush 2
        // 05d: idiv
        // 05e: if_icmpge 07a
        // 061: iload 2
        // 062: aload 0
        // 063: getfield com/trolmastercard/sexmod/j.field_146295_m I
        // 066: bipush 2
        // 067: idiv
        // 068: if_icmple 07a
        // 06b: goto 072
        // 06e: invokestatic com/trolmastercard/sexmod/j.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
        // 071: athrow
        // 072: bipush 1
        // 073: goto 07b
        // 076: invokestatic com/trolmastercard/sexmod/j.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
        // 079: athrow
        // 07a: bipush -1
        // 07b: i2f
        // 07c: aload 0
        // 07d: getfield com/trolmastercard/sexmod/j.field_146297_k Lnet/minecraft/client/Minecraft;
        // 080: invokevirtual net/minecraft/client/Minecraft.func_193989_ak ()F
        // 083: fmul
        // 084: fadd
        // 085: putfield com/trolmastercard/sexmod/j.a F
        // 088: aload 0
        // 089: dup
        // 08a: getfield com/trolmastercard/sexmod/j.k F
        // 08d: iload 1
        // 08e: aload 0
        // 08f: getfield com/trolmastercard/sexmod/j.field_146294_l I
        // 092: bipush 2
        // 093: idiv
        // 094: if_icmpge 0b0
        // 097: iload 2
        // 098: aload 0
        // 099: getfield com/trolmastercard/sexmod/j.field_146295_m I
        // 09c: bipush 2
        // 09d: idiv
        // 09e: if_icmpge 0b0
        // 0a1: goto 0a8
        // 0a4: invokestatic com/trolmastercard/sexmod/j.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
        // 0a7: athrow
        // 0a8: bipush 1
        // 0a9: goto 0b1
        // 0ac: invokestatic com/trolmastercard/sexmod/j.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
        // 0af: athrow
        // 0b0: bipush -1
        // 0b1: i2f
        // 0b2: aload 0
        // 0b3: getfield com/trolmastercard/sexmod/j.field_146297_k Lnet/minecraft/client/Minecraft;
        // 0b6: invokevirtual net/minecraft/client/Minecraft.func_193989_ak ()F
        // 0b9: fmul
        // 0ba: fadd
        // 0bb: putfield com/trolmastercard/sexmod/j.k F
        // 0be: aload 0
        // 0bf: dup
        // 0c0: getfield com/trolmastercard/sexmod/j.n F
        // 0c3: iload 1
        // 0c4: aload 0
        // 0c5: getfield com/trolmastercard/sexmod/j.field_146294_l I
        // 0c8: bipush 2
        // 0c9: idiv
        // 0ca: if_icmple 0e6
        // 0cd: iload 2
        // 0ce: aload 0
        // 0cf: getfield com/trolmastercard/sexmod/j.field_146295_m I
        // 0d2: bipush 2
        // 0d3: idiv
        // 0d4: if_icmple 0e6
        // 0d7: goto 0de
        // 0da: invokestatic com/trolmastercard/sexmod/j.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
        // 0dd: athrow
        // 0de: bipush 1
        // 0df: goto 0e7
        // 0e2: invokestatic com/trolmastercard/sexmod/j.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
        // 0e5: athrow
        // 0e6: bipush -1
        // 0e7: i2f
        // 0e8: aload 0
        // 0e9: getfield com/trolmastercard/sexmod/j.field_146297_k Lnet/minecraft/client/Minecraft;
        // 0ec: invokevirtual net/minecraft/client/Minecraft.func_193989_ak ()F
        // 0ef: fmul
        // 0f0: fadd
        // 0f1: putfield com/trolmastercard/sexmod/j.n F
        // 0f4: aload 0
        // 0f5: dup
        // 0f6: getfield com/trolmastercard/sexmod/j.i F
        // 0f9: iload 1
        // 0fa: aload 0
        // 0fb: getfield com/trolmastercard/sexmod/j.field_146294_l I
        // 0fe: bipush 2
        // 0ff: idiv
        // 100: if_icmple 11c
        // 103: iload 2
        // 104: aload 0
        // 105: getfield com/trolmastercard/sexmod/j.field_146295_m I
        // 108: bipush 2
        // 109: idiv
        // 10a: if_icmpge 11c
        // 10d: goto 114
        // 110: invokestatic com/trolmastercard/sexmod/j.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
        // 113: athrow
        // 114: bipush 1
        // 115: goto 11d
        // 118: invokestatic com/trolmastercard/sexmod/j.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
        // 11b: athrow
        // 11c: bipush -1
        // 11d: i2f
        // 11e: aload 0
        // 11f: getfield com/trolmastercard/sexmod/j.field_146297_k Lnet/minecraft/client/Minecraft;
        // 122: invokevirtual net/minecraft/client/Minecraft.func_193989_ak ()F
        // 125: fmul
        // 126: fadd
        // 127: putfield com/trolmastercard/sexmod/j.i F
        // 12a: aload 0
        // 12b: aload 0
        // 12c: getfield com/trolmastercard/sexmod/j.a F
        // 12f: fconst_0
        // 130: fconst_1
        // 131: invokestatic com/trolmastercard/sexmod/be.b (FFF)F
        // 134: putfield com/trolmastercard/sexmod/j.a F
        // 137: aload 0
        // 138: aload 0
        // 139: getfield com/trolmastercard/sexmod/j.k F
        // 13c: fconst_0
        // 13d: fconst_1
        // 13e: invokestatic com/trolmastercard/sexmod/be.b (FFF)F
        // 141: putfield com/trolmastercard/sexmod/j.k F
        // 144: aload 0
        // 145: aload 0
        // 146: getfield com/trolmastercard/sexmod/j.n F
        // 149: fconst_0
        // 14a: fconst_1
        // 14b: invokestatic com/trolmastercard/sexmod/be.b (FFF)F
        // 14e: putfield com/trolmastercard/sexmod/j.n F
        // 151: aload 0
        // 152: aload 0
        // 153: getfield com/trolmastercard/sexmod/j.i F
        // 156: fconst_0
        // 157: fconst_1
        // 158: invokestatic com/trolmastercard/sexmod/be.b (FFF)F
        // 15b: putfield com/trolmastercard/sexmod/j.i F
        // 15e: invokestatic net/minecraft/client/renderer/GlStateManager.func_179094_E ()V
        // 161: aload 0
        // 162: getfield com/trolmastercard/sexmod/j.field_146294_l I
        // 165: i2f
        // 166: fconst_2
        // 167: fdiv
        // 168: aload 0
        // 169: getfield com/trolmastercard/sexmod/j.field_146295_m I
        // 16c: i2f
        // 16d: fconst_2
        // 16e: fdiv
        // 16f: fconst_0
        // 170: invokestatic net/minecraft/client/renderer/GlStateManager.func_179109_b (FFF)V
        // 173: fload 4
        // 175: fload 4
        // 177: fload 4
        // 179: invokestatic net/minecraft/client/renderer/GlStateManager.func_179152_a (FFF)V
        // 17c: aload 0
        // 17d: getfield com/trolmastercard/sexmod/j.field_146297_k Lnet/minecraft/client/Minecraft;
        // 180: getfield net/minecraft/client/Minecraft.field_71446_o Lnet/minecraft/client/renderer/texture/TextureManager;
        // 183: getstatic com/trolmastercard/sexmod/j.h Lnet/minecraft/util/ResourceLocation;
        // 186: invokevirtual net/minecraft/client/renderer/texture/TextureManager.func_110577_a (Lnet/minecraft/util/ResourceLocation;)V
        // 189: invokestatic net/minecraft/client/renderer/GlStateManager.func_179094_E ()V
        // 18c: fconst_1
        // 18d: aload 0
        // 18e: getfield com/trolmastercard/sexmod/j.k F
        // 191: ldc 0.5
        // 193: fmul
        // 194: fadd
        // 195: fconst_1
        // 196: aload 0
        // 197: getfield com/trolmastercard/sexmod/j.k F
        // 19a: ldc 0.5
        // 19c: fmul
        // 19d: fadd
        // 19e: fconst_1
        // 19f: invokestatic net/minecraft/client/renderer/GlStateManager.func_179152_a (FFF)V
        // 1a2: aload 0
        // 1a3: ldc -62.0
        // 1a5: fload 5
        // 1a7: fadd
        // 1a8: aload 0
        // 1a9: getfield com/trolmastercard/sexmod/j.k F
        // 1ac: ldc 15.0
        // 1ae: fmul
        // 1af: fsub
        // 1b0: ldc -62.0
        // 1b2: fload 5
        // 1b4: fadd
        // 1b5: aload 0
        // 1b6: getfield com/trolmastercard/sexmod/j.k F
        // 1b9: ldc 15.0
        // 1bb: fmul
        // 1bc: fsub
        // 1bd: bipush 0
        // 1be: bipush 0
        // 1bf: bipush 64
        // 1c1: bipush 64
        // 1c3: invokevirtual com/trolmastercard/sexmod/j.func_175174_a (FFIIII)V
        // 1c6: aload 0
        // 1c7: fload 5
        // 1c9: invokevirtual com/trolmastercard/sexmod/j.c (F)V
        // 1cc: getstatic com/trolmastercard/sexmod/j.d Z
        // 1cf: ifeq 200
        // 1d2: aload 0
        // 1d3: ldc -62.0
        // 1d5: fload 5
        // 1d7: fadd
        // 1d8: aload 0
        // 1d9: getfield com/trolmastercard/sexmod/j.k F
        // 1dc: ldc 15.0
        // 1de: fmul
        // 1df: fsub
        // 1e0: ldc -62.0
        // 1e2: fload 5
        // 1e4: fadd
        // 1e5: aload 0
        // 1e6: getfield com/trolmastercard/sexmod/j.k F
        // 1e9: ldc 15.0
        // 1eb: fmul
        // 1ec: fsub
        // 1ed: sipush 128
        // 1f0: bipush 64
        // 1f2: bipush 64
        // 1f4: bipush 64
        // 1f6: invokevirtual com/trolmastercard/sexmod/j.func_175174_a (FFIIII)V
        // 1f9: goto 200
        // 1fc: invokestatic com/trolmastercard/sexmod/j.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
        // 1ff: athrow
        // 200: invokestatic net/minecraft/client/renderer/GlStateManager.func_179121_F ()V
        // 203: invokestatic net/minecraft/client/renderer/GlStateManager.func_179094_E ()V
        // 206: fconst_1
        // 207: aload 0
        // 208: getfield com/trolmastercard/sexmod/j.n F
        // 20b: ldc 0.5
        // 20d: fmul
        // 20e: fadd
        // 20f: fconst_1
        // 210: aload 0
        // 211: getfield com/trolmastercard/sexmod/j.n F
        // 214: ldc 0.5
        // 216: fmul
        // 217: fadd
        // 218: fconst_1
        // 219: invokestatic net/minecraft/client/renderer/GlStateManager.func_179152_a (FFF)V
        // 21c: aload 0
        // 21d: ldc -2.0
        // 21f: fload 5
        // 221: fsub
        // 222: aload 0
        // 223: getfield com/trolmastercard/sexmod/j.n F
        // 226: ldc 15.0
        // 228: fmul
        // 229: fadd
        // 22a: ldc -2.0
        // 22c: fload 5
        // 22e: fsub
        // 22f: aload 0
        // 230: getfield com/trolmastercard/sexmod/j.n F
        // 233: ldc 15.0
        // 235: fmul
        // 236: fadd
        // 237: bipush 0
        // 238: bipush 0
        // 239: bipush 64
        // 23b: bipush 64
        // 23d: invokevirtual com/trolmastercard/sexmod/j.func_175174_a (FFIIII)V
        // 240: aload 0
        // 241: fload 5
        // 243: invokevirtual com/trolmastercard/sexmod/j.a (F)V
        // 246: invokestatic com/trolmastercard/sexmod/fa.b ()Z
        // 249: ifeq 27a
        // 24c: aload 0
        // 24d: ldc -2.0
        // 24f: fload 5
        // 251: fsub
        // 252: aload 0
        // 253: getfield com/trolmastercard/sexmod/j.n F
        // 256: ldc 15.0
        // 258: fmul
        // 259: fadd
        // 25a: ldc -2.0
        // 25c: fload 5
        // 25e: fsub
        // 25f: aload 0
        // 260: getfield com/trolmastercard/sexmod/j.n F
        // 263: ldc 15.0
        // 265: fmul
        // 266: fadd
        // 267: sipush 128
        // 26a: bipush 64
        // 26c: bipush 64
        // 26e: bipush 64
        // 270: invokevirtual com/trolmastercard/sexmod/j.func_175174_a (FFIIII)V
        // 273: goto 27a
        // 276: invokestatic com/trolmastercard/sexmod/j.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
        // 279: athrow
        // 27a: invokestatic net/minecraft/client/renderer/GlStateManager.func_179121_F ()V
        // 27d: aload 0
        // 27e: getfield com/trolmastercard/sexmod/j.e Lnet/minecraft/block/state/IBlockState;
        // 281: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c ()Lnet/minecraft/block/Block; 1
        // 286: astore 6
        // 288: aload 6
        // 28a: instanceof net/minecraft/block/BlockChest
        // 28d: istore 7
        // 28f: aload 6
        // 291: instanceof net/minecraft/block/BlockBed
        // 294: istore 8
        // 296: iload 7
        // 298: ifne 2a7
        // 29b: iload 8
        // 29d: ifeq 34a
        // 2a0: goto 2a7
        // 2a3: invokestatic com/trolmastercard/sexmod/j.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
        // 2a6: athrow
        // 2a7: invokestatic net/minecraft/client/renderer/GlStateManager.func_179094_E ()V
        // 2aa: fconst_1
        // 2ab: aload 0
        // 2ac: getfield com/trolmastercard/sexmod/j.a F
        // 2af: ldc 0.5
        // 2b1: fmul
        // 2b2: fadd
        // 2b3: fconst_1
        // 2b4: aload 0
        // 2b5: getfield com/trolmastercard/sexmod/j.a F
        // 2b8: ldc 0.5
        // 2ba: fmul
        // 2bb: fadd
        // 2bc: fconst_1
        // 2bd: invokestatic net/minecraft/client/renderer/GlStateManager.func_179152_a (FFF)V
        // 2c0: aload 0
        // 2c1: ldc -62.0
        // 2c3: fload 5
        // 2c5: fadd
        // 2c6: aload 0
        // 2c7: getfield com/trolmastercard/sexmod/j.a F
        // 2ca: ldc 15.0
        // 2cc: fmul
        // 2cd: fsub
        // 2ce: ldc -2.0
        // 2d0: fload 5
        // 2d2: fsub
        // 2d3: aload 0
        // 2d4: getfield com/trolmastercard/sexmod/j.a F
        // 2d7: ldc 15.0
        // 2d9: fmul
        // 2da: fadd
        // 2db: bipush 0
        // 2dc: bipush 0
        // 2dd: bipush 64
        // 2df: bipush 64
        // 2e1: invokevirtual com/trolmastercard/sexmod/j.func_175174_a (FFIIII)V
        // 2e4: iload 7
        // 2e6: ifeq 2fd
        // 2e9: goto 2f0
        // 2ec: invokestatic com/trolmastercard/sexmod/j.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
        // 2ef: athrow
        // 2f0: aload 0
        // 2f1: fload 5
        // 2f3: invokevirtual com/trolmastercard/sexmod/j.d (F)V
        // 2f6: goto 2fd
        // 2f9: invokestatic com/trolmastercard/sexmod/j.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
        // 2fc: athrow
        // 2fd: iload 8
        // 2ff: ifeq 30f
        // 302: aload 0
        // 303: fload 5
        // 305: invokevirtual com/trolmastercard/sexmod/j.f (F)V
        // 308: goto 30f
        // 30b: invokestatic com/trolmastercard/sexmod/j.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
        // 30e: athrow
        // 30f: aload 0
        // 310: getfield com/trolmastercard/sexmod/j.c Lnet/minecraft/util/math/BlockPos;
        // 313: invokestatic com/trolmastercard/sexmod/gm.a (Lnet/minecraft/util/math/BlockPos;)Z
        // 316: ifeq 347
        // 319: aload 0
        // 31a: ldc -62.0
        // 31c: fload 5
        // 31e: fadd
        // 31f: aload 0
        // 320: getfield com/trolmastercard/sexmod/j.a F
        // 323: ldc 15.0
        // 325: fmul
        // 326: fsub
        // 327: ldc -2.0
        // 329: fload 5
        // 32b: fsub
        // 32c: aload 0
        // 32d: getfield com/trolmastercard/sexmod/j.a F
        // 330: ldc 15.0
        // 332: fmul
        // 333: fadd
        // 334: sipush 128
        // 337: bipush 64
        // 339: bipush 64
        // 33b: bipush 64
        // 33d: invokevirtual com/trolmastercard/sexmod/j.func_175174_a (FFIIII)V
        // 340: goto 347
        // 343: invokestatic com/trolmastercard/sexmod/j.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
        // 346: athrow
        // 347: invokestatic net/minecraft/client/renderer/GlStateManager.func_179121_F ()V
        // 34a: aload 6
        // 34c: instanceof net/minecraft/block/BlockLog
        // 34f: istore 9
        // 351: aload 0
        // 352: invokevirtual com/trolmastercard/sexmod/j.e ()[Ljava/lang/Object;
        // 355: ifnull 360
        // 358: bipush 1
        // 359: goto 361
        // 35c: invokestatic com/trolmastercard/sexmod/j.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
        // 35f: athrow
        // 360: bipush 0
        // 361: istore 10
        // 363: iload 9
        // 365: ifne 374
        // 368: iload 10
        // 36a: ifeq 417
        // 36d: goto 374
        // 370: invokestatic com/trolmastercard/sexmod/j.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
        // 373: athrow
        // 374: invokestatic net/minecraft/client/renderer/GlStateManager.func_179094_E ()V
        // 377: fconst_1
        // 378: aload 0
        // 379: getfield com/trolmastercard/sexmod/j.i F
        // 37c: ldc 0.5
        // 37e: fmul
        // 37f: fadd
        // 380: fconst_1
        // 381: aload 0
        // 382: getfield com/trolmastercard/sexmod/j.i F
        // 385: ldc 0.5
        // 387: fmul
        // 388: fadd
        // 389: fconst_1
        // 38a: invokestatic net/minecraft/client/renderer/GlStateManager.func_179152_a (FFF)V
        // 38d: aload 0
        // 38e: ldc -2.0
        // 390: fload 5
        // 392: fsub
        // 393: aload 0
        // 394: getfield com/trolmastercard/sexmod/j.i F
        // 397: ldc 15.0
        // 399: fmul
        // 39a: fadd
        // 39b: ldc -62.0
        // 39d: fload 5
        // 39f: fadd
        // 3a0: aload 0
        // 3a1: getfield com/trolmastercard/sexmod/j.i F
        // 3a4: ldc 15.0
        // 3a6: fmul
        // 3a7: fsub
        // 3a8: bipush 0
        // 3a9: bipush 0
        // 3aa: bipush 64
        // 3ac: bipush 64
        // 3ae: invokevirtual com/trolmastercard/sexmod/j.func_175174_a (FFIIII)V
        // 3b1: iload 9
        // 3b3: ifeq 3ca
        // 3b6: goto 3bd
        // 3b9: invokestatic com/trolmastercard/sexmod/j.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
        // 3bc: athrow
        // 3bd: aload 0
        // 3be: fload 5
        // 3c0: invokevirtual com/trolmastercard/sexmod/j.e (F)V
        // 3c3: goto 3ca
        // 3c6: invokestatic com/trolmastercard/sexmod/j.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
        // 3c9: athrow
        // 3ca: iload 10
        // 3cc: ifeq 3dc
        // 3cf: aload 0
        // 3d0: fload 5
        // 3d2: invokevirtual com/trolmastercard/sexmod/j.b (F)V
        // 3d5: goto 3dc
        // 3d8: invokestatic com/trolmastercard/sexmod/j.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
        // 3db: athrow
        // 3dc: aload 0
        // 3dd: getfield com/trolmastercard/sexmod/j.c Lnet/minecraft/util/math/BlockPos;
        // 3e0: invokestatic com/trolmastercard/sexmod/gm.a (Lnet/minecraft/util/math/BlockPos;)Z
        // 3e3: ifeq 414
        // 3e6: aload 0
        // 3e7: ldc -2.0
        // 3e9: fload 5
        // 3eb: fsub
        // 3ec: aload 0
        // 3ed: getfield com/trolmastercard/sexmod/j.i F
        // 3f0: ldc 15.0
        // 3f2: fmul
        // 3f3: fadd
        // 3f4: ldc -62.0
        // 3f6: fload 5
        // 3f8: fadd
        // 3f9: aload 0
        // 3fa: getfield com/trolmastercard/sexmod/j.i F
        // 3fd: ldc 15.0
        // 3ff: fmul
        // 400: fsub
        // 401: sipush 128
        // 404: bipush 64
        // 406: bipush 64
        // 408: bipush 64
        // 40a: invokevirtual com/trolmastercard/sexmod/j.func_175174_a (FFIIII)V
        // 40d: goto 414
        // 410: invokestatic com/trolmastercard/sexmod/j.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
        // 413: athrow
        // 414: invokestatic net/minecraft/client/renderer/GlStateManager.func_179121_F ()V
        // 417: invokestatic net/minecraft/client/renderer/GlStateManager.func_179121_F ()V
        // 41a: sipush 3042
        // 41d: invokestatic org/lwjgl/opengl/GL11.glDisable (I)V
        // 420: return
        // try (15 -> 27): 28 java/lang/NullPointerException
        // try (42 -> 57): 58 java/lang/NullPointerException
        // try (51 -> 62): 62 java/lang/NullPointerException
        // try (65 -> 87): 88 java/lang/NullPointerException
        // try (81 -> 92): 92 java/lang/NullPointerException
        // try (95 -> 117): 118 java/lang/NullPointerException
        // try (111 -> 122): 122 java/lang/NullPointerException
        // try (125 -> 147): 148 java/lang/NullPointerException
        // try (141 -> 152): 152 java/lang/NullPointerException
        // try (155 -> 276): 277 java/lang/NullPointerException
        // try (279 -> 344): 345 java/lang/NullPointerException
        // try (358 -> 362): 363 java/lang/NullPointerException
        // try (360 -> 404): 405 java/lang/NullPointerException
        // try (365 -> 410): 411 java/lang/NullPointerException
        // try (413 -> 418): 419 java/lang/NullPointerException
        // try (421 -> 447): 448 java/lang/NullPointerException
        // try (454 -> 459): 459 java/lang/NullPointerException
        // try (463 -> 467): 468 java/lang/NullPointerException
        // try (465 -> 509): 510 java/lang/NullPointerException
        // try (470 -> 515): 516 java/lang/NullPointerException
        // try (518 -> 523): 524 java/lang/NullPointerException
        // try (526 -> 552): 553 java/lang/NullPointerException
    }

    void a(float var1) {
        this.func_175174_a(-2.0F - var1 + this.n * 15.0F, -2.0F - var1 + this.n * 15.0F, 192, 64, 64, 64);
    }

    void c(float var1) {
        this.func_175174_a(-62.0F + var1 - this.k * 15.0F, -62.0F + var1 - this.k * 15.0F, 64, 64, 64, 64);
    }

    void e(float var1) {
        this.func_175174_a(-2.0F - var1 + this.i * 15.0F, -62.0F + var1 - this.i * 15.0F, 64, 0, 64, 64);
    }

    void b(float var1) {
        this.func_175174_a(-2.0F - var1 + this.i * 15.0F, -62.0F + var1 - this.i * 15.0F, 128, 0, 64, 64);
    }

    void f(float var1) {
        this.func_175174_a(-62.0F + var1 - this.a * 15.0F, -2.0F - var1 + this.a * 15.0F, 0, 64, 64, 64);
    }

    void d(float var1) {
        this.func_175174_a(-62.0F + var1 - this.a * 15.0F, -2.0F - var1 + this.a * 15.0F, 192, 0, 64, 64);
    }

    double a(double var1) {
        double var3 = 1.70158;
        double var5 = var3 + 1.0;
        return 1.0 + var5 * Math.pow(var1 - 1.0, 3.0) + var3 * Math.pow(var1 - 1.0, 2.0);
    }

    protected void func_146286_b(int var1, int var2, int var3) {
        this.field_146297_k.field_71439_g.func_71053_j();
        super.func_146286_b(var1, var2, var3);
    }

    public boolean func_73868_f() {
        return false;
    }

    private static NullPointerException a(NullPointerException var0) {
        return var0;
    }
}
