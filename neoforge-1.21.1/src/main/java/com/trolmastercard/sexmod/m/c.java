package com.trolmastercard.sexmod.m;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.Vec3;

public class c extends DamageSource {
    private final com.trolmastercard.sexmod.f.b.e a;
    private final Vec3 b;

    public c(com.trolmastercard.sexmod.f.b.e var1) {
        super(var1.level().registryAccess().lookupOrThrow(Registries.DAMAGE_TYPE).getOrThrow(DamageTypes.GENERIC_KILL), var1, var1, var1.position());
        this.a = var1;
        this.b = var1.position();
    }

    public Component getLocalizedDeathMessage(LivingEntity var1) {
        return Component.literal(var1.getName().getString() + " got his cum drained by a Succubus");
    }

    public Vec3 getSourcePosition() {
        return this.b;
    }
}
