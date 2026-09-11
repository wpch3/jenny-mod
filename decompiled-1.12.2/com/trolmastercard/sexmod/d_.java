package com.trolmastercard.sexmod;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.UUID;
import javax.annotation.Nullable;
import javax.imageio.ImageIO;
import javax.vecmath.Matrix4f;
import javax.vecmath.Vector4f;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityHanging;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.geo.render.built.GeoCube;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.GeoModelProvider;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;
import software.bernie.geckolib3.util.MatrixStack;

public abstract class d_<T extends em & IAnimatable> extends GeoEntityRenderer<T> implements c3 {
    protected static final ResourceLocation e = new ResourceLocation("sexmod", "textures/line.png");
    static final float m = 1.5F;
    protected double c;
    protected T j;
    protected static Minecraft i;
    protected static HashMap<UUID, ResourceLocation> l = new HashMap<>();
    Color f = new Color(245, 199, 165);
    Color o = new Color(245, 157, 169);
    boolean h = false;
    protected HashSet<String> p = new HashSet<>();
    Integer k = null;
    Integer b = null;
    Integer d = null;
    float a = 0.0F;
    public static BufferBuilder n;
    Matrix4f g = null;
    protected GeoBone q = null;

    public d_(RenderManager var1, AnimatedGeoModel<T> var2, double var3) {
        super(var1, var2);
        this.c = var3;
        i = Minecraft.func_71410_x();
        this.field_76989_e = 0.2F;
    }

    protected ResourceLocation d(T var1) throws IOException {
        label38: {
            try {
                if (!(var1.field_70170_p instanceof gj) && var1.ae() != null) {
                    break label38;
                }
            } catch (IOException var5) {
                throw b(var5);
            }

            ResourceLocation var2 = l.get(i.func_110432_I().func_148256_e().getId());

            try {
                if (var2 == null) {
                    return this.a(i.func_110432_I().func_148256_e().getId(), var1.field_70170_p);
                }

                return var2;
            } catch (IOException var4) {
                throw b(var4);
            }
        }

        ResourceLocation var6 = l.get(var1.ae());

        try {
            if (var6 == null) {
                return this.a(var1.ae(), var1.field_70170_p);
            }
        } catch (IOException var3) {
            throw b(var3);
        }

        return var6;
    }

    protected ResourceLocation a(UUID var1, World var2) throws IOException {
        BufferedImage var3;
        try {
            var3 = y.a(var1);
            Graphics var4 = var3.getGraphics();
            var4.setColor(this.f);
            var4.fillRect(0, 0, 4, 3);
            var4.setColor(this.o);
            var4.fillRect(4, 0, 3, 3);
        } catch (Exception var6) {
            try {
                if (!this.h) {
                    this.h = true;
                }
            } catch (Exception var5) {
                throw b(var5);
            }

            var3 = ImageIO.read(i.func_110442_L().func_110536_a(new ResourceLocation("sexmod", "textures/player/steve.png")).func_110527_b());
        }

        l.put(var1, this.field_76990_c.field_78724_e.func_110578_a("player" + var1, new DynamicTexture(var3)));
        return l.get(var1);
    }

    protected static float a(em var0, float var1) {
        try {
            if (var0.Q()) {
                return var0.I();
            }
        } catch (IllegalStateException var2) {
            throw b(var2);
        }

        return b6.a(var0.field_70760_ar, var0.field_70761_aq, var1);
    }

    protected void d() {
    }

    protected void b() {
    }

    float a(World var1, Vec3d var2, float var3, float var4) {
        RayTraceResult var5 = this.a(var2, var2.func_178787_e(ck.a(new Vec3d(0.0, 0.0, -4.0), var3, var4)), var1);

        try {
            if (var5 == null) {
                return 4.0F;
            }
        } catch (IllegalStateException var8) {
            throw b(var8);
        }

        Vec3d var6 = var5.field_72307_f;

        try {
            if (var6 == null) {
                return 4.0F;
            }
        } catch (IllegalStateException var7) {
            throw b(var7);
        }

        return (float)var2.func_72438_d(var6);
    }

    boolean a(T var1, EntityPlayer var2) {
        try {
            if (var1 instanceof ei) {
                return true;
            }
        } catch (IllegalStateException var20) {
            throw b(var20);
        }

        World var3 = var1.field_70170_p;
        Vec3d var4 = var1.func_174791_d();
        float var5 = var1.field_70130_N * 1.5F;
        float var6 = var1.field_70131_O * 1.5F;
        Vec3d var7 = var2.func_174791_d().func_72441_c(0.0, var2.func_70047_e(), 0.0);
        int var8 = i.field_71474_y.field_74320_O;

        try {
            if (var8 != 0) {
                return true;
            }
        } catch (IllegalStateException var19) {
            throw b(var19);
        }

        if (var8 > 0) {
            float var9 = var2.field_70177_z;
            float var10 = var2.field_70125_A;
            if (var8 == 2) {
                var10 += 180.0F;
            }

            float var11 = 4.0F;
            Vec3d var12 = var7.func_72441_c(
                MathHelper.func_76126_a(var9 * (float) (Math.PI / 180.0)) * MathHelper.func_76134_b(var10 * (float) (Math.PI / 180.0)) * var11,
                MathHelper.func_76126_a(var10 * (float) (Math.PI / 180.0)) * var11,
                -MathHelper.func_76134_b(var9 * (float) (Math.PI / 180.0)) * MathHelper.func_76134_b(var10 * (float) (Math.PI / 180.0)) * var11
            );
            BlockPos var13 = new BlockPos(var12);
            boolean var14 = var3.func_175623_d(var13);
            if (!var14) {
                var7 = var12;
            } else if (var3.func_175623_d(var13.func_177982_a(0, 1, 0))) {
                var7 = new Vec3d(var12.field_72450_a, var13.func_177956_o() + 1, var12.field_72449_c);
            }
        }

        Vec3d[] var21 = new Vec3d[]{
            var4.func_72441_c(-var5 / 2.0F, 0.0, -var5 / 2.0F),
            var4.func_72441_c(-var5 / 2.0F, 0.0, var5 / 2.0F),
            var4.func_72441_c(var5 / 2.0F, 0.0, -var5 / 2.0F),
            var4.func_72441_c(var5 / 2.0F, 0.0, var5 / 2.0F),
            var4.func_72441_c(-var5 / 2.0F, var6, -var5 / 2.0F),
            var4.func_72441_c(-var5 / 2.0F, var6, var5 / 2.0F),
            var4.func_72441_c(var5 / 2.0F, var6, -var5 / 2.0F),
            var4.func_72441_c(var5 / 2.0F, var6, var5 / 2.0F)
        };

        for (Vec3d var25 : var21) {
            RayTraceResult var26 = this.a(var7, var25, var3);

            try {
                if (var26 == null) {
                    return true;
                }
            } catch (IllegalStateException var18) {
                throw b(var18);
            }

            IBlockState var15 = var3.func_180495_p(var26.func_178782_a());

            try {
                if (var15.func_185895_e()) {
                    return true;
                }
            } catch (IllegalStateException var16) {
                throw b(var16);
            }

            try {
                if (var15.func_177230_c().func_180664_k() != BlockRenderLayer.SOLID) {
                    return true;
                }
            } catch (IllegalStateException var17) {
                throw b(var17);
            }
        }

        return false;
    }

    HashSet<String> a(Boolean param1, boolean param2) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: getstatic com/trolmastercard/sexmod/ClientProxy.IS_PRELOADING Z
        // 03: ifeq 12
        // 06: new java/util/HashSet
        // 09: dup
        // 0a: invokespecial java/util/HashSet.<init> ()V
        // 0d: areturn
        // 0e: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 11: athrow
        // 12: aload 1
        // 13: invokevirtual java/lang/Boolean.booleanValue ()Z
        // 16: ifeq 20
        // 19: invokestatic com/trolmastercard/sexmod/a.b ()Ljava/util/HashSet;
        // 1c: astore 3
        // 1d: goto 28
        // 20: aload 0
        // 21: getfield com/trolmastercard/sexmod/d_.j Lcom/trolmastercard/sexmod/em;
        // 24: invokevirtual com/trolmastercard/sexmod/em.Y ()Ljava/util/HashSet;
        // 27: astore 3
        // 28: new java/util/HashSet
        // 2b: dup
        // 2c: invokespecial java/util/HashSet.<init> ()V
        // 2f: astore 4
        // 31: aload 3
        // 32: invokevirtual java/util/HashSet.iterator ()Ljava/util/Iterator;
        // 35: astore 5
        // 37: aload 5
        // 39: invokeinterface java/util/Iterator.hasNext ()Z 1
        // 3e: ifeq 88
        // 41: aload 5
        // 43: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
        // 48: checkcast java/lang/String
        // 4b: astore 6
        // 4d: aload 6
        // 4f: invokestatic com/trolmastercard/sexmod/br.b (Ljava/lang/String;)Lcom/trolmastercard/sexmod/br$b;
        // 52: astore 7
        // 54: aload 7
        // 56: ifnonnull 60
        // 59: goto 37
        // 5c: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 5f: athrow
        // 60: aload 7
        // 62: invokevirtual com/trolmastercard/sexmod/br$b.a ()Z
        // 65: ifne 7a
        // 68: iload 2
        // 69: ifeq 7a
        // 6c: goto 73
        // 6f: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 72: athrow
        // 73: goto 37
        // 76: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 79: athrow
        // 7a: aload 4
        // 7c: aload 7
        // 7e: invokevirtual com/trolmastercard/sexmod/br$b.h ()Ljava/util/HashSet;
        // 81: invokevirtual java/util/HashSet.addAll (Ljava/util/Collection;)Z
        // 84: pop
        // 85: goto 37
        // 88: aload 4
        // 8a: areturn
        // try (0 -> 6): 6 java/lang/IllegalStateException
        // try (35 -> 38): 38 java/lang/IllegalStateException
        // try (40 -> 45): 46 java/lang/IllegalStateException
        // try (43 -> 49): 49 java/lang/IllegalStateException
    }

    public void a(GeoModel param1, T param2, float param3, float param4, float param5, float param6, float param7) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: getstatic com/trolmastercard/sexmod/d_.i Lnet/minecraft/client/Minecraft;
        // 03: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 06: ifnull 3f
        // 09: aload 2
        // 0a: invokevirtual com/trolmastercard/sexmod/em.h ()Z
        // 0d: ifne 3f
        // 10: goto 17
        // 13: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 16: athrow
        // 17: aload 2
        // 18: invokevirtual com/trolmastercard/sexmod/em.d ()Z
        // 1b: ifeq 3f
        // 1e: goto 25
        // 21: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 24: athrow
        // 25: aload 0
        // 26: aload 2
        // 27: getstatic com/trolmastercard/sexmod/d_.i Lnet/minecraft/client/Minecraft;
        // 2a: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 2d: invokevirtual com/trolmastercard/sexmod/d_.a (Lcom/trolmastercard/sexmod/em;Lnet/minecraft/entity/player/EntityPlayer;)Z
        // 30: ifne 3f
        // 33: goto 3a
        // 36: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 39: athrow
        // 3a: return
        // 3b: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 3e: athrow
        // 3f: invokestatic net/minecraft/client/renderer/GlStateManager.func_179091_B ()V
        // 42: aload 0
        // 43: aload 2
        // 44: fload 3
        // 45: fload 4
        // 47: fload 5
        // 49: fload 6
        // 4b: fload 7
        // 4d: invokevirtual com/trolmastercard/sexmod/d_.a (Lcom/trolmastercard/sexmod/em;FFFFF)V
        // 50: aload 0
        // 51: aload 2
        // 52: fload 3
        // 53: fload 4
        // 55: fload 5
        // 57: fload 6
        // 59: fload 7
        // 5b: invokevirtual com/trolmastercard/sexmod/d_.renderLate (Ljava/lang/Object;FFFFF)V
        // 5e: invokestatic net/minecraft/client/renderer/Tessellator.func_178181_a ()Lnet/minecraft/client/renderer/Tessellator;
        // 61: invokevirtual net/minecraft/client/renderer/Tessellator.func_178180_c ()Lnet/minecraft/client/renderer/BufferBuilder;
        // 64: astore 8
        // 66: aload 8
        // 68: bipush 7
        // 6a: getstatic net/minecraft/client/renderer/vertex/DefaultVertexFormats.field_181712_l Lnet/minecraft/client/renderer/vertex/VertexFormat;
        // 6d: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181668_a (ILnet/minecraft/client/renderer/vertex/VertexFormat;)V
        // 70: aload 0
        // 71: aload 0
        // 72: aload 0
        // 73: getfield com/trolmastercard/sexmod/d_.j Lcom/trolmastercard/sexmod/em;
        // 76: invokevirtual com/trolmastercard/sexmod/d_.getEntityTexture (Lnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/util/ResourceLocation;
        // 79: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
        // 7c: checkcast net/minecraft/util/ResourceLocation
        // 7f: invokevirtual com/trolmastercard/sexmod/d_.func_110776_a (Lnet/minecraft/util/ResourceLocation;)V
        // 82: aload 0
        // 83: getfield com/trolmastercard/sexmod/d_.p Ljava/util/HashSet;
        // 86: invokevirtual java/util/HashSet.clear ()V
        // 89: aload 0
        // 8a: aload 0
        // 8b: aload 2
        // 8c: invokevirtual com/trolmastercard/sexmod/em.h ()Z
        // 8f: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
        // 92: aload 2
        // 93: invokevirtual com/trolmastercard/sexmod/em.ah ()I
        // 96: ifne a1
        // 99: bipush 1
        // 9a: goto a2
        // 9d: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // a0: athrow
        // a1: bipush 0
        // a2: invokevirtual com/trolmastercard/sexmod/d_.a (Ljava/lang/Boolean;Z)Ljava/util/HashSet;
        // a5: putfield com/trolmastercard/sexmod/d_.p Ljava/util/HashSet;
        // a8: aload 0
        // a9: invokevirtual com/trolmastercard/sexmod/d_.d ()V
        // ac: aload 2
        // ad: invokevirtual com/trolmastercard/sexmod/em.b ()Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;
        // b0: invokevirtual software/bernie/geckolib3/core/processor/AnimationProcessor.getModelRendererList ()Ljava/util/List;
        // b3: aload 0
        // b4: invokevirtual com/trolmastercard/sexmod/d_.a ()Ljava/util/HashSet;
        // b7: aload 0
        // b8: invokestatic com/trolmastercard/sexmod/gx.a (Ljava/util/List;Ljava/util/HashSet;Lcom/trolmastercard/sexmod/c3;)V
        // bb: aload 2
        // bc: fload 3
        // bd: invokestatic com/trolmastercard/sexmod/gx.a (Lnet/minecraft/entity/EntityLivingBase;F)V
        // c0: aload 0
        // c1: aload 1
        // c2: aload 8
        // c4: aload 2
        // c5: fload 4
        // c7: fload 5
        // c9: fload 6
        // cb: fload 7
        // cd: fload 3
        // ce: invokevirtual com/trolmastercard/sexmod/d_.a (Lsoftware/bernie/geckolib3/geo/render/built/GeoModel;Lnet/minecraft/client/renderer/BufferBuilder;Lcom/trolmastercard/sexmod/em;FFFFF)V
        // d1: aload 0
        // d2: aload 2
        // d3: fload 3
        // d4: fload 4
        // d6: fload 5
        // d8: fload 6
        // da: fload 7
        // dc: invokevirtual com/trolmastercard/sexmod/d_.renderAfter (Ljava/lang/Object;FFFFF)V
        // df: invokestatic net/minecraft/client/renderer/GlStateManager.func_179101_C ()V
        // e2: invokestatic net/minecraft/client/renderer/GlStateManager.func_179089_o ()V
        // e5: bipush 0
        // e6: invokestatic org/lwjgl/opengl/GL20.glUseProgram (I)V
        // e9: return
        // try (0 -> 6): 7 java/lang/IllegalStateException
        // try (3 -> 12): 13 java/lang/IllegalStateException
        // try (9 -> 21): 22 java/lang/IllegalStateException
        // try (15 -> 25): 25 java/lang/IllegalStateException
        // try (47 -> 72): 72 java/lang/IllegalStateException
    }

    protected void a(GeoModel var1, BufferBuilder var2, T var3, float var4, float var5, float var6, float var7, float var8) {
        GeoBone var9 = null;

        for (GeoBone var11 : var1.topLevelBones) {
            if (var11.getName().equals("steve")) {
                var9 = var11;
            } else {
                this.renderRecursively(var2, var11, var4, var5, var6, var7);
            }
        }

        label30: {
            IOException var14;
            try {
                Tessellator.func_178181_a().func_78381_a();
                this.b();
                if (var9 == null) {
                    return;
                }

                var2.func_181668_a(7, DefaultVertexFormats.field_181712_l);

                try {
                    Minecraft.func_71410_x().field_71446_o.func_110577_a(this.d(this.j));
                    break label30;
                } catch (IOException var12) {
                    var14 = var12;
                }
            } catch (IllegalStateException var13) {
                throw b(var13);
            }

            var14.printStackTrace();
        }

        this.renderRecursively(var2, var9, var4, var5, var6, this.j.v());
        Tessellator.func_178181_a().func_78381_a();
    }

    String a(String var1) {
        StringBuilder var2 = new StringBuilder();

        try {
            BufferedReader var3 = new BufferedReader(new FileReader(var1));

            while (true) {
                String var4;
                String var10000 = var4 = var3.readLine();

                try {
                    if (var10000 == null) {
                        break;
                    }

                    var2.append(var4).append("//\n");
                } catch (IOException var5) {
                    throw b(var5);
                }
            }

            var3.close();
        } catch (IOException var6) {
            var6.printStackTrace();
        }

        return var2.toString();
    }

    protected void a(double var1, double var3, double var5) {
        try {
            if (this.j.h()) {
                return;
            }
        } catch (IllegalStateException var9) {
            throw b(var9);
        }

        try {
            if (this.j.y().hideNameTag) {
                return;
            }
        } catch (IllegalStateException var7) {
            throw b(var7);
        }

        try {
            if (i.func_175598_ae().field_78734_h == null) {
                return;
            }
        } catch (IllegalStateException var8) {
            throw b(var8);
        }

        this.func_147906_a(this.j, this.j.ab(), var1, var3 + this.j.i(), var5, 300);
    }

    Vec3d a(EntityPlayer var1, float var2) {
        EntityLiving var3 = (EntityLiving)var1.func_184187_bx();
        EntityPlayerSP var4 = i.field_71439_g;
        Vec3d var5 = var3.func_70040_Z();
        Vec3d var6 = b6.a(new Vec3d(var1.field_70142_S, var1.field_70137_T, var1.field_70136_U), var1.func_174791_d(), var2);
        Vec3d var7 = b6.a(new Vec3d(var4.field_70142_S, var4.field_70137_T, var4.field_70136_U), var4.func_174791_d(), var2);
        var7 = var6.func_178788_d(var7);
        this.j.field_70761_aq = var3.field_70761_aq;
        return new Vec3d(var7.field_72450_a + var5.field_72450_a * -0.5, var7.field_72448_b + 0.15F, var7.field_72449_c + var5.field_72449_c * -0.5);
    }

    protected Vec3d a(T var1, float var2, Vec3d var3) {
        return var3;
    }

    Vec3d a(T param1, float param2, double param3, double param5, double param7) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 000: new net/minecraft/util/math/Vec3d
        // 003: dup
        // 004: dload 3
        // 005: dload 5
        // 007: dload 7
        // 009: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
        // 00c: astore 9
        // 00e: aload 1
        // 00f: getfield com/trolmastercard/sexmod/em.field_70170_p Lnet/minecraft/world/World;
        // 012: instanceof com/trolmastercard/sexmod/gj
        // 015: ifeq 01f
        // 018: aload 9
        // 01a: areturn
        // 01b: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 01e: athrow
        // 01f: aload 1
        // 020: invokevirtual com/trolmastercard/sexmod/em.t ()Z
        // 023: ifeq 057
        // 026: aload 1
        // 027: instanceof com/trolmastercard/sexmod/ei
        // 02a: ifeq 047
        // 02d: goto 034
        // 030: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 033: athrow
        // 034: getstatic com/trolmastercard/sexmod/d_.i Lnet/minecraft/client/Minecraft;
        // 037: getfield net/minecraft/client/Minecraft.field_71474_y Lnet/minecraft/client/settings/GameSettings;
        // 03a: getfield net/minecraft/client/settings/GameSettings.field_74320_O I
        // 03d: ifeq 057
        // 040: goto 047
        // 043: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 046: athrow
        // 047: aload 0
        // 048: dload 3
        // 049: dload 5
        // 04b: dload 7
        // 04d: invokevirtual com/trolmastercard/sexmod/d_.a (DDD)V
        // 050: goto 057
        // 053: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 056: athrow
        // 057: aload 1
        // 058: invokevirtual com/trolmastercard/sexmod/em.z ()Lnet/minecraft/entity/player/EntityPlayer;
        // 05b: astore 10
        // 05d: aload 10
        // 05f: ifnull 0a4
        // 062: aload 10
        // 064: invokevirtual net/minecraft/entity/player/EntityPlayer.func_184218_aH ()Z
        // 067: ifeq 0a4
        // 06a: goto 071
        // 06d: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 070: athrow
        // 071: aload 10
        // 073: invokevirtual net/minecraft/entity/player/EntityPlayer.func_184187_bx ()Lnet/minecraft/entity/Entity;
        // 076: instanceof net/minecraft/entity/passive/EntityHorse
        // 079: ifeq 0a4
        // 07c: goto 083
        // 07f: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 082: athrow
        // 083: aload 10
        // 085: invokevirtual net/minecraft/entity/player/EntityPlayer.func_184187_bx ()Lnet/minecraft/entity/Entity;
        // 088: checkcast net/minecraft/entity/passive/EntityHorse
        // 08b: invokevirtual net/minecraft/entity/passive/EntityHorse.func_110257_ck ()Z
        // 08e: ifeq 0a4
        // 091: goto 098
        // 094: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 097: athrow
        // 098: aload 0
        // 099: aload 10
        // 09b: fload 2
        // 09c: invokevirtual com/trolmastercard/sexmod/d_.a (Lnet/minecraft/entity/player/EntityPlayer;F)Lnet/minecraft/util/math/Vec3d;
        // 09f: areturn
        // 0a0: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 0a3: athrow
        // 0a4: aload 1
        // 0a5: invokevirtual com/trolmastercard/sexmod/em.Q ()Z
        // 0a8: ifne 0b2
        // 0ab: aload 9
        // 0ad: areturn
        // 0ae: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 0b1: athrow
        // 0b2: aload 1
        // 0b3: instanceof com/trolmastercard/sexmod/ei
        // 0b6: ifeq 0dd
        // 0b9: aload 1
        // 0ba: checkcast com/trolmastercard/sexmod/ei
        // 0bd: invokevirtual com/trolmastercard/sexmod/ei.f ()Z
        // 0c0: ifeq 0dd
        // 0c3: goto 0ca
        // 0c6: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 0c9: athrow
        // 0ca: getstatic com/trolmastercard/sexmod/d_.i Lnet/minecraft/client/Minecraft;
        // 0cd: getfield net/minecraft/client/Minecraft.field_71474_y Lnet/minecraft/client/settings/GameSettings;
        // 0d0: getfield net/minecraft/client/settings/GameSettings.field_74320_O I
        // 0d3: ifne 11a
        // 0d6: goto 0dd
        // 0d9: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 0dc: athrow
        // 0dd: new net/minecraft/util/math/Vec3d
        // 0e0: dup
        // 0e1: getstatic com/trolmastercard/sexmod/d_.i Lnet/minecraft/client/Minecraft;
        // 0e4: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 0e7: getfield net/minecraft/client/entity/EntityPlayerSP.field_70142_S D
        // 0ea: getstatic com/trolmastercard/sexmod/d_.i Lnet/minecraft/client/Minecraft;
        // 0ed: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 0f0: getfield net/minecraft/client/entity/EntityPlayerSP.field_70137_T D
        // 0f3: getstatic com/trolmastercard/sexmod/d_.i Lnet/minecraft/client/Minecraft;
        // 0f6: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 0f9: getfield net/minecraft/client/entity/EntityPlayerSP.field_70136_U D
        // 0fc: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
        // 0ff: getstatic com/trolmastercard/sexmod/d_.i Lnet/minecraft/client/Minecraft;
        // 102: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 105: invokevirtual net/minecraft/client/entity/EntityPlayerSP.func_174791_d ()Lnet/minecraft/util/math/Vec3d;
        // 108: fload 2
        // 109: f2d
        // 10a: invokestatic com/trolmastercard/sexmod/b6.a (Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;D)Lnet/minecraft/util/math/Vec3d;
        // 10d: astore 11
        // 10f: aload 1
        // 110: invokevirtual com/trolmastercard/sexmod/em.o ()Lnet/minecraft/util/math/Vec3d;
        // 113: aload 11
        // 115: invokevirtual net/minecraft/util/math/Vec3d.func_178788_d (Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;
        // 118: astore 9
        // 11a: aload 1
        // 11b: invokevirtual com/trolmastercard/sexmod/em.I ()Ljava/lang/Float;
        // 11e: invokevirtual java/lang/Float.floatValue ()F
        // 121: fstore 11
        // 123: aload 1
        // 124: fload 11
        // 126: putfield com/trolmastercard/sexmod/em.field_70177_z F
        // 129: aload 1
        // 12a: fload 11
        // 12c: putfield com/trolmastercard/sexmod/em.field_70760_ar F
        // 12f: aload 1
        // 130: fload 11
        // 132: putfield com/trolmastercard/sexmod/em.field_70761_aq F
        // 135: aload 1
        // 136: fload 11
        // 138: putfield com/trolmastercard/sexmod/em.field_70758_at F
        // 13b: aload 1
        // 13c: fload 11
        // 13e: putfield com/trolmastercard/sexmod/em.field_70759_as F
        // 141: aload 9
        // 143: areturn
        // try (7 -> 13): 13 java/lang/IllegalStateException
        // try (15 -> 21): 22 java/lang/IllegalStateException
        // try (18 -> 28): 29 java/lang/IllegalStateException
        // try (24 -> 36): 37 java/lang/IllegalStateException
        // try (42 -> 47): 48 java/lang/IllegalStateException
        // try (44 -> 54): 55 java/lang/IllegalStateException
        // try (50 -> 62): 63 java/lang/IllegalStateException
        // try (57 -> 70): 70 java/lang/IllegalStateException
        // try (72 -> 77): 77 java/lang/IllegalStateException
        // try (79 -> 86): 87 java/lang/IllegalStateException
        // try (82 -> 93): 94 java/lang/IllegalStateException
    }

    protected void b(T var1) {
    }

    public void a(T param1, double param2, double param4, double param6, float param8, float param9) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 000: aload 0
        // 001: aload 1
        // 002: putfield com/trolmastercard/sexmod/d_.j Lcom/trolmastercard/sexmod/em;
        // 005: aload 0
        // 006: aload 1
        // 007: fload 9
        // 009: dload 2
        // 00a: dload 4
        // 00c: dload 6
        // 00e: invokevirtual com/trolmastercard/sexmod/d_.a (Lcom/trolmastercard/sexmod/em;FDDD)Lnet/minecraft/util/math/Vec3d;
        // 011: astore 10
        // 013: aload 0
        // 014: aload 1
        // 015: fload 9
        // 017: aload 10
        // 019: invokevirtual com/trolmastercard/sexmod/d_.a (Lcom/trolmastercard/sexmod/em;FLnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;
        // 01c: astore 10
        // 01e: aload 10
        // 020: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 023: dstore 2
        // 024: aload 10
        // 026: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // 029: dstore 4
        // 02b: aload 10
        // 02d: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 030: dstore 6
        // 032: aload 0
        // 033: aload 1
        // 034: invokevirtual com/trolmastercard/sexmod/d_.b (Lcom/trolmastercard/sexmod/em;)V
        // 037: aload 1
        // 038: invokevirtual com/trolmastercard/sexmod/em.func_110167_bD ()Z
        // 03b: ifeq 056
        // 03e: aload 0
        // 03f: aload 1
        // 040: dload 2
        // 041: dload 4
        // 043: aload 0
        // 044: getfield com/trolmastercard/sexmod/d_.c D
        // 047: dadd
        // 048: dload 6
        // 04a: fload 9
        // 04c: invokevirtual com/trolmastercard/sexmod/d_.a (Lcom/trolmastercard/sexmod/em;DDDF)V
        // 04f: goto 056
        // 052: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 055: athrow
        // 056: invokestatic net/minecraft/client/renderer/GlStateManager.func_179094_E ()V
        // 059: dload 2
        // 05a: dload 4
        // 05c: dload 6
        // 05e: invokestatic net/minecraft/client/renderer/GlStateManager.func_179137_b (DDD)V
        // 061: sipush 2896
        // 064: invokestatic org/lwjgl/opengl/GL11.glDisable (I)V
        // 067: fconst_1
        // 068: fconst_1
        // 069: fconst_1
        // 06a: ldc 0.5
        // 06c: invokestatic net/minecraft/client/renderer/GlStateManager.func_179131_c (FFFF)V
        // 06f: invokestatic net/minecraft/client/renderer/GlStateManager.func_179108_z ()V
        // 072: invokestatic net/minecraft/client/renderer/GlStateManager.func_179147_l ()V
        // 075: getstatic net/minecraft/client/renderer/GlStateManager$SourceFactor.SRC_ALPHA Lnet/minecraft/client/renderer/GlStateManager$SourceFactor;
        // 078: getstatic net/minecraft/client/renderer/GlStateManager$DestFactor.ONE_MINUS_SRC_ALPHA Lnet/minecraft/client/renderer/GlStateManager$DestFactor;
        // 07b: invokestatic net/minecraft/client/renderer/GlStateManager.func_187401_a (Lnet/minecraft/client/renderer/GlStateManager$SourceFactor;Lnet/minecraft/client/renderer/GlStateManager$DestFactor;)V
        // 07e: aload 1
        // 07f: invokevirtual com/trolmastercard/sexmod/em.func_184187_bx ()Lnet/minecraft/entity/Entity;
        // 082: ifnull 09e
        // 085: aload 1
        // 086: invokevirtual com/trolmastercard/sexmod/em.func_184187_bx ()Lnet/minecraft/entity/Entity;
        // 089: invokevirtual net/minecraft/entity/Entity.shouldRiderSit ()Z
        // 08c: ifeq 09e
        // 08f: goto 096
        // 092: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 095: athrow
        // 096: bipush 1
        // 097: goto 09f
        // 09a: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 09d: athrow
        // 09e: bipush 0
        // 09f: istore 11
        // 0a1: new software/bernie/geckolib3/model/provider/data/EntityModelData
        // 0a4: dup
        // 0a5: invokespecial software/bernie/geckolib3/model/provider/data/EntityModelData.<init> ()V
        // 0a8: astore 12
        // 0aa: aload 12
        // 0ac: iload 11
        // 0ae: putfield software/bernie/geckolib3/model/provider/data/EntityModelData.isSitting Z
        // 0b1: aload 12
        // 0b3: aload 1
        // 0b4: invokevirtual com/trolmastercard/sexmod/em.func_70631_g_ ()Z
        // 0b7: putfield software/bernie/geckolib3/model/provider/data/EntityModelData.isChild Z
        // 0ba: aload 1
        // 0bb: getfield com/trolmastercard/sexmod/em.field_70760_ar F
        // 0be: aload 1
        // 0bf: getfield com/trolmastercard/sexmod/em.field_70761_aq F
        // 0c2: fload 9
        // 0c4: invokestatic software/bernie/shadowed/eliotlash/mclib/utils/Interpolations.lerpYaw (FFF)F
        // 0c7: fstore 13
        // 0c9: aload 1
        // 0ca: getfield com/trolmastercard/sexmod/em.field_70758_at F
        // 0cd: aload 1
        // 0ce: getfield com/trolmastercard/sexmod/em.field_70759_as F
        // 0d1: fload 9
        // 0d3: invokestatic software/bernie/shadowed/eliotlash/mclib/utils/Interpolations.lerpYaw (FFF)F
        // 0d6: fstore 14
        // 0d8: fload 14
        // 0da: fload 13
        // 0dc: fsub
        // 0dd: fstore 15
        // 0df: iload 11
        // 0e1: ifeq 158
        // 0e4: aload 1
        // 0e5: invokevirtual com/trolmastercard/sexmod/em.func_184187_bx ()Lnet/minecraft/entity/Entity;
        // 0e8: instanceof net/minecraft/entity/EntityLivingBase
        // 0eb: ifeq 158
        // 0ee: goto 0f5
        // 0f1: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 0f4: athrow
        // 0f5: aload 1
        // 0f6: invokevirtual com/trolmastercard/sexmod/em.func_184187_bx ()Lnet/minecraft/entity/Entity;
        // 0f9: checkcast net/minecraft/entity/EntityLivingBase
        // 0fc: astore 16
        // 0fe: aload 16
        // 100: getfield net/minecraft/entity/EntityLivingBase.field_70760_ar F
        // 103: aload 16
        // 105: getfield net/minecraft/entity/EntityLivingBase.field_70761_aq F
        // 108: fload 9
        // 10a: invokestatic software/bernie/shadowed/eliotlash/mclib/utils/Interpolations.lerpYaw (FFF)F
        // 10d: fstore 13
        // 10f: fload 14
        // 111: fload 13
        // 113: fsub
        // 114: fstore 15
        // 116: fload 15
        // 118: invokestatic net/minecraft/util/math/MathHelper.func_76142_g (F)F
        // 11b: fstore 17
        // 11d: fload 17
        // 11f: ldc -85.0
        // 121: fcmpg
        // 122: ifge 129
        // 125: ldc -85.0
        // 127: fstore 17
        // 129: fload 17
        // 12b: ldc 85.0
        // 12d: fcmpl
        // 12e: iflt 135
        // 131: ldc 85.0
        // 133: fstore 17
        // 135: fload 14
        // 137: fload 17
        // 139: fsub
        // 13a: fstore 13
        // 13c: fload 17
        // 13e: fload 17
        // 140: fmul
        // 141: ldc 2500.0
        // 143: fcmpl
        // 144: ifle 151
        // 147: fload 13
        // 149: fload 17
        // 14b: ldc 0.2
        // 14d: fmul
        // 14e: fadd
        // 14f: fstore 13
        // 151: fload 14
        // 153: fload 13
        // 155: fsub
        // 156: fstore 15
        // 158: aload 1
        // 159: getfield com/trolmastercard/sexmod/em.field_70127_C F
        // 15c: aload 1
        // 15d: getfield com/trolmastercard/sexmod/em.field_70125_A F
        // 160: fload 9
        // 162: invokestatic software/bernie/shadowed/eliotlash/mclib/utils/Interpolations.lerp (FFF)F
        // 165: fstore 16
        // 167: aload 0
        // 168: aload 1
        // 169: fload 9
        // 16b: invokevirtual com/trolmastercard/sexmod/d_.handleRotationFloat (Lnet/minecraft/entity/EntityLivingBase;F)F
        // 16e: fstore 17
        // 170: aload 0
        // 171: aload 1
        // 172: fload 17
        // 174: fload 13
        // 176: fload 9
        // 178: invokevirtual com/trolmastercard/sexmod/d_.b (Lcom/trolmastercard/sexmod/em;FFF)V
        // 17b: fconst_0
        // 17c: fstore 18
        // 17e: fconst_0
        // 17f: fstore 19
        // 181: iload 11
        // 183: ifne 1cb
        // 186: aload 1
        // 187: invokevirtual com/trolmastercard/sexmod/em.func_70089_S ()Z
        // 18a: ifeq 1cb
        // 18d: goto 194
        // 190: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 193: athrow
        // 194: aload 1
        // 195: getfield com/trolmastercard/sexmod/em.field_184618_aE F
        // 198: aload 1
        // 199: getfield com/trolmastercard/sexmod/em.field_70721_aZ F
        // 19c: fload 9
        // 19e: invokestatic software/bernie/shadowed/eliotlash/mclib/utils/Interpolations.lerp (FFF)F
        // 1a1: fstore 18
        // 1a3: aload 1
        // 1a4: getfield com/trolmastercard/sexmod/em.field_184619_aG F
        // 1a7: aload 1
        // 1a8: getfield com/trolmastercard/sexmod/em.field_70721_aZ F
        // 1ab: fconst_1
        // 1ac: fload 9
        // 1ae: fsub
        // 1af: fmul
        // 1b0: fsub
        // 1b1: fstore 19
        // 1b3: aload 1
        // 1b4: invokevirtual com/trolmastercard/sexmod/em.func_70631_g_ ()Z
        // 1b7: ifeq 1c1
        // 1ba: fload 19
        // 1bc: ldc 3.0
        // 1be: fmul
        // 1bf: fstore 19
        // 1c1: fload 18
        // 1c3: fconst_1
        // 1c4: fcmpl
        // 1c5: ifle 1cb
        // 1c8: fconst_1
        // 1c9: fstore 18
        // 1cb: aload 12
        // 1cd: fload 16
        // 1cf: fneg
        // 1d0: putfield software/bernie/geckolib3/model/provider/data/EntityModelData.headPitch F
        // 1d3: aload 12
        // 1d5: fload 15
        // 1d7: fneg
        // 1d8: putfield software/bernie/geckolib3/model/provider/data/EntityModelData.netHeadYaw F
        // 1db: new software/bernie/geckolib3/core/event/predicate/AnimationEvent
        // 1de: dup
        // 1df: aload 1
        // 1e0: fload 19
        // 1e2: fload 18
        // 1e4: fload 9
        // 1e6: fload 18
        // 1e8: ldc -0.15
        // 1ea: fcmpl
        // 1eb: ifle 1fd
        // 1ee: fload 18
        // 1f0: ldc 0.15
        // 1f2: fcmpg
        // 1f3: iflt 201
        // 1f6: goto 1fd
        // 1f9: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 1fc: athrow
        // 1fd: bipush 1
        // 1fe: goto 202
        // 201: bipush 0
        // 202: aload 12
        // 204: invokestatic java/util/Collections.singletonList (Ljava/lang/Object;)Ljava/util/List;
        // 207: invokespecial software/bernie/geckolib3/core/event/predicate/AnimationEvent.<init> (Lsoftware/bernie/geckolib3/core/IAnimatable;FFFZLjava/util/List;)V
        // 20a: astore 20
        // 20c: aload 0
        // 20d: invokespecial software/bernie/geckolib3/renderers/geo/GeoEntityRenderer.getGeoModelProvider ()Lsoftware/bernie/geckolib3/model/provider/GeoModelProvider;
        // 210: astore 21
        // 212: aload 21
        // 214: aload 1
        // 215: invokevirtual software/bernie/geckolib3/model/provider/GeoModelProvider.getModelLocation (Ljava/lang/Object;)Lnet/minecraft/util/ResourceLocation;
        // 218: astore 22
        // 21a: aload 21
        // 21c: aload 22
        // 21e: invokevirtual software/bernie/geckolib3/model/provider/GeoModelProvider.getModel (Lnet/minecraft/util/ResourceLocation;)Lsoftware/bernie/geckolib3/geo/render/built/GeoModel;
        // 221: astore 23
        // 223: aload 21
        // 225: instanceof software/bernie/geckolib3/core/IAnimatableModel
        // 228: ifeq 249
        // 22b: aload 21
        // 22d: checkcast software/bernie/geckolib3/core/IAnimatableModel
        // 230: aload 1
        // 231: aload 1
        // 232: invokevirtual com/trolmastercard/sexmod/em.func_110124_au ()Ljava/util/UUID;
        // 235: invokevirtual java/util/UUID.hashCode ()I
        // 238: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
        // 23b: aload 20
        // 23d: invokeinterface software/bernie/geckolib3/core/IAnimatableModel.setLivingAnimations (Ljava/lang/Object;Ljava/lang/Integer;Lsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V 4
        // 242: goto 249
        // 245: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 248: athrow
        // 249: invokestatic net/minecraft/client/renderer/GlStateManager.func_179094_E ()V
        // 24c: fconst_0
        // 24d: ldc 0.01
        // 24f: fconst_0
        // 250: invokestatic net/minecraft/client/renderer/GlStateManager.func_179109_b (FFF)V
        // 253: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
        // 256: getfield net/minecraft/client/Minecraft.field_71446_o Lnet/minecraft/client/renderer/texture/TextureManager;
        // 259: aload 0
        // 25a: aload 1
        // 25b: invokevirtual com/trolmastercard/sexmod/d_.getEntityTexture (Lnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/util/ResourceLocation;
        // 25e: invokevirtual net/minecraft/client/renderer/texture/TextureManager.func_110577_a (Lnet/minecraft/util/ResourceLocation;)V
        // 261: aload 0
        // 262: aload 1
        // 263: fload 9
        // 265: invokevirtual com/trolmastercard/sexmod/d_.getRenderColor (Ljava/lang/Object;F)Lsoftware/bernie/geckolib3/core/util/Color;
        // 268: astore 24
        // 26a: aload 0
        // 26b: aload 1
        // 26c: fload 9
        // 26e: invokevirtual com/trolmastercard/sexmod/d_.setDoRenderBrightness (Lnet/minecraft/entity/EntityLivingBase;F)Z
        // 271: istore 25
        // 273: aload 0
        // 274: aload 23
        // 276: aload 1
        // 277: fload 9
        // 279: aload 24
        // 27b: invokevirtual software/bernie/geckolib3/core/util/Color.getRed ()I
        // 27e: i2f
        // 27f: ldc 255.0
        // 281: fdiv
        // 282: aload 24
        // 284: invokevirtual software/bernie/geckolib3/core/util/Color.getBlue ()I
        // 287: i2f
        // 288: ldc 255.0
        // 28a: fdiv
        // 28b: aload 24
        // 28d: invokevirtual software/bernie/geckolib3/core/util/Color.getGreen ()I
        // 290: i2f
        // 291: ldc 255.0
        // 293: fdiv
        // 294: aload 24
        // 296: invokevirtual software/bernie/geckolib3/core/util/Color.getAlpha ()I
        // 299: i2f
        // 29a: ldc 255.0
        // 29c: fdiv
        // 29d: invokevirtual com/trolmastercard/sexmod/d_.a (Lsoftware/bernie/geckolib3/geo/render/built/GeoModel;Lcom/trolmastercard/sexmod/em;FFFFF)V
        // 2a0: iload 25
        // 2a2: ifeq 2af
        // 2a5: invokestatic software/bernie/geckolib3/renderers/geo/RenderHurtColor.unset ()V
        // 2a8: goto 2af
        // 2ab: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 2ae: athrow
        // 2af: aload 0
        // 2b0: getfield com/trolmastercard/sexmod/d_.layerRenderers Ljava/util/List;
        // 2b3: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
        // 2b8: astore 26
        // 2ba: aload 26
        // 2bc: invokeinterface java/util/Iterator.hasNext ()Z 1
        // 2c1: ifeq 2e7
        // 2c4: aload 26
        // 2c6: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
        // 2cb: checkcast software/bernie/geckolib3/renderers/geo/GeoLayerRenderer
        // 2ce: astore 27
        // 2d0: aload 27
        // 2d2: aload 1
        // 2d3: fload 19
        // 2d5: fload 18
        // 2d7: fload 9
        // 2d9: fload 19
        // 2db: fload 15
        // 2dd: fload 16
        // 2df: aload 24
        // 2e1: invokevirtual software/bernie/geckolib3/renderers/geo/GeoLayerRenderer.render (Lnet/minecraft/entity/EntityLivingBase;FFFFFFLsoftware/bernie/geckolib3/core/util/Color;)V
        // 2e4: goto 2ba
        // 2e7: sipush 2896
        // 2ea: invokestatic org/lwjgl/opengl/GL11.glEnable (I)V
        // 2ed: invokestatic net/minecraft/client/renderer/GlStateManager.func_179084_k ()V
        // 2f0: invokestatic net/minecraft/client/renderer/GlStateManager.func_179133_A ()V
        // 2f3: invokestatic net/minecraft/client/renderer/GlStateManager.func_179121_F ()V
        // 2f6: invokestatic net/minecraft/client/renderer/GlStateManager.func_179121_F ()V
        // 2f9: aload 0
        // 2fa: aload 1
        // 2fb: invokevirtual com/trolmastercard/sexmod/d_.a (Lcom/trolmastercard/sexmod/em;)V
        // 2fe: aload 1
        // 2ff: fload 9
        // 301: invokestatic com/trolmastercard/sexmod/b.a (Lcom/trolmastercard/sexmod/em;F)V
        // 304: aload 0
        // 305: aload 1
        // 306: invokevirtual com/trolmastercard/sexmod/d_.e (Lcom/trolmastercard/sexmod/em;)Lcom/trolmastercard/sexmod/f7;
        // 309: astore 26
        // 30b: aload 26
        // 30d: ifnull 320
        // 310: aload 0
        // 311: aload 1
        // 312: fload 9
        // 314: aload 26
        // 316: invokevirtual com/trolmastercard/sexmod/d_.a (Lcom/trolmastercard/sexmod/em;FLcom/trolmastercard/sexmod/f7;)V
        // 319: goto 320
        // 31c: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 31f: athrow
        // 320: return
        // try (26 -> 42): 43 java/lang/IllegalStateException
        // try (45 -> 69): 70 java/lang/IllegalStateException
        // try (65 -> 74): 74 java/lang/IllegalStateException
        // try (107 -> 113): 114 java/lang/IllegalStateException
        // try (188 -> 193): 194 java/lang/IllegalStateException
        // try (226 -> 248): 249 java/lang/IllegalStateException
        // try (269 -> 281): 282 java/lang/IllegalStateException
        // try (305 -> 333): 334 java/lang/IllegalStateException
        // try (374 -> 381): 382 java/lang/IllegalStateException
    }

    void a(T var1) {
        ArrayList var2 = new ArrayList<>(cv.e);
        var2.addAll(var1.p);

        for (String var4 : var2) {
            em var10000;
            String var10001;
            boolean var10002;
            label23: {
                try {
                    var10000 = var1;
                    var10001 = var4;
                    if (!var1.h()) {
                        var10002 = true;
                        break label23;
                    }
                } catch (IllegalStateException var8) {
                    throw b(var8);
                }

                var10002 = false;
            }

            MatrixStack var5 = var10000.a(var10001, var10002);
            Matrix4f var6 = var5.getModelMatrix();
            Vec3d var7 = new Vec3d(-var6.m03, var6.m13, -var6.m23);
            var1.a(var4, var7);
        }
    }

    @Nullable
    protected f7 e(T var1) {
        return null;
    }

    public Entity c(em var1) {
        return var1;
    }

    void a(em var1, float var2, f7 var3) {
        EntityPlayerSP var4 = i.field_71439_g;
        var3 = new f7(var3.a / 255.0F, var3.c / 255.0F, var3.b / 255.0F);
        Tessellator var5 = Tessellator.func_178181_a();
        BufferBuilder var6 = var5.func_178180_c();
        GlStateManager.func_179094_E();
        GlStateManager.func_179137_b(0.0, 0.01, 0.0);
        Entity var7 = this.c(var1);

        Vec3d var10000;
        label17: {
            try {
                if (var1.Q()) {
                    var10000 = var1.o();
                    break label17;
                }
            } catch (IllegalStateException var12) {
                throw b(var12);
            }

            var10000 = b6.a(new Vec3d(var7.field_70142_S, var7.field_70137_T, var7.field_70136_U), var7.func_174791_d(), var2);
        }

        Vec3d var8 = var10000;
        Vec3d var9 = b6.a(new Vec3d(var4.field_70142_S, var4.field_70137_T, var4.field_70136_U), var4.func_174791_d(), var2);
        Vec3d var10 = var8.func_178788_d(var9);
        GlStateManager.func_179137_b(var10.field_72450_a, var10.field_72448_b, var10.field_72449_c);
        i.func_110434_K().func_110577_a(e);
        float var11 = a(var1, var2, 1.0F, 5.0F);
        this.b(var5, var6, var1, var3, var11);
        GlStateManager.func_179121_F();
    }

    protected static float a(em var0, float var1, float var2, float var3) {
        EntityPlayerSP var4 = i.field_71439_g;
        Entity var5 = ((d_)i.func_175598_ae().func_78713_a(var0)).c(var0);

        Vec3d var10000;
        label17: {
            try {
                if (var0.Q()) {
                    var10000 = var0.o();
                    break label17;
                }
            } catch (IllegalStateException var11) {
                throw b(var11);
            }

            var10000 = b6.a(new Vec3d(var5.field_70142_S, var5.field_70137_T, var5.field_70136_U), var5.func_174791_d(), var1);
        }

        Vec3d var6 = var10000;
        Vec3d var7 = b6.a(new Vec3d(var4.field_70142_S, var4.field_70137_T, var4.field_70136_U), var4.func_174791_d(), var1);
        Vec3d var8 = ActiveRenderInfo.getCameraPosition().func_178787_e(var7);
        float var9 = (float)var8.func_72438_d(var6);
        float var10 = Math.abs(var9) / 5.0F;
        return b6.a(var3, var2, be.b(var10, 0.0F, 1.0F));
    }

    protected void b(Tessellator var1, BufferBuilder var2, em var3, f7 var4, float var5) {
    }

    protected static void a(BufferBuilder var0, Tessellator var1, em var2, String var3, String var4, float var5, float var6, float var7, float var8) {
        var0.func_181668_a(1, DefaultVertexFormats.field_181709_i);
        GlStateManager.func_187441_d(var8);
        Vec3d var9 = var2.b(var3);
        Vec3d var10 = var2.b(var4);
        var0.func_181662_b(var9.field_72450_a, var9.field_72448_b, var9.field_72449_c)
            .func_187315_a(0.0, 0.0)
            .func_181666_a(var5, var6, var7, 1.0F)
            .func_181675_d();
        var0.func_181662_b(var10.field_72450_a, var10.field_72448_b, var10.field_72449_c)
            .func_187315_a(0.0, 0.0)
            .func_181666_a(var5, var6, var7, 1.0F)
            .func_181675_d();
        var1.func_78381_a();
    }

    protected static void a(Tessellator var0, BufferBuilder var1, em var2, f7 var3, float var4) {
        a(var1, var0, var2, "braStringMidStartR", "braStringMidMid1R", var3.a, var3.c, var3.b, var4);
        a(var1, var0, var2, "braStringMidMid1R", "braStringMidMid2R", var3.a, var3.c, var3.b, var4);
        a(var1, var0, var2, "braStringMidMid2R", "braStringMidMid3R", var3.a, var3.c, var3.b, var4);
        a(var1, var0, var2, "braStringMidMid3R", "braStringMidEndR", var3.a, var3.c, var3.b, var4);
        a(var1, var0, var2, "braStringMidEndR", "braStringBackR", var3.a, var3.c, var3.b, var4);
        a(var1, var0, var2, "braStringBackR", "braStringRightEndR", var3.a, var3.c, var3.b, var4);
        a(var1, var0, var2, "braStringRightEndR", "braStringRightStartR", var3.a, var3.c, var3.b, var4);
        a(var1, var0, var2, "braStringRightR", "braStringRightL", var3.a, var3.c, var3.b, var4);
        a(var1, var0, var2, "braStringMidStartL", "braStringMidMid1L", var3.a, var3.c, var3.b, var4);
        a(var1, var0, var2, "braStringMidMid1L", "braStringMidMid2L", var3.a, var3.c, var3.b, var4);
        a(var1, var0, var2, "braStringMidMid2L", "braStringMidMid3L", var3.a, var3.c, var3.b, var4);
        a(var1, var0, var2, "braStringMidMid3L", "braStringMidEndL", var3.a, var3.c, var3.b, var4);
        a(var1, var0, var2, "braStringMidEndL", "braStringBackL", var3.a, var3.c, var3.b, var4);
        a(var1, var0, var2, "braStringBackL", "braStringLeftEndL", var3.a, var3.c, var3.b, var4);
        a(var1, var0, var2, "braStringLeftEndL", "braStringLeftStartL", var3.a, var3.c, var3.b, var4);
    }

    protected void b(T var1, float var2, float var3, float var4) {
        try {
            super.applyRotations((T)var1, var2, var3, var4);
            if (!(var1 instanceof ei)) {
                return;
            }
        } catch (IllegalStateException var22) {
            throw b(var22);
        }

        UUID var5 = ((ei)var1).m();

        try {
            if (var5 == null) {
                return;
            }
        } catch (IllegalStateException var21) {
            throw b(var21);
        }

        EntityPlayer var6 = var1.field_70170_p.func_152378_a(var5);

        try {
            if (var6 == null) {
                return;
            }
        } catch (IllegalStateException var18) {
            throw b(var18);
        }

        try {
            if (!var6.func_184613_cA()) {
                return;
            }
        } catch (IllegalStateException var20) {
            throw b(var20);
        }

        float var7 = var6.func_184599_cB() + var4;
        float var8 = MathHelper.func_76131_a(var7 * var7 / 100.0F, 0.0F, 1.0F);
        GlStateManager.func_179114_b(var8 * (-90.0F - var6.field_70125_A), 1.0F, 0.0F, 0.0F);
        Vec3d var9 = var6.func_70676_i(var4);
        double var10 = var6.field_70159_w * var6.field_70159_w + var6.field_70179_y * var6.field_70179_y;
        double var12 = var9.field_72450_a * var9.field_72450_a + var9.field_72449_c * var9.field_72449_c;

        try {
            if (!(var10 > 0.0) || !(var12 > 0.0)) {
                return;
            }
        } catch (IllegalStateException var19) {
            throw b(var19);
        }

        double var14 = (var6.field_70159_w * var9.field_72450_a + var6.field_70179_y * var9.field_72449_c) / (Math.sqrt(var10) * Math.sqrt(var12));
        double var16 = var6.field_70159_w * var9.field_72449_c - var6.field_70179_y * var9.field_72450_a;
        GlStateManager.func_179114_b((float)(Math.signum(var16) * Math.acos(var14)) * 180.0F / (float) Math.PI, 0.0F, 1.0F, 0.0F);
    }

    protected void a(BufferBuilder var1, String var2, GeoBone var3) {
    }

    protected void a(em var1, double var2, double var4, double var6, float var8) {
        Entity var9 = var1.func_110166_bE();
        var4 -= (1.6 - var1.field_70131_O) * 0.5;
        Tessellator var10 = Tessellator.func_178181_a();
        BufferBuilder var11 = var10.func_178180_c();
        double var12 = b6.a(var9.field_70126_B, var9.field_70177_z, var8 * 0.5F) * (float) (Math.PI / 180.0);
        double var14 = b6.a(var9.field_70127_C, var9.field_70125_A, var8 * 0.5F) * (float) (Math.PI / 180.0);
        double var16 = Math.cos(var12);
        double var18 = Math.sin(var12);
        double var20 = Math.sin(var14);
        if (var9 instanceof EntityHanging) {
            var16 = 0.0;
            var18 = 0.0;
            var20 = -1.0;
        }

        double var22 = Math.cos(var14);
        double var24 = b6.b(var9.field_70169_q, var9.field_70165_t, var8) - var16 * 0.7 - var18 * 0.5 * var22;
        double var26 = b6.b(var9.field_70167_r + var9.func_70047_e() * 0.7, var9.field_70163_u + var9.func_70047_e() * 0.7, var8) - var20 * 0.5 - 0.25;
        double var28 = b6.b(var9.field_70166_s, var9.field_70161_v, var8) - var18 * 0.7 + var16 * 0.5 * var22;
        double var30 = b6.a(var1.field_70760_ar, var1.field_70761_aq, var8) * (float) (Math.PI / 180.0) + (Math.PI / 2);
        var16 = Math.cos(var30) * var1.field_70130_N * 0.4;
        var18 = Math.sin(var30) * var1.field_70130_N * 0.4;
        double var32 = b6.b(var1.field_70169_q, var1.field_70165_t, var8) + var16;
        double var34 = b6.b(var1.field_70167_r, var1.field_70163_u, var8);
        double var36 = b6.b(var1.field_70166_s, var1.field_70161_v, var8) + var18;
        var2 += var16;
        var6 += var18;
        double var38 = (float)(var24 - var32);
        double var40 = (float)(var26 - var34);
        double var42 = (float)(var28 - var36);
        GlStateManager.func_179090_x();
        GlStateManager.func_179140_f();
        GlStateManager.func_179129_p();
        var11.func_181668_a(5, DefaultVertexFormats.field_181706_f);

        for (int var44 = 0; var44 <= 24; var44++) {
            float var45 = 0.5F;
            float var46 = 0.4F;
            float var47 = 0.3F;
            if (var44 % 2 == 0) {
                var45 *= 0.7F;
                var46 *= 0.7F;
                var47 *= 0.7F;
            }

            float var48 = var44 / 24.0F;
            var11.func_181662_b(
                    var2 + var38 * var48 + 0.0, var4 + var40 * (var48 * var48 + var48) * 0.5 + ((24.0F - var44) / 18.0F + 0.125F), var6 + var42 * var48
                )
                .func_181666_a(var45, var46, var47, 1.0F)
                .func_181675_d();
            var11.func_181662_b(
                    var2 + var38 * var48 + 0.025,
                    var4 + var40 * (var48 * var48 + var48) * 0.5 + ((24.0F - var44) / 18.0F + 0.125F) + 0.025,
                    var6 + var42 * var48
                )
                .func_181666_a(var45, var46, var47, 1.0F)
                .func_181675_d();
        }

        var10.func_78381_a();
        var11.func_181668_a(5, DefaultVertexFormats.field_181706_f);

        for (int var54 = 0; var54 <= 24; var54++) {
            float var55 = 0.5F;
            float var56 = 0.4F;
            float var57 = 0.3F;
            if (var54 % 2 == 0) {
                var55 *= 0.7F;
                var56 *= 0.7F;
                var57 *= 0.7F;
            }

            float var58 = var54 / 24.0F;
            var11.func_181662_b(
                    var2 + var38 * var58 + 0.0, var4 + var40 * (var58 * var58 + var58) * 0.5 + ((24.0F - var54) / 18.0F + 0.125F) + 0.025, var6 + var42 * var58
                )
                .func_181666_a(var55, var56, var57, 1.0F)
                .func_181675_d();
            var11.func_181662_b(
                    var2 + var38 * var58 + 0.025,
                    var4 + var40 * (var58 * var58 + var58) * 0.5 + ((24.0F - var54) / 18.0F + 0.125F),
                    var6 + var42 * var58 + 0.025
                )
                .func_181666_a(var55, var56, var57, 1.0F)
                .func_181675_d();
        }

        var10.func_78381_a();
        GlStateManager.func_179145_e();
        GlStateManager.func_179098_w();
        GlStateManager.func_179089_o();
    }

    @Override
    public void renderRecursively(BufferBuilder param1, GeoBone param2, float param3, float param4, float param5, float param6) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 000: aload 0
        // 001: getfield com/trolmastercard/sexmod/d_.j Lcom/trolmastercard/sexmod/em;
        // 004: getfield com/trolmastercard/sexmod/em.field_70170_p Lnet/minecraft/world/World;
        // 007: instanceof com/trolmastercard/sexmod/gj
        // 00a: ifeq 012
        // 00d: return
        // 00e: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 011: athrow
        // 012: aload 2
        // 013: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.getName ()Ljava/lang/String;
        // 016: astore 7
        // 018: aload 7
        // 01a: ldc "weapon"
        // 01c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 01f: ifeq 040
        // 022: aload 0
        // 023: getfield com/trolmastercard/sexmod/d_.j Lcom/trolmastercard/sexmod/em;
        // 026: instanceof com/trolmastercard/sexmod/e2
        // 029: ifeq 040
        // 02c: goto 033
        // 02f: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 032: athrow
        // 033: aload 0
        // 034: aload 1
        // 035: aload 2
        // 036: invokevirtual com/trolmastercard/sexmod/d_.a (Lnet/minecraft/client/renderer/BufferBuilder;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
        // 039: goto 040
        // 03c: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 03f: athrow
        // 040: aload 7
        // 042: ldc "itemRenderer"
        // 044: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 047: ifeq 06b
        // 04a: aload 0
        // 04b: getfield com/trolmastercard/sexmod/d_.j Lcom/trolmastercard/sexmod/em;
        // 04e: invokevirtual com/trolmastercard/sexmod/em.y ()Lcom/trolmastercard/sexmod/fp;
        // 051: getstatic com/trolmastercard/sexmod/fp.PAYMENT Lcom/trolmastercard/sexmod/fp;
        // 054: if_acmpne 06b
        // 057: goto 05e
        // 05a: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 05d: athrow
        // 05e: aload 0
        // 05f: aload 1
        // 060: aload 2
        // 061: invokevirtual com/trolmastercard/sexmod/d_.b (Lnet/minecraft/client/renderer/BufferBuilder;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
        // 064: goto 06b
        // 067: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 06a: athrow
        // 06b: aload 7
        // 06d: ldc "ballL"
        // 06f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 072: ifne 097
        // 075: aload 7
        // 077: ldc "ballR"
        // 079: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 07c: ifne 097
        // 07f: goto 086
        // 082: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 085: athrow
        // 086: aload 7
        // 088: ldc "cock"
        // 08a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 08d: ifeq 09a
        // 090: goto 097
        // 093: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 096: athrow
        // 097: fconst_1
        // 098: fstore 6
        // 09a: aload 1
        // 09b: putstatic com/trolmastercard/sexmod/d_.n Lnet/minecraft/client/renderer/BufferBuilder;
        // 09e: aload 0
        // 09f: aload 1
        // 0a0: aload 7
        // 0a2: aload 2
        // 0a3: invokevirtual com/trolmastercard/sexmod/d_.a (Lnet/minecraft/client/renderer/BufferBuilder;Ljava/lang/String;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
        // 0a6: getstatic com/trolmastercard/sexmod/d_.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 0a9: invokevirtual software/bernie/geckolib3/util/MatrixStack.push ()V
        // 0ac: getstatic com/trolmastercard/sexmod/d_.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 0af: aload 2
        // 0b0: invokevirtual software/bernie/geckolib3/util/MatrixStack.translate (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
        // 0b3: getstatic com/trolmastercard/sexmod/d_.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 0b6: aload 2
        // 0b7: invokevirtual software/bernie/geckolib3/util/MatrixStack.moveToPivot (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
        // 0ba: getstatic com/trolmastercard/sexmod/d_.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 0bd: aload 2
        // 0be: invokevirtual software/bernie/geckolib3/util/MatrixStack.rotate (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
        // 0c1: getstatic com/trolmastercard/sexmod/d_.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 0c4: aload 2
        // 0c5: invokevirtual software/bernie/geckolib3/util/MatrixStack.scale (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
        // 0c8: getstatic com/trolmastercard/sexmod/d_.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 0cb: aload 2
        // 0cc: invokevirtual software/bernie/geckolib3/util/MatrixStack.moveBackFromPivot (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
        // 0cf: ldc "Head2"
        // 0d1: aload 7
        // 0d3: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 0d6: ifeq 0f2
        // 0d9: aload 0
        // 0da: invokevirtual com/trolmastercard/sexmod/d_.c ()Z
        // 0dd: ifne 0f2
        // 0e0: goto 0e7
        // 0e3: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 0e6: athrow
        // 0e7: getstatic com/trolmastercard/sexmod/d_.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 0ea: invokevirtual software/bernie/geckolib3/util/MatrixStack.pop ()V
        // 0ed: return
        // 0ee: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 0f1: athrow
        // 0f2: aload 0
        // 0f3: aload 7
        // 0f5: invokevirtual com/trolmastercard/sexmod/d_.b (Ljava/lang/String;)Z
        // 0f8: ifne 106
        // 0fb: getstatic com/trolmastercard/sexmod/d_.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 0fe: invokevirtual software/bernie/geckolib3/util/MatrixStack.pop ()V
        // 101: return
        // 102: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 105: athrow
        // 106: aload 2
        // 107: getfield software/bernie/geckolib3/geo/render/built/GeoBone.isHidden Z
        // 10a: ifne 1d7
        // 10d: aload 0
        // 10e: aload 7
        // 110: fload 3
        // 111: fload 4
        // 113: fload 5
        // 115: invokevirtual com/trolmastercard/sexmod/d_.a (Ljava/lang/String;FFF)Ljavax/vecmath/Vector4f;
        // 118: astore 8
        // 11a: aload 8
        // 11c: getfield javax/vecmath/Vector4f.x F
        // 11f: fstore 3
        // 120: aload 8
        // 122: getfield javax/vecmath/Vector4f.y F
        // 125: fstore 4
        // 127: aload 8
        // 129: getfield javax/vecmath/Vector4f.z F
        // 12c: fstore 5
        // 12e: aload 8
        // 130: getfield javax/vecmath/Vector4f.w F
        // 133: f2d
        // 134: dstore 9
        // 136: aload 0
        // 137: getfield com/trolmastercard/sexmod/d_.p Ljava/util/HashSet;
        // 13a: aload 7
        // 13c: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
        // 13f: ifne 187
        // 142: aload 2
        // 143: getfield software/bernie/geckolib3/geo/render/built/GeoBone.childCubes Ljava/util/List;
        // 146: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
        // 14b: astore 11
        // 14d: aload 11
        // 14f: invokeinterface java/util/Iterator.hasNext ()Z 1
        // 154: ifeq 187
        // 157: aload 11
        // 159: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
        // 15e: checkcast software/bernie/geckolib3/geo/render/built/GeoCube
        // 161: astore 12
        // 163: getstatic com/trolmastercard/sexmod/d_.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 166: invokevirtual software/bernie/geckolib3/util/MatrixStack.push ()V
        // 169: aload 0
        // 16a: aload 2
        // 16b: putfield com/trolmastercard/sexmod/d_.q Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;
        // 16e: aload 0
        // 16f: aload 1
        // 170: aload 12
        // 172: fload 3
        // 173: fload 4
        // 175: fload 5
        // 177: fload 6
        // 179: dload 9
        // 17b: invokevirtual com/trolmastercard/sexmod/d_.a (Lnet/minecraft/client/renderer/BufferBuilder;Lsoftware/bernie/geckolib3/geo/render/built/GeoCube;FFFFD)V
        // 17e: getstatic com/trolmastercard/sexmod/d_.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 181: invokevirtual software/bernie/geckolib3/util/MatrixStack.pop ()V
        // 184: goto 14d
        // 187: aload 2
        // 188: getfield software/bernie/geckolib3/geo/render/built/GeoBone.childBones Ljava/util/List;
        // 18b: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
        // 190: astore 11
        // 192: aload 11
        // 194: invokeinterface java/util/Iterator.hasNext ()Z 1
        // 199: ifeq 1d7
        // 19c: aload 11
        // 19e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
        // 1a3: checkcast software/bernie/geckolib3/geo/render/built/GeoBone
        // 1a6: astore 12
        // 1a8: dload 9
        // 1aa: dconst_0
        // 1ab: dcmpl
        // 1ac: ifne 1c4
        // 1af: aload 0
        // 1b0: aload 1
        // 1b1: aload 12
        // 1b3: fload 3
        // 1b4: fload 4
        // 1b6: fload 5
        // 1b8: fload 6
        // 1ba: invokevirtual com/trolmastercard/sexmod/d_.renderRecursively (Lnet/minecraft/client/renderer/BufferBuilder;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;FFFF)V
        // 1bd: goto 1d4
        // 1c0: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 1c3: athrow
        // 1c4: aload 0
        // 1c5: aload 1
        // 1c6: aload 12
        // 1c8: fload 3
        // 1c9: fload 4
        // 1cb: fload 5
        // 1cd: fload 6
        // 1cf: dload 9
        // 1d1: invokevirtual com/trolmastercard/sexmod/d_.a (Lnet/minecraft/client/renderer/BufferBuilder;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;FFFFD)V
        // 1d4: goto 192
        // 1d7: getstatic com/trolmastercard/sexmod/d_.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 1da: invokevirtual software/bernie/geckolib3/util/MatrixStack.pop ()V
        // 1dd: goto 1e2
        // 1e0: astore 8
        // 1e2: return
        // try (183 -> 196): 196 java/lang/IllegalStateException
        // try (107 -> 114): 114 java/lang/IllegalStateException
        // try (96 -> 105): 105 java/lang/IllegalStateException
        // try (68 -> 99): 100 java/lang/IllegalStateException
        // try (52 -> 63): 64 java/lang/IllegalStateException
        // try (48 -> 56): 57 java/lang/IllegalStateException
        // try (33 -> 45): 46 java/lang/IllegalStateException
        // try (29 -> 38): 39 java/lang/IllegalStateException
        // try (15 -> 26): 27 java/lang/IllegalStateException
        // try (11 -> 19): 20 java/lang/IllegalStateException
        // try (0 -> 6): 6 java/lang/IllegalStateException
        // try (208 -> 210): 211 java/lang/IllegalStateException
    }

    protected Vector4f a(float var1, float var2, float var3) {
        return new Vector4f(var1, var2, var3, 0.0F);
    }

    boolean b(String var1) {
        try {
            if (!var1.startsWith("armor")) {
                return true;
            }
        } catch (IllegalStateException var2) {
            throw b(var2);
        }

        return this.j instanceof e2;
    }

    protected Vector4f a(String var1, float var2, float var3, float var4) {
        try {
            if (!var1.startsWith("armor")) {
                return this.a(var2, var3, var4);
            }
        } catch (IllegalStateException var19) {
            throw b(var19);
        }

        try {
            if (!(this.j instanceof e2)) {
                return this.a(var2, var3, var4);
            }
        } catch (IllegalStateException var15) {
            throw b(var15);
        }

        try {
            if ((Integer)this.j.m.func_187225_a(em.D) == 0) {
                return this.a(var2, var3, var4);
            }
        } catch (IllegalStateException var18) {
            throw b(var18);
        }

        GeoModelProvider var5 = this.getGeoModelProvider();

        try {
            if (!(var5 instanceof cv)) {
                return this.a(var2, var3, var4);
            }
        } catch (IllegalStateException var17) {
            throw b(var17);
        }

        cv var6 = (cv)var5;
        ItemStack var7 = var6.a(this.j, var1);

        try {
            if (!(var7.func_77973_b() instanceof ItemArmor)) {
                return this.a(var2, var3, var4);
            }
        } catch (IllegalStateException var16) {
            throw b(var16);
        }

        ItemArmor var8 = (ItemArmor)var7.func_77973_b();
        ArmorMaterial var9 = var8.func_82812_d();
        float var10 = 0.0F;
        switch (var9) {
            case GOLD:
                var10 = 1.0F;
                break;
            case CHAIN:
            case IRON:
                var10 = 2.0F;
                break;
            case LEATHER:
                var10 = 4.0F;
                int var11 = var8.func_82814_b(var7);
                float var12 = (var11 >> 16 & 0xFF) / 255.0F;
                float var13 = (var11 >> 8 & 0xFF) / 255.0F;
                float var14 = (var11 & 0xFF) / 255.0F;
                var2 *= var12;
                var3 *= var13;
                var4 *= var14;
        }

        return new Vector4f(var2, var3, var4, 72.0F * var10 / 4096.0F);
    }

    public void a(T var1, float var2, float var3, float var4, float var5, float var6) {
        this.g = (Matrix4f)MATRIX_STACK.getModelMatrix().clone();
    }

    public void a(BufferBuilder param1, GeoBone param2, float param3, float param4, float param5, float param6, double param7) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 000: aload 0
        // 001: getfield com/trolmastercard/sexmod/d_.j Lcom/trolmastercard/sexmod/em;
        // 004: getfield com/trolmastercard/sexmod/em.field_70170_p Lnet/minecraft/world/World;
        // 007: instanceof com/trolmastercard/sexmod/gj
        // 00a: ifeq 012
        // 00d: return
        // 00e: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 011: athrow
        // 012: aload 2
        // 013: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.getName ()Ljava/lang/String;
        // 016: astore 9
        // 018: aload 9
        // 01a: ldc "weapon"
        // 01c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 01f: ifeq 02f
        // 022: aload 0
        // 023: aload 1
        // 024: aload 2
        // 025: invokevirtual com/trolmastercard/sexmod/d_.a (Lnet/minecraft/client/renderer/BufferBuilder;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
        // 028: goto 02f
        // 02b: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 02e: athrow
        // 02f: aload 9
        // 031: ldc "ballL"
        // 033: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 036: ifne 05b
        // 039: aload 9
        // 03b: ldc "ballR"
        // 03d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 040: ifne 05b
        // 043: goto 04a
        // 046: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 049: athrow
        // 04a: aload 9
        // 04c: ldc "cock"
        // 04e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 051: ifeq 05e
        // 054: goto 05b
        // 057: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 05a: athrow
        // 05b: fconst_1
        // 05c: fstore 6
        // 05e: aload 0
        // 05f: aload 1
        // 060: aload 2
        // 061: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.getName ()Ljava/lang/String;
        // 064: aload 2
        // 065: invokevirtual com/trolmastercard/sexmod/d_.a (Lnet/minecraft/client/renderer/BufferBuilder;Ljava/lang/String;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
        // 068: getstatic com/trolmastercard/sexmod/d_.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 06b: invokevirtual software/bernie/geckolib3/util/MatrixStack.push ()V
        // 06e: getstatic com/trolmastercard/sexmod/d_.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 071: aload 2
        // 072: invokevirtual software/bernie/geckolib3/util/MatrixStack.translate (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
        // 075: getstatic com/trolmastercard/sexmod/d_.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 078: aload 2
        // 079: invokevirtual software/bernie/geckolib3/util/MatrixStack.moveToPivot (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
        // 07c: getstatic com/trolmastercard/sexmod/d_.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 07f: aload 2
        // 080: invokevirtual software/bernie/geckolib3/util/MatrixStack.rotate (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
        // 083: getstatic com/trolmastercard/sexmod/d_.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 086: aload 2
        // 087: invokevirtual software/bernie/geckolib3/util/MatrixStack.scale (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
        // 08a: getstatic com/trolmastercard/sexmod/d_.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 08d: aload 2
        // 08e: invokevirtual software/bernie/geckolib3/util/MatrixStack.moveBackFromPivot (Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
        // 091: aload 2
        // 092: getfield software/bernie/geckolib3/geo/render/built/GeoBone.isHidden Z
        // 095: ifne 12a
        // 098: aload 0
        // 099: getfield com/trolmastercard/sexmod/d_.p Ljava/util/HashSet;
        // 09c: aload 9
        // 09e: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
        // 0a1: ifne 0f6
        // 0a4: goto 0ab
        // 0a7: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 0aa: athrow
        // 0ab: aload 2
        // 0ac: getfield software/bernie/geckolib3/geo/render/built/GeoBone.childCubes Ljava/util/List;
        // 0af: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
        // 0b4: astore 10
        // 0b6: aload 10
        // 0b8: invokeinterface java/util/Iterator.hasNext ()Z 1
        // 0bd: ifeq 0f6
        // 0c0: aload 10
        // 0c2: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
        // 0c7: checkcast software/bernie/geckolib3/geo/render/built/GeoCube
        // 0ca: astore 11
        // 0cc: getstatic com/trolmastercard/sexmod/d_.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 0cf: invokevirtual software/bernie/geckolib3/util/MatrixStack.push ()V
        // 0d2: invokestatic net/minecraft/client/renderer/GlStateManager.func_179094_E ()V
        // 0d5: aload 0
        // 0d6: aload 2
        // 0d7: putfield com/trolmastercard/sexmod/d_.q Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;
        // 0da: aload 0
        // 0db: aload 1
        // 0dc: aload 11
        // 0de: fload 3
        // 0df: fload 4
        // 0e1: fload 5
        // 0e3: fload 6
        // 0e5: dload 7
        // 0e7: invokevirtual com/trolmastercard/sexmod/d_.a (Lnet/minecraft/client/renderer/BufferBuilder;Lsoftware/bernie/geckolib3/geo/render/built/GeoCube;FFFFD)V
        // 0ea: invokestatic net/minecraft/client/renderer/GlStateManager.func_179121_F ()V
        // 0ed: getstatic com/trolmastercard/sexmod/d_.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 0f0: invokevirtual software/bernie/geckolib3/util/MatrixStack.pop ()V
        // 0f3: goto 0b6
        // 0f6: aload 2
        // 0f7: getfield software/bernie/geckolib3/geo/render/built/GeoBone.childBones Ljava/util/List;
        // 0fa: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
        // 0ff: astore 10
        // 101: aload 10
        // 103: invokeinterface java/util/Iterator.hasNext ()Z 1
        // 108: ifeq 12a
        // 10b: aload 10
        // 10d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
        // 112: checkcast software/bernie/geckolib3/geo/render/built/GeoBone
        // 115: astore 11
        // 117: aload 0
        // 118: aload 1
        // 119: aload 11
        // 11b: fload 3
        // 11c: fload 4
        // 11e: fload 5
        // 120: fload 6
        // 122: dload 7
        // 124: invokevirtual com/trolmastercard/sexmod/d_.a (Lnet/minecraft/client/renderer/BufferBuilder;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;FFFFD)V
        // 127: goto 101
        // 12a: getstatic com/trolmastercard/sexmod/d_.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 12d: invokevirtual software/bernie/geckolib3/util/MatrixStack.pop ()V
        // 130: return
        // try (0 -> 6): 6 java/lang/IllegalStateException
        // try (11 -> 19): 20 java/lang/IllegalStateException
        // try (22 -> 30): 31 java/lang/IllegalStateException
        // try (26 -> 37): 38 java/lang/IllegalStateException
        // try (42 -> 73): 74 java/lang/IllegalStateException
    }

    protected boolean c() {
        try {
            if (!this.j.n()) {
                return true;
            }
        } catch (IllegalStateException var1) {
            throw b(var1);
        }

        try {
            if (i.field_71474_y.field_74320_O != 0) {
                return true;
            }
        } catch (IllegalStateException var2) {
            throw b(var2);
        }

        return false;
    }

    public void a(BufferBuilder param1, GeoCube param2, float param3, float param4, float param5, float param6, double param7) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 000: getstatic com/trolmastercard/sexmod/d_.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 003: aload 2
        // 004: invokevirtual software/bernie/geckolib3/util/MatrixStack.moveToPivot (Lsoftware/bernie/geckolib3/geo/render/built/GeoCube;)V
        // 007: getstatic com/trolmastercard/sexmod/d_.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 00a: aload 2
        // 00b: invokevirtual software/bernie/geckolib3/util/MatrixStack.rotate (Lsoftware/bernie/geckolib3/geo/render/built/GeoCube;)V
        // 00e: getstatic com/trolmastercard/sexmod/d_.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 011: aload 2
        // 012: invokevirtual software/bernie/geckolib3/util/MatrixStack.moveBackFromPivot (Lsoftware/bernie/geckolib3/geo/render/built/GeoCube;)V
        // 015: aload 2
        // 016: getfield software/bernie/geckolib3/geo/render/built/GeoCube.quads [Lsoftware/bernie/geckolib3/geo/render/built/GeoQuad;
        // 019: astore 9
        // 01b: aload 9
        // 01d: arraylength
        // 01e: istore 10
        // 020: bipush 0
        // 021: istore 11
        // 023: iload 11
        // 025: iload 10
        // 027: if_icmpge 1fa
        // 02a: aload 9
        // 02c: iload 11
        // 02e: aaload
        // 02f: astore 12
        // 031: aload 12
        // 033: ifnonnull 03d
        // 036: goto 1f4
        // 039: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 03c: athrow
        // 03d: new javax/vecmath/Vector3f
        // 040: dup
        // 041: aload 12
        // 043: getfield software/bernie/geckolib3/geo/render/built/GeoQuad.normal Lnet/minecraft/util/math/Vec3i;
        // 046: invokevirtual net/minecraft/util/math/Vec3i.func_177958_n ()I
        // 049: i2f
        // 04a: aload 12
        // 04c: getfield software/bernie/geckolib3/geo/render/built/GeoQuad.normal Lnet/minecraft/util/math/Vec3i;
        // 04f: invokevirtual net/minecraft/util/math/Vec3i.func_177956_o ()I
        // 052: i2f
        // 053: aload 12
        // 055: getfield software/bernie/geckolib3/geo/render/built/GeoQuad.normal Lnet/minecraft/util/math/Vec3i;
        // 058: invokevirtual net/minecraft/util/math/Vec3i.func_177952_p ()I
        // 05b: i2f
        // 05c: invokespecial javax/vecmath/Vector3f.<init> (FFF)V
        // 05f: astore 13
        // 061: getstatic com/trolmastercard/sexmod/d_.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 064: invokevirtual software/bernie/geckolib3/util/MatrixStack.getNormalMatrix ()Ljavax/vecmath/Matrix3f;
        // 067: aload 13
        // 069: invokevirtual javax/vecmath/Matrix3f.transform (Ljavax/vecmath/Tuple3f;)V
        // 06c: aload 2
        // 06d: getfield software/bernie/geckolib3/geo/render/built/GeoCube.size Ljavax/vecmath/Vector3f;
        // 070: getfield javax/vecmath/Vector3f.y F
        // 073: fconst_0
        // 074: fcmpl
        // 075: ifeq 08b
        // 078: aload 2
        // 079: getfield software/bernie/geckolib3/geo/render/built/GeoCube.size Ljavax/vecmath/Vector3f;
        // 07c: getfield javax/vecmath/Vector3f.z F
        // 07f: fconst_0
        // 080: fcmpl
        // 081: ifne 0af
        // 084: goto 08b
        // 087: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 08a: athrow
        // 08b: aload 13
        // 08d: invokevirtual javax/vecmath/Vector3f.getX ()F
        // 090: fconst_0
        // 091: fcmpg
        // 092: ifge 0af
        // 095: goto 09c
        // 098: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 09b: athrow
        // 09c: aload 13
        // 09e: dup
        // 09f: getfield javax/vecmath/Vector3f.x F
        // 0a2: ldc -1.0
        // 0a4: fmul
        // 0a5: putfield javax/vecmath/Vector3f.x F
        // 0a8: goto 0af
        // 0ab: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 0ae: athrow
        // 0af: aload 2
        // 0b0: getfield software/bernie/geckolib3/geo/render/built/GeoCube.size Ljavax/vecmath/Vector3f;
        // 0b3: getfield javax/vecmath/Vector3f.x F
        // 0b6: fconst_0
        // 0b7: fcmpl
        // 0b8: ifeq 0ce
        // 0bb: aload 2
        // 0bc: getfield software/bernie/geckolib3/geo/render/built/GeoCube.size Ljavax/vecmath/Vector3f;
        // 0bf: getfield javax/vecmath/Vector3f.z F
        // 0c2: fconst_0
        // 0c3: fcmpl
        // 0c4: ifne 0f2
        // 0c7: goto 0ce
        // 0ca: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 0cd: athrow
        // 0ce: aload 13
        // 0d0: invokevirtual javax/vecmath/Vector3f.getY ()F
        // 0d3: fconst_0
        // 0d4: fcmpg
        // 0d5: ifge 0f2
        // 0d8: goto 0df
        // 0db: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 0de: athrow
        // 0df: aload 13
        // 0e1: dup
        // 0e2: getfield javax/vecmath/Vector3f.y F
        // 0e5: ldc -1.0
        // 0e7: fmul
        // 0e8: putfield javax/vecmath/Vector3f.y F
        // 0eb: goto 0f2
        // 0ee: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 0f1: athrow
        // 0f2: aload 2
        // 0f3: getfield software/bernie/geckolib3/geo/render/built/GeoCube.size Ljavax/vecmath/Vector3f;
        // 0f6: getfield javax/vecmath/Vector3f.x F
        // 0f9: fconst_0
        // 0fa: fcmpl
        // 0fb: ifeq 111
        // 0fe: aload 2
        // 0ff: getfield software/bernie/geckolib3/geo/render/built/GeoCube.size Ljavax/vecmath/Vector3f;
        // 102: getfield javax/vecmath/Vector3f.y F
        // 105: fconst_0
        // 106: fcmpl
        // 107: ifne 135
        // 10a: goto 111
        // 10d: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 110: athrow
        // 111: aload 13
        // 113: invokevirtual javax/vecmath/Vector3f.getZ ()F
        // 116: fconst_0
        // 117: fcmpg
        // 118: ifge 135
        // 11b: goto 122
        // 11e: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 121: athrow
        // 122: aload 13
        // 124: dup
        // 125: getfield javax/vecmath/Vector3f.z F
        // 128: ldc -1.0
        // 12a: fmul
        // 12b: putfield javax/vecmath/Vector3f.z F
        // 12e: goto 135
        // 131: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 134: athrow
        // 135: aload 0
        // 136: aload 0
        // 137: getfield com/trolmastercard/sexmod/d_.q Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;
        // 13a: new net/minecraft/util/math/Vec3d
        // 13d: dup
        // 13e: fload 3
        // 13f: f2d
        // 140: fload 4
        // 142: f2d
        // 143: fload 5
        // 145: f2d
        // 146: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
        // 149: aload 13
        // 14b: invokestatic com/trolmastercard/sexmod/gx.a (Lcom/trolmastercard/sexmod/c3;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;Lnet/minecraft/util/math/Vec3d;Ljavax/vecmath/Vector3f;)Lnet/minecraft/util/math/Vec3d;
        // 14e: astore 14
        // 150: aload 12
        // 152: getfield software/bernie/geckolib3/geo/render/built/GeoQuad.vertices [Lsoftware/bernie/geckolib3/geo/render/built/GeoVertex;
        // 155: astore 15
        // 157: aload 15
        // 159: arraylength
        // 15a: istore 16
        // 15c: bipush 0
        // 15d: istore 17
        // 15f: iload 17
        // 161: iload 16
        // 163: if_icmpge 1f4
        // 166: aload 15
        // 168: iload 17
        // 16a: aaload
        // 16b: astore 18
        // 16d: new javax/vecmath/Vector4f
        // 170: dup
        // 171: aload 18
        // 173: getfield software/bernie/geckolib3/geo/render/built/GeoVertex.position Ljavax/vecmath/Vector3f;
        // 176: invokevirtual javax/vecmath/Vector3f.getX ()F
        // 179: aload 18
        // 17b: getfield software/bernie/geckolib3/geo/render/built/GeoVertex.position Ljavax/vecmath/Vector3f;
        // 17e: invokevirtual javax/vecmath/Vector3f.getY ()F
        // 181: aload 18
        // 183: getfield software/bernie/geckolib3/geo/render/built/GeoVertex.position Ljavax/vecmath/Vector3f;
        // 186: invokevirtual javax/vecmath/Vector3f.getZ ()F
        // 189: fconst_1
        // 18a: invokespecial javax/vecmath/Vector4f.<init> (FFFF)V
        // 18d: astore 19
        // 18f: getstatic com/trolmastercard/sexmod/d_.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 192: invokevirtual software/bernie/geckolib3/util/MatrixStack.getModelMatrix ()Ljavax/vecmath/Matrix4f;
        // 195: aload 19
        // 197: invokevirtual javax/vecmath/Matrix4f.transform (Ljavax/vecmath/Tuple4f;)V
        // 19a: aload 1
        // 19b: aload 19
        // 19d: invokevirtual javax/vecmath/Vector4f.getX ()F
        // 1a0: f2d
        // 1a1: aload 19
        // 1a3: invokevirtual javax/vecmath/Vector4f.getY ()F
        // 1a6: f2d
        // 1a7: aload 19
        // 1a9: invokevirtual javax/vecmath/Vector4f.getZ ()F
        // 1ac: f2d
        // 1ad: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181662_b (DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        // 1b0: aload 18
        // 1b2: getfield software/bernie/geckolib3/geo/render/built/GeoVertex.textureU F
        // 1b5: f2d
        // 1b6: dload 7
        // 1b8: dadd
        // 1b9: aload 18
        // 1bb: getfield software/bernie/geckolib3/geo/render/built/GeoVertex.textureV F
        // 1be: f2d
        // 1bf: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_187315_a (DD)Lnet/minecraft/client/renderer/BufferBuilder;
        // 1c2: aload 14
        // 1c4: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 1c7: d2f
        // 1c8: aload 14
        // 1ca: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // 1cd: d2f
        // 1ce: aload 14
        // 1d0: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 1d3: d2f
        // 1d4: fload 6
        // 1d6: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181666_a (FFFF)Lnet/minecraft/client/renderer/BufferBuilder;
        // 1d9: aload 13
        // 1db: invokevirtual javax/vecmath/Vector3f.getX ()F
        // 1de: aload 13
        // 1e0: invokevirtual javax/vecmath/Vector3f.getY ()F
        // 1e3: aload 13
        // 1e5: invokevirtual javax/vecmath/Vector3f.getZ ()F
        // 1e8: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181663_c (FFF)Lnet/minecraft/client/renderer/BufferBuilder;
        // 1eb: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181675_d ()V
        // 1ee: iinc 17 1
        // 1f1: goto 15f
        // 1f4: iinc 11 1
        // 1f7: goto 023
        // 1fa: return
        // try (24 -> 27): 27 java/lang/IllegalStateException
        // try (45 -> 61): 62 java/lang/IllegalStateException
        // try (55 -> 69): 70 java/lang/IllegalStateException
        // try (64 -> 78): 79 java/lang/IllegalStateException
        // try (81 -> 93): 94 java/lang/IllegalStateException
        // try (87 -> 101): 102 java/lang/IllegalStateException
        // try (96 -> 110): 111 java/lang/IllegalStateException
        // try (113 -> 125): 126 java/lang/IllegalStateException
        // try (119 -> 133): 134 java/lang/IllegalStateException
        // try (128 -> 142): 143 java/lang/IllegalStateException
    }

    protected ItemStack a() {
        String var1 = (String)this.j.m.func_187225_a(em.h);
        byte var2 = -1;

        label76: {
            label75: {
                label74: {
                    label73: {
                        label72: {
                            label71: {
                                try {
                                    switch (var1.hashCode()) {
                                        case -20842805:
                                            break;
                                        case 113766:
                                            break label74;
                                        case 64419037:
                                            break label72;
                                        case 95761198:
                                            if (!var1.equals("doggy")) {
                                                break label76;
                                            }
                                            break label75;
                                        case 109773592:
                                            break label71;
                                        case 2014427283:
                                            break label73;
                                        default:
                                            break label76;
                                    }
                                } catch (IllegalStateException var4) {
                                    throw b(var4);
                                }

                                if (var1.equals("blowjob")) {
                                    var2 = 1;
                                }
                                break label76;
                            }

                            if (var1.equals("strip")) {
                                var2 = 2;
                            }
                            break label76;
                        }

                        if (var1.equals("boobjob")) {
                            var2 = 3;
                        }
                        break label76;
                    }

                    if (var1.equals("touch_boobs")) {
                        var2 = 4;
                    }
                    break label76;
                }

                if (var1.equals("sex")) {
                    var2 = 5;
                }
                break label76;
            }

            var2 = 0;
        }

        try {
            switch (var2) {
                case 0:
                    return new ItemStack(Items.field_151045_i, 2);
                case 1:
                    return new ItemStack(Items.field_151166_bC, 3);
                case 2:
                    return new ItemStack(Items.field_151043_k, 1);
                case 3:
                    return new ItemStack(Items.field_151079_bi, 2);
                case 4:
                    return new ItemStack(Items.field_151115_aP, 2, 1);
                case 5:
                    return new ItemStack(Items.field_151115_aP, 3, 0);
                default:
                    return null;
            }
        } catch (IllegalStateException var3) {
            throw b(var3);
        }
    }

    protected void b(BufferBuilder param1, GeoBone param2) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 0
        // 01: invokevirtual com/trolmastercard/sexmod/d_.a ()Lnet/minecraft/item/ItemStack;
        // 04: astore 3
        // 05: aload 3
        // 06: ifnonnull 0e
        // 09: return
        // 0a: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 0d: athrow
        // 0e: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
        // 11: invokevirtual net/minecraft/client/Minecraft.func_175597_ag ()Lnet/minecraft/client/renderer/ItemRenderer;
        // 14: astore 4
        // 16: bipush 0
        // 17: istore 5
        // 19: iload 5
        // 1b: aload 3
        // 1c: invokevirtual net/minecraft/item/ItemStack.func_190916_E ()I
        // 1f: if_icmpge ff
        // 22: invokestatic net/minecraft/client/renderer/GlStateManager.func_179094_E ()V
        // 25: invokestatic net/minecraft/client/renderer/Tessellator.func_178181_a ()Lnet/minecraft/client/renderer/Tessellator;
        // 28: invokevirtual net/minecraft/client/renderer/Tessellator.func_78381_a ()V
        // 2b: getstatic software/bernie/geckolib3/renderers/geo/IGeoRenderer.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 2e: aload 2
        // 2f: invokestatic com/trolmastercard/sexmod/p.a (Lsoftware/bernie/geckolib3/util/MatrixStack;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
        // 32: sipush 2896
        // 35: invokestatic org/lwjgl/opengl/GL11.glEnable (I)V
        // 38: aload 2
        // 39: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.getRotationX ()F
        // 3c: f2d
        // 3d: ldc2_w 2.5
        // 40: dadd
        // 41: dconst_0
        // 42: dconst_0
        // 43: dconst_1
        // 44: invokestatic org/lwjgl/opengl/GL11.glRotated (DDDD)V
        // 47: aload 2
        // 48: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.getRotationY ()F
        // 4b: f2d
        // 4c: dconst_0
        // 4d: dconst_1
        // 4e: dconst_0
        // 4f: invokestatic org/lwjgl/opengl/GL11.glRotated (DDDD)V
        // 52: aload 2
        // 53: invokevirtual software/bernie/geckolib3/geo/render/built/GeoBone.getRotationZ ()F
        // 56: f2d
        // 57: dconst_1
        // 58: dconst_0
        // 59: dconst_0
        // 5a: invokestatic org/lwjgl/opengl/GL11.glRotated (DDDD)V
        // 5d: iload 5
        // 5f: lookupswitch 70 2 1 29 2 53
        // 78: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 7b: athrow
        // 7c: ldc2_w -15.0
        // 7f: dconst_0
        // 80: dconst_0
        // 81: dconst_1
        // 82: invokestatic org/lwjgl/opengl/GL11.glRotated (DDDD)V
        // 85: dconst_0
        // 86: dconst_0
        // 87: ldc2_w -0.025
        // 8a: invokestatic net/minecraft/client/renderer/GlStateManager.func_179137_b (DDD)V
        // 8d: goto a5
        // 90: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 93: athrow
        // 94: ldc2_w 15.0
        // 97: dconst_0
        // 98: dconst_0
        // 99: dconst_1
        // 9a: invokestatic org/lwjgl/opengl/GL11.glRotated (DDDD)V
        // 9d: dconst_0
        // 9e: dconst_0
        // 9f: ldc2_w 0.025
        // a2: invokestatic net/minecraft/client/renderer/GlStateManager.func_179137_b (DDD)V
        // a5: aload 0
        // a6: getfield com/trolmastercard/sexmod/d_.j Lcom/trolmastercard/sexmod/em;
        // a9: getfield com/trolmastercard/sexmod/em.n F
        // ac: aload 0
        // ad: getfield com/trolmastercard/sexmod/d_.j Lcom/trolmastercard/sexmod/em;
        // b0: getfield com/trolmastercard/sexmod/em.n F
        // b3: aload 0
        // b4: getfield com/trolmastercard/sexmod/d_.j Lcom/trolmastercard/sexmod/em;
        // b7: getfield com/trolmastercard/sexmod/em.n F
        // ba: invokestatic net/minecraft/client/renderer/GlStateManager.func_179152_a (FFF)V
        // bd: aload 4
        // bf: aload 0
        // c0: getfield com/trolmastercard/sexmod/d_.j Lcom/trolmastercard/sexmod/em;
        // c3: new net/minecraft/item/ItemStack
        // c6: dup
        // c7: aload 3
        // c8: invokevirtual net/minecraft/item/ItemStack.func_77973_b ()Lnet/minecraft/item/Item;
        // cb: bipush 1
        // cc: invokespecial net/minecraft/item/ItemStack.<init> (Lnet/minecraft/item/Item;I)V
        // cf: getstatic net/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType.THIRD_PERSON_RIGHT_HAND Lnet/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType;
        // d2: invokevirtual net/minecraft/client/renderer/ItemRenderer.func_178099_a (Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType;)V
        // d5: aload 0
        // d6: aload 0
        // d7: aload 0
        // d8: getfield com/trolmastercard/sexmod/d_.j Lcom/trolmastercard/sexmod/em;
        // db: invokevirtual com/trolmastercard/sexmod/d_.getEntityTexture (Lnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/util/ResourceLocation;
        // de: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
        // e1: checkcast net/minecraft/util/ResourceLocation
        // e4: invokevirtual com/trolmastercard/sexmod/d_.func_110776_a (Lnet/minecraft/util/ResourceLocation;)V
        // e7: aload 1
        // e8: bipush 7
        // ea: getstatic net/minecraft/client/renderer/vertex/DefaultVertexFormats.field_181712_l Lnet/minecraft/client/renderer/vertex/VertexFormat;
        // ed: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181668_a (ILnet/minecraft/client/renderer/vertex/VertexFormat;)V
        // f0: sipush 2896
        // f3: invokestatic org/lwjgl/opengl/GL11.glDisable (I)V
        // f6: invokestatic net/minecraft/client/renderer/GlStateManager.func_179121_F ()V
        // f9: iinc 5 1
        // fc: goto 19
        // ff: return
        // try (3 -> 6): 6 java/lang/IllegalStateException
        // try (13 -> 50): 50 java/lang/IllegalStateException
        // try (17 -> 62): 62 java/lang/IllegalStateException
    }

    protected ItemStack a(@Nullable ItemStack var1) {
        return var1;
    }

    protected void a(BufferBuilder param1, GeoBone param2) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 000: aload 0
        // 001: getfield com/trolmastercard/sexmod/d_.j Lcom/trolmastercard/sexmod/em;
        // 004: ifnonnull 00c
        // 007: return
        // 008: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 00b: athrow
        // 00c: aload 0
        // 00d: getfield com/trolmastercard/sexmod/d_.j Lcom/trolmastercard/sexmod/em;
        // 010: instanceof com/trolmastercard/sexmod/e2
        // 013: ifne 01b
        // 016: return
        // 017: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 01a: athrow
        // 01b: aload 0
        // 01c: getfield com/trolmastercard/sexmod/d_.j Lcom/trolmastercard/sexmod/em;
        // 01f: invokevirtual com/trolmastercard/sexmod/em.func_184212_Q ()Lnet/minecraft/network/datasync/EntityDataManager;
        // 022: astore 3
        // 023: aload 0
        // 024: getfield com/trolmastercard/sexmod/d_.j Lcom/trolmastercard/sexmod/em;
        // 027: checkcast com/trolmastercard/sexmod/e2
        // 02a: astore 4
        // 02c: aload 3
        // 02d: getstatic com/trolmastercard/sexmod/e2.M Lnet/minecraft/network/datasync/DataParameter;
        // 030: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
        // 033: checkcast java/lang/Integer
        // 036: invokevirtual java/lang/Integer.intValue ()I
        // 039: istore 5
        // 03b: aload 4
        // 03d: invokevirtual com/trolmastercard/sexmod/e2.y ()Lcom/trolmastercard/sexmod/fp;
        // 040: getstatic com/trolmastercard/sexmod/fp.BOW Lcom/trolmastercard/sexmod/fp;
        // 043: if_acmpeq 052
        // 046: aload 0
        // 047: fconst_0
        // 048: putfield com/trolmastercard/sexmod/d_.a F
        // 04b: goto 052
        // 04e: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 051: athrow
        // 052: aconst_null
        // 053: astore 6
        // 055: iload 5
        // 057: bipush 1
        // 058: if_icmpne 06a
        // 05b: aload 3
        // 05c: getstatic com/trolmastercard/sexmod/e2.L Lnet/minecraft/network/datasync/DataParameter;
        // 05f: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
        // 062: checkcast net/minecraft/item/ItemStack
        // 065: astore 6
        // 067: goto 07c
        // 06a: iload 5
        // 06c: bipush 2
        // 06d: if_icmpne 07c
        // 070: aload 3
        // 071: getstatic com/trolmastercard/sexmod/e2.R Lnet/minecraft/network/datasync/DataParameter;
        // 074: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
        // 077: checkcast net/minecraft/item/ItemStack
        // 07a: astore 6
        // 07c: aload 0
        // 07d: aload 6
        // 07f: invokevirtual com/trolmastercard/sexmod/d_.a (Lnet/minecraft/item/ItemStack;)Lnet/minecraft/item/ItemStack;
        // 082: astore 6
        // 084: aload 6
        // 086: ifnonnull 08e
        // 089: return
        // 08a: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 08d: athrow
        // 08e: aload 6
        // 090: invokevirtual net/minecraft/item/ItemStack.func_77973_b ()Lnet/minecraft/item/Item;
        // 093: getstatic net/minecraft/init/Items.field_151031_f Lnet/minecraft/item/ItemBow;
        // 096: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
        // 099: ifeq 0de
        // 09c: aload 4
        // 09e: invokevirtual com/trolmastercard/sexmod/e2.y ()Lcom/trolmastercard/sexmod/fp;
        // 0a1: getstatic com/trolmastercard/sexmod/fp.BOW Lcom/trolmastercard/sexmod/fp;
        // 0a4: if_acmpne 0de
        // 0a7: goto 0ae
        // 0aa: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 0ad: athrow
        // 0ae: aload 0
        // 0af: dup
        // 0b0: getfield com/trolmastercard/sexmod/d_.a F
        // 0b3: ldc 0.015
        // 0b5: fadd
        // 0b6: putfield com/trolmastercard/sexmod/d_.a F
        // 0b9: aload 4
        // 0bb: aload 0
        // 0bc: getfield com/trolmastercard/sexmod/d_.a F
        // 0bf: fneg
        // 0c0: ldc 20.0
        // 0c2: fmul
        // 0c3: aload 6
        // 0c5: invokevirtual net/minecraft/item/ItemStack.func_77988_m ()I
        // 0c8: i2f
        // 0c9: fadd
        // 0ca: invokestatic java/lang/Math.round (F)I
        // 0cd: invokevirtual com/trolmastercard/sexmod/e2.d (I)V
        // 0d0: aload 4
        // 0d2: aload 6
        // 0d4: invokevirtual com/trolmastercard/sexmod/e2.a (Lnet/minecraft/item/ItemStack;)V
        // 0d7: goto 0de
        // 0da: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 0dd: athrow
        // 0de: invokestatic net/minecraft/client/renderer/GlStateManager.func_179094_E ()V
        // 0e1: invokestatic net/minecraft/client/renderer/Tessellator.func_178181_a ()Lnet/minecraft/client/renderer/Tessellator;
        // 0e4: invokevirtual net/minecraft/client/renderer/Tessellator.func_78381_a ()V
        // 0e7: getstatic com/trolmastercard/sexmod/d_.MATRIX_STACK Lsoftware/bernie/geckolib3/util/MatrixStack;
        // 0ea: aload 2
        // 0eb: invokestatic com/trolmastercard/sexmod/p.a (Lsoftware/bernie/geckolib3/util/MatrixStack;Lsoftware/bernie/geckolib3/geo/render/built/GeoBone;)V
        // 0ee: sipush 2896
        // 0f1: invokestatic org/lwjgl/opengl/GL11.glEnable (I)V
        // 0f4: aload 6
        // 0f6: invokevirtual net/minecraft/item/ItemStack.func_77973_b ()Lnet/minecraft/item/Item;
        // 0f9: instanceof net/minecraft/item/ItemBow
        // 0fc: ifeq 112
        // 0ff: aload 4
        // 101: getfield com/trolmastercard/sexmod/e2.K I
        // 104: i2f
        // 105: fconst_1
        // 106: fconst_0
        // 107: fconst_0
        // 108: invokestatic org/lwjgl/opengl/GL11.glRotatef (FFFF)V
        // 10b: goto 166
        // 10e: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 111: athrow
        // 112: aload 4
        // 114: invokevirtual com/trolmastercard/sexmod/e2.y ()Lcom/trolmastercard/sexmod/fp;
        // 117: getstatic com/trolmastercard/sexmod/fp.ATTACK Lcom/trolmastercard/sexmod/fp;
        // 11a: if_acmpne 15a
        // 11d: aload 4
        // 11f: getfield com/trolmastercard/sexmod/e2.S I
        // 122: ifne 15a
        // 125: goto 12c
        // 128: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 12b: athrow
        // 12c: aload 4
        // 12e: getfield com/trolmastercard/sexmod/e2.V Lnet/minecraft/util/math/Vec3d;
        // 131: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 134: aload 4
        // 136: getfield com/trolmastercard/sexmod/e2.V Lnet/minecraft/util/math/Vec3d;
        // 139: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // 13c: aload 4
        // 13e: getfield com/trolmastercard/sexmod/e2.V Lnet/minecraft/util/math/Vec3d;
        // 141: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 144: invokestatic net/minecraft/client/renderer/GlStateManager.func_179137_b (DDD)V
        // 147: aload 4
        // 149: getfield com/trolmastercard/sexmod/e2.O I
        // 14c: i2f
        // 14d: fconst_1
        // 14e: fconst_0
        // 14f: fconst_0
        // 150: invokestatic org/lwjgl/opengl/GL11.glRotatef (FFFF)V
        // 153: goto 166
        // 156: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 159: athrow
        // 15a: aload 4
        // 15c: getfield com/trolmastercard/sexmod/e2.P I
        // 15f: i2f
        // 160: fconst_1
        // 161: fconst_0
        // 162: fconst_0
        // 163: invokestatic org/lwjgl/opengl/GL11.glRotatef (FFFF)V
        // 166: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
        // 169: invokevirtual net/minecraft/client/Minecraft.func_175597_ag ()Lnet/minecraft/client/renderer/ItemRenderer;
        // 16c: aload 0
        // 16d: getfield com/trolmastercard/sexmod/d_.j Lcom/trolmastercard/sexmod/em;
        // 170: aload 6
        // 172: getstatic net/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType.THIRD_PERSON_RIGHT_HAND Lnet/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType;
        // 175: invokevirtual net/minecraft/client/renderer/ItemRenderer.func_178099_a (Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType;)V
        // 178: aload 0
        // 179: aload 0
        // 17a: aload 0
        // 17b: getfield com/trolmastercard/sexmod/d_.j Lcom/trolmastercard/sexmod/em;
        // 17e: invokevirtual com/trolmastercard/sexmod/d_.getEntityTexture (Lnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/util/ResourceLocation;
        // 181: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
        // 184: checkcast net/minecraft/util/ResourceLocation
        // 187: invokevirtual com/trolmastercard/sexmod/d_.func_110776_a (Lnet/minecraft/util/ResourceLocation;)V
        // 18a: aload 1
        // 18b: bipush 7
        // 18d: getstatic net/minecraft/client/renderer/vertex/DefaultVertexFormats.field_181712_l Lnet/minecraft/client/renderer/vertex/VertexFormat;
        // 190: invokevirtual net/minecraft/client/renderer/BufferBuilder.func_181668_a (ILnet/minecraft/client/renderer/vertex/VertexFormat;)V
        // 193: sipush 2896
        // 196: invokestatic org/lwjgl/opengl/GL11.glDisable (I)V
        // 199: invokestatic net/minecraft/client/renderer/GlStateManager.func_179121_F ()V
        // 19c: return
        // try (0 -> 4): 4 java/lang/IllegalStateException
        // try (6 -> 11): 11 java/lang/IllegalStateException
        // try (27 -> 34): 35 java/lang/IllegalStateException
        // try (60 -> 63): 63 java/lang/IllegalStateException
        // try (65 -> 74): 75 java/lang/IllegalStateException
        // try (70 -> 98): 99 java/lang/IllegalStateException
        // try (101 -> 121): 121 java/lang/IllegalStateException
        // try (123 -> 130): 131 java/lang/IllegalStateException
        // try (127 -> 151): 151 java/lang/IllegalStateException
    }

    RayTraceResult a(Vec3d param1, Vec3d param2, World param3) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 000: aload 1
        // 001: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 004: invokestatic java/lang/Double.isNaN (D)Z
        // 007: ifne 02c
        // 00a: aload 1
        // 00b: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // 00e: invokestatic java/lang/Double.isNaN (D)Z
        // 011: ifne 02c
        // 014: goto 01b
        // 017: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 01a: athrow
        // 01b: aload 1
        // 01c: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 01f: invokestatic java/lang/Double.isNaN (D)Z
        // 022: ifeq 032
        // 025: goto 02c
        // 028: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 02b: athrow
        // 02c: aconst_null
        // 02d: areturn
        // 02e: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 031: athrow
        // 032: aload 2
        // 033: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 036: invokestatic java/lang/Double.isNaN (D)Z
        // 039: ifne 05e
        // 03c: aload 2
        // 03d: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // 040: invokestatic java/lang/Double.isNaN (D)Z
        // 043: ifne 05e
        // 046: goto 04d
        // 049: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 04c: athrow
        // 04d: aload 2
        // 04e: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 051: invokestatic java/lang/Double.isNaN (D)Z
        // 054: ifeq 064
        // 057: goto 05e
        // 05a: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 05d: athrow
        // 05e: aconst_null
        // 05f: areturn
        // 060: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 063: athrow
        // 064: aload 2
        // 065: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 068: invokestatic net/minecraft/util/math/MathHelper.func_76128_c (D)I
        // 06b: istore 4
        // 06d: aload 2
        // 06e: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // 071: invokestatic net/minecraft/util/math/MathHelper.func_76128_c (D)I
        // 074: istore 5
        // 076: aload 2
        // 077: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 07a: invokestatic net/minecraft/util/math/MathHelper.func_76128_c (D)I
        // 07d: istore 6
        // 07f: aload 1
        // 080: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 083: invokestatic net/minecraft/util/math/MathHelper.func_76128_c (D)I
        // 086: istore 7
        // 088: aload 1
        // 089: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // 08c: invokestatic net/minecraft/util/math/MathHelper.func_76128_c (D)I
        // 08f: istore 8
        // 091: aload 1
        // 092: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 095: invokestatic net/minecraft/util/math/MathHelper.func_76128_c (D)I
        // 098: istore 9
        // 09a: new net/minecraft/util/math/BlockPos
        // 09d: dup
        // 09e: iload 7
        // 0a0: iload 8
        // 0a2: iload 9
        // 0a4: invokespecial net/minecraft/util/math/BlockPos.<init> (III)V
        // 0a7: astore 10
        // 0a9: aload 3
        // 0aa: aload 10
        // 0ac: invokevirtual net/minecraft/world/World.func_180495_p (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        // 0af: astore 11
        // 0b1: aload 11
        // 0b3: aload 3
        // 0b4: aload 10
        // 0b6: invokeinterface net/minecraft/block/state/IBlockState.func_185890_d (Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/AxisAlignedBB; 3
        // 0bb: getstatic net/minecraft/block/Block.field_185506_k Lnet/minecraft/util/math/AxisAlignedBB;
        // 0be: if_acmpeq 0e9
        // 0c1: aload 11
        // 0c3: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c ()Lnet/minecraft/block/Block; 1
        // 0c8: invokevirtual net/minecraft/block/Block.func_180664_k ()Lnet/minecraft/util/BlockRenderLayer;
        // 0cb: getstatic net/minecraft/util/BlockRenderLayer.SOLID Lnet/minecraft/util/BlockRenderLayer;
        // 0ce: if_acmpne 0e9
        // 0d1: goto 0d8
        // 0d4: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 0d7: athrow
        // 0d8: aload 11
        // 0da: aload 3
        // 0db: aload 10
        // 0dd: aload 1
        // 0de: aload 2
        // 0df: invokeinterface net/minecraft/block/state/IBlockState.func_185910_a (Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/RayTraceResult; 5
        // 0e4: areturn
        // 0e5: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 0e8: athrow
        // 0e9: sipush 200
        // 0ec: istore 12
        // 0ee: iload 12
        // 0f0: iinc 12 -1
        // 0f3: iflt 3f2
        // 0f6: aload 1
        // 0f7: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 0fa: invokestatic java/lang/Double.isNaN (D)Z
        // 0fd: ifne 129
        // 100: goto 107
        // 103: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 106: athrow
        // 107: aload 1
        // 108: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // 10b: invokestatic java/lang/Double.isNaN (D)Z
        // 10e: ifne 129
        // 111: goto 118
        // 114: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 117: athrow
        // 118: aload 1
        // 119: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 11c: invokestatic java/lang/Double.isNaN (D)Z
        // 11f: ifeq 12f
        // 122: goto 129
        // 125: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 128: athrow
        // 129: aconst_null
        // 12a: areturn
        // 12b: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 12e: athrow
        // 12f: iload 7
        // 131: iload 4
        // 133: if_icmpne 158
        // 136: iload 8
        // 138: iload 5
        // 13a: if_icmpne 158
        // 13d: goto 144
        // 140: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 143: athrow
        // 144: iload 9
        // 146: iload 6
        // 148: if_icmpne 158
        // 14b: goto 152
        // 14e: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 151: athrow
        // 152: aconst_null
        // 153: areturn
        // 154: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 157: athrow
        // 158: bipush 1
        // 159: istore 13
        // 15b: bipush 1
        // 15c: istore 14
        // 15e: bipush 1
        // 15f: istore 15
        // 161: ldc2_w 999.0
        // 164: dstore 16
        // 166: ldc2_w 999.0
        // 169: dstore 18
        // 16b: ldc2_w 999.0
        // 16e: dstore 20
        // 170: iload 4
        // 172: iload 7
        // 174: if_icmple 181
        // 177: iload 7
        // 179: i2d
        // 17a: dconst_1
        // 17b: dadd
        // 17c: dstore 16
        // 17e: goto 195
        // 181: iload 4
        // 183: iload 7
        // 185: if_icmpge 192
        // 188: iload 7
        // 18a: i2d
        // 18b: dconst_0
        // 18c: dadd
        // 18d: dstore 16
        // 18f: goto 195
        // 192: bipush 0
        // 193: istore 13
        // 195: iload 5
        // 197: iload 8
        // 199: if_icmple 1a6
        // 19c: iload 8
        // 19e: i2d
        // 19f: dconst_1
        // 1a0: dadd
        // 1a1: dstore 18
        // 1a3: goto 1ba
        // 1a6: iload 5
        // 1a8: iload 8
        // 1aa: if_icmpge 1b7
        // 1ad: iload 8
        // 1af: i2d
        // 1b0: dconst_0
        // 1b1: dadd
        // 1b2: dstore 18
        // 1b4: goto 1ba
        // 1b7: bipush 0
        // 1b8: istore 14
        // 1ba: iload 6
        // 1bc: iload 9
        // 1be: if_icmple 1cb
        // 1c1: iload 9
        // 1c3: i2d
        // 1c4: dconst_1
        // 1c5: dadd
        // 1c6: dstore 20
        // 1c8: goto 1df
        // 1cb: iload 6
        // 1cd: iload 9
        // 1cf: if_icmpge 1dc
        // 1d2: iload 9
        // 1d4: i2d
        // 1d5: dconst_0
        // 1d6: dadd
        // 1d7: dstore 20
        // 1d9: goto 1df
        // 1dc: bipush 0
        // 1dd: istore 15
        // 1df: ldc2_w 999.0
        // 1e2: dstore 22
        // 1e4: ldc2_w 999.0
        // 1e7: dstore 24
        // 1e9: ldc2_w 999.0
        // 1ec: dstore 26
        // 1ee: aload 2
        // 1ef: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 1f2: aload 1
        // 1f3: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 1f6: dsub
        // 1f7: dstore 28
        // 1f9: aload 2
        // 1fa: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // 1fd: aload 1
        // 1fe: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // 201: dsub
        // 202: dstore 30
        // 204: aload 2
        // 205: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 208: aload 1
        // 209: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 20c: dsub
        // 20d: dstore 32
        // 20f: iload 13
        // 211: ifeq 220
        // 214: dload 16
        // 216: aload 1
        // 217: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 21a: dsub
        // 21b: dload 28
        // 21d: ddiv
        // 21e: dstore 22
        // 220: iload 14
        // 222: ifeq 231
        // 225: dload 18
        // 227: aload 1
        // 228: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // 22b: dsub
        // 22c: dload 30
        // 22e: ddiv
        // 22f: dstore 24
        // 231: iload 15
        // 233: ifeq 242
        // 236: dload 20
        // 238: aload 1
        // 239: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 23c: dsub
        // 23d: dload 32
        // 23f: ddiv
        // 240: dstore 26
        // 242: dload 22
        // 244: ldc2_w -0.0
        // 247: dcmpl
        // 248: ifne 250
        // 24b: ldc2_w -1.0E-4
        // 24e: dstore 22
        // 250: dload 24
        // 252: ldc2_w -0.0
        // 255: dcmpl
        // 256: ifne 25e
        // 259: ldc2_w -1.0E-4
        // 25c: dstore 24
        // 25e: dload 26
        // 260: ldc2_w -0.0
        // 263: dcmpl
        // 264: ifne 26c
        // 267: ldc2_w -1.0E-4
        // 26a: dstore 26
        // 26c: dload 22
        // 26e: dload 24
        // 270: dcmpg
        // 271: ifge 2c1
        // 274: dload 22
        // 276: dload 26
        // 278: dcmpg
        // 279: ifge 2c1
        // 27c: goto 283
        // 27f: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 282: athrow
        // 283: iload 4
        // 285: iload 7
        // 287: if_icmple 29b
        // 28a: goto 291
        // 28d: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 290: athrow
        // 291: getstatic net/minecraft/util/EnumFacing.WEST Lnet/minecraft/util/EnumFacing;
        // 294: goto 29e
        // 297: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 29a: athrow
        // 29b: getstatic net/minecraft/util/EnumFacing.EAST Lnet/minecraft/util/EnumFacing;
        // 29e: astore 34
        // 2a0: new net/minecraft/util/math/Vec3d
        // 2a3: dup
        // 2a4: dload 16
        // 2a6: aload 1
        // 2a7: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // 2aa: dload 30
        // 2ac: dload 22
        // 2ae: dmul
        // 2af: dadd
        // 2b0: aload 1
        // 2b1: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 2b4: dload 32
        // 2b6: dload 22
        // 2b8: dmul
        // 2b9: dadd
        // 2ba: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
        // 2bd: astore 1
        // 2be: goto 33b
        // 2c1: dload 24
        // 2c3: dload 26
        // 2c5: dcmpg
        // 2c6: ifge 307
        // 2c9: iload 5
        // 2cb: iload 8
        // 2cd: if_icmple 2e1
        // 2d0: goto 2d7
        // 2d3: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 2d6: athrow
        // 2d7: getstatic net/minecraft/util/EnumFacing.DOWN Lnet/minecraft/util/EnumFacing;
        // 2da: goto 2e4
        // 2dd: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 2e0: athrow
        // 2e1: getstatic net/minecraft/util/EnumFacing.UP Lnet/minecraft/util/EnumFacing;
        // 2e4: astore 34
        // 2e6: new net/minecraft/util/math/Vec3d
        // 2e9: dup
        // 2ea: aload 1
        // 2eb: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 2ee: dload 28
        // 2f0: dload 24
        // 2f2: dmul
        // 2f3: dadd
        // 2f4: dload 18
        // 2f6: aload 1
        // 2f7: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 2fa: dload 32
        // 2fc: dload 24
        // 2fe: dmul
        // 2ff: dadd
        // 300: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
        // 303: astore 1
        // 304: goto 33b
        // 307: iload 6
        // 309: iload 9
        // 30b: if_icmple 318
        // 30e: getstatic net/minecraft/util/EnumFacing.NORTH Lnet/minecraft/util/EnumFacing;
        // 311: goto 31b
        // 314: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 317: athrow
        // 318: getstatic net/minecraft/util/EnumFacing.SOUTH Lnet/minecraft/util/EnumFacing;
        // 31b: astore 34
        // 31d: new net/minecraft/util/math/Vec3d
        // 320: dup
        // 321: aload 1
        // 322: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 325: dload 28
        // 327: dload 26
        // 329: dmul
        // 32a: dadd
        // 32b: aload 1
        // 32c: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // 32f: dload 30
        // 331: dload 26
        // 333: dmul
        // 334: dadd
        // 335: dload 20
        // 337: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
        // 33a: astore 1
        // 33b: aload 1
        // 33c: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 33f: invokestatic net/minecraft/util/math/MathHelper.func_76128_c (D)I
        // 342: aload 34
        // 344: getstatic net/minecraft/util/EnumFacing.EAST Lnet/minecraft/util/EnumFacing;
        // 347: if_acmpne 352
        // 34a: bipush 1
        // 34b: goto 353
        // 34e: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 351: athrow
        // 352: bipush 0
        // 353: isub
        // 354: istore 7
        // 356: aload 1
        // 357: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // 35a: invokestatic net/minecraft/util/math/MathHelper.func_76128_c (D)I
        // 35d: aload 34
        // 35f: getstatic net/minecraft/util/EnumFacing.UP Lnet/minecraft/util/EnumFacing;
        // 362: if_acmpne 36d
        // 365: bipush 1
        // 366: goto 36e
        // 369: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 36c: athrow
        // 36d: bipush 0
        // 36e: isub
        // 36f: istore 8
        // 371: aload 1
        // 372: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 375: invokestatic net/minecraft/util/math/MathHelper.func_76128_c (D)I
        // 378: aload 34
        // 37a: getstatic net/minecraft/util/EnumFacing.SOUTH Lnet/minecraft/util/EnumFacing;
        // 37d: if_acmpne 388
        // 380: bipush 1
        // 381: goto 389
        // 384: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 387: athrow
        // 388: bipush 0
        // 389: isub
        // 38a: istore 9
        // 38c: new net/minecraft/util/math/BlockPos
        // 38f: dup
        // 390: iload 7
        // 392: iload 8
        // 394: iload 9
        // 396: invokespecial net/minecraft/util/math/BlockPos.<init> (III)V
        // 399: astore 10
        // 39b: aload 3
        // 39c: aload 10
        // 39e: invokevirtual net/minecraft/world/World.func_180495_p (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        // 3a1: astore 35
        // 3a3: aload 35
        // 3a5: invokeinterface net/minecraft/block/state/IBlockState.func_185904_a ()Lnet/minecraft/block/material/Material; 1
        // 3aa: getstatic net/minecraft/block/material/Material.field_151567_E Lnet/minecraft/block/material/Material;
        // 3ad: if_acmpeq 3c7
        // 3b0: aload 35
        // 3b2: aload 3
        // 3b3: aload 10
        // 3b5: invokeinterface net/minecraft/block/state/IBlockState.func_185890_d (Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/AxisAlignedBB; 3
        // 3ba: getstatic net/minecraft/block/Block.field_185506_k Lnet/minecraft/util/math/AxisAlignedBB;
        // 3bd: if_acmpeq 3ef
        // 3c0: goto 3c7
        // 3c3: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 3c6: athrow
        // 3c7: aload 35
        // 3c9: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c ()Lnet/minecraft/block/Block; 1
        // 3ce: invokevirtual net/minecraft/block/Block.func_180664_k ()Lnet/minecraft/util/BlockRenderLayer;
        // 3d1: getstatic net/minecraft/util/BlockRenderLayer.SOLID Lnet/minecraft/util/BlockRenderLayer;
        // 3d4: if_acmpne 3ef
        // 3d7: goto 3de
        // 3da: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 3dd: athrow
        // 3de: aload 35
        // 3e0: aload 3
        // 3e1: aload 10
        // 3e3: aload 1
        // 3e4: aload 2
        // 3e5: invokeinterface net/minecraft/block/state/IBlockState.func_185910_a (Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/RayTraceResult; 5
        // 3ea: areturn
        // 3eb: invokestatic com/trolmastercard/sexmod/d_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 3ee: athrow
        // 3ef: goto 0ee
        // 3f2: aconst_null
        // 3f3: areturn
        // try (0 -> 8): 9 java/lang/IllegalStateException
        // try (4 -> 15): 16 java/lang/IllegalStateException
        // try (11 -> 20): 20 java/lang/IllegalStateException
        // try (22 -> 30): 31 java/lang/IllegalStateException
        // try (26 -> 37): 38 java/lang/IllegalStateException
        // try (33 -> 42): 42 java/lang/IllegalStateException
        // try (79 -> 90): 91 java/lang/IllegalStateException
        // try (85 -> 100): 100 java/lang/IllegalStateException
        // try (104 -> 111): 112 java/lang/IllegalStateException
        // try (107 -> 118): 119 java/lang/IllegalStateException
        // try (114 -> 125): 126 java/lang/IllegalStateException
        // try (121 -> 130): 130 java/lang/IllegalStateException
        // try (132 -> 138): 139 java/lang/IllegalStateException
        // try (135 -> 144): 145 java/lang/IllegalStateException
        // try (141 -> 149): 149 java/lang/IllegalStateException
        // try (292 -> 300): 301 java/lang/IllegalStateException
        // try (296 -> 306): 307 java/lang/IllegalStateException
        // try (303 -> 311): 311 java/lang/IllegalStateException
        // try (333 -> 340): 341 java/lang/IllegalStateException
        // try (337 -> 345): 345 java/lang/IllegalStateException
        // try (367 -> 372): 372 java/lang/IllegalStateException
        // try (393 -> 401): 401 java/lang/IllegalStateException
        // try (406 -> 414): 414 java/lang/IllegalStateException
        // try (419 -> 427): 427 java/lang/IllegalStateException
        // try (443 -> 453): 454 java/lang/IllegalStateException
        // try (447 -> 461): 462 java/lang/IllegalStateException
        // try (456 -> 471): 471 java/lang/IllegalStateException
    }

    private static Exception b(Exception var0) {
        return var0;
    }
}
