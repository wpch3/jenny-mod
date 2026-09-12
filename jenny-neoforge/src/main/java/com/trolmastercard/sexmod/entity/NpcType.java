package com.trolmastercard.sexmod.entity;

import net.minecraft.world.entity.Entity;

public enum NpcType {
    a(com.trolmastercard.sexmod.entity.JennyEntity.class, 177013, com.trolmastercard.sexmod.entity.player.PlayerJennyEntity.class, 12388645),
    b(com.trolmastercard.sexmod.entity.EllieEntity.class, 228922, com.trolmastercard.sexmod.entity.player.PlayerEllieEntity.class, 46348348),
    c(com.trolmastercard.sexmod.entity.BiaEntity.class, 230053, com.trolmastercard.sexmod.entity.player.PlayerBiaEntity.class, 65456415),
    d(com.trolmastercard.sexmod.entity.SlimeGirlEntity.class, 168597, com.trolmastercard.sexmod.entity.player.PlayerSlimeEntity.class, 54816432),
    e(com.trolmastercard.sexmod.entity.BeeEntity.class, 4663354, com.trolmastercard.sexmod.entity.player.PlayerBeeEntity.class, 48648638),
    f(com.trolmastercard.sexmod.entity.AllieEntity.class, 5614613, com.trolmastercard.sexmod.entity.player.PlayerAllieEntity.class, 64867483),
    g(com.trolmastercard.sexmod.entity.LunaEntity.class, 6816463, com.trolmastercard.sexmod.entity.player.PlayerLunaEntity.class, 81234824),
    h(com.trolmastercard.sexmod.entity.KoboldEntity.class, 5648456, com.trolmastercard.sexmod.entity.player.PlayerKoboldEntity.class, 62484851, true),
    i(com.trolmastercard.sexmod.entity.GoblinEntity.class, 4567275, com.trolmastercard.sexmod.entity.player.PlayerGoblinEntity.class, 6584344, true),
    j(com.trolmastercard.sexmod.entity.GalathEntity.class, 314351, com.trolmastercard.sexmod.entity.player.PlayerGalathEntity.class, 652535516),
    k(com.trolmastercard.sexmod.entity.ManglelieEntity.class, 618151);

    public final int l;
    public final int m;
    public final Class<? extends com.trolmastercard.sexmod.entity.GirlEntity> n;
    public final Class<? extends com.trolmastercard.sexmod.entity.player.PlayerGirlEntity> o;
    public final boolean p;
    public final int q;
    public final boolean r;

    NpcType(Class<? extends com.trolmastercard.sexmod.entity.GirlEntity> var3, int var4, Class<? extends com.trolmastercard.sexmod.entity.player.PlayerGirlEntity> var5, int var6, boolean var7) {
        this.l = var4;
        this.m = var6;
        this.n = var3;
        this.o = var5;
        this.p = false;
        this.r = var7;
        this.q = com.trolmastercard.sexmod.util.ModState.b++;
    }

    NpcType(Class<? extends com.trolmastercard.sexmod.entity.GirlEntity> var3, int var4, Class<? extends com.trolmastercard.sexmod.entity.player.PlayerGirlEntity> var5, int var6) {
        this.l = var4;
        this.m = var6;
        this.n = var3;
        this.o = var5;
        this.p = false;
        this.r = false;
        this.q = com.trolmastercard.sexmod.util.ModState.b++;
    }

    NpcType(Class<? extends com.trolmastercard.sexmod.entity.GirlEntity> var3, int var4) {
        this.l = var4;
        this.n = var3;
        this.p = true;
        this.r = false;
        this.q = com.trolmastercard.sexmod.util.ModState.b++;
        this.o = null;
        this.m = 0;
    }

    public static NpcType a(String var0) {
        for (NpcType var4 : values()) {
            if (var4.toString().equalsIgnoreCase(var0)) {
                return var4;
            }
        }

        return a;
    }

    public static NpcType a(Entity var0) {
        if (var0 instanceof com.trolmastercard.sexmod.entity.GirlEntity var1) {
            Class var2 = var1.getClass();

            for (NpcType var6 : values()) {
                if (var2.equals(var6.n)) {
                    return var6;
                }

                if (var2.equals(var6.o)) {
                    return var6;
                }
            }

            return null;
        } else {
            return null;
        }
    }
}
