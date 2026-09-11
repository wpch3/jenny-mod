package com.trolmastercard.sexmod;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.EntityInteract;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.LeftClickBlock;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.LeftClickEmpty;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class hj extends Item {
    public static final hj a = new hj();

    public hj() {
        this.func_77637_a(CreativeTabs.field_78040_i);
        this.field_77777_bU = 1;
    }

    public void func_77663_a(ItemStack var1, World var2, Entity var3, int var4, boolean var5) {
        try {
            if (var2.field_72995_K) {
                this.a(var3, var1);
            }
        } catch (RuntimeException var6) {
            throw a(var6);
        }

        super.func_77663_a(var1, var2, var3, var4, var5);
    }

    @SideOnly(Side.CLIENT)
    void a(Entity param1, ItemStack param2) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 1
        // 01: instanceof net/minecraft/entity/player/EntityPlayer
        // 04: ifne 0c
        // 07: return
        // 08: invokestatic com/trolmastercard/sexmod/hj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0b: athrow
        // 0c: aload 1
        // 0d: checkcast net/minecraft/entity/player/EntityPlayer
        // 10: astore 3
        // 11: aload 2
        // 12: aload 3
        // 13: invokevirtual net/minecraft/entity/player/EntityPlayer.func_184614_ca ()Lnet/minecraft/item/ItemStack;
        // 16: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
        // 19: ifne 38
        // 1c: aload 2
        // 1d: aload 3
        // 1e: invokevirtual net/minecraft/entity/player/EntityPlayer.func_184592_cb ()Lnet/minecraft/item/ItemStack;
        // 21: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
        // 24: ifne 38
        // 27: goto 2e
        // 2a: invokestatic com/trolmastercard/sexmod/hj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 2d: athrow
        // 2e: aload 2
        // 2f: bipush 0
        // 30: invokevirtual net/minecraft/item/ItemStack.func_77964_b (I)V
        // 33: return
        // 34: invokestatic com/trolmastercard/sexmod/hj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 37: athrow
        // 38: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
        // 3b: getfield net/minecraft/client/Minecraft.field_71476_x Lnet/minecraft/util/math/RayTraceResult;
        // 3e: astore 4
        // 40: aload 2
        // 41: aload 4
        // 43: ifnull 60
        // 46: aload 4
        // 48: getfield net/minecraft/util/math/RayTraceResult.field_72308_g Lnet/minecraft/entity/Entity;
        // 4b: invokestatic com/trolmastercard/sexmod/em.a (Lnet/minecraft/entity/Entity;)Z
        // 4e: ifeq 60
        // 51: goto 58
        // 54: invokestatic com/trolmastercard/sexmod/hj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 57: athrow
        // 58: bipush 1
        // 59: goto 61
        // 5c: invokestatic com/trolmastercard/sexmod/hj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 5f: athrow
        // 60: bipush 0
        // 61: invokevirtual net/minecraft/item/ItemStack.func_77964_b (I)V
        // 64: return
        // try (0 -> 4): 4 java/lang/RuntimeException
        // try (9 -> 19): 20 java/lang/RuntimeException
        // try (14 -> 26): 26 java/lang/RuntimeException
        // try (31 -> 38): 39 java/lang/RuntimeException
        // try (34 -> 43): 43 java/lang/RuntimeException
    }

    @SubscribeEvent
    public void a(EntityInteract param1) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 1
        // 01: invokevirtual net/minecraftforge/event/entity/player/PlayerInteractEvent$EntityInteract.getTarget ()Lnet/minecraft/entity/Entity;
        // 04: astore 2
        // 05: aload 2
        // 06: instanceof com/trolmastercard/sexmod/em
        // 09: ifne 11
        // 0c: return
        // 0d: invokestatic com/trolmastercard/sexmod/hj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 10: athrow
        // 11: aload 2
        // 12: invokestatic com/trolmastercard/sexmod/em.a (Lnet/minecraft/entity/Entity;)Z
        // 15: ifne 1d
        // 18: return
        // 19: invokestatic com/trolmastercard/sexmod/hj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 1c: athrow
        // 1d: aload 1
        // 1e: invokevirtual net/minecraftforge/event/entity/player/PlayerInteractEvent$EntityInteract.getEntityPlayer ()Lnet/minecraft/entity/player/EntityPlayer;
        // 21: astore 3
        // 22: aload 3
        // 23: ifnonnull 2b
        // 26: return
        // 27: invokestatic com/trolmastercard/sexmod/hj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 2a: athrow
        // 2b: aload 3
        // 2c: invokevirtual net/minecraft/entity/player/EntityPlayer.func_184614_ca ()Lnet/minecraft/item/ItemStack;
        // 2f: astore 4
        // 31: aload 4
        // 33: invokevirtual net/minecraft/item/ItemStack.func_77973_b ()Lnet/minecraft/item/Item;
        // 36: getstatic com/trolmastercard/sexmod/hj.a Lcom/trolmastercard/sexmod/hj;
        // 39: if_acmpeq 42
        // 3c: aload 3
        // 3d: invokevirtual net/minecraft/entity/player/EntityPlayer.func_184592_cb ()Lnet/minecraft/item/ItemStack;
        // 40: astore 4
        // 42: aload 4
        // 44: invokevirtual net/minecraft/item/ItemStack.func_77973_b ()Lnet/minecraft/item/Item;
        // 47: getstatic com/trolmastercard/sexmod/hj.a Lcom/trolmastercard/sexmod/hj;
        // 4a: if_acmpeq 52
        // 4d: return
        // 4e: invokestatic com/trolmastercard/sexmod/hj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 51: athrow
        // 52: aload 1
        // 53: bipush 1
        // 54: invokevirtual net/minecraftforge/event/entity/player/PlayerInteractEvent$EntityInteract.setCanceled (Z)V
        // 57: aload 1
        // 58: invokevirtual net/minecraftforge/event/entity/player/PlayerInteractEvent$EntityInteract.getWorld ()Lnet/minecraft/world/World;
        // 5b: getfield net/minecraft/world/World.field_72995_K Z
        // 5e: ifne 66
        // 61: return
        // 62: invokestatic com/trolmastercard/sexmod/hj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 65: athrow
        // 66: getstatic com/trolmastercard/sexmod/br.d Z
        // 69: ifeq 92
        // 6c: bipush 0
        // 6d: bipush 1
        // 6e: invokestatic com/trolmastercard/sexmod/br.b (Z)I
        // 71: if_icmpeq 83
        // 74: goto 7b
        // 77: invokestatic com/trolmastercard/sexmod/hj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 7a: athrow
        // 7b: bipush 1
        // 7c: goto 84
        // 7f: invokestatic com/trolmastercard/sexmod/hj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 82: athrow
        // 83: bipush 0
        // 84: putstatic com/trolmastercard/sexmod/br.d Z
        // 87: getstatic com/trolmastercard/sexmod/br.d Z
        // 8a: ifeq 92
        // 8d: return
        // 8e: invokestatic com/trolmastercard/sexmod/hj.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 91: athrow
        // 92: aload 2
        // 93: checkcast com/trolmastercard/sexmod/em
        // 96: invokevirtual com/trolmastercard/sexmod/em.E ()Lcom/trolmastercard/sexmod/em;
        // 99: invokestatic com/trolmastercard/sexmod/a.a (Lcom/trolmastercard/sexmod/em;)V
        // 9c: return
        // try (3 -> 7): 7 java/lang/RuntimeException
        // try (9 -> 13): 13 java/lang/RuntimeException
        // try (18 -> 21): 21 java/lang/RuntimeException
        // try (33 -> 38): 38 java/lang/RuntimeException
        // try (40 -> 48): 48 java/lang/RuntimeException
        // try (50 -> 56): 57 java/lang/RuntimeException
        // try (52 -> 61): 61 java/lang/RuntimeException
        // try (64 -> 68): 68 java/lang/RuntimeException
    }

    @SubscribeEvent
    public void a(AttackEntityEvent var1) {
        Entity var2 = var1.getTarget();

        try {
            if (var2 == null) {
                return;
            }
        } catch (RuntimeException var10) {
            throw a(var10);
        }

        try {
            if (!(var2 instanceof em)) {
                return;
            }
        } catch (RuntimeException var12) {
            throw a(var12);
        }

        EntityPlayer var3 = var1.getEntityPlayer();

        try {
            if (var3 == null) {
                return;
            }
        } catch (RuntimeException var9) {
            throw a(var9);
        }

        ItemStack var4 = var3.func_184614_ca();
        if (var4.func_77973_b() != a) {
            var4 = var3.func_184592_cb();
        }

        try {
            if (var4.func_77973_b() != a) {
                return;
            }
        } catch (RuntimeException var8) {
            throw a(var8);
        }

        try {
            var1.setCanceled(true);
            if (!var3.field_70170_p.field_72995_K) {
                return;
            }
        } catch (RuntimeException var11) {
            throw a(var11);
        }

        em var5 = (em)var2;
        String var6 = var5.C();
        String var7 = em.c(em.h(var5.f()));
        var3.func_145747_a(new TextComponentString(String.format("%s's model-code: %s%s$%s", var5.c(), TextFormatting.YELLOW, var6, var7)));
        var3.func_145747_a(new TextComponentString(TextFormatting.ITALIC + "copied to clipboard"));
        be.a(String.format("%s$%s", var6, var7));
    }

    @SubscribeEvent
    public void a(LeftClickBlock var1) {
        try {
            if (this.a(var1.getEntityPlayer(), var1.getWorld())) {
                var1.setCanceled(true);
            }
        } catch (RuntimeException var2) {
            throw a(var2);
        }
    }

    @SubscribeEvent
    public void a(LeftClickEmpty var1) {
        this.a(var1.getEntityPlayer(), var1.getWorld());
    }

    boolean a(EntityPlayer var1, World var2) {
        try {
            if (var1 == null) {
                return false;
            }
        } catch (RuntimeException var8) {
            throw a(var8);
        }

        ItemStack var3 = var1.func_184614_ca();
        if (var3.func_77973_b() != a) {
            var3 = var1.func_184592_cb();
        }

        try {
            if (var3.func_77973_b() != a) {
                return false;
            }
        } catch (RuntimeException var7) {
            throw a(var7);
        }

        try {
            if (!var2.field_72995_K) {
                return true;
            }
        } catch (RuntimeException var10) {
            throw a(var10);
        }

        ei var4 = ei.d(var1.getPersistentID());

        try {
            if (var4 == null) {
                var1.func_146105_b(new TextComponentString("you gotta turn into the girl, you want to copy the model-code off"), true);
                return true;
            }
        } catch (RuntimeException var9) {
            throw a(var9);
        }

        String var5 = var4.C();
        String var6 = em.c(em.h(var4.f()));
        var1.func_145747_a(new TextComponentString(String.format("%s's model-code: %s%s$%s", be.b(fy.a(var4).toString()), TextFormatting.YELLOW, var5, var6)));
        var1.func_145747_a(new TextComponentString(TextFormatting.ITALIC + "copied to clipboard"));
        be.a(String.format("%s$%s", var5, var6));
        return true;
    }

    public static void a() {
        a.setRegistryName("sexmod", "npc_editor_wand");
        a.func_77655_b("npc_editor_wand");
        MinecraftForge.EVENT_BUS.register(hj.class);
    }

    @SubscribeEvent
    public static void a(Register<Item> var0) {
        var0.getRegistry().register(a);
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void a(ModelRegistryEvent var0) {
        ModelLoader.setCustomModelResourceLocation(a, 0, new ModelResourceLocation("sexmod:npc_editor_wand"));
        ModelLoader.setCustomModelResourceLocation(a, 1, new ModelResourceLocation("sexmod:npc_editor_wand_active"));
    }

    private static RuntimeException a(RuntimeException var0) {
        return var0;
    }
}
