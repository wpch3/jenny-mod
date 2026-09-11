package com.trolmastercard.sexmod;

import java.util.HashSet;
import javax.annotation.Nullable;
import javax.vecmath.Vector4f;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.math.Vec3i;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class dg extends d9 {
    eq B = null;
    boolean C = false;
    boolean E = false;
    boolean D = false;

    public dg(RenderManager var1, AnimatedGeoModel var2) {
        super(var1, var2);
    }

    @Override
    protected Vec3i a(String param1) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 0
        // 01: getfield com/trolmastercard/sexmod/dg.j Lcom/trolmastercard/sexmod/em;
        // 04: invokestatic com/trolmastercard/sexmod/e4.a (Lcom/trolmastercard/sexmod/em;)[Ljava/lang/String;
        // 07: astore 2
        // 08: aload 2
        // 09: arraylength
        // 0a: bipush 8
        // 0c: if_icmpge 17
        // 0f: getstatic com/trolmastercard/sexmod/dg.z Lnet/minecraft/util/math/Vec3i;
        // 12: areturn
        // 13: invokestatic com/trolmastercard/sexmod/dg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 16: athrow
        // 17: aload 1
        // 18: ldc "band"
        // 1a: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
        // 1d: ifeq 28
        // 20: getstatic com/trolmastercard/sexmod/dy.w Lnet/minecraft/util/math/Vec3i;
        // 23: areturn
        // 24: invokestatic com/trolmastercard/sexmod/dg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 27: athrow
        // 28: aload 1
        // 29: ldc "eyeColor"
        // 2b: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
        // 2e: ifne 41
        // 31: aload 1
        // 32: ldc "eyeColor2"
        // 34: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
        // 37: ifeq 4d
        // 3a: goto 41
        // 3d: invokestatic com/trolmastercard/sexmod/dg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 40: athrow
        // 41: aload 2
        // 42: bipush 8
        // 44: aaload
        // 45: invokestatic com/trolmastercard/sexmod/dy.b (Ljava/lang/String;)Lnet/minecraft/util/math/Vec3i;
        // 48: areturn
        // 49: invokestatic com/trolmastercard/sexmod/dg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 4c: athrow
        // 4d: aload 1
        // 4e: ldc "variant"
        // 50: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
        // 53: ifne 66
        // 56: aload 1
        // 57: ldc "boob"
        // 59: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
        // 5c: ifeq 72
        // 5f: goto 66
        // 62: invokestatic com/trolmastercard/sexmod/dg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 65: athrow
        // 66: aload 2
        // 67: bipush 7
        // 69: aaload
        // 6a: invokestatic com/trolmastercard/sexmod/dy.c (Ljava/lang/String;)Lnet/minecraft/util/math/Vec3i;
        // 6d: areturn
        // 6e: invokestatic com/trolmastercard/sexmod/dg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 71: athrow
        // 72: aload 1
        // 73: ldc "hair"
        // 75: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
        // 78: ifeq 87
        // 7b: aload 2
        // 7c: bipush 6
        // 7e: aaload
        // 7f: invokestatic com/trolmastercard/sexmod/dy.d (Ljava/lang/String;)Lnet/minecraft/util/math/Vec3i;
        // 82: areturn
        // 83: invokestatic com/trolmastercard/sexmod/dg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 86: athrow
        // 87: getstatic com/trolmastercard/sexmod/dy.D Ljava/util/HashSet;
        // 8a: aload 1
        // 8b: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
        // 8e: ifeq 9d
        // 91: aload 2
        // 92: bipush 7
        // 94: aaload
        // 95: invokestatic com/trolmastercard/sexmod/dy.c (Ljava/lang/String;)Lnet/minecraft/util/math/Vec3i;
        // 98: areturn
        // 99: invokestatic com/trolmastercard/sexmod/dg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 9c: athrow
        // 9d: getstatic com/trolmastercard/sexmod/dy.M Ljava/util/HashSet;
        // a0: aload 1
        // a1: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
        // a4: ifeq b3
        // a7: aload 2
        // a8: bipush 6
        // aa: aaload
        // ab: invokestatic com/trolmastercard/sexmod/dy.d (Ljava/lang/String;)Lnet/minecraft/util/math/Vec3i;
        // ae: areturn
        // af: invokestatic com/trolmastercard/sexmod/dg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // b2: athrow
        // b3: getstatic com/trolmastercard/sexmod/dg.z Lnet/minecraft/util/math/Vec3i;
        // b6: areturn
        // try (4 -> 10): 10 java/lang/RuntimeException
        // try (12 -> 18): 18 java/lang/RuntimeException
        // try (20 -> 28): 29 java/lang/RuntimeException
        // try (24 -> 36): 36 java/lang/RuntimeException
        // try (38 -> 46): 47 java/lang/RuntimeException
        // try (42 -> 54): 54 java/lang/RuntimeException
        // try (56 -> 65): 65 java/lang/RuntimeException
        // try (67 -> 76): 76 java/lang/RuntimeException
        // try (78 -> 87): 87 java/lang/RuntimeException
    }

    @Override
    protected Vector4f a(String var1, float var2, float var3, float var4) {
        if (var1.startsWith("crown")) {
            ItemStack var5 = (ItemStack)this.j.func_184212_Q().func_187225_a(e2.X);

            try {
                if (var5.func_190926_b()) {
                    return super.a(var1, var2, var3, var4);
                }
            } catch (RuntimeException var13) {
                throw a(var13);
            }

            ItemArmor var6 = (ItemArmor)var5.func_77973_b();
            ArmorMaterial var7 = var6.func_82812_d();
            float var8 = 0.0F;
            switch (var7) {
                case GOLD:
                    var8 = 1.0F;
                    break;
                case CHAIN:
                case IRON:
                    var8 = 2.0F;
                    break;
                case LEATHER:
                    var8 = 4.0F;
                    int var9 = var6.func_82814_b(var5);
                    float var10 = (var9 >> 16 & 0xFF) / 255.0F;
                    float var11 = (var9 >> 8 & 0xFF) / 255.0F;
                    float var12 = (var9 & 0xFF) / 255.0F;
                    var2 = var10;
                    var3 = var11;
                    var4 = var12;
            }

            return new Vector4f(var2, var3, var4, 72.0F * var8 / 4096.0F);
        } else {
            return super.a(var1, var2, var3, var4);
        }
    }

    @Override
    protected boolean c(String var1) {
        try {
            if (var1.startsWith("crown")) {
                return true;
            }
        } catch (RuntimeException var2) {
            throw a(var2);
        }

        return super.c(var1);
    }

    @Override
    public HashSet<String> a() {
        return new HashSet<String>() {
            {
                this.add("boobs");
                this.add("booty");
                this.add("vagina");
                this.add("fuckhole");
                this.add("preggy");
                this.add("LegL");
                this.add("LegR");
                this.add("cheekR");
                this.add("cheekL");
            }
        };
    }

    @Override
    protected void a(String var1, GeoBone var2) {
        String[] var3 = e4.a(this.j);

        try {
            if (var3.length < 8) {
                return;
            }
        } catch (RuntimeException var9) {
            throw a(var9);
        }

        String var4 = var1;
        byte var5 = -1;

        label111: {
            label110: {
                label109: {
                    label108: {
                        label107: {
                            label106: {
                                label105: {
                                    label104: {
                                        try {
                                            switch (var4.hashCode()) {
                                                case -1383396097:
                                                    break label108;
                                                case -1383396096:
                                                    break label109;
                                                case 2364452:
                                                    break label106;
                                                case 3029410:
                                                    break label105;
                                                case 3105718:
                                                    if (!var4.equals("earL")) {
                                                        break label111;
                                                    }
                                                    break label110;
                                                case 3105724:
                                                    break;
                                                case 3194850:
                                                    break label104;
                                                case 93921650:
                                                    break label107;
                                                default:
                                                    break label111;
                                            }
                                        } catch (RuntimeException var8) {
                                            throw a(var8);
                                        }

                                        if (var4.equals("earR")) {
                                            var5 = 1;
                                        }
                                        break label111;
                                    }

                                    if (var4.equals("hair")) {
                                        var5 = 2;
                                    }
                                    break label111;
                                }

                                if (var4.equals("body")) {
                                    var5 = 3;
                                }
                                break label111;
                            }

                            if (var4.equals("LegR")) {
                                var5 = 4;
                            }
                            break label111;
                        }

                        if (var4.equals("boobR")) {
                            var5 = 5;
                        }
                        break label111;
                    }

                    if (var4.equals("boobR1")) {
                        var5 = 6;
                    }
                    break label111;
                }

                if (var4.equals("boobR2")) {
                    var5 = 7;
                }
                break label111;
            }

            var5 = 0;
        }

        label82: {
            label81: {
                label80: {
                    label79: {
                        label78: {
                            label77: {
                                label76: {
                                    try {
                                        switch (var5) {
                                            case 0:
                                                dy.a(var2, var3[0], var3[1], var3[3]);
                                                break label82;
                                            case 1:
                                                break label81;
                                            case 2:
                                                break label80;
                                            case 3:
                                                break label79;
                                            case 4:
                                                break label78;
                                            case 5:
                                                break label77;
                                            case 6:
                                                break label76;
                                            case 7:
                                                break;
                                            default:
                                                break label82;
                                        }
                                    } catch (RuntimeException var7) {
                                        throw a(var7);
                                    }

                                    dy.a(this.C, var2, 5.0F, 3.0F);
                                    break label82;
                                }

                                dy.a(this.C, var2, 10.0F, 15.0F);
                                break label82;
                            }

                            dy.a(this.C, var2, 30.0F, 30.0F);
                            break label82;
                        }

                        dy.a(this.C, var2, 25.0F, 25.0F);
                        break label82;
                    }

                    var2.setPivotY(-0.15F);
                    dy.a(this.j, var2);
                    break label82;
                }

                dy.a(var2, var3[5]);
                break label82;
            }

            dy.a(var2, var3[0], var3[2], var3[4]);
        }

        try {
            if (var1.contains("crown")) {
                dy.a(this.j, var2, var3[9]);
            }
        } catch (RuntimeException var6) {
            throw a(var6);
        }
    }

    @Override
    public void a(em param1, double param2, double param4, double param6, float param8, float param9) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 000: aload 0
        // 001: getstatic com/trolmastercard/sexmod/dg.v Z
        // 004: putfield com/trolmastercard/sexmod/dg.D Z
        // 007: aload 0
        // 008: aload 1
        // 009: checkcast com/trolmastercard/sexmod/eq
        // 00c: putfield com/trolmastercard/sexmod/dg.B Lcom/trolmastercard/sexmod/eq;
        // 00f: aload 0
        // 010: ldc -420.69
        // 012: fload 8
        // 014: fcmpl
        // 015: ifne 031
        // 018: aload 1
        // 019: invokevirtual com/trolmastercard/sexmod/em.y ()Lcom/trolmastercard/sexmod/fp;
        // 01c: getstatic com/trolmastercard/sexmod/fp.SHOULDER_IDLE Lcom/trolmastercard/sexmod/fp;
        // 01f: if_acmpne 031
        // 022: goto 029
        // 025: invokestatic com/trolmastercard/sexmod/dg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 028: athrow
        // 029: bipush 1
        // 02a: goto 032
        // 02d: invokestatic com/trolmastercard/sexmod/dg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 030: athrow
        // 031: bipush 0
        // 032: putfield com/trolmastercard/sexmod/dg.C Z
        // 035: aload 0
        // 036: ldc -420.69
        // 038: fload 8
        // 03a: fcmpl
        // 03b: ifne 057
        // 03e: aload 1
        // 03f: invokevirtual com/trolmastercard/sexmod/em.y ()Lcom/trolmastercard/sexmod/fp;
        // 042: getstatic com/trolmastercard/sexmod/fp.PICK_UP Lcom/trolmastercard/sexmod/fp;
        // 045: if_acmpne 057
        // 048: goto 04f
        // 04b: invokestatic com/trolmastercard/sexmod/dg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 04e: athrow
        // 04f: bipush 1
        // 050: goto 058
        // 053: invokestatic com/trolmastercard/sexmod/dg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 056: athrow
        // 057: bipush 0
        // 058: putfield com/trolmastercard/sexmod/dg.E Z
        // 05b: aload 0
        // 05c: fload 9
        // 05e: putfield com/trolmastercard/sexmod/dg.y F
        // 061: fload 8
        // 063: putstatic com/trolmastercard/sexmod/dy.B F
        // 066: aload 1
        // 067: invokevirtual com/trolmastercard/sexmod/em.y ()Lcom/trolmastercard/sexmod/fp;
        // 06a: astore 10
        // 06c: aload 0
        // 06d: getfield com/trolmastercard/sexmod/dg.B Lcom/trolmastercard/sexmod/eq;
        // 070: invokevirtual com/trolmastercard/sexmod/eq.e ()Ljava/util/UUID;
        // 073: astore 11
        // 075: aload 1
        // 076: invokevirtual com/trolmastercard/sexmod/em.h ()Z
        // 079: ifeq 0a1
        // 07c: aload 1
        // 07d: getfield com/trolmastercard/sexmod/em.field_70170_p Lnet/minecraft/world/World;
        // 080: aload 1
        // 081: aload 11
        // 083: dload 2
        // 084: dload 4
        // 086: dload 6
        // 088: invokestatic com/trolmastercard/sexmod/dy.a (Lnet/minecraft/world/World;Lcom/trolmastercard/sexmod/em;Ljava/util/UUID;DDD)Lnet/minecraft/util/math/Vec3d;
        // 08b: astore 12
        // 08d: aload 12
        // 08f: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 092: dstore 2
        // 093: aload 12
        // 095: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // 098: dstore 4
        // 09a: aload 12
        // 09c: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 09f: dstore 6
        // 0a1: aload 10
        // 0a3: getstatic com/trolmastercard/sexmod/fp.THROWN Lcom/trolmastercard/sexmod/fp;
        // 0a6: if_acmpeq 0b8
        // 0a9: aload 10
        // 0ab: getstatic com/trolmastercard/sexmod/fp.START_THROWING Lcom/trolmastercard/sexmod/fp;
        // 0ae: if_acmpne 109
        // 0b1: goto 0b8
        // 0b4: invokestatic com/trolmastercard/sexmod/dg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0b7: athrow
        // 0b8: getstatic com/trolmastercard/sexmod/dg.i Lnet/minecraft/client/Minecraft;
        // 0bb: getfield net/minecraft/client/Minecraft.field_71474_y Lnet/minecraft/client/settings/GameSettings;
        // 0be: getfield net/minecraft/client/settings/GameSettings.field_74320_O I
        // 0c1: ifne 0ed
        // 0c4: goto 0cb
        // 0c7: invokestatic com/trolmastercard/sexmod/dg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0ca: athrow
        // 0cb: fload 8
        // 0cd: ldc -420.69
        // 0cf: fcmpl
        // 0d0: ifne 0ed
        // 0d3: goto 0da
        // 0d6: invokestatic com/trolmastercard/sexmod/dg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0d9: athrow
        // 0da: aload 1
        // 0db: invokevirtual com/trolmastercard/sexmod/em.h ()Z
        // 0de: ifne 0ed
        // 0e1: goto 0e8
        // 0e4: invokestatic com/trolmastercard/sexmod/dg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0e7: athrow
        // 0e8: return
        // 0e9: invokestatic com/trolmastercard/sexmod/dg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0ec: athrow
        // 0ed: aload 1
        // 0ee: invokevirtual com/trolmastercard/sexmod/em.h ()Z
        // 0f1: ifne 109
        // 0f4: aload 1
        // 0f5: invokevirtual com/trolmastercard/sexmod/em.I ()Ljava/lang/Float;
        // 0f8: invokevirtual java/lang/Float.floatValue ()F
        // 0fb: fstore 12
        // 0fd: aload 1
        // 0fe: fload 12
        // 100: putfield com/trolmastercard/sexmod/em.field_70760_ar F
        // 103: aload 1
        // 104: fload 12
        // 106: putfield com/trolmastercard/sexmod/em.field_70761_aq F
        // 109: aload 1
        // 10a: aload 10
        // 10c: invokestatic com/trolmastercard/sexmod/dy.a (Lcom/trolmastercard/sexmod/em;Lcom/trolmastercard/sexmod/fp;)Z
        // 10f: ifeq 2aa
        // 112: getstatic com/trolmastercard/sexmod/dg.i Lnet/minecraft/client/Minecraft;
        // 115: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 118: invokevirtual net/minecraft/client/entity/EntityPlayerSP.getPersistentID ()Ljava/util/UUID;
        // 11b: aload 11
        // 11d: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
        // 120: ifeq 1d2
        // 123: goto 12a
        // 126: invokestatic com/trolmastercard/sexmod/dg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 129: athrow
        // 12a: ldc -420.69
        // 12c: fload 8
        // 12e: fcmpl
        // 12f: ifeq 13e
        // 132: goto 139
        // 135: invokestatic com/trolmastercard/sexmod/dg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 138: athrow
        // 139: return
        // 13a: invokestatic com/trolmastercard/sexmod/dg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 13d: athrow
        // 13e: aload 1
        // 13f: getstatic com/trolmastercard/sexmod/dg.i Lnet/minecraft/client/Minecraft;
        // 142: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 145: getfield net/minecraft/client/entity/EntityPlayerSP.field_70177_z F
        // 148: ldc 180.0
        // 14a: fadd
        // 14b: putfield com/trolmastercard/sexmod/em.field_70761_aq F
        // 14e: aload 1
        // 14f: getstatic com/trolmastercard/sexmod/dg.i Lnet/minecraft/client/Minecraft;
        // 152: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 155: getfield net/minecraft/client/entity/EntityPlayerSP.field_70177_z F
        // 158: ldc 180.0
        // 15a: fadd
        // 15b: putfield com/trolmastercard/sexmod/em.field_70760_ar F
        // 15e: getstatic com/trolmastercard/sexmod/dg.i Lnet/minecraft/client/Minecraft;
        // 161: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 164: invokevirtual net/minecraft/client/entity/EntityPlayerSP.func_70040_Z ()Lnet/minecraft/util/math/Vec3d;
        // 167: astore 12
        // 169: invokestatic net/minecraft/client/renderer/GlStateManager.func_179094_E ()V
        // 16c: aload 12
        // 16e: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 171: aload 12
        // 173: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // 176: getstatic com/trolmastercard/sexmod/dg.i Lnet/minecraft/client/Minecraft;
        // 179: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 17c: invokevirtual net/minecraft/client/entity/EntityPlayerSP.func_70047_e ()F
        // 17f: f2d
        // 180: dadd
        // 181: aload 12
        // 183: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 186: invokestatic net/minecraft/client/renderer/GlStateManager.func_179137_b (DDD)V
        // 189: new net/minecraft/util/math/Vec3d
        // 18c: dup
        // 18d: getstatic com/trolmastercard/sexmod/dg.i Lnet/minecraft/client/Minecraft;
        // 190: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 193: getfield net/minecraft/client/entity/EntityPlayerSP.field_70125_A F
        // 196: invokestatic java/lang/Math.abs (F)F
        // 199: fneg
        // 19a: f2d
        // 19b: dconst_0
        // 19c: dconst_0
        // 19d: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
        // 1a0: getstatic com/trolmastercard/sexmod/dg.i Lnet/minecraft/client/Minecraft;
        // 1a3: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 1a6: getfield net/minecraft/client/entity/EntityPlayerSP.field_70177_z F
        // 1a9: invokestatic com/trolmastercard/sexmod/e3.b (Lnet/minecraft/util/math/Vec3d;F)Lnet/minecraft/util/math/Vec3d;
        // 1ac: astore 13
        // 1ae: getstatic com/trolmastercard/sexmod/dg.i Lnet/minecraft/client/Minecraft;
        // 1b1: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 1b4: getfield net/minecraft/client/entity/EntityPlayerSP.field_70125_A F
        // 1b7: aload 13
        // 1b9: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 1bc: d2f
        // 1bd: fconst_0
        // 1be: aload 13
        // 1c0: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 1c3: d2f
        // 1c4: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
        // 1c7: dconst_0
        // 1c8: dstore 2
        // 1c9: dconst_0
        // 1ca: dstore 4
        // 1cc: dconst_0
        // 1cd: dstore 6
        // 1cf: goto 3fa
        // 1d2: aload 0
        // 1d3: getfield com/trolmastercard/sexmod/dg.B Lcom/trolmastercard/sexmod/eq;
        // 1d6: invokevirtual com/trolmastercard/sexmod/eq.m ()Ljava/util/UUID;
        // 1d9: getstatic com/trolmastercard/sexmod/dg.i Lnet/minecraft/client/Minecraft;
        // 1dc: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 1df: invokevirtual net/minecraft/client/entity/EntityPlayerSP.getPersistentID ()Ljava/util/UUID;
        // 1e2: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
        // 1e5: ifne 3fa
        // 1e8: aload 1
        // 1e9: invokevirtual com/trolmastercard/sexmod/em.h ()Z
        // 1ec: ifeq 21a
        // 1ef: goto 1f6
        // 1f2: invokestatic com/trolmastercard/sexmod/dg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 1f5: athrow
        // 1f6: aload 11
        // 1f8: ifnull 21a
        // 1fb: goto 202
        // 1fe: invokestatic com/trolmastercard/sexmod/dg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 201: athrow
        // 202: getstatic com/trolmastercard/sexmod/dg.i Lnet/minecraft/client/Minecraft;
        // 205: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 208: invokevirtual net/minecraft/client/entity/EntityPlayerSP.getPersistentID ()Ljava/util/UUID;
        // 20b: aload 11
        // 20d: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
        // 210: ifeq 284
        // 213: goto 21a
        // 216: invokestatic com/trolmastercard/sexmod/dg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 219: athrow
        // 21a: aload 11
        // 21c: ifnull 26a
        // 21f: goto 226
        // 222: invokestatic com/trolmastercard/sexmod/dg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 225: athrow
        // 226: getstatic com/trolmastercard/sexmod/dg.i Lnet/minecraft/client/Minecraft;
        // 229: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 22c: invokevirtual net/minecraft/client/entity/EntityPlayerSP.getPersistentID ()Ljava/util/UUID;
        // 22f: aload 11
        // 231: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
        // 234: ifne 26a
        // 237: goto 23e
        // 23a: invokestatic com/trolmastercard/sexmod/dg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 23d: athrow
        // 23e: aload 1
        // 23f: getfield com/trolmastercard/sexmod/em.field_70170_p Lnet/minecraft/world/World;
        // 242: aload 11
        // 244: invokevirtual net/minecraft/world/World.func_152378_a (Ljava/util/UUID;)Lnet/minecraft/entity/player/EntityPlayer;
        // 247: astore 12
        // 249: aload 12
        // 24b: ifnull 267
        // 24e: aload 1
        // 24f: aload 12
        // 251: getfield net/minecraft/entity/player/EntityPlayer.field_70177_z F
        // 254: putfield com/trolmastercard/sexmod/em.field_70761_aq F
        // 257: aload 1
        // 258: aload 12
        // 25a: getfield net/minecraft/entity/player/EntityPlayer.field_70177_z F
        // 25d: putfield com/trolmastercard/sexmod/em.field_70760_ar F
        // 260: goto 267
        // 263: invokestatic com/trolmastercard/sexmod/dg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 266: athrow
        // 267: goto 284
        // 26a: aload 1
        // 26b: getstatic com/trolmastercard/sexmod/dg.i Lnet/minecraft/client/Minecraft;
        // 26e: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 271: getfield net/minecraft/client/entity/EntityPlayerSP.field_70177_z F
        // 274: putfield com/trolmastercard/sexmod/em.field_70761_aq F
        // 277: aload 1
        // 278: getstatic com/trolmastercard/sexmod/dg.i Lnet/minecraft/client/Minecraft;
        // 27b: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 27e: getfield net/minecraft/client/entity/EntityPlayerSP.field_70177_z F
        // 281: putfield com/trolmastercard/sexmod/em.field_70760_ar F
        // 284: aload 1
        // 285: aload 0
        // 286: getfield com/trolmastercard/sexmod/dg.B Lcom/trolmastercard/sexmod/eq;
        // 289: invokevirtual com/trolmastercard/sexmod/eq.e ()Ljava/util/UUID;
        // 28c: fload 9
        // 28e: invokestatic com/trolmastercard/sexmod/dy.a (Lcom/trolmastercard/sexmod/em;Ljava/util/UUID;F)Lnet/minecraft/util/math/Vec3d;
        // 291: astore 12
        // 293: aload 12
        // 295: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 298: dstore 2
        // 299: aload 12
        // 29b: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // 29e: dstore 4
        // 2a0: aload 12
        // 2a2: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 2a5: dstore 6
        // 2a7: goto 3fa
        // 2aa: aload 0
        // 2ab: getfield com/trolmastercard/sexmod/dg.C Z
        // 2ae: ifeq 32a
        // 2b1: fload 9
        // 2b3: invokestatic com/trolmastercard/sexmod/dy.a (F)V
        // 2b6: new net/minecraft/util/math/Vec3d
        // 2b9: dup
        // 2ba: ldc -0.1
        // 2bc: ldc 0.2
        // 2be: getstatic com/trolmastercard/sexmod/dg.i Lnet/minecraft/client/Minecraft;
        // 2c1: getfield net/minecraft/client/Minecraft.field_71474_y Lnet/minecraft/client/settings/GameSettings;
        // 2c4: getfield net/minecraft/client/settings/GameSettings.field_74334_X F
        // 2c7: ldc 110.0
        // 2c9: fdiv
        // 2ca: invokestatic com/trolmastercard/sexmod/b6.a (FFF)F
        // 2cd: f2d
        // 2ce: dconst_0
        // 2cf: dconst_0
        // 2d0: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
        // 2d3: astore 12
        // 2d5: aload 12
        // 2d7: getstatic com/trolmastercard/sexmod/dg.i Lnet/minecraft/client/Minecraft;
        // 2da: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 2dd: getfield net/minecraft/client/entity/EntityPlayerSP.field_70177_z F
        // 2e0: invokestatic com/trolmastercard/sexmod/e3.b (Lnet/minecraft/util/math/Vec3d;F)Lnet/minecraft/util/math/Vec3d;
        // 2e3: astore 12
        // 2e5: aload 12
        // 2e7: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 2ea: dstore 2
        // 2eb: aload 12
        // 2ed: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // 2f0: dstore 4
        // 2f2: aload 12
        // 2f4: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 2f7: dstore 6
        // 2f9: aload 1
        // 2fa: getstatic com/trolmastercard/sexmod/dg.i Lnet/minecraft/client/Minecraft;
        // 2fd: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 300: getfield net/minecraft/client/entity/EntityPlayerSP.field_70177_z F
        // 303: putfield com/trolmastercard/sexmod/em.field_70761_aq F
        // 306: aload 1
        // 307: getstatic com/trolmastercard/sexmod/dg.i Lnet/minecraft/client/Minecraft;
        // 30a: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 30d: getfield net/minecraft/client/entity/EntityPlayerSP.field_70126_B F
        // 310: putfield com/trolmastercard/sexmod/em.field_70760_ar F
        // 313: getstatic com/trolmastercard/sexmod/dg.i Lnet/minecraft/client/Minecraft;
        // 316: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 319: invokevirtual net/minecraft/client/entity/EntityPlayerSP.func_70093_af ()Z
        // 31c: ifeq 327
        // 31f: dload 4
        // 321: ldc2_w 0.075
        // 324: dsub
        // 325: dstore 4
        // 327: goto 3fa
        // 32a: aload 10
        // 32c: getstatic com/trolmastercard/sexmod/fp.SHOULDER_IDLE Lcom/trolmastercard/sexmod/fp;
        // 32f: if_acmpne 3bd
        // 332: aload 11
        // 334: ifnonnull 343
        // 337: goto 33e
        // 33a: invokestatic com/trolmastercard/sexmod/dg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 33d: athrow
        // 33e: return
        // 33f: invokestatic com/trolmastercard/sexmod/dg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 342: athrow
        // 343: getstatic com/trolmastercard/sexmod/dg.i Lnet/minecraft/client/Minecraft;
        // 346: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 349: invokevirtual net/minecraft/client/entity/EntityPlayerSP.getPersistentID ()Ljava/util/UUID;
        // 34c: aload 11
        // 34e: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
        // 351: ifeq 36c
        // 354: getstatic com/trolmastercard/sexmod/dg.i Lnet/minecraft/client/Minecraft;
        // 357: getfield net/minecraft/client/Minecraft.field_71474_y Lnet/minecraft/client/settings/GameSettings;
        // 35a: getfield net/minecraft/client/settings/GameSettings.field_74320_O I
        // 35d: ifne 36c
        // 360: goto 367
        // 363: invokestatic com/trolmastercard/sexmod/dg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 366: athrow
        // 367: return
        // 368: invokestatic com/trolmastercard/sexmod/dg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 36b: athrow
        // 36c: aload 1
        // 36d: getfield com/trolmastercard/sexmod/em.field_70170_p Lnet/minecraft/world/World;
        // 370: aload 11
        // 372: invokevirtual net/minecraft/world/World.func_152378_a (Ljava/util/UUID;)Lnet/minecraft/entity/player/EntityPlayer;
        // 375: astore 12
        // 377: aload 12
        // 379: ifnonnull 381
        // 37c: return
        // 37d: invokestatic com/trolmastercard/sexmod/dg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 380: athrow
        // 381: aload 12
        // 383: fload 9
        // 385: invokestatic com/trolmastercard/sexmod/dy.a (Lnet/minecraft/entity/player/EntityPlayer;F)Ljavax/vecmath/Vector4f;
        // 388: astore 13
        // 38a: aload 13
        // 38c: getfield javax/vecmath/Vector4f.x F
        // 38f: f2d
        // 390: dstore 2
        // 391: aload 13
        // 393: getfield javax/vecmath/Vector4f.y F
        // 396: f2d
        // 397: dstore 4
        // 399: aload 13
        // 39b: getfield javax/vecmath/Vector4f.z F
        // 39e: f2d
        // 39f: dstore 6
        // 3a1: aload 1
        // 3a2: aload 13
        // 3a4: getfield javax/vecmath/Vector4f.w F
        // 3a7: putfield com/trolmastercard/sexmod/em.field_70761_aq F
        // 3aa: aload 12
        // 3ac: invokevirtual net/minecraft/entity/player/EntityPlayer.func_70093_af ()Z
        // 3af: ifeq 3ba
        // 3b2: dload 4
        // 3b4: ldc2_w 0.32
        // 3b7: dsub
        // 3b8: dstore 4
        // 3ba: goto 3fa
        // 3bd: aload 10
        // 3bf: getstatic com/trolmastercard/sexmod/fp.PICK_UP Lcom/trolmastercard/sexmod/fp;
        // 3c2: if_acmpne 3fa
        // 3c5: aload 11
        // 3c7: ifnull 3fa
        // 3ca: goto 3d1
        // 3cd: invokestatic com/trolmastercard/sexmod/dg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 3d0: athrow
        // 3d1: aload 1
        // 3d2: getfield com/trolmastercard/sexmod/em.field_70170_p Lnet/minecraft/world/World;
        // 3d5: aload 11
        // 3d7: invokevirtual net/minecraft/world/World.func_152378_a (Ljava/util/UUID;)Lnet/minecraft/entity/player/EntityPlayer;
        // 3da: astore 12
        // 3dc: aload 12
        // 3de: ifnull 3fa
        // 3e1: aload 1
        // 3e2: aload 12
        // 3e4: getfield net/minecraft/entity/player/EntityPlayer.field_70758_at F
        // 3e7: putfield com/trolmastercard/sexmod/em.field_70760_ar F
        // 3ea: aload 1
        // 3eb: aload 12
        // 3ed: getfield net/minecraft/entity/player/EntityPlayer.field_70759_as F
        // 3f0: putfield com/trolmastercard/sexmod/em.field_70761_aq F
        // 3f3: goto 3fa
        // 3f6: invokestatic com/trolmastercard/sexmod/dg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 3f9: athrow
        // 3fa: aload 0
        // 3fb: aload 1
        // 3fc: dload 2
        // 3fd: dload 4
        // 3ff: dload 6
        // 401: fload 8
        // 403: fload 9
        // 405: invokespecial com/trolmastercard/sexmod/d9.a (Lcom/trolmastercard/sexmod/em;DDDFF)V
        // 408: aload 1
        // 409: aload 10
        // 40b: invokestatic com/trolmastercard/sexmod/dy.a (Lcom/trolmastercard/sexmod/em;Lcom/trolmastercard/sexmod/fp;)Z
        // 40e: ifeq 446
        // 411: getstatic com/trolmastercard/sexmod/dg.i Lnet/minecraft/client/Minecraft;
        // 414: getfield net/minecraft/client/Minecraft.field_71474_y Lnet/minecraft/client/settings/GameSettings;
        // 417: getfield net/minecraft/client/settings/GameSettings.field_74320_O I
        // 41a: ifne 446
        // 41d: goto 424
        // 420: invokestatic com/trolmastercard/sexmod/dg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 423: athrow
        // 424: getstatic com/trolmastercard/sexmod/dg.i Lnet/minecraft/client/Minecraft;
        // 427: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 42a: invokevirtual net/minecraft/client/entity/EntityPlayerSP.getPersistentID ()Ljava/util/UUID;
        // 42d: aload 11
        // 42f: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
        // 432: ifeq 446
        // 435: goto 43c
        // 438: invokestatic com/trolmastercard/sexmod/dg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 43b: athrow
        // 43c: invokestatic net/minecraft/client/renderer/GlStateManager.func_179121_F ()V
        // 43f: goto 446
        // 442: invokestatic com/trolmastercard/sexmod/dg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 445: athrow
        // 446: return
        // try (0 -> 16): 17 java/lang/RuntimeException
        // try (12 -> 21): 21 java/lang/RuntimeException
        // try (24 -> 34): 35 java/lang/RuntimeException
        // try (30 -> 39): 39 java/lang/RuntimeException
        // try (76 -> 82): 83 java/lang/RuntimeException
        // try (79 -> 89): 90 java/lang/RuntimeException
        // try (85 -> 96): 97 java/lang/RuntimeException
        // try (92 -> 102): 103 java/lang/RuntimeException
        // try (99 -> 106): 106 java/lang/RuntimeException
        // try (121 -> 131): 132 java/lang/RuntimeException
        // try (125 -> 138): 139 java/lang/RuntimeException
        // try (134 -> 142): 142 java/lang/RuntimeException
        // try (209 -> 220): 221 java/lang/RuntimeException
        // try (217 -> 225): 226 java/lang/RuntimeException
        // try (223 -> 234): 235 java/lang/RuntimeException
        // try (228 -> 239): 240 java/lang/RuntimeException
        // try (237 -> 248): 249 java/lang/RuntimeException
        // try (256 -> 266): 267 java/lang/RuntimeException
        // try (351 -> 356): 357 java/lang/RuntimeException
        // try (354 -> 360): 360 java/lang/RuntimeException
        // try (362 -> 372): 373 java/lang/RuntimeException
        // try (368 -> 376): 376 java/lang/RuntimeException
        // try (383 -> 386): 386 java/lang/RuntimeException
        // try (416 -> 421): 422 java/lang/RuntimeException
        // try (429 -> 439): 440 java/lang/RuntimeException
        // try (442 -> 458): 459 java/lang/RuntimeException
        // try (454 -> 467): 468 java/lang/RuntimeException
        // try (461 -> 471): 472 java/lang/RuntimeException
    }

    @Override
    protected void b(Tessellator var1, BufferBuilder var2, em var3, f7 var4, float var5) {
        a(var1, var2, var3, var4, var5);
    }

    @Nullable
    @Override
    protected f7 e(em param1) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 000: aload 0
        // 001: getfield com/trolmastercard/sexmod/dg.D Z
        // 004: ifne 00d
        // 007: aconst_null
        // 008: areturn
        // 009: invokestatic com/trolmastercard/sexmod/dg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 00c: athrow
        // 00d: aload 1
        // 00e: instanceof com/trolmastercard/sexmod/eq
        // 011: ifne 01a
        // 014: aconst_null
        // 015: areturn
        // 016: invokestatic com/trolmastercard/sexmod/dg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 019: athrow
        // 01a: aload 1
        // 01b: checkcast com/trolmastercard/sexmod/eq
        // 01e: astore 2
        // 01f: aload 2
        // 020: invokevirtual com/trolmastercard/sexmod/eq.m ()Ljava/util/UUID;
        // 023: astore 3
        // 024: getstatic com/trolmastercard/sexmod/dg.i Lnet/minecraft/client/Minecraft;
        // 027: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 02a: astore 4
        // 02c: aload 3
        // 02d: ifnull 056
        // 030: getstatic com/trolmastercard/sexmod/dg.i Lnet/minecraft/client/Minecraft;
        // 033: getfield net/minecraft/client/Minecraft.field_71474_y Lnet/minecraft/client/settings/GameSettings;
        // 036: getfield net/minecraft/client/settings/GameSettings.field_74320_O I
        // 039: ifne 05c
        // 03c: goto 043
        // 03f: invokestatic com/trolmastercard/sexmod/dg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 042: athrow
        // 043: aload 4
        // 045: invokevirtual net/minecraft/entity/player/EntityPlayer.getPersistentID ()Ljava/util/UUID;
        // 048: aload 3
        // 049: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
        // 04c: ifeq 05c
        // 04f: goto 056
        // 052: invokestatic com/trolmastercard/sexmod/dg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 055: athrow
        // 056: aconst_null
        // 057: areturn
        // 058: invokestatic com/trolmastercard/sexmod/dg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 05b: athrow
        // 05c: aload 2
        // 05d: invokevirtual com/trolmastercard/sexmod/eq.k ()Lnet/minecraft/entity/player/EntityPlayer;
        // 060: astore 5
        // 062: aload 5
        // 064: ifnonnull 06d
        // 067: aconst_null
        // 068: areturn
        // 069: invokestatic com/trolmastercard/sexmod/dg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 06c: athrow
        // 06d: aload 2
        // 06e: invokevirtual com/trolmastercard/sexmod/eq.func_184212_Q ()Lnet/minecraft/network/datasync/EntityDataManager;
        // 071: getstatic com/trolmastercard/sexmod/e2.T Lnet/minecraft/network/datasync/DataParameter;
        // 074: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
        // 077: checkcast net/minecraft/item/ItemStack
        // 07a: astore 6
        // 07c: aload 6
        // 07e: invokevirtual net/minecraft/item/ItemStack.func_190926_b ()Z
        // 081: ifeq 08a
        // 084: aconst_null
        // 085: areturn
        // 086: invokestatic com/trolmastercard/sexmod/dg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 089: athrow
        // 08a: aload 6
        // 08c: invokevirtual net/minecraft/item/ItemStack.func_77973_b ()Lnet/minecraft/item/Item;
        // 08f: instanceof net/minecraft/item/ItemArmor
        // 092: ifne 09b
        // 095: aconst_null
        // 096: areturn
        // 097: invokestatic com/trolmastercard/sexmod/dg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 09a: athrow
        // 09b: aload 6
        // 09d: invokevirtual net/minecraft/item/ItemStack.func_77973_b ()Lnet/minecraft/item/Item;
        // 0a0: checkcast net/minecraft/item/ItemArmor
        // 0a3: astore 7
        // 0a5: getstatic com/trolmastercard/sexmod/dg$b.a [I
        // 0a8: aload 7
        // 0aa: invokevirtual net/minecraft/item/ItemArmor.func_82812_d ()Lnet/minecraft/item/ItemArmor$ArmorMaterial;
        // 0ad: invokevirtual net/minecraft/item/ItemArmor$ArmorMaterial.ordinal ()I
        // 0b0: iaload
        // 0b1: tableswitch 35 1 5 53 67 67 81 35
        // 0d4: new com/trolmastercard/sexmod/f7
        // 0d7: dup
        // 0d8: ldc 23.0
        // 0da: ldc 100.0
        // 0dc: ldc 93.0
        // 0de: invokespecial com/trolmastercard/sexmod/f7.<init> (FFF)V
        // 0e1: areturn
        // 0e2: invokestatic com/trolmastercard/sexmod/dg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0e5: athrow
        // 0e6: new com/trolmastercard/sexmod/f7
        // 0e9: dup
        // 0ea: ldc 99.0
        // 0ec: ldc 98.0
        // 0ee: ldc 14.0
        // 0f0: invokespecial com/trolmastercard/sexmod/f7.<init> (FFF)V
        // 0f3: areturn
        // 0f4: new com/trolmastercard/sexmod/f7
        // 0f7: dup
        // 0f8: ldc 85.0
        // 0fa: ldc 85.0
        // 0fc: ldc 85.0
        // 0fe: invokespecial com/trolmastercard/sexmod/f7.<init> (FFF)V
        // 101: areturn
        // 102: aload 7
        // 104: aload 6
        // 106: invokevirtual net/minecraft/item/ItemArmor.func_82814_b (Lnet/minecraft/item/ItemStack;)I
        // 109: istore 8
        // 10b: iload 8
        // 10d: bipush 16
        // 10f: ishr
        // 110: sipush 255
        // 113: iand
        // 114: i2f
        // 115: fstore 9
        // 117: iload 8
        // 119: bipush 8
        // 11b: ishr
        // 11c: sipush 255
        // 11f: iand
        // 120: i2f
        // 121: fstore 10
        // 123: iload 8
        // 125: sipush 255
        // 128: iand
        // 129: i2f
        // 12a: fstore 11
        // 12c: new com/trolmastercard/sexmod/f7
        // 12f: dup
        // 130: fload 9
        // 132: fload 10
        // 134: fload 11
        // 136: invokespecial com/trolmastercard/sexmod/f7.<init> (FFF)V
        // 139: areturn
        // try (0 -> 5): 5 java/lang/RuntimeException
        // try (7 -> 12): 12 java/lang/RuntimeException
        // try (23 -> 29): 30 java/lang/RuntimeException
        // try (25 -> 37): 38 java/lang/RuntimeException
        // try (32 -> 42): 42 java/lang/RuntimeException
        // try (47 -> 51): 51 java/lang/RuntimeException
        // try (59 -> 64): 64 java/lang/RuntimeException
        // try (66 -> 72): 72 java/lang/RuntimeException
        // try (78 -> 91): 91 java/lang/RuntimeException
    }

    @Override
    protected void c() {
        GlStateManager.func_179137_b(0.0, -0.77, -0.05);
        GlStateManager.func_179139_a(0.5, 0.5, 0.5);
    }

    @Override
    protected void a(boolean param1, ItemStack param2) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 0
        // 01: iload 1
        // 02: aload 2
        // 03: invokespecial com/trolmastercard/sexmod/d9.a (ZLnet/minecraft/item/ItemStack;)V
        // 06: aload 2
        // 07: invokevirtual net/minecraft/item/ItemStack.func_77973_b ()Lnet/minecraft/item/Item;
        // 0a: aload 2
        // 0b: invokevirtual net/minecraft/item/Item.func_77661_b (Lnet/minecraft/item/ItemStack;)Lnet/minecraft/item/EnumAction;
        // 0e: getstatic net/minecraft/item/EnumAction.BOW Lnet/minecraft/item/EnumAction;
        // 11: if_acmpne 3e
        // 14: iload 1
        // 15: ifeq 35
        // 18: goto 1f
        // 1b: invokestatic com/trolmastercard/sexmod/dg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 1e: athrow
        // 1f: ldc 0.1
        // 21: fconst_0
        // 22: fconst_0
        // 23: invokestatic net/minecraft/client/renderer/GlStateManager.func_179109_b (FFF)V
        // 26: ldc 90.0
        // 28: fconst_1
        // 29: fconst_0
        // 2a: fconst_0
        // 2b: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
        // 2e: goto 3d
        // 31: invokestatic com/trolmastercard/sexmod/dg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 34: athrow
        // 35: ldc 170.0
        // 37: fconst_1
        // 38: fconst_0
        // 39: fconst_0
        // 3a: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
        // 3d: return
        // 3e: iload 1
        // 3f: ifeq 4b
        // 42: ldc 70.0
        // 44: goto 4d
        // 47: invokestatic com/trolmastercard/sexmod/dg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 4a: athrow
        // 4b: ldc 180.0
        // 4d: fconst_1
        // 4e: fconst_0
        // 4f: fconst_0
        // 50: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
        // 53: dconst_0
        // 54: ldc2_w 0.05
        // 57: ldc2_w -0.03
        // 5a: invokestatic net/minecraft/client/renderer/GlStateManager.func_179137_b (DDD)V
        // 5d: return
        // try (0 -> 12): 13 java/lang/RuntimeException
        // try (10 -> 25): 25 java/lang/RuntimeException
        // try (33 -> 37): 37 java/lang/RuntimeException
    }

    @Override
    protected void a(boolean var1) {
    }

    @Override
    protected void a(boolean param1, boolean param2) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 0
        // 01: iload 1
        // 02: iload 2
        // 03: invokespecial com/trolmastercard/sexmod/d9.a (ZZ)V
        // 06: iload 1
        // 07: ifeq 53
        // 0a: iload 2
        // 0b: ifeq 3e
        // 0e: goto 15
        // 11: invokestatic com/trolmastercard/sexmod/dg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 14: athrow
        // 15: dconst_0
        // 16: ldc2_w 0.2
        // 19: ldc2_w -0.25
        // 1c: invokestatic net/minecraft/client/renderer/GlStateManager.func_179137_b (DDD)V
        // 1f: ldc 85.0
        // 21: fconst_0
        // 22: fconst_1
        // 23: fconst_0
        // 24: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
        // 27: ldc 38.0
        // 29: fconst_1
        // 2a: fconst_0
        // 2b: fconst_0
        // 2c: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
        // 2f: ldc 90.0
        // 31: fconst_0
        // 32: fconst_0
        // 33: fconst_1
        // 34: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
        // 37: goto 8a
        // 3a: invokestatic com/trolmastercard/sexmod/dg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 3d: athrow
        // 3e: ldc 90.0
        // 40: fconst_1
        // 41: fconst_0
        // 42: fconst_0
        // 43: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
        // 46: dconst_0
        // 47: ldc2_w -0.265
        // 4a: ldc2_w -0.04
        // 4d: invokestatic net/minecraft/client/renderer/GlStateManager.func_179137_b (DDD)V
        // 50: goto 8a
        // 53: iload 2
        // 54: ifeq 7e
        // 57: fconst_0
        // 58: fconst_1
        // 59: fconst_0
        // 5a: fconst_0
        // 5b: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
        // 5e: ldc 150.0
        // 60: fconst_0
        // 61: fconst_1
        // 62: fconst_0
        // 63: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
        // 66: fconst_0
        // 67: fconst_0
        // 68: fconst_0
        // 69: fconst_1
        // 6a: invokestatic net/minecraft/client/renderer/GlStateManager.func_179114_b (FFFF)V
        // 6d: dconst_0
        // 6e: ldc2_w -0.33
        // 71: ldc2_w -0.1
        // 74: invokestatic net/minecraft/client/renderer/GlStateManager.func_179137_b (DDD)V
        // 77: goto 8a
        // 7a: invokestatic com/trolmastercard/sexmod/dg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 7d: athrow
        // 7e: ldc2_w -0.02
        // 81: ldc2_w -0.05
        // 84: ldc2_w -0.05
        // 87: invokestatic net/minecraft/client/renderer/GlStateManager.func_179137_b (DDD)V
        // 8a: return
        // try (0 -> 8): 9 java/lang/RuntimeException
        // try (6 -> 31): 31 java/lang/RuntimeException
        // try (43 -> 65): 65 java/lang/RuntimeException
    }

    private static RuntimeException a(RuntimeException var0) {
        return var0;
    }
}
