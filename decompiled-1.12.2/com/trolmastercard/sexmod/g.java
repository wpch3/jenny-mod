package com.trolmastercard.sexmod;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityTippedArrow;
import net.minecraft.init.Enchantments;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingHealEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class g extends f {
    e2 q;
    EntityLivingBase r;
    Entity o;
    double l = Float.MAX_VALUE;
    Vec3d i = Vec3d.field_186680_a;
    int j = 0;
    int n = 0;
    int k = 0;
    int p = 0;
    int m = 0;

    public g(e2 var1) {
        super(var1);
        this.q = var1;
    }

    @Override
    public void func_75246_d() {
        try {
            super.func_75246_d();
            this.l = this.q.func_70032_d(this.a);
            this.i = this.a.func_174791_d();
            if (this.q.y() == fp.BOW) {
                this.q.b(fp.NULL);
            }
        } catch (RuntimeException var1) {
            throw a(var1);
        }
    }

    boolean a(EntityLivingBase param1) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 0
        // 01: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 04: invokevirtual com/trolmastercard/sexmod/e2.func_174791_d ()Lnet/minecraft/util/math/Vec3d;
        // 07: astore 2
        // 08: aload 1
        // 09: instanceof com/trolmastercard/sexmod/em
        // 0c: ifne 9f
        // 0f: aload 0
        // 10: getfield com/trolmastercard/sexmod/g.n I
        // 13: ifgt 9f
        // 16: goto 1d
        // 19: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 1c: athrow
        // 1d: aload 1
        // 1e: ifnull 9f
        // 21: goto 28
        // 24: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 27: athrow
        // 28: aload 1
        // 29: getfield net/minecraft/entity/EntityLivingBase.field_70170_p Lnet/minecraft/world/World;
        // 2c: ifnull 9f
        // 2f: goto 36
        // 32: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 35: athrow
        // 36: aload 0
        // 37: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 3a: aload 1
        // 3b: invokevirtual com/trolmastercard/sexmod/e2.equals (Ljava/lang/Object;)Z
        // 3e: ifne 9f
        // 41: goto 48
        // 44: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 47: athrow
        // 48: aload 1
        // 49: invokevirtual net/minecraft/entity/EntityLivingBase.func_70089_S ()Z
        // 4c: ifeq 9f
        // 4f: goto 56
        // 52: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 55: athrow
        // 56: aload 2
        // 57: aload 0
        // 58: getfield com/trolmastercard/sexmod/g.a Lnet/minecraft/entity/player/EntityPlayer;
        // 5b: invokevirtual net/minecraft/entity/player/EntityPlayer.func_174791_d ()Lnet/minecraft/util/math/Vec3d;
        // 5e: invokevirtual net/minecraft/util/math/Vec3d.func_72438_d (Lnet/minecraft/util/math/Vec3d;)D
        // 61: ldc2_w 15.0
        // 64: dcmpg
        // 65: ifge 9f
        // 68: goto 6f
        // 6b: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 6e: athrow
        // 6f: aload 2
        // 70: aload 1
        // 71: invokevirtual net/minecraft/entity/EntityLivingBase.func_174791_d ()Lnet/minecraft/util/math/Vec3d;
        // 74: invokevirtual net/minecraft/util/math/Vec3d.func_72438_d (Lnet/minecraft/util/math/Vec3d;)D
        // 77: ldc2_w 20.0
        // 7a: dcmpg
        // 7b: ifge 9f
        // 7e: goto 85
        // 81: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 84: athrow
        // 85: aload 1
        // 86: aload 0
        // 87: getfield com/trolmastercard/sexmod/g.a Lnet/minecraft/entity/player/EntityPlayer;
        // 8a: invokevirtual net/minecraft/entity/EntityLivingBase.equals (Ljava/lang/Object;)Z
        // 8d: ifne 9f
        // 90: goto 97
        // 93: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 96: athrow
        // 97: bipush 1
        // 98: goto a0
        // 9b: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 9e: athrow
        // 9f: bipush 0
        // a0: ireturn
        // try (4 -> 10): 11 java/lang/RuntimeException
        // try (7 -> 15): 16 java/lang/RuntimeException
        // try (13 -> 21): 22 java/lang/RuntimeException
        // try (18 -> 29): 30 java/lang/RuntimeException
        // try (24 -> 35): 36 java/lang/RuntimeException
        // try (32 -> 46): 47 java/lang/RuntimeException
        // try (38 -> 56): 57 java/lang/RuntimeException
        // try (49 -> 64): 65 java/lang/RuntimeException
        // try (59 -> 69): 69 java/lang/RuntimeException
    }

    @Override
    protected void a(f.a param1) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 000: getstatic com/trolmastercard/sexmod/g$b.a [I
        // 003: aload 1
        // 004: invokevirtual com/trolmastercard/sexmod/f$a.ordinal ()I
        // 007: iaload
        // 008: tableswitch 843 1 5 36 392 501 691 836
        // 02c: aload 0
        // 02d: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 030: invokevirtual com/trolmastercard/sexmod/e2.func_70671_ap ()Lnet/minecraft/entity/ai/EntityLookHelper;
        // 033: aload 0
        // 034: getfield com/trolmastercard/sexmod/g.r Lnet/minecraft/entity/EntityLivingBase;
        // 037: ldc 30.0
        // 039: ldc 30.0
        // 03b: invokevirtual net/minecraft/entity/ai/EntityLookHelper.func_75651_a (Lnet/minecraft/entity/Entity;FF)V
        // 03e: aload 0
        // 03f: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 042: aload 0
        // 043: getfield com/trolmastercard/sexmod/g.r Lnet/minecraft/entity/EntityLivingBase;
        // 046: invokevirtual com/trolmastercard/sexmod/e2.func_70032_d (Lnet/minecraft/entity/Entity;)F
        // 049: f2d
        // 04a: dstore 2
        // 04b: aload 0
        // 04c: getfield com/trolmastercard/sexmod/g.c Lnet/minecraft/pathfinding/PathNavigate;
        // 04f: invokevirtual net/minecraft/pathfinding/PathNavigate.func_75499_g ()V
        // 052: dload 2
        // 053: ldc2_w 1.9
        // 056: dcmpg
        // 057: ifge 07a
        // 05a: aload 0
        // 05b: dup
        // 05c: getfield com/trolmastercard/sexmod/g.k I
        // 05f: bipush 1
        // 060: isub
        // 061: dup_x1
        // 062: putfield com/trolmastercard/sexmod/g.k I
        // 065: ifgt 07a
        // 068: goto 06f
        // 06b: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 06e: athrow
        // 06f: aload 0
        // 070: invokevirtual com/trolmastercard/sexmod/g.d ()V
        // 073: goto 353
        // 076: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 079: athrow
        // 07a: aload 0
        // 07b: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 07e: getfield com/trolmastercard/sexmod/e2.Q Lnet/minecraftforge/items/ItemStackHandler;
        // 081: bipush 1
        // 082: invokevirtual net/minecraftforge/items/ItemStackHandler.getStackInSlot (I)Lnet/minecraft/item/ItemStack;
        // 085: invokevirtual net/minecraft/item/ItemStack.func_77973_b ()Lnet/minecraft/item/Item;
        // 088: instanceof net/minecraft/item/ItemBow
        // 08b: ifeq 130
        // 08e: aload 0
        // 08f: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 092: invokevirtual com/trolmastercard/sexmod/e2.func_70635_at ()Lnet/minecraft/entity/ai/EntitySenses;
        // 095: aload 0
        // 096: getfield com/trolmastercard/sexmod/g.r Lnet/minecraft/entity/EntityLivingBase;
        // 099: invokevirtual net/minecraft/entity/ai/EntitySenses.func_75522_a (Lnet/minecraft/entity/Entity;)Z
        // 09c: ifeq 130
        // 09f: goto 0a6
        // 0a2: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0a5: athrow
        // 0a6: aload 0
        // 0a7: dup
        // 0a8: getfield com/trolmastercard/sexmod/g.p I
        // 0ab: bipush 1
        // 0ac: iadd
        // 0ad: dup_x1
        // 0ae: putfield com/trolmastercard/sexmod/g.p I
        // 0b1: ifle 130
        // 0b4: goto 0bb
        // 0b7: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0ba: athrow
        // 0bb: dload 2
        // 0bc: ldc2_w 6.0
        // 0bf: dcmpl
        // 0c0: ifle 130
        // 0c3: goto 0ca
        // 0c6: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0c9: athrow
        // 0ca: aload 0
        // 0cb: getfield com/trolmastercard/sexmod/g.e Lnet/minecraft/network/datasync/EntityDataManager;
        // 0ce: getstatic com/trolmastercard/sexmod/e2.M Lnet/minecraft/network/datasync/DataParameter;
        // 0d1: bipush 2
        // 0d2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
        // 0d5: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187227_b (Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V
        // 0d8: aload 0
        // 0d9: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 0dc: getstatic com/trolmastercard/sexmod/fp.BOW Lcom/trolmastercard/sexmod/fp;
        // 0df: invokevirtual com/trolmastercard/sexmod/e2.b (Lcom/trolmastercard/sexmod/fp;)V
        // 0e2: aload 0
        // 0e3: dup
        // 0e4: getfield com/trolmastercard/sexmod/g.p I
        // 0e7: bipush 1
        // 0e8: iadd
        // 0e9: dup_x1
        // 0ea: putfield com/trolmastercard/sexmod/g.p I
        // 0ed: bipush 32
        // 0ef: if_icmplt 114
        // 0f2: goto 0f9
        // 0f5: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0f8: athrow
        // 0f9: aload 0
        // 0fa: bipush -20
        // 0fc: putfield com/trolmastercard/sexmod/g.p I
        // 0ff: aload 0
        // 100: invokevirtual com/trolmastercard/sexmod/g.e ()V
        // 103: aload 0
        // 104: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 107: getstatic com/trolmastercard/sexmod/fp.NULL Lcom/trolmastercard/sexmod/fp;
        // 10a: invokevirtual com/trolmastercard/sexmod/e2.b (Lcom/trolmastercard/sexmod/fp;)V
        // 10d: goto 114
        // 110: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 113: athrow
        // 114: aload 0
        // 115: aload 0
        // 116: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 119: aload 0
        // 11a: getfield com/trolmastercard/sexmod/g.a Lnet/minecraft/entity/player/EntityPlayer;
        // 11d: invokevirtual com/trolmastercard/sexmod/e2.func_70032_d (Lnet/minecraft/entity/Entity;)F
        // 120: f2d
        // 121: putfield com/trolmastercard/sexmod/g.l D
        // 124: aload 0
        // 125: aload 0
        // 126: getfield com/trolmastercard/sexmod/g.a Lnet/minecraft/entity/player/EntityPlayer;
        // 129: invokevirtual net/minecraft/entity/player/EntityPlayer.func_174791_d ()Lnet/minecraft/util/math/Vec3d;
        // 12c: putfield com/trolmastercard/sexmod/g.i Lnet/minecraft/util/math/Vec3d;
        // 12f: return
        // 130: dload 2
        // 131: ldc2_w 2.0
        // 134: dcmpg
        // 135: ifge 166
        // 138: aload 0
        // 139: getfield com/trolmastercard/sexmod/g.e Lnet/minecraft/network/datasync/EntityDataManager;
        // 13c: getstatic com/trolmastercard/sexmod/e2.M Lnet/minecraft/network/datasync/DataParameter;
        // 13f: bipush 1
        // 140: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
        // 143: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187227_b (Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V
        // 146: aload 0
        // 147: getfield com/trolmastercard/sexmod/g.c Lnet/minecraft/pathfinding/PathNavigate;
        // 14a: aload 0
        // 14b: getfield com/trolmastercard/sexmod/g.r Lnet/minecraft/entity/EntityLivingBase;
        // 14e: ldc2_w 0.5
        // 151: invokevirtual net/minecraft/pathfinding/PathNavigate.func_75497_a (Lnet/minecraft/entity/Entity;D)Z
        // 154: pop
        // 155: aload 0
        // 156: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 159: getstatic com/trolmastercard/sexmod/em$a.WALK Lcom/trolmastercard/sexmod/em$a;
        // 15c: invokevirtual com/trolmastercard/sexmod/e2.a (Lcom/trolmastercard/sexmod/em$a;)V
        // 15f: goto 353
        // 162: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 165: athrow
        // 166: aload 0
        // 167: getfield com/trolmastercard/sexmod/g.e Lnet/minecraft/network/datasync/EntityDataManager;
        // 16a: getstatic com/trolmastercard/sexmod/e2.M Lnet/minecraft/network/datasync/DataParameter;
        // 16d: bipush 1
        // 16e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
        // 171: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187227_b (Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V
        // 174: aload 0
        // 175: getfield com/trolmastercard/sexmod/g.c Lnet/minecraft/pathfinding/PathNavigate;
        // 178: aload 0
        // 179: getfield com/trolmastercard/sexmod/g.r Lnet/minecraft/entity/EntityLivingBase;
        // 17c: ldc2_w 0.7
        // 17f: invokevirtual net/minecraft/pathfinding/PathNavigate.func_75497_a (Lnet/minecraft/entity/Entity;D)Z
        // 182: pop
        // 183: aload 0
        // 184: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 187: getstatic com/trolmastercard/sexmod/em$a.RUN Lcom/trolmastercard/sexmod/em$a;
        // 18a: invokevirtual com/trolmastercard/sexmod/e2.a (Lcom/trolmastercard/sexmod/em$a;)V
        // 18d: goto 353
        // 190: aload 0
        // 191: getfield com/trolmastercard/sexmod/g.e Lnet/minecraft/network/datasync/EntityDataManager;
        // 194: getstatic com/trolmastercard/sexmod/e2.M Lnet/minecraft/network/datasync/DataParameter;
        // 197: bipush 0
        // 198: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
        // 19b: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187227_b (Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V
        // 19e: aload 0
        // 19f: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 1a2: aload 0
        // 1a3: getfield com/trolmastercard/sexmod/g.a Lnet/minecraft/entity/player/EntityPlayer;
        // 1a6: invokevirtual com/trolmastercard/sexmod/e2.func_70032_d (Lnet/minecraft/entity/Entity;)F
        // 1a9: f2d
        // 1aa: dstore 2
        // 1ab: aload 0
        // 1ac: getfield com/trolmastercard/sexmod/g.c Lnet/minecraft/pathfinding/PathNavigate;
        // 1af: invokevirtual net/minecraft/pathfinding/PathNavigate.func_111269_d ()F
        // 1b2: f2d
        // 1b3: dload 2
        // 1b4: dcmpl
        // 1b5: ifle 1ea
        // 1b8: aload 0
        // 1b9: getfield com/trolmastercard/sexmod/g.c Lnet/minecraft/pathfinding/PathNavigate;
        // 1bc: invokevirtual net/minecraft/pathfinding/PathNavigate.func_75499_g ()V
        // 1bf: aload 0
        // 1c0: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 1c3: getfield com/trolmastercard/sexmod/e2.N Z
        // 1c6: ifne 1ee
        // 1c9: goto 1d0
        // 1cc: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 1cf: athrow
        // 1d0: aload 0
        // 1d1: getfield com/trolmastercard/sexmod/g.c Lnet/minecraft/pathfinding/PathNavigate;
        // 1d4: aload 0
        // 1d5: getfield com/trolmastercard/sexmod/g.a Lnet/minecraft/entity/player/EntityPlayer;
        // 1d8: ldc2_w 0.5
        // 1db: invokevirtual net/minecraft/pathfinding/PathNavigate.func_75497_a (Lnet/minecraft/entity/Entity;D)Z
        // 1de: pop
        // 1df: aload 0
        // 1e0: invokevirtual com/trolmastercard/sexmod/g.a ()V
        // 1e3: goto 1ee
        // 1e6: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 1e9: athrow
        // 1ea: aload 0
        // 1eb: invokevirtual com/trolmastercard/sexmod/g.c ()V
        // 1ee: aload 0
        // 1ef: sipush 300
        // 1f2: putfield com/trolmastercard/sexmod/g.j I
        // 1f5: aload 0
        // 1f6: invokevirtual com/trolmastercard/sexmod/g.b ()D
        // 1f9: pop2
        // 1fa: goto 353
        // 1fd: aload 0
        // 1fe: getfield com/trolmastercard/sexmod/g.e Lnet/minecraft/network/datasync/EntityDataManager;
        // 201: getstatic com/trolmastercard/sexmod/e2.M Lnet/minecraft/network/datasync/DataParameter;
        // 204: bipush 0
        // 205: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
        // 208: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187227_b (Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V
        // 20b: aload 0
        // 20c: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 20f: getfield com/trolmastercard/sexmod/e2.N Z
        // 212: ifne 29f
        // 215: aload 0
        // 216: dup
        // 217: getfield com/trolmastercard/sexmod/g.j I
        // 21a: bipush 1
        // 21b: iadd
        // 21c: dup_x1
        // 21d: putfield com/trolmastercard/sexmod/g.j I
        // 220: sipush 200
        // 223: getstatic com/trolmastercard/sexmod/r.f Ljava/util/Random;
        // 226: bipush 100
        // 228: invokevirtual java/util/Random.nextInt (I)I
        // 22b: iadd
        // 22c: if_icmple 297
        // 22f: goto 236
        // 232: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 235: athrow
        // 236: aload 0
        // 237: bipush 0
        // 238: putfield com/trolmastercard/sexmod/g.j I
        // 23b: aload 0
        // 23c: getfield com/trolmastercard/sexmod/g.a Lnet/minecraft/entity/player/EntityPlayer;
        // 23f: invokevirtual net/minecraft/entity/player/EntityPlayer.func_174791_d ()Lnet/minecraft/util/math/Vec3d;
        // 242: astore 4
        // 244: new net/minecraft/util/math/Vec3d
        // 247: dup
        // 248: aload 4
        // 24a: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 24d: dconst_1
        // 24e: dadd
        // 24f: getstatic com/trolmastercard/sexmod/r.f Ljava/util/Random;
        // 252: invokevirtual java/util/Random.nextFloat ()F
        // 255: ldc 3.0
        // 257: fmul
        // 258: f2d
        // 259: dadd
        // 25a: aload 4
        // 25c: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // 25f: aload 4
        // 261: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 264: dconst_1
        // 265: dadd
        // 266: getstatic com/trolmastercard/sexmod/r.f Ljava/util/Random;
        // 269: invokevirtual java/util/Random.nextFloat ()F
        // 26c: ldc 3.0
        // 26e: fmul
        // 26f: f2d
        // 270: dadd
        // 271: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
        // 274: astore 5
        // 276: aload 0
        // 277: getfield com/trolmastercard/sexmod/g.c Lnet/minecraft/pathfinding/PathNavigate;
        // 27a: invokevirtual net/minecraft/pathfinding/PathNavigate.func_75499_g ()V
        // 27d: aload 0
        // 27e: getfield com/trolmastercard/sexmod/g.c Lnet/minecraft/pathfinding/PathNavigate;
        // 281: aload 5
        // 283: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 286: aload 5
        // 288: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // 28b: aload 5
        // 28d: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 290: ldc2_w 0.5
        // 293: invokevirtual net/minecraft/pathfinding/PathNavigate.func_75492_a (DDDD)Z
        // 296: pop
        // 297: aload 0
        // 298: invokevirtual com/trolmastercard/sexmod/g.b ()D
        // 29b: pop2
        // 29c: goto 353
        // 29f: aload 0
        // 2a0: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 2a3: aload 0
        // 2a4: getfield com/trolmastercard/sexmod/g.a Lnet/minecraft/entity/player/EntityPlayer;
        // 2a7: invokevirtual com/trolmastercard/sexmod/e2.func_70032_d (Lnet/minecraft/entity/Entity;)F
        // 2aa: ldc 10.0
        // 2ac: fcmpl
        // 2ad: ifle 353
        // 2b0: aload 0
        // 2b1: invokevirtual com/trolmastercard/sexmod/g.c ()V
        // 2b4: goto 353
        // 2b7: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 2ba: athrow
        // 2bb: aload 0
        // 2bc: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 2bf: invokevirtual com/trolmastercard/sexmod/e2.func_184218_aH ()Z
        // 2c2: ifeq 2d6
        // 2c5: aload 0
        // 2c6: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 2c9: getstatic com/trolmastercard/sexmod/fp.SIT Lcom/trolmastercard/sexmod/fp;
        // 2cc: invokevirtual com/trolmastercard/sexmod/e2.b (Lcom/trolmastercard/sexmod/fp;)V
        // 2cf: goto 353
        // 2d2: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 2d5: athrow
        // 2d6: aload 0
        // 2d7: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 2da: bipush 1
        // 2db: invokevirtual com/trolmastercard/sexmod/e2.func_189654_d (Z)V
        // 2de: aload 0
        // 2df: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 2e2: bipush 1
        // 2e3: putfield com/trolmastercard/sexmod/e2.field_70145_X Z
        // 2e6: aload 0
        // 2e7: getfield com/trolmastercard/sexmod/g.a Lnet/minecraft/entity/player/EntityPlayer;
        // 2ea: invokevirtual net/minecraft/entity/player/EntityPlayer.func_174791_d ()Lnet/minecraft/util/math/Vec3d;
        // 2ed: aload 0
        // 2ee: getfield com/trolmastercard/sexmod/g.o Lnet/minecraft/entity/Entity;
        // 2f1: invokevirtual net/minecraft/entity/Entity.func_70040_Z ()Lnet/minecraft/util/math/Vec3d;
        // 2f4: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 2f7: ldc2_w 0.5
        // 2fa: dmul
        // 2fb: dconst_0
        // 2fc: aload 0
        // 2fd: getfield com/trolmastercard/sexmod/g.o Lnet/minecraft/entity/Entity;
        // 300: invokevirtual net/minecraft/entity/Entity.func_70040_Z ()Lnet/minecraft/util/math/Vec3d;
        // 303: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 306: ldc2_w 0.5
        // 309: dmul
        // 30a: invokevirtual net/minecraft/util/math/Vec3d.func_178786_a (DDD)Lnet/minecraft/util/math/Vec3d;
        // 30d: astore 4
        // 30f: aload 0
        // 310: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 313: aload 4
        // 315: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 318: aload 4
        // 31a: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // 31d: aload 4
        // 31f: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 322: fconst_0
        // 323: fconst_0
        // 324: invokevirtual com/trolmastercard/sexmod/e2.func_70080_a (DDDFF)V
        // 327: aload 0
        // 328: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 32b: dconst_0
        // 32c: putfield com/trolmastercard/sexmod/e2.field_70159_w D
        // 32f: aload 0
        // 330: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 333: dconst_0
        // 334: putfield com/trolmastercard/sexmod/e2.field_70181_x D
        // 337: aload 0
        // 338: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 33b: dconst_0
        // 33c: putfield com/trolmastercard/sexmod/e2.field_70179_y D
        // 33f: aload 0
        // 340: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 343: getstatic com/trolmastercard/sexmod/fp.RIDE Lcom/trolmastercard/sexmod/fp;
        // 346: invokevirtual com/trolmastercard/sexmod/e2.b (Lcom/trolmastercard/sexmod/fp;)V
        // 349: goto 353
        // 34c: aload 0
        // 34d: getfield com/trolmastercard/sexmod/g.c Lnet/minecraft/pathfinding/PathNavigate;
        // 350: invokevirtual net/minecraft/pathfinding/PathNavigate.func_75499_g ()V
        // 353: return
        // try (20 -> 35): 36 java/lang/RuntimeException
        // try (27 -> 41): 41 java/lang/RuntimeException
        // try (43 -> 58): 59 java/lang/RuntimeException
        // try (51 -> 69): 70 java/lang/RuntimeException
        // try (61 -> 76): 77 java/lang/RuntimeException
        // try (72 -> 98): 99 java/lang/RuntimeException
        // try (79 -> 110): 111 java/lang/RuntimeException
        // try (127 -> 149): 149 java/lang/RuntimeException
        // try (182 -> 196): 197 java/lang/RuntimeException
        // try (189 -> 209): 209 java/lang/RuntimeException
        // try (220 -> 243): 244 java/lang/RuntimeException
        // try (297 -> 308): 308 java/lang/RuntimeException
        // try (310 -> 319): 319 java/lang/RuntimeException
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
        // 000: aload 0
        // 001: dup
        // 002: getfield com/trolmastercard/sexmod/g.n I
        // 005: bipush 1
        // 006: isub
        // 007: putfield com/trolmastercard/sexmod/g.n I
        // 00a: aload 0
        // 00b: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 00e: getfield com/trolmastercard/sexmod/e2.N Z
        // 011: ifne 025
        // 014: aload 0
        // 015: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 018: invokevirtual com/trolmastercard/sexmod/e2.ae ()Ljava/util/UUID;
        // 01b: ifnull 02d
        // 01e: goto 025
        // 021: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 024: athrow
        // 025: getstatic com/trolmastercard/sexmod/f$a.DOWNED Lcom/trolmastercard/sexmod/f$a;
        // 028: areturn
        // 029: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 02c: athrow
        // 02d: aload 0
        // 02e: getfield com/trolmastercard/sexmod/g.a Lnet/minecraft/entity/player/EntityPlayer;
        // 031: invokevirtual net/minecraft/entity/player/EntityPlayer.func_184218_aH ()Z
        // 034: ifeq 08a
        // 037: aload 0
        // 038: getfield com/trolmastercard/sexmod/g.a Lnet/minecraft/entity/player/EntityPlayer;
        // 03b: invokevirtual net/minecraft/entity/player/EntityPlayer.func_184187_bx ()Lnet/minecraft/entity/Entity;
        // 03e: astore 1
        // 03f: aload 0
        // 040: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 043: invokevirtual com/trolmastercard/sexmod/e2.func_184218_aH ()Z
        // 046: ifne 07a
        // 049: aload 0
        // 04a: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 04d: aload 1
        // 04e: invokevirtual com/trolmastercard/sexmod/e2.func_184220_m (Lnet/minecraft/entity/Entity;)Z
        // 051: ifne 07a
        // 054: goto 05b
        // 057: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 05a: athrow
        // 05b: aload 1
        // 05c: instanceof net/minecraft/entity/passive/EntityHorse
        // 05f: ifeq 087
        // 062: goto 069
        // 065: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 068: athrow
        // 069: aload 1
        // 06a: checkcast net/minecraft/entity/passive/EntityHorse
        // 06d: invokevirtual net/minecraft/entity/passive/EntityHorse.func_110257_ck ()Z
        // 070: ifeq 087
        // 073: goto 07a
        // 076: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 079: athrow
        // 07a: aload 0
        // 07b: aload 1
        // 07c: putfield com/trolmastercard/sexmod/g.o Lnet/minecraft/entity/Entity;
        // 07f: getstatic com/trolmastercard/sexmod/f$a.RIDE Lcom/trolmastercard/sexmod/f$a;
        // 082: areturn
        // 083: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 086: athrow
        // 087: goto 0ef
        // 08a: aload 0
        // 08b: getfield com/trolmastercard/sexmod/g.a Lnet/minecraft/entity/player/EntityPlayer;
        // 08e: invokevirtual net/minecraft/entity/player/EntityPlayer.func_184218_aH ()Z
        // 091: ifne 0a5
        // 094: aload 0
        // 095: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 098: invokevirtual com/trolmastercard/sexmod/e2.func_184218_aH ()Z
        // 09b: ifne 0c7
        // 09e: goto 0a5
        // 0a1: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0a4: athrow
        // 0a5: aload 0
        // 0a6: getfield com/trolmastercard/sexmod/g.f Lcom/trolmastercard/sexmod/f$a;
        // 0a9: getstatic com/trolmastercard/sexmod/f$a.RIDE Lcom/trolmastercard/sexmod/f$a;
        // 0ac: if_acmpne 0ef
        // 0af: goto 0b6
        // 0b2: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0b5: athrow
        // 0b6: aload 0
        // 0b7: getfield com/trolmastercard/sexmod/g.a Lnet/minecraft/entity/player/EntityPlayer;
        // 0ba: invokevirtual net/minecraft/entity/player/EntityPlayer.func_184218_aH ()Z
        // 0bd: ifne 0ef
        // 0c0: goto 0c7
        // 0c3: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0c6: athrow
        // 0c7: aload 0
        // 0c8: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 0cb: getstatic com/trolmastercard/sexmod/fp.NULL Lcom/trolmastercard/sexmod/fp;
        // 0ce: invokevirtual com/trolmastercard/sexmod/e2.b (Lcom/trolmastercard/sexmod/fp;)V
        // 0d1: aload 0
        // 0d2: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 0d5: invokevirtual com/trolmastercard/sexmod/e2.func_184210_p ()V
        // 0d8: aload 0
        // 0d9: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 0dc: bipush 0
        // 0dd: putfield com/trolmastercard/sexmod/e2.field_70145_X Z
        // 0e0: aload 0
        // 0e1: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 0e4: bipush 0
        // 0e5: invokevirtual com/trolmastercard/sexmod/e2.func_189654_d (Z)V
        // 0e8: goto 0ef
        // 0eb: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0ee: athrow
        // 0ef: aload 0
        // 0f0: aload 0
        // 0f1: getfield com/trolmastercard/sexmod/g.r Lnet/minecraft/entity/EntityLivingBase;
        // 0f4: invokevirtual com/trolmastercard/sexmod/g.a (Lnet/minecraft/entity/EntityLivingBase;)Z
        // 0f7: ifeq 102
        // 0fa: getstatic com/trolmastercard/sexmod/f$a.ATTACK Lcom/trolmastercard/sexmod/f$a;
        // 0fd: areturn
        // 0fe: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 101: athrow
        // 102: aload 0
        // 103: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 106: invokevirtual com/trolmastercard/sexmod/e2.func_189748_bU ()Lnet/minecraft/util/DamageSource;
        // 109: astore 2
        // 10a: aload 2
        // 10b: ifnull 12b
        // 10e: aload 2
        // 10f: invokevirtual net/minecraft/util/DamageSource.func_76346_g ()Lnet/minecraft/entity/Entity;
        // 112: checkcast net/minecraft/entity/EntityLivingBase
        // 115: astore 1
        // 116: aload 0
        // 117: aload 1
        // 118: invokevirtual com/trolmastercard/sexmod/g.a (Lnet/minecraft/entity/EntityLivingBase;)Z
        // 11b: ifeq 12b
        // 11e: aload 0
        // 11f: aload 1
        // 120: putfield com/trolmastercard/sexmod/g.r Lnet/minecraft/entity/EntityLivingBase;
        // 123: getstatic com/trolmastercard/sexmod/f$a.ATTACK Lcom/trolmastercard/sexmod/f$a;
        // 126: areturn
        // 127: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 12a: athrow
        // 12b: aload 0
        // 12c: getfield com/trolmastercard/sexmod/g.a Lnet/minecraft/entity/player/EntityPlayer;
        // 12f: invokevirtual net/minecraft/entity/player/EntityPlayer.func_110144_aD ()Lnet/minecraft/entity/EntityLivingBase;
        // 132: astore 1
        // 133: aload 0
        // 134: getfield com/trolmastercard/sexmod/g.a Lnet/minecraft/entity/player/EntityPlayer;
        // 137: getfield net/minecraft/entity/player/EntityPlayer.field_70173_aa I
        // 13a: aload 0
        // 13b: getfield com/trolmastercard/sexmod/g.a Lnet/minecraft/entity/player/EntityPlayer;
        // 13e: invokevirtual net/minecraft/entity/player/EntityPlayer.func_142013_aG ()I
        // 141: isub
        // 142: sipush 140
        // 145: if_icmpge 164
        // 148: aload 0
        // 149: aload 1
        // 14a: invokevirtual com/trolmastercard/sexmod/g.a (Lnet/minecraft/entity/EntityLivingBase;)Z
        // 14d: ifeq 164
        // 150: goto 157
        // 153: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 156: athrow
        // 157: aload 0
        // 158: aload 1
        // 159: putfield com/trolmastercard/sexmod/g.r Lnet/minecraft/entity/EntityLivingBase;
        // 15c: getstatic com/trolmastercard/sexmod/f$a.ATTACK Lcom/trolmastercard/sexmod/f$a;
        // 15f: areturn
        // 160: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 163: athrow
        // 164: aload 0
        // 165: getfield com/trolmastercard/sexmod/g.f Lcom/trolmastercard/sexmod/f$a;
        // 168: getstatic com/trolmastercard/sexmod/f$a.FOLLOW Lcom/trolmastercard/sexmod/f$a;
        // 16b: if_acmpeq 23d
        // 16e: aload 0
        // 16f: getfield com/trolmastercard/sexmod/g.a Lnet/minecraft/entity/player/EntityPlayer;
        // 172: invokevirtual net/minecraft/entity/player/EntityPlayer.func_189748_bU ()Lnet/minecraft/util/DamageSource;
        // 175: astore 2
        // 176: aload 2
        // 177: ifnull 197
        // 17a: aload 2
        // 17b: invokevirtual net/minecraft/util/DamageSource.func_76346_g ()Lnet/minecraft/entity/Entity;
        // 17e: checkcast net/minecraft/entity/EntityLivingBase
        // 181: astore 1
        // 182: aload 0
        // 183: aload 1
        // 184: invokevirtual com/trolmastercard/sexmod/g.a (Lnet/minecraft/entity/EntityLivingBase;)Z
        // 187: ifeq 197
        // 18a: aload 0
        // 18b: aload 1
        // 18c: putfield com/trolmastercard/sexmod/g.r Lnet/minecraft/entity/EntityLivingBase;
        // 18f: getstatic com/trolmastercard/sexmod/f$a.ATTACK Lcom/trolmastercard/sexmod/f$a;
        // 192: areturn
        // 193: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 196: athrow
        // 197: aload 0
        // 198: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 19b: invokevirtual com/trolmastercard/sexmod/e2.func_174791_d ()Lnet/minecraft/util/math/Vec3d;
        // 19e: astore 3
        // 19f: new net/minecraft/util/math/AxisAlignedBB
        // 1a2: dup
        // 1a3: aload 3
        // 1a4: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 1a7: ldc2_w 5.0
        // 1aa: dsub
        // 1ab: aload 3
        // 1ac: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // 1af: ldc2_w 2.0
        // 1b2: dsub
        // 1b3: aload 3
        // 1b4: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 1b7: ldc2_w 5.0
        // 1ba: dsub
        // 1bb: aload 3
        // 1bc: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 1bf: ldc2_w 5.0
        // 1c2: dadd
        // 1c3: aload 3
        // 1c4: getfield net/minecraft/util/math/Vec3d.field_72448_b D
        // 1c7: ldc2_w 2.0
        // 1ca: dadd
        // 1cb: aload 3
        // 1cc: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 1cf: ldc2_w 5.0
        // 1d2: dadd
        // 1d3: invokespecial net/minecraft/util/math/AxisAlignedBB.<init> (DDDDDD)V
        // 1d6: astore 4
        // 1d8: aload 0
        // 1d9: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 1dc: getfield com/trolmastercard/sexmod/e2.field_70170_p Lnet/minecraft/world/World;
        // 1df: ldc net/minecraft/entity/monster/EntityMob
        // 1e1: aload 4
        // 1e3: invokevirtual net/minecraft/world/World.func_72872_a (Ljava/lang/Class;Lnet/minecraft/util/math/AxisAlignedBB;)Ljava/util/List;
        // 1e6: astore 5
        // 1e8: aload 5
        // 1ea: aload 0
        // 1eb: invokedynamic compare (Lcom/trolmastercard/sexmod/g;)Ljava/util/Comparator; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;Ljava/lang/Object;)I, com/trolmastercard/sexmod/g.lambda$updateMode$0 (Lnet/minecraft/entity/monster/EntityMob;Lnet/minecraft/entity/monster/EntityMob;)I, (Lnet/minecraft/entity/monster/EntityMob;Lnet/minecraft/entity/monster/EntityMob;)I ]
        // 1f0: invokeinterface java/util/List.sort (Ljava/util/Comparator;)V 2
        // 1f5: aload 5
        // 1f7: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
        // 1fc: astore 6
        // 1fe: aload 6
        // 200: invokeinterface java/util/Iterator.hasNext ()Z 1
        // 205: ifeq 23d
        // 208: aload 6
        // 20a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
        // 20f: checkcast net/minecraft/entity/monster/EntityMob
        // 212: astore 7
        // 214: aload 0
        // 215: aload 7
        // 217: invokevirtual com/trolmastercard/sexmod/g.a (Lnet/minecraft/entity/EntityLivingBase;)Z
        // 21a: ifeq 23a
        // 21d: aload 7
        // 21f: instanceof net/minecraft/entity/monster/EntityCreeper
        // 222: ifne 23a
        // 225: goto 22c
        // 228: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 22b: athrow
        // 22c: aload 0
        // 22d: aload 7
        // 22f: putfield com/trolmastercard/sexmod/g.r Lnet/minecraft/entity/EntityLivingBase;
        // 232: getstatic com/trolmastercard/sexmod/f$a.ATTACK Lcom/trolmastercard/sexmod/f$a;
        // 235: areturn
        // 236: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 239: athrow
        // 23a: goto 1fe
        // 23d: aload 0
        // 23e: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 241: aload 0
        // 242: getfield com/trolmastercard/sexmod/g.a Lnet/minecraft/entity/player/EntityPlayer;
        // 245: invokevirtual com/trolmastercard/sexmod/e2.func_70032_d (Lnet/minecraft/entity/Entity;)F
        // 248: fstore 3
        // 249: fload 3
        // 24a: ldc 5.0
        // 24c: fcmpl
        // 24d: ifle 258
        // 250: bipush 1
        // 251: goto 259
        // 254: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 257: athrow
        // 258: bipush 0
        // 259: istore 4
        // 25b: iload 4
        // 25d: ifne 296
        // 260: aload 0
        // 261: getfield com/trolmastercard/sexmod/g.f Lcom/trolmastercard/sexmod/f$a;
        // 264: getstatic com/trolmastercard/sexmod/f$a.FOLLOW Lcom/trolmastercard/sexmod/f$a;
        // 267: if_acmpne 296
        // 26a: goto 271
        // 26d: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 270: athrow
        // 271: aload 0
        // 272: dup
        // 273: getfield com/trolmastercard/sexmod/g.m I
        // 276: bipush 1
        // 277: iadd
        // 278: dup_x1
        // 279: putfield com/trolmastercard/sexmod/g.m I
        // 27c: bipush 60
        // 27e: if_icmple 293
        // 281: goto 288
        // 284: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 287: athrow
        // 288: bipush 0
        // 289: istore 4
        // 28b: aload 0
        // 28c: bipush 0
        // 28d: putfield com/trolmastercard/sexmod/g.m I
        // 290: goto 296
        // 293: bipush 1
        // 294: istore 4
        // 296: iload 4
        // 298: ifeq 2b9
        // 29b: aload 0
        // 29c: getfield com/trolmastercard/sexmod/g.f Lcom/trolmastercard/sexmod/f$a;
        // 29f: getstatic com/trolmastercard/sexmod/f$a.ATTACK Lcom/trolmastercard/sexmod/f$a;
        // 2a2: if_acmpne 2b9
        // 2a5: goto 2ac
        // 2a8: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 2ab: athrow
        // 2ac: aload 0
        // 2ad: bipush 60
        // 2af: putfield com/trolmastercard/sexmod/g.n I
        // 2b2: goto 2b9
        // 2b5: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 2b8: athrow
        // 2b9: iload 4
        // 2bb: ifeq 2c6
        // 2be: getstatic com/trolmastercard/sexmod/f$a.FOLLOW Lcom/trolmastercard/sexmod/f$a;
        // 2c1: areturn
        // 2c2: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 2c5: athrow
        // 2c6: getstatic com/trolmastercard/sexmod/f$a.IDLE Lcom/trolmastercard/sexmod/f$a;
        // 2c9: areturn
        // try (0 -> 14): 15 java/lang/RuntimeException
        // try (10 -> 19): 19 java/lang/RuntimeException
        // try (29 -> 38): 39 java/lang/RuntimeException
        // try (33 -> 44): 45 java/lang/RuntimeException
        // try (41 -> 51): 52 java/lang/RuntimeException
        // try (47 -> 59): 59 java/lang/RuntimeException
        // try (62 -> 70): 71 java/lang/RuntimeException
        // try (66 -> 77): 78 java/lang/RuntimeException
        // try (73 -> 84): 85 java/lang/RuntimeException
        // try (80 -> 102): 103 java/lang/RuntimeException
        // try (105 -> 112): 112 java/lang/RuntimeException
        // try (124 -> 133): 133 java/lang/RuntimeException
        // try (139 -> 152): 153 java/lang/RuntimeException
        // try (148 -> 160): 160 java/lang/RuntimeException
        // try (176 -> 185): 185 java/lang/RuntimeException
        // try (240 -> 247): 248 java/lang/RuntimeException
        // try (244 -> 255): 255 java/lang/RuntimeException
        // try (264 -> 270): 270 java/lang/RuntimeException
        // try (274 -> 280): 281 java/lang/RuntimeException
        // try (276 -> 292): 293 java/lang/RuntimeException
        // try (303 -> 309): 310 java/lang/RuntimeException
        // try (305 -> 315): 316 java/lang/RuntimeException
        // try (318 -> 322): 322 java/lang/RuntimeException
    }

    public void e() {
        EntityArrow var1 = this.b();
        double var2 = this.r.field_70165_t - this.q.field_70165_t;
        double var4 = this.r.func_174813_aQ().field_72338_b + this.r.field_70131_O / 3.0F - var1.field_70163_u;
        double var6 = this.r.field_70161_v - this.q.field_70161_v;
        double var8 = MathHelper.func_76133_a(var2 * var2 + var6 * var6);
        var1.func_70186_c(var2, var4 + var8 * 0.2F, var6, 1.6F, 2.0F);
        this.q.func_184185_a(SoundEvents.field_187866_fi, 1.0F, 1.0F / (this.q.func_70681_au().nextFloat() * 0.4F + 0.8F));
        this.q.field_70170_p.func_72838_d(var1);
        var1.func_70239_b(4.5);
    }

    protected EntityArrow b() {
        EntityTippedArrow var1 = new EntityTippedArrow(this.q.field_70170_p, this.q);
        ItemStack var2 = this.q.Q.getStackInSlot(1);
        double var3 = EnchantmentHelper.func_77506_a(Enchantments.field_185309_u, var2);
        int var5 = EnchantmentHelper.func_77506_a(Enchantments.field_185310_v, var2);
        int var6 = EnchantmentHelper.func_77506_a(Enchantments.field_185311_w, var2);

        try {
            if (var3 != 0.0) {
                var1.func_70239_b(var1.func_70242_d() + var3 * 0.5 + 0.5);
            }
        } catch (RuntimeException var8) {
            throw a(var8);
        }

        try {
            if (var5 != 0) {
                var1.func_70240_a(var5);
            }
        } catch (RuntimeException var9) {
            throw a(var9);
        }

        try {
            if (var6 != 0) {
                var1.func_70015_d(100);
            }

            return var1;
        } catch (RuntimeException var7) {
            throw a(var7);
        }
    }

    void d() {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 000: aload 0
        // 001: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 004: getstatic com/trolmastercard/sexmod/fp.ATTACK Lcom/trolmastercard/sexmod/fp;
        // 007: invokevirtual com/trolmastercard/sexmod/e2.b (Lcom/trolmastercard/sexmod/fp;)V
        // 00a: aload 0
        // 00b: getfield com/trolmastercard/sexmod/g.e Lnet/minecraft/network/datasync/EntityDataManager;
        // 00e: getstatic com/trolmastercard/sexmod/e2.M Lnet/minecraft/network/datasync/DataParameter;
        // 011: bipush 1
        // 012: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
        // 015: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187227_b (Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V
        // 018: aload 0
        // 019: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 01c: getfield com/trolmastercard/sexmod/e2.Q Lnet/minecraftforge/items/ItemStackHandler;
        // 01f: bipush 0
        // 020: invokevirtual net/minecraftforge/items/ItemStackHandler.getStackInSlot (I)Lnet/minecraft/item/ItemStack;
        // 023: astore 1
        // 024: aload 1
        // 025: getstatic net/minecraft/inventory/EntityEquipmentSlot.MAINHAND Lnet/minecraft/inventory/EntityEquipmentSlot;
        // 028: invokevirtual net/minecraft/item/ItemStack.func_111283_C (Lnet/minecraft/inventory/EntityEquipmentSlot;)Lcom/google/common/collect/Multimap;
        // 02b: astore 2
        // 02c: fconst_0
        // 02d: fstore 3
        // 02e: fconst_0
        // 02f: fstore 4
        // 031: aload 2
        // 032: getstatic net/minecraft/entity/SharedMonsterAttributes.field_111264_e Lnet/minecraft/entity/ai/attributes/IAttribute;
        // 035: invokeinterface net/minecraft/entity/ai/attributes/IAttribute.func_111108_a ()Ljava/lang/String; 1
        // 03a: invokeinterface com/google/common/collect/Multimap.get (Ljava/lang/Object;)Ljava/util/Collection; 2
        // 03f: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
        // 044: astore 5
        // 046: aload 5
        // 048: invokeinterface java/util/Iterator.hasNext ()Z 1
        // 04d: ifeq 066
        // 050: aload 5
        // 052: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
        // 057: checkcast net/minecraft/entity/ai/attributes/AttributeModifier
        // 05a: astore 6
        // 05c: aload 6
        // 05e: invokevirtual net/minecraft/entity/ai/attributes/AttributeModifier.func_111164_d ()D
        // 061: d2f
        // 062: fstore 3
        // 063: goto 046
        // 066: aload 2
        // 067: getstatic net/minecraft/entity/SharedMonsterAttributes.field_188790_f Lnet/minecraft/entity/ai/attributes/IAttribute;
        // 06a: invokeinterface net/minecraft/entity/ai/attributes/IAttribute.func_111108_a ()Ljava/lang/String; 1
        // 06f: invokeinterface com/google/common/collect/Multimap.get (Ljava/lang/Object;)Ljava/util/Collection; 2
        // 074: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
        // 079: astore 5
        // 07b: aload 5
        // 07d: invokeinterface java/util/Iterator.hasNext ()Z 1
        // 082: ifeq 09c
        // 085: aload 5
        // 087: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
        // 08c: checkcast net/minecraft/entity/ai/attributes/AttributeModifier
        // 08f: astore 6
        // 091: aload 6
        // 093: invokevirtual net/minecraft/entity/ai/attributes/AttributeModifier.func_111164_d ()D
        // 096: d2f
        // 097: fstore 4
        // 099: goto 07b
        // 09c: fload 4
        // 09e: ldc 0.5
        // 0a0: invokestatic java/lang/Math.max (FF)F
        // 0a3: fstore 4
        // 0a5: aload 1
        // 0a6: aload 0
        // 0a7: getfield com/trolmastercard/sexmod/g.r Lnet/minecraft/entity/EntityLivingBase;
        // 0aa: invokevirtual net/minecraft/entity/EntityLivingBase.func_70668_bt ()Lnet/minecraft/entity/EnumCreatureAttribute;
        // 0ad: invokestatic net/minecraft/enchantment/EnchantmentHelper.func_152377_a (Lnet/minecraft/item/ItemStack;Lnet/minecraft/entity/EnumCreatureAttribute;)F
        // 0b0: fstore 5
        // 0b2: getstatic net/minecraft/init/Enchantments.field_180313_o Lnet/minecraft/enchantment/Enchantment;
        // 0b5: aload 1
        // 0b6: invokestatic net/minecraft/enchantment/EnchantmentHelper.func_77506_a (Lnet/minecraft/enchantment/Enchantment;Lnet/minecraft/item/ItemStack;)I
        // 0b9: istore 6
        // 0bb: getstatic net/minecraft/init/Enchantments.field_77334_n Lnet/minecraft/enchantment/Enchantment;
        // 0be: aload 1
        // 0bf: invokestatic net/minecraft/enchantment/EnchantmentHelper.func_77506_a (Lnet/minecraft/enchantment/Enchantment;Lnet/minecraft/item/ItemStack;)I
        // 0c2: istore 7
        // 0c4: getstatic net/minecraft/init/Enchantments.field_191530_r Lnet/minecraft/enchantment/Enchantment;
        // 0c7: aload 1
        // 0c8: invokestatic net/minecraft/enchantment/EnchantmentHelper.func_77506_a (Lnet/minecraft/enchantment/Enchantment;Lnet/minecraft/item/ItemStack;)I
        // 0cb: istore 8
        // 0cd: aload 0
        // 0ce: getfield com/trolmastercard/sexmod/g.r Lnet/minecraft/entity/EntityLivingBase;
        // 0d1: aload 0
        // 0d2: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 0d5: iload 6
        // 0d7: i2f
        // 0d8: ldc 0.5
        // 0da: fmul
        // 0db: aload 0
        // 0dc: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 0df: getfield com/trolmastercard/sexmod/e2.field_70177_z F
        // 0e2: ldc 0.017453292
        // 0e4: fmul
        // 0e5: invokestatic net/minecraft/util/math/MathHelper.func_76126_a (F)F
        // 0e8: f2d
        // 0e9: aload 0
        // 0ea: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 0ed: getfield com/trolmastercard/sexmod/e2.field_70177_z F
        // 0f0: ldc 0.017453292
        // 0f2: fmul
        // 0f3: invokestatic net/minecraft/util/math/MathHelper.func_76134_b (F)F
        // 0f6: fneg
        // 0f7: f2d
        // 0f8: invokevirtual net/minecraft/entity/EntityLivingBase.func_70653_a (Lnet/minecraft/entity/Entity;FDD)V
        // 0fb: aload 0
        // 0fc: getfield com/trolmastercard/sexmod/g.r Lnet/minecraft/entity/EntityLivingBase;
        // 0ff: iload 7
        // 101: bipush 4
        // 102: imul
        // 103: invokevirtual net/minecraft/entity/EntityLivingBase.func_70015_d (I)V
        // 106: iload 8
        // 108: ifeq 1f7
        // 10b: ldc 0.5
        // 10d: fstore 9
        // 10f: iload 8
        // 111: bipush 2
        // 112: if_icmpne 11c
        // 115: ldc 0.67
        // 117: fstore 9
        // 119: goto 126
        // 11c: iload 8
        // 11e: bipush 3
        // 11f: if_icmpne 126
        // 122: ldc 0.75
        // 124: fstore 9
        // 126: aload 0
        // 127: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 12a: getfield com/trolmastercard/sexmod/e2.field_70170_p Lnet/minecraft/world/World;
        // 12d: ldc net/minecraft/entity/EntityLivingBase
        // 12f: aload 0
        // 130: getfield com/trolmastercard/sexmod/g.r Lnet/minecraft/entity/EntityLivingBase;
        // 133: invokevirtual net/minecraft/entity/EntityLivingBase.func_174813_aQ ()Lnet/minecraft/util/math/AxisAlignedBB;
        // 136: dconst_1
        // 137: ldc2_w 0.25
        // 13a: dconst_1
        // 13b: invokevirtual net/minecraft/util/math/AxisAlignedBB.func_72314_b (DDD)Lnet/minecraft/util/math/AxisAlignedBB;
        // 13e: invokevirtual net/minecraft/world/World.func_72872_a (Ljava/lang/Class;Lnet/minecraft/util/math/AxisAlignedBB;)Ljava/util/List;
        // 141: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
        // 146: astore 10
        // 148: aload 10
        // 14a: invokeinterface java/util/Iterator.hasNext ()Z 1
        // 14f: ifeq 1f7
        // 152: aload 10
        // 154: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
        // 159: checkcast net/minecraft/entity/EntityLivingBase
        // 15c: astore 11
        // 15e: aload 11
        // 160: aload 0
        // 161: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 164: if_acmpeq 1f4
        // 167: aload 11
        // 169: aload 0
        // 16a: getfield com/trolmastercard/sexmod/g.a Lnet/minecraft/entity/player/EntityPlayer;
        // 16d: if_acmpeq 1f4
        // 170: goto 177
        // 173: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 176: athrow
        // 177: aload 11
        // 179: aload 0
        // 17a: getfield com/trolmastercard/sexmod/g.r Lnet/minecraft/entity/EntityLivingBase;
        // 17d: if_acmpeq 1f4
        // 180: goto 187
        // 183: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 186: athrow
        // 187: aload 0
        // 188: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 18b: aload 11
        // 18d: invokevirtual com/trolmastercard/sexmod/e2.func_184191_r (Lnet/minecraft/entity/Entity;)Z
        // 190: ifne 1f4
        // 193: goto 19a
        // 196: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 199: athrow
        // 19a: aload 0
        // 19b: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 19e: aload 11
        // 1a0: invokevirtual com/trolmastercard/sexmod/e2.func_70068_e (Lnet/minecraft/entity/Entity;)D
        // 1a3: ldc2_w 9.0
        // 1a6: dcmpg
        // 1a7: ifge 1f4
        // 1aa: goto 1b1
        // 1ad: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 1b0: athrow
        // 1b1: aload 11
        // 1b3: aload 0
        // 1b4: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 1b7: ldc 0.4
        // 1b9: aload 0
        // 1ba: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 1bd: getfield com/trolmastercard/sexmod/e2.field_70177_z F
        // 1c0: ldc 0.017453292
        // 1c2: fmul
        // 1c3: invokestatic net/minecraft/util/math/MathHelper.func_76126_a (F)F
        // 1c6: f2d
        // 1c7: aload 0
        // 1c8: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 1cb: getfield com/trolmastercard/sexmod/e2.field_70177_z F
        // 1ce: ldc 0.017453292
        // 1d0: fmul
        // 1d1: invokestatic net/minecraft/util/math/MathHelper.func_76134_b (F)F
        // 1d4: fneg
        // 1d5: f2d
        // 1d6: invokevirtual net/minecraft/entity/EntityLivingBase.func_70653_a (Lnet/minecraft/entity/Entity;FDD)V
        // 1d9: aload 11
        // 1db: aload 0
        // 1dc: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 1df: invokestatic net/minecraft/util/DamageSource.func_76358_a (Lnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/util/DamageSource;
        // 1e2: fload 3
        // 1e3: fload 5
        // 1e5: fadd
        // 1e6: fload 9
        // 1e8: fmul
        // 1e9: invokevirtual net/minecraft/entity/EntityLivingBase.func_70097_a (Lnet/minecraft/util/DamageSource;F)Z
        // 1ec: pop
        // 1ed: goto 1f4
        // 1f0: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 1f3: athrow
        // 1f4: goto 148
        // 1f7: aload 0
        // 1f8: getfield com/trolmastercard/sexmod/g.r Lnet/minecraft/entity/EntityLivingBase;
        // 1fb: aload 0
        // 1fc: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 1ff: invokestatic net/minecraft/util/DamageSource.func_76358_a (Lnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/util/DamageSource;
        // 202: fload 3
        // 203: fload 5
        // 205: fadd
        // 206: invokevirtual net/minecraft/entity/EntityLivingBase.func_70097_a (Lnet/minecraft/util/DamageSource;F)Z
        // 209: pop
        // 20a: aload 0
        // 20b: fload 4
        // 20d: invokestatic java/lang/Math.abs (F)F
        // 210: ldc 3.373494
        // 212: fdiv
        // 213: ldc 20.0
        // 215: fmul
        // 216: invokestatic java/lang/Math.round (F)I
        // 219: putfield com/trolmastercard/sexmod/g.k I
        // 21c: return
        // try (148 -> 156): 157 java/lang/RuntimeException
        // try (152 -> 163): 164 java/lang/RuntimeException
        // try (159 -> 171): 172 java/lang/RuntimeException
        // try (166 -> 181): 182 java/lang/RuntimeException
        // try (174 -> 215): 216 java/lang/RuntimeException
    }

    @Override
    protected double b() {
        double var1 = super.b();
        if (this.q.N) {
            var1 = 0.0;
        }

        this.c.func_75489_a(var1);
        this.q.a(this.q.q());
        return var1;
    }

    @Override
    public void func_75251_c() {
        super.func_75251_c();
        this.q.func_184212_Q().func_187227_b(e2.M, 0);
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
        // 01: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 04: getfield com/trolmastercard/sexmod/e2.field_70122_E Z
        // 07: ifne 49
        // 0a: aload 0
        // 0b: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 0e: invokevirtual com/trolmastercard/sexmod/e2.func_70090_H ()Z
        // 11: ifne 49
        // 14: goto 1b
        // 17: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 1a: athrow
        // 1b: aload 0
        // 1c: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 1f: getfield com/trolmastercard/sexmod/e2.field_70159_w D
        // 22: aload 0
        // 23: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 26: getfield com/trolmastercard/sexmod/e2.field_70179_y D
        // 29: dadd
        // 2a: dconst_0
        // 2b: dcmpl
        // 2c: ifne 49
        // 2f: goto 36
        // 32: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 35: athrow
        // 36: aload 0
        // 37: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 3a: getfield com/trolmastercard/sexmod/e2.field_70181_x D
        // 3d: dconst_0
        // 3e: dcmpg
        // 3f: ifgt 4e
        // 42: goto 49
        // 45: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 48: athrow
        // 49: return
        // 4a: invokestatic com/trolmastercard/sexmod/g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 4d: athrow
        // 4e: new net/minecraft/util/math/Vec3d
        // 51: dup
        // 52: dconst_0
        // 53: dconst_0
        // 54: ldc2_w 0.10000000149011612
        // 57: invokespecial net/minecraft/util/math/Vec3d.<init> (DDD)V
        // 5a: astore 1
        // 5b: aload 1
        // 5c: aload 0
        // 5d: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 60: getfield com/trolmastercard/sexmod/e2.field_70177_z F
        // 63: invokestatic com/trolmastercard/sexmod/ck.a (Lnet/minecraft/util/math/Vec3d;F)Lnet/minecraft/util/math/Vec3d;
        // 66: astore 1
        // 67: aload 0
        // 68: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 6b: aload 1
        // 6c: getfield net/minecraft/util/math/Vec3d.field_72450_a D
        // 6f: putfield com/trolmastercard/sexmod/e2.field_70159_w D
        // 72: aload 0
        // 73: getfield com/trolmastercard/sexmod/g.q Lcom/trolmastercard/sexmod/e2;
        // 76: aload 1
        // 77: getfield net/minecraft/util/math/Vec3d.field_72449_c D
        // 7a: putfield com/trolmastercard/sexmod/e2.field_70179_y D
        // 7d: return
        // try (0 -> 8): 9 java/lang/RuntimeException
        // try (4 -> 21): 22 java/lang/RuntimeException
        // try (11 -> 30): 31 java/lang/RuntimeException
        // try (24 -> 34): 34 java/lang/RuntimeException
    }

    private static RuntimeException a(RuntimeException var0) {
        return var0;
    }

    public static class a {
        @SubscribeEvent
        public void a(LivingHurtEvent param1) {
            // $VF: Couldn't be decompiled
            // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
            // java.lang.RuntimeException: parsing failure!
            //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
            //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
            //
            // Bytecode:
            // 00: aload 1
            // 01: invokevirtual net/minecraftforge/event/entity/living/LivingHurtEvent.getEntityLiving ()Lnet/minecraft/entity/EntityLivingBase;
            // 04: instanceof com/trolmastercard/sexmod/e2
            // 07: ifeq 73
            // 0a: aload 1
            // 0b: invokevirtual net/minecraftforge/event/entity/living/LivingHurtEvent.getEntityLiving ()Lnet/minecraft/entity/EntityLivingBase;
            // 0e: checkcast com/trolmastercard/sexmod/e2
            // 11: astore 2
            // 12: aload 2
            // 13: getfield com/trolmastercard/sexmod/e2.N Z
            // 16: ifeq 25
            // 19: aload 1
            // 1a: bipush 1
            // 1b: invokevirtual net/minecraftforge/event/entity/living/LivingHurtEvent.setCanceled (Z)V
            // 1e: goto 73
            // 21: invokestatic com/trolmastercard/sexmod/g$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 24: athrow
            // 25: aload 2
            // 26: invokevirtual com/trolmastercard/sexmod/e2.func_110143_aJ ()F
            // 29: aload 1
            // 2a: invokevirtual net/minecraftforge/event/entity/living/LivingHurtEvent.getAmount ()F
            // 2d: fsub
            // 2e: fconst_0
            // 2f: fcmpg
            // 30: ifge 73
            // 33: aload 2
            // 34: invokevirtual com/trolmastercard/sexmod/e2.func_184212_Q ()Lnet/minecraft/network/datasync/EntityDataManager;
            // 37: getstatic com/trolmastercard/sexmod/e2.v Lnet/minecraft/network/datasync/DataParameter;
            // 3a: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
            // 3d: checkcast java/lang/String
            // 40: ldc ""
            // 42: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
            // 45: ifne 73
            // 48: goto 4f
            // 4b: invokestatic com/trolmastercard/sexmod/g$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 4e: athrow
            // 4f: aload 2
            // 50: bipush 1
            // 51: putfield com/trolmastercard/sexmod/e2.N Z
            // 54: aload 2
            // 55: getstatic com/trolmastercard/sexmod/fp.DOWNED Lcom/trolmastercard/sexmod/fp;
            // 58: invokevirtual com/trolmastercard/sexmod/e2.b (Lcom/trolmastercard/sexmod/fp;)V
            // 5b: aload 1
            // 5c: aload 2
            // 5d: invokevirtual com/trolmastercard/sexmod/e2.func_110143_aJ ()F
            // 60: fconst_1
            // 61: fsub
            // 62: invokevirtual net/minecraftforge/event/entity/living/LivingHurtEvent.setAmount (F)V
            // 65: aload 2
            // 66: invokevirtual com/trolmastercard/sexmod/e2.func_70661_as ()Lnet/minecraft/pathfinding/PathNavigate;
            // 69: invokevirtual net/minecraft/pathfinding/PathNavigate.func_75499_g ()V
            // 6c: goto 73
            // 6f: invokestatic com/trolmastercard/sexmod/g$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 72: athrow
            // 73: return
            // try (8 -> 15): 15 java/lang/RuntimeException
            // try (17 -> 33): 34 java/lang/RuntimeException
            // try (25 -> 51): 52 java/lang/RuntimeException
        }

        @SubscribeEvent
        public void a(LivingHealEvent param1) {
            // $VF: Couldn't be decompiled
            // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
            // java.lang.RuntimeException: parsing failure!
            //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
            //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
            //
            // Bytecode:
            // 00: aload 1
            // 01: invokevirtual net/minecraftforge/event/entity/living/LivingHealEvent.getEntityLiving ()Lnet/minecraft/entity/EntityLivingBase;
            // 04: instanceof com/trolmastercard/sexmod/e2
            // 07: ifeq 44
            // 0a: aload 1
            // 0b: invokevirtual net/minecraftforge/event/entity/living/LivingHealEvent.getEntityLiving ()Lnet/minecraft/entity/EntityLivingBase;
            // 0e: checkcast com/trolmastercard/sexmod/e2
            // 11: astore 2
            // 12: aload 2
            // 13: getfield com/trolmastercard/sexmod/e2.N Z
            // 16: ifeq 44
            // 19: aload 2
            // 1a: invokevirtual com/trolmastercard/sexmod/e2.func_110143_aJ ()F
            // 1d: aload 1
            // 1e: invokevirtual net/minecraftforge/event/entity/living/LivingHealEvent.getAmount ()F
            // 21: fadd
            // 22: aload 2
            // 23: invokevirtual com/trolmastercard/sexmod/e2.func_110138_aP ()F
            // 26: fcmpl
            // 27: iflt 44
            // 2a: goto 31
            // 2d: invokestatic com/trolmastercard/sexmod/g$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 30: athrow
            // 31: aload 2
            // 32: bipush 0
            // 33: putfield com/trolmastercard/sexmod/e2.N Z
            // 36: aload 2
            // 37: getstatic com/trolmastercard/sexmod/fp.NULL Lcom/trolmastercard/sexmod/fp;
            // 3a: invokevirtual com/trolmastercard/sexmod/e2.b (Lcom/trolmastercard/sexmod/fp;)V
            // 3d: goto 44
            // 40: invokestatic com/trolmastercard/sexmod/g$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 43: athrow
            // 44: return
            // try (8 -> 20): 21 java/lang/RuntimeException
            // try (11 -> 29): 30 java/lang/RuntimeException
        }

        @SubscribeEvent
        public void a(LivingDeathEvent var1) {
            if (var1.getEntityLiving() instanceof e2) {
                e2 var2 = (e2)var1.getEntityLiving();

                try {
                    if (var2.field_70170_p.field_72995_K) {
                        return;
                    }
                } catch (RuntimeException var6) {
                    throw a(var6);
                }

                for (int var3 = 0; var3 < 6; var3++) {
                    Item var4 = var2.Q.getStackInSlot(var3).func_77973_b();

                    try {
                        if (var4 != Items.field_190931_a) {
                            var2.func_145779_a(var4, 1);
                        }
                    } catch (RuntimeException var5) {
                        throw a(var5);
                    }
                }
            }
        }

        private static RuntimeException a(RuntimeException var0) {
            return var0;
        }
    }
}
