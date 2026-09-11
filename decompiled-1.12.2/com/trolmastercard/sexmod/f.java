package com.trolmastercard.sexmod;

import java.util.UUID;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public abstract class f extends EntityAIBase {
    public em d;
    public EntityPlayer a;
    public PathNavigate c;
    public EntityDataManager e;
    public f.a f = f.a.IDLE;
    public static final double g = 0.5;
    public static final double h = 0.7;
    public static final int b = 60;

    public f(em var1) {
        this.d = var1;
        this.c = var1.func_70661_as();
        this.e = var1.func_184212_Q();
    }

    protected void c() {
        int var2 = 0;

        BlockPos var1;
        do {
            var1 = this.a.func_180425_c().func_177982_a(r.f.nextInt(10), 0, r.f.nextInt(10));
        } while (++var2 < 20 && !this.d.func_184595_k(var1.func_177958_n(), var1.func_177956_o(), var1.func_177952_p()));

        try {
            if (var2 >= 20) {
                this.d.func_70107_b(this.a.field_70165_t, this.a.field_70163_u, this.a.field_70161_v);
            }
        } catch (RuntimeException var3) {
            throw b(var3);
        }

        this.d.field_70159_w = 0.0;
        this.d.field_70181_x = 0.0;
        this.d.field_70179_y = 0.0;
    }

    protected double b() {
        float var1 = this.d.func_70032_d(this.a);
        double var2;
        em.a var4;
        if (this.a.func_70051_ag()) {
            var2 = 0.7;
            var4 = em.a.RUN;
        } else {
            var2 = 0.5;
            var4 = em.a.WALK;
        }

        double var5 = Math.floor(var1 / 5.0F) * 0.2;
        var2 += var5;
        if (this.d.func_70090_H()) {
            var2 *= 60.0;
            var4 = em.a.WALK;
        }

        this.c.func_75489_a(var2);
        this.d.a(var4);
        return var2;
    }

    public void func_75251_c() {
        this.c.func_75499_g();
        this.f = f.a.IDLE;
        this.d.b(fp.NULL);
        this.e.func_187227_b(em.v, "");
        this.c = null;
        this.e = null;
        this.a = null;
    }

    public boolean func_75250_a() {
        try {
            if (!((String)this.d.func_184212_Q().func_187225_a(em.v)).equals("")) {
                return true;
            }
        } catch (RuntimeException var1) {
            throw b(var1);
        }

        return false;
    }

    public boolean func_75253_b() {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 0
        // 01: getfield com/trolmastercard/sexmod/f.e Lnet/minecraft/network/datasync/EntityDataManager;
        // 04: getstatic com/trolmastercard/sexmod/em.v Lnet/minecraft/network/datasync/DataParameter;
        // 07: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187225_a (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
        // 0a: checkcast java/lang/String
        // 0d: astore 1
        // 0e: aload 1
        // 0f: ldc ""
        // 11: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
        // 14: ifne 37
        // 17: aload 0
        // 18: getfield com/trolmastercard/sexmod/f.d Lcom/trolmastercard/sexmod/em;
        // 1b: getfield com/trolmastercard/sexmod/em.field_70170_p Lnet/minecraft/world/World;
        // 1e: aload 1
        // 1f: invokestatic java/util/UUID.fromString (Ljava/lang/String;)Ljava/util/UUID;
        // 22: invokevirtual net/minecraft/world/World.func_152378_a (Ljava/util/UUID;)Lnet/minecraft/entity/player/EntityPlayer;
        // 25: ifnull 37
        // 28: goto 2f
        // 2b: invokestatic com/trolmastercard/sexmod/f.b (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 2e: athrow
        // 2f: bipush 1
        // 30: goto 38
        // 33: invokestatic com/trolmastercard/sexmod/f.b (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 36: athrow
        // 37: bipush 0
        // 38: ireturn
        // try (6 -> 17): 18 java/lang/RuntimeException
        // try (10 -> 22): 22 java/lang/RuntimeException
    }

    public void func_75249_e() {
        this.c = this.d.func_70661_as();
        this.e = this.d.func_184212_Q();
        this.a = this.d.field_70170_p.func_152378_a(UUID.fromString((String)this.e.func_187225_a(em.v)));
    }

    public void func_75246_d() {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: aload 0
        // 01: aload 0
        // 02: invokevirtual com/trolmastercard/sexmod/f.a ()Lcom/trolmastercard/sexmod/f$a;
        // 05: putfield com/trolmastercard/sexmod/f.f Lcom/trolmastercard/sexmod/f$a;
        // 08: aload 0
        // 09: getfield com/trolmastercard/sexmod/f.d Lcom/trolmastercard/sexmod/em;
        // 0c: getfield com/trolmastercard/sexmod/em.o Lcom/trolmastercard/sexmod/df;
        // 0f: ifnull 36
        // 12: aload 0
        // 13: getfield com/trolmastercard/sexmod/f.d Lcom/trolmastercard/sexmod/em;
        // 16: getfield com/trolmastercard/sexmod/em.o Lcom/trolmastercard/sexmod/df;
        // 19: aload 0
        // 1a: getfield com/trolmastercard/sexmod/f.f Lcom/trolmastercard/sexmod/f$a;
        // 1d: getstatic com/trolmastercard/sexmod/f$a.IDLE Lcom/trolmastercard/sexmod/f$a;
        // 20: if_acmpne 32
        // 23: goto 2a
        // 26: invokestatic com/trolmastercard/sexmod/f.b (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 29: athrow
        // 2a: bipush 1
        // 2b: goto 33
        // 2e: invokestatic com/trolmastercard/sexmod/f.b (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 31: athrow
        // 32: bipush 0
        // 33: putfield com/trolmastercard/sexmod/df.a Z
        // 36: aload 0
        // 37: aload 0
        // 38: getfield com/trolmastercard/sexmod/f.f Lcom/trolmastercard/sexmod/f$a;
        // 3b: invokevirtual com/trolmastercard/sexmod/f.a (Lcom/trolmastercard/sexmod/f$a;)V
        // 3e: return
        // try (0 -> 15): 16 java/lang/RuntimeException
        // try (8 -> 20): 20 java/lang/RuntimeException
    }

    protected abstract f.a a();

    protected abstract void a(f.a var1);

    @SubscribeEvent
    public void a(LivingDeathEvent var1) {
        if (var1.getEntityLiving() instanceof em) {
            em var2 = (em)var1.getEntityLiving();

            try {
                if (!((String)var2.func_184212_Q().func_187225_a(em.v)).equals("")) {
                    var1.setCanceled(true);
                }
            } catch (RuntimeException var3) {
                throw b(var3);
            }
        }
    }

    private static RuntimeException b(RuntimeException var0) {
        return var0;
    }

    public enum a {
        ATTACK,
        FOLLOW,
        IDLE,
        RIDE,
        DOWNED;
    }
}
