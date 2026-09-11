package com.trolmastercard.sexmod.e;

import com.trolmastercard.sexmod.b.f;
import com.trolmastercard.sexmod.f.b.g;
import com.trolmastercard.sexmod.f.b.k;
import com.trolmastercard.sexmod.h.h;
import com.trolmastercard.sexmod.h.i;
import java.io.File;
import java.nio.file.Files;
import java.util.HashSet;
import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.phys.Vec3;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ClientTickEvent.Post;

@EventBusSubscriber(modid = "sexmod", value = Dist.CLIENT)
public final class d {
    static boolean a = false;
    static boolean b = false;
    static boolean c = false;
    static com.trolmastercard.sexmod.f.b.e d = null;
    static int e = 0;
    static ItemStack f = null;
    static k g = null;
    static boolean h = false;
    static boolean i = false;

    private d() {
    }

    @SubscribeEvent
    public static void onClientTick(Post var0) {
        if (!a || g != null) {
            if (!a || !i) {
                File var1 = new File("gui.target");
                if (var1.exists()) {
                    Minecraft var2 = Minecraft.getInstance();
                    if (var2.player != null && var2.level != null) {
                        if (!b) {
                            b = true;

                            String var3;
                            try {
                                var3 = new String(Files.readAllBytes(var1.toPath())).trim();
                            } catch (Exception var11) {
                                a("marker read failed: " + var11);
                                return;
                            }

                            a("opening " + var3);
                            switch (var3) {
                                case "AROUSAL":
                                    c = true;
                                    com.trolmastercard.sexmod.b.f.a = true;
                                    com.trolmastercard.sexmod.b.f.b();
                                    break;
                                case "CHARSELECT":
                                    var2.setScreen(new com.trolmastercard.sexmod.h.d());
                                    break;
                                case "TRIBENAME":
                                    com.trolmastercard.sexmod.h.i.a(UUID.randomUUID());
                                    break;
                                case "BEE":
                                    com.trolmastercard.sexmod.f.b.b var22 = (com.trolmastercard.sexmod.f.b.b)((EntityType)com.trolmastercard.sexmod.i.b.p.get())
                                        .create(var2.level);
                                    if (var22 != null) {
                                        com.trolmastercard.sexmod.h.b.a(var22, var2.player);
                                    } else {
                                        a("BEE preview entity create() returned null");
                                    }
                                    break;
                                case "NPCINTERACT":
                                    g var21 = (g)((EntityType)com.trolmastercard.sexmod.i.b.b.get()).create(var2.level);
                                    if (var21 != null) {
                                        var2.setScreen(new h(var21, var2.player));
                                    } else {
                                        a("NPCINTERACT preview entity create() returned null");
                                    }
                                    break;
                                case "STORAGE":
                                    com.trolmastercard.sexmod.f.b.b var20 = (com.trolmastercard.sexmod.f.b.b)((EntityType)com.trolmastercard.sexmod.i.b.p.get())
                                        .create(var2.level);
                                    if (var20 != null) {
                                        com.trolmastercard.sexmod.j.b var24 = new com.trolmastercard.sexmod.j.b(0, var2.player.getInventory(), var20);
                                        var2.setScreen(new com.trolmastercard.sexmod.h.f(var24, var2.player.getInventory(), Component.literal("Storage")));
                                    } else {
                                        a("STORAGE preview entity create() returned null");
                                    }
                                    break;
                                case "DRAGONSTAFF":
                                    BlockPos var19 = var2.player.blockPosition().below();
                                    com.trolmastercard.sexmod.h.g.a(var19, Direction.UP);
                                    break;
                                case "HIGHLIGHT":
                                    var2.player.setItemInHand(InteractionHand.MAIN_HAND, new ItemStack((ItemLike)com.trolmastercard.sexmod.i.c.v.get()));
                                    BlockPos var18 = var2.player.blockPosition();
                                    HashSet var23 = new HashSet();

                                    for (int var8 = -3; var8 <= 3; var8++) {
                                        for (int var9 = -3; var9 <= 3; var9++) {
                                            var23.add(var18.offset(var8, -1, var9));
                                        }
                                    }

                                    com.trolmastercard.sexmod.b.a.a(var23);
                                    break;
                                case "COINGIFT":
                                    var2.player.setYRot(180.0F);
                                    var2.player.setXRot(0.0F);
                                    com.trolmastercard.sexmod.f.b.e var17 = (com.trolmastercard.sexmod.f.b.e)((EntityType)com.trolmastercard.sexmod.i.b.t.get())
                                        .create(var2.level);
                                    if (var17 != null) {
                                        var17.setPos(var2.player.getX(), var2.player.getY() + 1.0, var2.player.getZ() - 3.0);
                                        d = var17;
                                    } else {
                                        a("COINGIFT preview entity create() returned null");
                                    }
                                    break;
                                case "ENERGYBALL":
                                    var2.player.setYRot(180.0F);
                                    var2.player.setXRot(0.0F);
                                    Vec3 var16 = new Vec3(0.0, 0.0, -0.1);
                                    com.trolmastercard.sexmod.f.b var7 = new com.trolmastercard.sexmod.f.b(
                                        (EntityType<? extends Mob>)com.trolmastercard.sexmod.i.b.A.get(), var2.level, null, var16
                                    );
                                    var7.setPos(var2.player.getX(), var2.player.getY() + 1.0, var2.player.getZ() - 3.0);
                                    var2.level.addFreshEntity(var7);
                                    break;
                                case "CHAREDIT":
                                    g var6 = (g)((EntityType)com.trolmastercard.sexmod.i.b.b.get()).create(var2.level);
                                    if (var6 != null) {
                                        g = var6;
                                        com.trolmastercard.sexmod.h.c.a(var6);
                                    } else {
                                        a("CHAREDIT preview entity create() returned null");
                                    }
                                    break;
                                case "COIN":
                                    f = new ItemStack((ItemLike)com.trolmastercard.sexmod.i.c.s.get());
                                    break;
                                case "LAMP":
                                    f = new ItemStack((ItemLike)com.trolmastercard.sexmod.i.c.u.get());
                                    break;
                                case "LAMPRUB":
                                    f = new ItemStack((ItemLike)com.trolmastercard.sexmod.i.c.u.get());
                                    var2.player.getPersistentData().putBoolean("sexmodAllieInUse", true);
                                    break;
                                case "STAFF":
                                    f = new ItemStack((ItemLike)com.trolmastercard.sexmod.i.c.v.get());
                                    break;
                                case "EMPTYHAND":
                                    f = ItemStack.EMPTY;
                                    break;
                                default:
                                    a("unknown gui.target: " + var3);
                            }
                        }

                        if (f != null) {
                            var2.player.setYRot(180.0F);
                            var2.player.setXRot(0.0F);

                            for (Entity var14 : var2.level.getEntities((Entity)null, var2.player.getBoundingBox().inflate(16.0), var1x -> var1x != var2.player)) {
                                var14.discard();
                            }

                            var2.player.setItemInHand(InteractionHand.MAIN_HAND, f);
                        }

                        if (c) {
                            com.trolmastercard.sexmod.b.f.d();
                        }

                        if (d != null && e % 10 == 0) {
                            com.trolmastercard.sexmod.b.b.a(d);
                        }

                        if (++e > 40 && !a) {
                            a = true;
                            a();
                        }

                        if (g != null && !i) {
                            if (!h && e == 440) {
                                h = true;
                                a("CHAREDIT control: re-opening for a fresh registry read");
                                com.trolmastercard.sexmod.h.c.a(g);
                            }

                            if (h && e == 460 && Minecraft.getInstance().screen instanceof com.trolmastercard.sexmod.h.c var13) {
                                a("CHAREDIT control: cycling HEAD row to prove the registered model is selectable");
                                var13.a(com.trolmastercard.sexmod.h.a.b);
                            }

                            if (h && e > 480) {
                                i = true;

                                try {
                                    new File("gui.done2").createNewFile();
                                } catch (Exception var10) {
                                    a("writeDone2 failed: " + var10);
                                }

                                a("CHAREDIT control done -> gui.done2");
                            }
                        }
                    }
                }
            }
        }
    }

    static void a() {
        try {
            new File("gui.done").createNewFile();
        } catch (Exception var1) {
            a("writeDone failed: " + var1);
        }
    }

    static void a(String var0) {
        System.out.println("[GUITEST] " + var0);
    }
}
