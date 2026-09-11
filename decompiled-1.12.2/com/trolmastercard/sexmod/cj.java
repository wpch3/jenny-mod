package com.trolmastercard.sexmod;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map.Entry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBed.EnumPartType;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;

public class cj {
    public static float a(float var0, float var1) {
        var0 = gc.b(var0);
        var1 = gc.b(var1);
        float var2 = Math.abs(var0 - var1);
        float var3 = 360.0F - var2;
        float var4 = Math.min(var2, var3);

        try {
            return var0 > var1 ? -var4 : var4;
        } catch (RuntimeException var5) {
            throw a(var5);
        }
    }

    public static Vec3d a(EntityLivingBase var0, float var1) {
        World var2 = var0.field_70170_p;

        try {
            if (var2 instanceof gj) {
                return new Vec3d(0.0, 1.0, 0.0);
            }
        } catch (RuntimeException var11) {
            throw a(var11);
        }

        BlockPos var3 = new BlockPos(Math.floor(var0.field_70165_t), Math.floor(var0.field_70163_u), Math.floor(var0.field_70161_v));
        HashMap var4 = new HashMap();
        int var5 = 0;

        for (int var6 = -1; var6 < 2; var6++) {
            for (int var7 = -1; var7 < 2; var7++) {
                for (int var8 = -1; var8 < 2; var8++) {
                    int var9 = var2.func_175721_c(var3.func_177982_a(var6, var7, var8), false);
                    var4.put(new Vec3d(var6, var7, var8), var9);
                    if (var9 > var5) {
                        var5 = var9;
                    }
                }
            }
        }

        Vec3d var12 = null;

        for (Entry var17 : var4.entrySet()) {
            try {
                if ((Integer)var17.getValue() != var5) {
                    continue;
                }
            } catch (RuntimeException var10) {
                throw a(var10);
            }

            if (var12 != null) {
                var12 = null;
                break;
            }

            var12 = (Vec3d)var17.getKey();
        }

        if (var12 == null) {
            var12 = new Vec3d(0.2, 0.8, 0.0);
        } else {
            var12 = new Vec3d(var12.field_72450_a, var12.field_72448_b, -var12.field_72449_c);
            float var16 = -b6.a(var0.field_70760_ar, var0.field_70761_aq, var1);
            var12 = ck.a(var12, var16);
        }

        return var12.func_72432_b();
    }

    public static int a(World var0, int var1, int var2) {
        HashSet var3 = Sets.newHashSet(
            new Block[]{
                Blocks.field_150349_c, Blocks.field_150354_m, Blocks.field_180395_cM, Blocks.field_150355_j, Blocks.field_150348_b, Blocks.field_150347_e
            }
        );
        int var4 = var0.func_72800_K();
        boolean var5 = false;

        while (true) {
            try {
                if (var5 || var4-- < 0) {
                    return var4;
                }
            } catch (RuntimeException var7) {
                throw a(var7);
            }

            Block var6 = var0.func_180495_p(new BlockPos(var1, var4, var2)).func_177230_c();
            var5 = var3.contains(var6);
        }
    }

    public static BlockPos a(World var0, BlockPos var1) {
        return new BlockPos(var1.func_177958_n(), a(var0, var1.func_177958_n(), var1.func_177952_p()), var1.func_177952_p());
    }

    public static boolean b(World var0, BlockPos var1) {
        return a(var0, var1, null, null, null);
    }

    public static boolean a(World param0, BlockPos param1, Vec3d param2, EnumFacing param3, EntityPlayer param4) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 0
        // 01: aload 1
        // 02: invokevirtual net/minecraft/world/World.func_180495_p (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        // 05: astore 5
        // 07: aload 5
        // 09: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c ()Lnet/minecraft/block/Block; 1
        // 0e: astore 6
        // 10: aload 6
        // 12: aload 5
        // 14: aload 0
        // 15: aload 1
        // 16: aconst_null
        // 17: invokevirtual net/minecraft/block/Block.isBed (Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/Entity;)Z
        // 1a: ifeq 23
        // 1d: bipush 1
        // 1e: ireturn
        // 1f: invokestatic com/trolmastercard/sexmod/cj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 22: athrow
        // 23: aload 0
        // 24: aload 1
        // 25: invokevirtual net/minecraft/world/World.func_175625_s (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/tileentity/TileEntity;
        // 28: astore 7
        // 2a: aload 7
        // 2c: ifnull 69
        // 2f: aload 7
        // 31: invokevirtual net/minecraft/tileentity/TileEntity.func_145748_c_ ()Lnet/minecraft/util/text/ITextComponent;
        // 34: astore 8
        // 36: aload 8
        // 38: ifnull 69
        // 3b: aload 8
        // 3d: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
        // 40: ldc " bed"
        // 42: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
        // 45: ifne 63
        // 48: goto 4f
        // 4b: invokestatic com/trolmastercard/sexmod/cj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 4e: athrow
        // 4f: aload 8
        // 51: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
        // 54: ldc "bed "
        // 56: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
        // 59: ifeq 69
        // 5c: goto 63
        // 5f: invokestatic com/trolmastercard/sexmod/cj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 62: athrow
        // 63: bipush 1
        // 64: ireturn
        // 65: invokestatic com/trolmastercard/sexmod/cj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 68: athrow
        // 69: aload 3
        // 6a: ifnull 78
        // 6d: aload 2
        // 6e: ifnonnull 7e
        // 71: goto 78
        // 74: invokestatic com/trolmastercard/sexmod/cj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 77: athrow
        // 78: bipush 0
        // 79: ireturn
        // 7a: invokestatic com/trolmastercard/sexmod/cj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 7d: athrow
        // 7e: aload 6
        // 80: aload 5
        // 82: new net/minecraft/util/math/RayTraceResult
        // 85: dup
        // 86: aload 2
        // 87: aload 3
        // 88: invokespecial net/minecraft/util/math/RayTraceResult.<init> (Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/EnumFacing;)V
        // 8b: aload 0
        // 8c: aload 1
        // 8d: aload 4
        // 8f: invokevirtual net/minecraft/block/Block.getPickBlock (Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/math/RayTraceResult;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/player/EntityPlayer;)Lnet/minecraft/item/ItemStack;
        // 92: invokevirtual net/minecraft/item/ItemStack.func_82833_r ()Ljava/lang/String;
        // 95: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
        // 98: astore 8
        // 9a: aload 8
        // 9c: ldc " bed"
        // 9e: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
        // a1: ifne b5
        // a4: aload 8
        // a6: ldc "bed "
        // a8: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
        // ab: ifeq bb
        // ae: goto b5
        // b1: invokestatic com/trolmastercard/sexmod/cj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // b4: athrow
        // b5: bipush 1
        // b6: ireturn
        // b7: invokestatic com/trolmastercard/sexmod/cj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // ba: athrow
        // bb: bipush 0
        // bc: ireturn
        // try (7 -> 16): 16 java/lang/RuntimeException
        // try (27 -> 34): 35 java/lang/RuntimeException
        // try (29 -> 42): 43 java/lang/RuntimeException
        // try (37 -> 47): 47 java/lang/RuntimeException
        // try (49 -> 53): 54 java/lang/RuntimeException
        // try (51 -> 58): 58 java/lang/RuntimeException
        // try (74 -> 82): 83 java/lang/RuntimeException
        // try (78 -> 87): 87 java/lang/RuntimeException
    }

    public static void a(World var0, EnumParticleTypes var1, Vec3d var2, int var3, double var4, double var6) {
        for (int var8 = 0; var8 < var3; var8++) {
            float var9 = (float)var8 / var3;
            double var10 = (Math.PI * 2) * var9;
            double var12 = Math.sin(var10);
            double var14 = Math.cos(var10);
            var12 *= var4;
            var14 *= var4;
            var0.func_175688_a(var1, var2.field_72450_a + var12, var2.field_72448_b, var2.field_72449_c + var14, 0.0, r.f.nextFloat() * var6, 0.0, new int[0]);
        }
    }

    public static BlockPos a(BlockPos var0, IBlockState var1) {
        ImmutableMap var2 = var1.func_177228_b();
        EnumFacing var3 = null;
        EnumPartType var4 = null;
        UnmodifiableIterator var5 = var2.entrySet().iterator();

        while (var5.hasNext()) {
            Entry var6 = (Entry)var5.next();
            if (var6.getKey() instanceof PropertyDirection) {
                var3 = (EnumFacing)var6.getValue();
            } else if (var6.getKey() instanceof PropertyEnum) {
                var4 = (EnumPartType)var6.getValue();
            }
        }

        try {
            if (var3 == null) {
                System.out.println("bed is fucked up - it has no facing value");
                return null;
            }
        } catch (RuntimeException var8) {
            throw a(var8);
        }

        try {
            if (var4 == null) {
                System.out.println("bed is fucked up - it has no partType value");
                return null;
            }
        } catch (RuntimeException var10) {
            throw a(var10);
        }

        BlockPos var11 = null;

        label91: {
            label92: {
                label72: {
                    try {
                        if (var4 != EnumPartType.FOOT) {
                            break label92;
                        }

                        if (var3 != EnumFacing.NORTH) {
                            break label72;
                        }
                    } catch (RuntimeException var9) {
                        throw a(var9);
                    }

                    var11 = var0.func_177978_c();
                }

                if (var3 == EnumFacing.EAST) {
                    var11 = var0.func_177974_f();
                }

                if (var3 == EnumFacing.SOUTH) {
                    var11 = var0.func_177968_d();
                }

                if (var3 == EnumFacing.WEST) {
                    var11 = var0.func_177976_e();
                }
                break label91;
            }

            if (var3 == EnumFacing.NORTH) {
                var11 = var0.func_177968_d();
            }

            if (var3 == EnumFacing.EAST) {
                var11 = var0.func_177976_e();
            }

            if (var3 == EnumFacing.SOUTH) {
                var11 = var0.func_177978_c();
            }

            if (var3 == EnumFacing.WEST) {
                var11 = var0.func_177974_f();
            }
        }

        try {
            if (var11 == null) {
                System.out.println("bed is fucked up - it appears to be positioned vertically (wtf?)");
                return null;
            } else {
                return var11;
            }
        } catch (RuntimeException var7) {
            throw a(var7);
        }
    }

    public static Set<? extends EntityPlayer> a(Entity var0) {
        try {
            if (var0 == null) {
                return Collections.emptySet();
            }
        } catch (RuntimeException var1) {
            throw a(var1);
        }

        return FMLCommonHandler.instance().getMinecraftServerInstance().func_71218_a(var0.field_71093_bK).func_73039_n().getTrackingPlayers(var0);
    }

    private static RuntimeException a(RuntimeException var0) {
        return var0;
    }
}
