package com.trolmastercard.sexmod;

import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ah {
    @SubscribeEvent
    public void b(LivingAttackEvent var1) {
        try {
            if (var1.getSource() == DamageSource.field_76380_i) {
                return;
            }
        } catch (RuntimeException var3) {
            throw a(var3);
        }

        try {
            if (!(var1.getEntity() instanceof em)) {
                return;
            }
        } catch (RuntimeException var6) {
            throw a(var6);
        }

        em var2 = (em)var1.getEntity();

        try {
            if (var2 instanceof ei) {
                var1.setCanceled(true);
                return;
            }
        } catch (RuntimeException var5) {
            throw a(var5);
        }

        LivingAttackEvent var10000;
        boolean var10001;
        label32: {
            try {
                var10000 = var1;
                if (var2.ae() != null) {
                    var10001 = true;
                    break label32;
                }
            } catch (RuntimeException var4) {
                throw a(var4);
            }

            var10001 = false;
        }

        var10000.setCanceled(var10001);
    }

    @SubscribeEvent
    public void a(LivingAttackEvent param1) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 1
        // 01: invokevirtual net/minecraftforge/event/entity/living/LivingAttackEvent.getSource ()Lnet/minecraft/util/DamageSource;
        // 04: astore 2
        // 05: aload 2
        // 06: getstatic net/minecraft/util/DamageSource.field_76380_i Lnet/minecraft/util/DamageSource;
        // 09: if_acmpeq 1a
        // 0c: aload 2
        // 0d: instanceof com/trolmastercard/sexmod/a3
        // 10: ifeq 1f
        // 13: goto 1a
        // 16: invokestatic com/trolmastercard/sexmod/ah.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 19: athrow
        // 1a: return
        // 1b: invokestatic com/trolmastercard/sexmod/ah.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 1e: athrow
        // 1f: aload 1
        // 20: invokevirtual net/minecraftforge/event/entity/living/LivingAttackEvent.getEntity ()Lnet/minecraft/entity/Entity;
        // 23: instanceof net/minecraft/entity/player/EntityPlayer
        // 26: ifne 2e
        // 29: return
        // 2a: invokestatic com/trolmastercard/sexmod/ah.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 2d: athrow
        // 2e: aload 1
        // 2f: invokevirtual net/minecraftforge/event/entity/living/LivingAttackEvent.getEntity ()Lnet/minecraft/entity/Entity;
        // 32: checkcast net/minecraft/entity/player/EntityPlayer
        // 35: astore 3
        // 36: aload 3
        // 37: invokevirtual net/minecraft/entity/player/EntityPlayer.getPersistentID ()Ljava/util/UUID;
        // 3a: invokestatic com/trolmastercard/sexmod/em.i (Ljava/util/UUID;)Lcom/trolmastercard/sexmod/em;
        // 3d: astore 4
        // 3f: aload 4
        // 41: ifnonnull 49
        // 44: return
        // 45: invokestatic com/trolmastercard/sexmod/ah.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 48: athrow
        // 49: aload 4
        // 4b: aload 3
        // 4c: invokevirtual com/trolmastercard/sexmod/em.func_70032_d (Lnet/minecraft/entity/Entity;)F
        // 4f: fconst_1
        // 50: fcmpg
        // 51: ifge 60
        // 54: aload 1
        // 55: bipush 1
        // 56: invokevirtual net/minecraftforge/event/entity/living/LivingAttackEvent.setCanceled (Z)V
        // 59: goto 60
        // 5c: invokestatic com/trolmastercard/sexmod/ah.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 5f: athrow
        // 60: return
        // try (3 -> 9): 10 java/lang/RuntimeException
        // try (6 -> 13): 13 java/lang/RuntimeException
        // try (15 -> 20): 20 java/lang/RuntimeException
        // try (30 -> 33): 33 java/lang/RuntimeException
        // try (35 -> 44): 45 java/lang/RuntimeException
    }

    private static RuntimeException a(RuntimeException var0) {
        return var0;
    }
}
