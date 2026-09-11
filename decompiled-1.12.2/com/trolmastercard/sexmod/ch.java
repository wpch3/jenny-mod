package com.trolmastercard.sexmod;

import java.io.IOException;
import java.util.List;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;

public class ch extends GuiScreen {
    fo c;
    EntityPlayer a;
    boolean e;
    static final ResourceLocation b = new ResourceLocation("sexmod", "textures/gui/girlinventory.png");
    double d = 0.0;

    public ch(fo var1, EntityPlayer var2) {
        this.c = var1;
        this.a = var2;
        this.e = !"".equals(var1.func_184212_Q().func_187225_a(em.v));
    }

    public boolean func_73868_f() {
        return false;
    }

    public void func_73863_a(int var1, int var2, float var3) {
        super.func_73863_a(var1, var2, var3);
        this.field_146292_n.clear();
        ScaledResolution var4 = new ScaledResolution(this.field_146297_k);
        int var5 = var4.func_78326_a();

        List var10000;
        GuiButton var10001;
        GuiButton var10002;
        byte var10003;
        int var10004;
        byte var10005;
        int var10006;
        byte var10007;
        String var10008;
        label22: {
            try {
                this.d = Math.min(1.0, this.d + this.field_146297_k.func_193989_ak() / 5.0F);
                var10000 = this.field_146292_n;
                var10001 = new GuiButton;
                var10002 = var10001;
                var10003 = 0;
                var10004 = var5 / 2 - 119 + (int)(100.0 - 100.0 * this.d);
                var10005 = 30;
                var10006 = (int)(this.d * 100.0);
                var10007 = 20;
                if (this.e) {
                    var10008 = I18n.func_135052_a("action.names.stopfollowme", new Object[0]);
                    break label22;
                }
            } catch (RuntimeException var6) {
                throw a(var6);
            }

            var10008 = I18n.func_135052_a("action.names.followme", new Object[0]);
        }

        var10002./* $VF: Unable to resugar constructor */<init>(var10003, var10004, var10005, var10006, var10007, var10008);
        var10000.add(var10001);
        this.field_146292_n.add(new GuiButton(1, var5 / 2 + 19, 30, (int)(this.d * 100.0), 20, I18n.func_135052_a("action.names.gohome", new Object[0])));
        this.field_146297_k.field_71446_o.func_110577_a(b);
        this.func_73729_b(var5 / 2 - 7, 61 - (int)(15.0 - this.d * 15.0), 32, 0, 15, 15);
        this.field_146292_n.add(new GuiButton(2, var5 / 2 - 10, 59 - (int)(15.0 - this.d * 15.0), 20, 20, ""));
        this.func_73729_b(var5 / 2 - 20, 20, this.c.func_184212_Q().func_187225_a(fo.K) ? 0 : 40, 130, 40, 40);
    }

    protected void func_73864_a(int param1, int param2, int param3) throws IOException {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: new net/minecraft/client/gui/ScaledResolution
        // 03: dup
        // 04: aload 0
        // 05: getfield com/trolmastercard/sexmod/ch.field_146297_k Lnet/minecraft/client/Minecraft;
        // 08: invokespecial net/minecraft/client/gui/ScaledResolution.<init> (Lnet/minecraft/client/Minecraft;)V
        // 0b: astore 4
        // 0d: aload 4
        // 0f: invokevirtual net/minecraft/client/gui/ScaledResolution.func_78326_a ()I
        // 12: istore 5
        // 14: aload 0
        // 15: getfield com/trolmastercard/sexmod/ch.c Lcom/trolmastercard/sexmod/fo;
        // 18: invokevirtual com/trolmastercard/sexmod/fo.func_184212_Q ()Lnet/minecraft/network/datasync/EntityDataManager;
        // 1b: getstatic com/trolmastercard/sexmod/fo.K Lnet/minecraft/network/datasync/DataParameter;
        // 1e: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
        // 21: checkcast java/lang/Boolean
        // 24: invokevirtual java/lang/Boolean.booleanValue ()Z
        // 27: ifeq 8e
        // 2a: iload 1
        // 2b: iload 5
        // 2d: bipush 2
        // 2e: idiv
        // 2f: bipush 20
        // 31: isub
        // 32: if_icmplt 8e
        // 35: goto 3c
        // 38: invokestatic com/trolmastercard/sexmod/ch.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 3b: athrow
        // 3c: iload 1
        // 3d: iload 5
        // 3f: bipush 2
        // 40: idiv
        // 41: bipush 20
        // 43: iadd
        // 44: if_icmpgt 8e
        // 47: goto 4e
        // 4a: invokestatic com/trolmastercard/sexmod/ch.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 4d: athrow
        // 4e: iload 2
        // 4f: bipush 20
        // 51: if_icmplt 8e
        // 54: goto 5b
        // 57: invokestatic com/trolmastercard/sexmod/ch.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 5a: athrow
        // 5b: iload 2
        // 5c: bipush 60
        // 5e: if_icmpgt 8e
        // 61: goto 68
        // 64: invokestatic com/trolmastercard/sexmod/ch.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 67: athrow
        // 68: getstatic com/trolmastercard/sexmod/ge.b Lnet/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper;
        // 6b: new com/trolmastercard/sexmod/f3
        // 6e: dup
        // 6f: aload 0
        // 70: getfield com/trolmastercard/sexmod/ch.c Lcom/trolmastercard/sexmod/fo;
        // 73: invokevirtual com/trolmastercard/sexmod/fo.f ()Ljava/util/UUID;
        // 76: aload 0
        // 77: getfield com/trolmastercard/sexmod/ch.a Lnet/minecraft/entity/player/EntityPlayer;
        // 7a: invokevirtual net/minecraft/entity/player/EntityPlayer.getPersistentID ()Ljava/util/UUID;
        // 7d: invokespecial com/trolmastercard/sexmod/f3.<init> (Ljava/util/UUID;Ljava/util/UUID;)V
        // 80: invokevirtual net/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper.sendToServer (Lnet/minecraftforge/fml/common/network/simpleimpl/IMessage;)V
        // 83: aload 0
        // 84: invokevirtual com/trolmastercard/sexmod/ch.func_146281_b ()V
        // 87: goto 8e
        // 8a: invokestatic com/trolmastercard/sexmod/ch.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 8d: athrow
        // 8e: aload 0
        // 8f: iload 1
        // 90: iload 2
        // 91: iload 3
        // 92: invokespecial net/minecraft/client/gui/GuiScreen.func_73864_a (III)V
        // 95: return
        // try (9 -> 24): 25 java/io/IOException
        // try (17 -> 34): 35 java/io/IOException
        // try (27 -> 40): 41 java/io/IOException
        // try (37 -> 46): 47 java/io/IOException
        // try (43 -> 62): 63 java/io/IOException
    }

    protected void func_146284_a(GuiButton param1) throws IOException {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 000: aload 0
        // 001: aload 1
        // 002: invokespecial net/minecraft/client/gui/GuiScreen.func_146284_a (Lnet/minecraft/client/gui/GuiButton;)V
        // 005: aload 1
        // 006: getfield net/minecraft/client/gui/GuiButton.field_146127_k I
        // 009: ifne 0a2
        // 00c: aload 0
        // 00d: getfield com/trolmastercard/sexmod/ch.e Z
        // 010: ifeq 050
        // 013: goto 01a
        // 016: invokestatic com/trolmastercard/sexmod/ch.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 019: athrow
        // 01a: getstatic com/trolmastercard/sexmod/ge.b Lnet/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper;
        // 01d: new com/trolmastercard/sexmod/n
        // 020: dup
        // 021: aload 0
        // 022: getfield com/trolmastercard/sexmod/ch.c Lcom/trolmastercard/sexmod/fo;
        // 025: invokevirtual com/trolmastercard/sexmod/fo.f ()Ljava/util/UUID;
        // 028: ldc "master"
        // 02a: ldc ""
        // 02c: invokespecial com/trolmastercard/sexmod/n.<init> (Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;)V
        // 02f: invokevirtual net/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper.sendToServer (Lnet/minecraftforge/fml/common/network/simpleimpl/IMessage;)V
        // 032: aload 0
        // 033: getfield com/trolmastercard/sexmod/ch.a Lnet/minecraft/entity/player/EntityPlayer;
        // 036: new net/minecraft/util/text/TextComponentString
        // 039: dup
        // 03a: ldc "bee.dialogue.sad"
        // 03c: bipush 0
        // 03d: anewarray 114
        // 040: invokestatic net/minecraft/client/resources/I18n.func_135052_a (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        // 043: invokespecial net/minecraft/util/text/TextComponentString.<init> (Ljava/lang/String;)V
        // 046: invokevirtual net/minecraft/entity/player/EntityPlayer.func_145747_a (Lnet/minecraft/util/text/ITextComponent;)V
        // 049: goto 087
        // 04c: invokestatic com/trolmastercard/sexmod/ch.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 04f: athrow
        // 050: getstatic com/trolmastercard/sexmod/ge.b Lnet/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper;
        // 053: new com/trolmastercard/sexmod/n
        // 056: dup
        // 057: aload 0
        // 058: getfield com/trolmastercard/sexmod/ch.c Lcom/trolmastercard/sexmod/fo;
        // 05b: invokevirtual com/trolmastercard/sexmod/fo.f ()Ljava/util/UUID;
        // 05e: ldc "master"
        // 060: aload 0
        // 061: getfield com/trolmastercard/sexmod/ch.a Lnet/minecraft/entity/player/EntityPlayer;
        // 064: invokevirtual net/minecraft/entity/player/EntityPlayer.getPersistentID ()Ljava/util/UUID;
        // 067: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
        // 06a: invokespecial com/trolmastercard/sexmod/n.<init> (Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;)V
        // 06d: invokevirtual net/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper.sendToServer (Lnet/minecraftforge/fml/common/network/simpleimpl/IMessage;)V
        // 070: aload 0
        // 071: getfield com/trolmastercard/sexmod/ch.a Lnet/minecraft/entity/player/EntityPlayer;
        // 074: new net/minecraft/util/text/TextComponentString
        // 077: dup
        // 078: ldc "bee.dialogue.exited"
        // 07a: bipush 0
        // 07b: anewarray 114
        // 07e: invokestatic net/minecraft/client/resources/I18n.func_135052_a (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        // 081: invokespecial net/minecraft/util/text/TextComponentString.<init> (Ljava/lang/String;)V
        // 084: invokevirtual net/minecraft/entity/player/EntityPlayer.func_145747_a (Lnet/minecraft/util/text/ITextComponent;)V
        // 087: aload 0
        // 088: aload 0
        // 089: getfield com/trolmastercard/sexmod/ch.e Z
        // 08c: ifne 097
        // 08f: bipush 1
        // 090: goto 098
        // 093: invokestatic com/trolmastercard/sexmod/ch.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 096: athrow
        // 097: bipush 0
        // 098: putfield com/trolmastercard/sexmod/ch.e Z
        // 09b: aload 0
        // 09c: getfield com/trolmastercard/sexmod/ch.a Lnet/minecraft/entity/player/EntityPlayer;
        // 09f: invokevirtual net/minecraft/entity/player/EntityPlayer.func_71053_j ()V
        // 0a2: aload 1
        // 0a3: getfield net/minecraft/client/gui/GuiButton.field_146127_k I
        // 0a6: bipush 1
        // 0a7: if_icmpne 0cc
        // 0aa: getstatic com/trolmastercard/sexmod/ge.b Lnet/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper;
        // 0ad: new com/trolmastercard/sexmod/gg
        // 0b0: dup
        // 0b1: aload 0
        // 0b2: getfield com/trolmastercard/sexmod/ch.c Lcom/trolmastercard/sexmod/fo;
        // 0b5: invokevirtual com/trolmastercard/sexmod/fo.f ()Ljava/util/UUID;
        // 0b8: invokespecial com/trolmastercard/sexmod/gg.<init> (Ljava/util/UUID;)V
        // 0bb: invokevirtual net/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper.sendToServer (Lnet/minecraftforge/fml/common/network/simpleimpl/IMessage;)V
        // 0be: aload 0
        // 0bf: getfield com/trolmastercard/sexmod/ch.a Lnet/minecraft/entity/player/EntityPlayer;
        // 0c2: invokevirtual net/minecraft/entity/player/EntityPlayer.func_71053_j ()V
        // 0c5: goto 0cc
        // 0c8: invokestatic com/trolmastercard/sexmod/ch.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 0cb: athrow
        // 0cc: aload 1
        // 0cd: getfield net/minecraft/client/gui/GuiButton.field_146127_k I
        // 0d0: bipush 2
        // 0d1: if_icmpne 129
        // 0d4: getstatic com/trolmastercard/sexmod/ge.b Lnet/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper;
        // 0d7: new com/trolmastercard/sexmod/a6
        // 0da: dup
        // 0db: aload 0
        // 0dc: getfield com/trolmastercard/sexmod/ch.c Lcom/trolmastercard/sexmod/fo;
        // 0df: invokevirtual com/trolmastercard/sexmod/fo.f ()Ljava/util/UUID;
        // 0e2: new net/minecraft/util/math/Vec3d
        // 0e5: dup
        // 0e6: aload 0
        // 0e7: getfield com/trolmastercard/sexmod/ch.c Lcom/trolmastercard/sexmod/fo;
        // 0ea: getfield com/trolmastercard/sexmod/fo.field_70165_t D
        // 0ed: aload 0
        // 0ee: getfield com/trolmastercard/sexmod/ch.c Lcom/trolmastercard/sexmod/fo;
        // 0f1: getfield com/trolmastercard/sexmod/fo.field_70163_u D
        // 0f4: aload 0
        // 0f5: getfield com/trolmastercard/sexmod/ch.c Lcom/trolmastercard/sexmod/fo;
        // 0f8: getfield com/trolmastercard/sexmod/fo.field_70161_v D
        // 0fb: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
        // 0fe: invokespecial com/trolmastercard/sexmod/a6.<init> (Ljava/util/UUID;Lnet/minecraft/util/math/Vec3d;)V
        // 101: invokevirtual net/minecraftforge/fml/common/network/simpleimpl/SimpleNetworkWrapper.sendToServer (Lnet/minecraftforge/fml/common/network/simpleimpl/IMessage;)V
        // 104: aload 0
        // 105: getfield com/trolmastercard/sexmod/ch.a Lnet/minecraft/entity/player/EntityPlayer;
        // 108: invokevirtual net/minecraft/entity/player/EntityPlayer.func_71053_j ()V
        // 10b: aload 0
        // 10c: getfield com/trolmastercard/sexmod/ch.a Lnet/minecraft/entity/player/EntityPlayer;
        // 10f: new net/minecraft/util/text/TextComponentString
        // 112: dup
        // 113: ldc "bee.dialogue.home"
        // 115: bipush 0
        // 116: anewarray 114
        // 119: invokestatic net/minecraft/client/resources/I18n.func_135052_a (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        // 11c: invokespecial net/minecraft/util/text/TextComponentString.<init> (Ljava/lang/String;)V
        // 11f: invokevirtual net/minecraft/entity/player/EntityPlayer.func_145747_a (Lnet/minecraft/util/text/ITextComponent;)V
        // 122: goto 129
        // 125: invokestatic com/trolmastercard/sexmod/ch.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 128: athrow
        // 129: return
        // try (0 -> 9): 10 java/io/IOException
        // try (6 -> 33): 33 java/io/IOException
        // try (58 -> 64): 64 java/io/IOException
        // try (71 -> 86): 87 java/io/IOException
        // try (89 -> 126): 127 java/io/IOException
    }

    private static Exception a(Exception var0) {
        return var0;
    }
}
