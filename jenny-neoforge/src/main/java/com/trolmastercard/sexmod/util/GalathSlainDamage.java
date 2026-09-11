package com.trolmastercard.sexmod.util;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.Vec3;

public class GalathSlainDamage extends DamageSource {
    private final com.trolmastercard.sexmod.entity.GalathEntity a;
    private final Vec3 b;

    public GalathSlainDamage(com.trolmastercard.sexmod.entity.GalathEntity var1) {
        super(var1.level().registryAccess().lookupOrThrow(Registries.DAMAGE_TYPE).getOrThrow(DamageTypes.MOB_ATTACK), var1, var1, var1.position());
        this.a = var1;
        this.b = var1.position();
    }

    public Component getLocalizedDeathMessage(LivingEntity var1) {
        return Component.literal(var1.getName().getString() + " was slain by Galath");
    }

    public Vec3 getSourcePosition() {
        return this.b;
    }
}
