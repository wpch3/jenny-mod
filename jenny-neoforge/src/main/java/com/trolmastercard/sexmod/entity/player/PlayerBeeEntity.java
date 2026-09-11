package com.trolmastercard.sexmod.entity.player;

import com.trolmastercard.sexmod.entity.FriendlySlimeEntity;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.animation.PlayState;
import software.bernie.geckolib.animation.AnimatableManager.ControllerRegistrar;

public class PlayerBeeEntity extends PlayerGirlEntity {
    public PlayerBeeEntity(EntityType<? extends PathfinderMob> var1, Level var2) {
        super(var1, var2);
    }

    @Override
    public void r() {
        this.a(true);
    }

    public EntityDimensions getDefaultDimensions(Pose var1) {
        return super.getDefaultDimensions(var1).withEyeHeight(1.3F);
    }

    @Override
    public boolean a(Player var1) {
        com.trolmastercard.sexmod.entity.GirlEntity.a(var1, this, new String[]{"action.names.sex"}, false);
        return true;
    }

    @Override
    public void c(com.trolmastercard.sexmod.entity.ScenePose var1) {
        com.trolmastercard.sexmod.entity.ScenePose var2 = this.ai();
        if (var2 != com.trolmastercard.sexmod.entity.ScenePose.au || var1 != com.trolmastercard.sexmod.entity.ScenePose.at && var1 != com.trolmastercard.sexmod.entity.ScenePose.x) {
            super.c(var1);
        }
    }

    @Override
    protected com.trolmastercard.sexmod.entity.ScenePose a_(com.trolmastercard.sexmod.entity.ScenePose var1) {
        return var1 == com.trolmastercard.sexmod.entity.ScenePose.as ? com.trolmastercard.sexmod.entity.ScenePose.at : null;
    }

    @Override
    protected com.trolmastercard.sexmod.entity.ScenePose b(com.trolmastercard.sexmod.entity.ScenePose var1) {
        return var1 != com.trolmastercard.sexmod.entity.ScenePose.at && var1 != com.trolmastercard.sexmod.entity.ScenePose.as ? null : com.trolmastercard.sexmod.entity.ScenePose.au;
    }

    @Override
    public void a_() {
        super.a_();
        this.d(1);
    }

    @Override
    protected PlayState a(AnimationState<com.trolmastercard.sexmod.entity.GirlEntity> var1) {
        String var2 = var1.getController().getName();
        switch (var2) {
            case "movement":
                if (this.ai() == com.trolmastercard.sexmod.entity.ScenePose.a) {
                    this.a("animation.bee.idle", true, var1);
                } else {
                    this.a("animation.bee.null", true, var1);
                }
                break;
            case "action":
                switch (this.ai()) {
                    case ar:
                        this.a("animation.bee.sex_start", false, var1);
                        break;
                    case as:
                        this.a("animation.bee.sex_slow", true, var1);
                        break;
                    case at:
                        this.a("animation.bee.sex_fast", true, var1);
                        break;
                    case au:
                        this.a("animation.bee.sex_cum", false, var1);
                        break;
                    case E:
                        this.a("animation.bee.throw_pearl", true, var1);
                }
        }

        return PlayState.CONTINUE;
    }

    @Override
    public void registerControllers(ControllerRegistrar var1) {
        super.registerControllers(var1);
        this.aB.setSoundKeyframeHandler(var0 -> {});
    }
}
