package com.trolmastercard.sexmod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickItem;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class hy extends Item implements IAnimatable {
    public static final hy b = new hy();
    private final AnimationFactory a = new AnimationFactory(this);

    public hy() {
        this.func_77637_a(CreativeTabs.field_78040_i);
        this.field_77777_bU = 1;
    }

    public static void a() {
        b.setRegistryName("sexmod", "dragon_staff");
        b.func_77655_b("dragon_staff");
        MinecraftForge.EVENT_BUS.register(hy.class);
    }

    public ActionResult<ItemStack> func_77659_a(World var1, EntityPlayer var2, EnumHand var3) {
        return new ActionResult(EnumActionResult.FAIL, var2.func_184586_b(var3));
    }

    @SubscribeEvent
    public static void a(Register<Item> var0) {
        var0.getRegistry().register(b);
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void a(ModelRegistryEvent var0) {
        ModelLoader.setCustomModelResourceLocation(b, 0, new ModelResourceLocation("sexmod:dragon_staff"));
        b.setTileEntityItemStackRenderer(new fa());
    }

    @Override
    public void registerControllers(AnimationData var1) {
    }

    @Override
    public AnimationFactory getFactory() {
        return this.a;
    }

    public static class a {
        @SubscribeEvent
        public void a(RightClickItem param1) {
            // $VF: Couldn't be decompiled
            // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
            // java.lang.RuntimeException: parsing failure!
            //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
            //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
            //
            // Bytecode:
            // 00: aload 1
            // 01: invokevirtual net/minecraftforge/event/entity/player/PlayerInteractEvent$RightClickItem.getWorld ()Lnet/minecraft/world/World;
            // 04: astore 2
            // 05: aload 2
            // 06: getfield net/minecraft/world/World.field_72995_K Z
            // 09: ifne 11
            // 0c: return
            // 0d: invokestatic com/trolmastercard/sexmod/hy$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 10: athrow
            // 11: aload 1
            // 12: invokevirtual net/minecraftforge/event/entity/player/PlayerInteractEvent$RightClickItem.getEntityPlayer ()Lnet/minecraft/entity/player/EntityPlayer;
            // 15: astore 3
            // 16: aload 3
            // 17: getstatic net/minecraft/util/EnumHand.MAIN_HAND Lnet/minecraft/util/EnumHand;
            // 1a: invokevirtual net/minecraft/entity/player/EntityPlayer.func_184586_b (Lnet/minecraft/util/EnumHand;)Lnet/minecraft/item/ItemStack;
            // 1d: invokevirtual net/minecraft/item/ItemStack.func_77973_b ()Lnet/minecraft/item/Item;
            // 20: getstatic com/trolmastercard/sexmod/hy.b Lcom/trolmastercard/sexmod/hy;
            // 23: if_acmpeq 42
            // 26: aload 3
            // 27: getstatic net/minecraft/util/EnumHand.OFF_HAND Lnet/minecraft/util/EnumHand;
            // 2a: invokevirtual net/minecraft/entity/player/EntityPlayer.func_184586_b (Lnet/minecraft/util/EnumHand;)Lnet/minecraft/item/ItemStack;
            // 2d: invokevirtual net/minecraft/item/ItemStack.func_77973_b ()Lnet/minecraft/item/Item;
            // 30: getstatic com/trolmastercard/sexmod/hy.b Lcom/trolmastercard/sexmod/hy;
            // 33: if_acmpeq 42
            // 36: goto 3d
            // 39: invokestatic com/trolmastercard/sexmod/hy$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 3c: athrow
            // 3d: return
            // 3e: invokestatic com/trolmastercard/sexmod/hy$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 41: athrow
            // 42: getstatic com/trolmastercard/sexmod/ff.aY Ljava/util/List;
            // 45: invokeinterface java/util/List.isEmpty ()Z 1
            // 4a: ifeq 52
            // 4d: return
            // 4e: invokestatic com/trolmastercard/sexmod/hy$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 51: athrow
            // 52: aload 0
            // 53: invokevirtual com/trolmastercard/sexmod/hy$a.a ()V
            // 56: return
            // try (3 -> 7): 7 java/lang/RuntimeException
            // try (12 -> 24): 25 java/lang/RuntimeException
            // try (18 -> 28): 28 java/lang/RuntimeException
            // try (30 -> 34): 34 java/lang/RuntimeException
        }

        @SideOnly(Side.CLIENT)
        void a() {
            Minecraft.func_71410_x().func_147108_a(new j());
            ge.b.sendToServer(new b3());
        }

        @SubscribeEvent
        public void a(RightClickBlock param1) {
            // $VF: Couldn't be decompiled
            // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
            // java.lang.RuntimeException: parsing failure!
            //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
            //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
            //
            // Bytecode:
            // 00: aload 1
            // 01: invokevirtual net/minecraftforge/event/entity/player/PlayerInteractEvent$RightClickBlock.getEntityPlayer ()Lnet/minecraft/entity/player/EntityPlayer;
            // 04: astore 2
            // 05: aload 2
            // 06: getstatic net/minecraft/util/EnumHand.MAIN_HAND Lnet/minecraft/util/EnumHand;
            // 09: invokevirtual net/minecraft/entity/player/EntityPlayer.func_184586_b (Lnet/minecraft/util/EnumHand;)Lnet/minecraft/item/ItemStack;
            // 0c: invokevirtual net/minecraft/item/ItemStack.func_77973_b ()Lnet/minecraft/item/Item;
            // 0f: getstatic com/trolmastercard/sexmod/hy.b Lcom/trolmastercard/sexmod/hy;
            // 12: if_acmpeq 31
            // 15: aload 2
            // 16: getstatic net/minecraft/util/EnumHand.OFF_HAND Lnet/minecraft/util/EnumHand;
            // 19: invokevirtual net/minecraft/entity/player/EntityPlayer.func_184586_b (Lnet/minecraft/util/EnumHand;)Lnet/minecraft/item/ItemStack;
            // 1c: invokevirtual net/minecraft/item/ItemStack.func_77973_b ()Lnet/minecraft/item/Item;
            // 1f: getstatic com/trolmastercard/sexmod/hy.b Lcom/trolmastercard/sexmod/hy;
            // 22: if_acmpeq 31
            // 25: goto 2c
            // 28: invokestatic com/trolmastercard/sexmod/hy$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 2b: athrow
            // 2c: return
            // 2d: invokestatic com/trolmastercard/sexmod/hy$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 30: athrow
            // 31: aload 1
            // 32: invokevirtual net/minecraftforge/event/entity/player/PlayerInteractEvent$RightClickBlock.getWorld ()Lnet/minecraft/world/World;
            // 35: aload 1
            // 36: invokevirtual net/minecraftforge/event/entity/player/PlayerInteractEvent$RightClickBlock.getPos ()Lnet/minecraft/util/math/BlockPos;
            // 39: invokevirtual net/minecraft/world/World.func_180495_p (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
            // 3c: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c ()Lnet/minecraft/block/Block; 1
            // 41: astore 3
            // 42: aload 3
            // 43: instanceof net/minecraft/block/BlockBed
            // 46: ifeq 63
            // 49: aload 1
            // 4a: getstatic net/minecraft/util/EnumActionResult.FAIL Lnet/minecraft/util/EnumActionResult;
            // 4d: invokevirtual net/minecraftforge/event/entity/player/PlayerInteractEvent$RightClickBlock.setCancellationResult (Lnet/minecraft/util/EnumActionResult;)V
            // 50: aload 1
            // 51: getstatic net/minecraftforge/fml/common/eventhandler/Event$Result.DENY Lnet/minecraftforge/fml/common/eventhandler/Event$Result;
            // 54: invokevirtual net/minecraftforge/event/entity/player/PlayerInteractEvent$RightClickBlock.setResult (Lnet/minecraftforge/fml/common/eventhandler/Event$Result;)V
            // 57: aload 1
            // 58: bipush 1
            // 59: invokevirtual net/minecraftforge/event/entity/player/PlayerInteractEvent$RightClickBlock.setCanceled (Z)V
            // 5c: goto 63
            // 5f: invokestatic com/trolmastercard/sexmod/hy$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 62: athrow
            // 63: aload 3
            // 64: instanceof net/minecraft/block/BlockChest
            // 67: ifeq 84
            // 6a: aload 1
            // 6b: getstatic net/minecraft/util/EnumActionResult.FAIL Lnet/minecraft/util/EnumActionResult;
            // 6e: invokevirtual net/minecraftforge/event/entity/player/PlayerInteractEvent$RightClickBlock.setCancellationResult (Lnet/minecraft/util/EnumActionResult;)V
            // 71: aload 1
            // 72: getstatic net/minecraftforge/fml/common/eventhandler/Event$Result.DENY Lnet/minecraftforge/fml/common/eventhandler/Event$Result;
            // 75: invokevirtual net/minecraftforge/event/entity/player/PlayerInteractEvent$RightClickBlock.setResult (Lnet/minecraftforge/fml/common/eventhandler/Event$Result;)V
            // 78: aload 1
            // 79: bipush 1
            // 7a: invokevirtual net/minecraftforge/event/entity/player/PlayerInteractEvent$RightClickBlock.setCanceled (Z)V
            // 7d: goto 84
            // 80: invokestatic com/trolmastercard/sexmod/hy$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 83: athrow
            // 84: return
            // try (3 -> 15): 16 java/lang/RuntimeException
            // try (9 -> 19): 19 java/lang/RuntimeException
            // try (28 -> 40): 41 java/lang/RuntimeException
            // try (43 -> 55): 56 java/lang/RuntimeException
        }

        private static RuntimeException a(RuntimeException var0) {
            return var0;
        }
    }
}
