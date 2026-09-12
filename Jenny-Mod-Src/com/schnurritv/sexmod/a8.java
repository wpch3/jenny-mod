package com.schnurritv.sexmod;

import java.util.ArrayList;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHandSide;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.util.MatrixStack;

public class a8 extends EntityLivingBase implements IAnimatable {
   static final float c = 11000.0F;
   public static final DataParameter<String> b = EntityDataManager.func_187226_a(a8.class, DataSerializers.field_187194_d).func_187156_b().func_187161_a(101);
   public static final DataParameter<String> e = EntityDataManager.func_187226_a(a8.class, DataSerializers.field_187194_d).func_187156_b().func_187161_a(102);
   AnimationFactory f = new AnimationFactory(this);
   public boolean d = false;
   public MatrixStack g = new MatrixStack();
   bQ a = null;

   public a8(World var1) {
      super(var1);
      this.field_70130_N = 0.1F;
      this.field_70131_O = 0.1F;
   }

   public a8(World var1, UUID var2, String var3) {
      this(var1);
      this.field_70180_af.func_187227_b(b, var2.toString());
      this.field_70180_af.func_187227_b(e, var3);
   }

   public static a8 a(World var0, UUID var1, bQ var2) {
      a8 var3 = new a8(var0);
      var3.func_184212_Q().func_187227_b(b, var1.toString());
      var3.d = true;
      var3.a = var2;
      return var3;
   }

   protected void func_70088_a() {
      super.func_70088_a();
      this.field_70180_af.func_187214_a(b, "");
      this.field_70180_af.func_187214_a(e, "");
   }

   public AxisAlignedBB func_184177_bl() {
      BlockPos var1 = this.func_180425_c();
      Vec3i var2 = new Vec3i(0.5, 0.5, 0.5);
      return new AxisAlignedBB(var1.func_177973_b(var2), var1.func_177971_a(var2));
   }

   @SideOnly(Side.CLIENT)
   public boolean func_145770_h(double var1, double var3, double var5) {
      double var7 = this.field_70165_t - var1;
      double var9 = this.field_70163_u - var3;
      double var11 = this.field_70161_v - var5;
      double var13 = var7 * var7 + var9 * var9 + var11 * var11;
      return this.func_70112_a(var13);
   }

   @SideOnly(Side.CLIENT)
   public boolean func_70112_a(double var1) {
      try {
         if (var1 < 11000.0) {
            return true;
         }
      } catch (RuntimeException var3) {
         throw a(var3);
      }

      return false;
   }

   @Nullable
   public UUID a() {
      String var1 = (String)this.field_70180_af.func_187225_a(b);

      try {
         if ("".equals(var1)) {
            return null;
         }
      } catch (RuntimeException var2) {
         throw a(var2);
      }

      return UUID.fromString(var1);
   }

   public boolean func_70097_a(DamageSource var1, float var2) {
      try {
         if (var1 != DamageSource.field_76380_i) {
            return false;
         }
      } catch (RuntimeException var3) {
         throw a(var3);
      }

      return super.func_70097_a(var1, var2);
   }

   @Nullable
   public String b() {
      String var1 = (String)this.field_70180_af.func_187225_a(e);

      try {
         return "".equals(var1) ? null : var1;
      } catch (RuntimeException var2) {
         throw a(var2);
      }
   }

   public boolean func_70104_M() {
      return false;
   }

   public boolean func_70067_L() {
      return false;
   }

   public void func_70645_a(DamageSource var1) {
      super.func_70645_a(var1);
   }

   @Override
   public AnimationFactory getFactory() {
      return this.f;
   }

   @Override
   public void registerControllers(AnimationData var1) {
   }

   public Iterable<ItemStack> func_184193_aE() {
      return new ArrayList<>();
   }

   public ItemStack func_184582_a(EntityEquipmentSlot var1) {
      return ItemStack.field_190927_a;
   }

   public void func_184201_a(EntityEquipmentSlot var1, ItemStack var2) {
   }

   public EnumHandSide func_184591_cq() {
      return EnumHandSide.LEFT;
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }
}
