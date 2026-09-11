package com.trolmastercard.sexmod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.UUID;
import java.util.Map.Entry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraft.world.storage.WorldSavedData;
import net.minecraftforge.event.world.WorldEvent.Load;
import net.minecraftforge.event.world.WorldEvent.Save;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.Phase;
import net.minecraftforge.fml.common.gameevent.TickEvent.ServerTickEvent;
import org.apache.logging.log4j.Level;

public class v extends WorldSavedData {
    public static boolean f = true;
    public static final float c = 60.0F;
    public static final String e = "sexmod:galath_owner_ship";
    public static final String d = "sexmod:ownershipdata";
    public static final String g = "sexmod:mangownershipdata";
    static final long a = 0L;
    static gl<UUID, UUID> h = new gl<>();
    static HashMap<UUID, Long> b = new HashMap<>();
    static HashSet<UUID> i = new HashSet<>();

    public v() {
        super("sexmod:galath_owner_ship");
    }

    public v(String var1) {
        super("sexmod:galath_owner_ship");
    }

    public static void a() {
        i.clear();
        h.b();
    }

    public static void e(UUID var0) {
        UUID var1 = f(var0);

        try {
            if (var1 == null) {
                return;
            }
        } catch (RuntimeException var2) {
            throw a(var2);
        }

        i.add(var1);
    }

    public static boolean b(UUID var0) {
        return i.contains(var0);
    }

    public static boolean c(f_ var0) {
        UUID var1 = h.b(var0.f());

        try {
            if (var1 == null) {
                return false;
            }
        } catch (RuntimeException var7) {
            throw a(var7);
        }

        World var2 = var0.field_70170_p;
        EntityPlayer var3 = var2.func_152378_a(var1);

        try {
            if (var3 == null) {
                return true;
            }
        } catch (RuntimeException var5) {
            throw a(var5);
        }

        try {
            if (var3.field_71093_bK != var0.field_71093_bK) {
                return false;
            }
        } catch (RuntimeException var6) {
            throw a(var6);
        }

        try {
            return !(var3.func_70032_d(var0) > 60.0F);
        } catch (RuntimeException var4) {
            throw a(var4);
        }
    }

    public static boolean b(EntityPlayer var0, f_ var1) {
        return var1.f().equals(h.c(var0.getPersistentID()));
    }

    public static void a(f_ var0) {
        f8 var1 = var0.a(true);

        try {
            if (var1 != null) {
                var0.field_70170_p.func_72900_e(var1);
            }
        } catch (RuntimeException var7) {
            throw a(var7);
        }

        UUID var2 = h.b(var0.f());

        try {
            if (var2 == null) {
                var0.field_70170_p.func_72900_e(var0);
                return;
            }
        } catch (RuntimeException var6) {
            throw a(var6);
        }

        World var3 = var0.field_70170_p;
        EntityPlayer var4 = var3.func_152378_a(var2);

        try {
            var0.field_70170_p.func_72900_e(var0);
            h.a(var2);
            if (var4 != null) {
                ge.b.sendTo(new gf(false), (EntityPlayerMP)var4);
            }
        } catch (RuntimeException var5) {
            throw a(var5);
        }
    }

    public static boolean c(UUID var0) {
        try {
            if (h.c(var0) != null) {
                return true;
            }
        } catch (RuntimeException var1) {
            throw a(var1);
        }

        return false;
    }

    public static UUID f(UUID var0) {
        return h.b(var0);
    }

    public static UUID b(f_ var0) {
        try {
            if (var0 == null) {
                return null;
            }
        } catch (RuntimeException var1) {
            throw a(var1);
        }

        return f(var0.f());
    }

    public static UUID a(UUID var0) {
        return h.c(var0);
    }

    public static UUID b(EntityPlayer var0) {
        try {
            if (var0 == null) {
                return null;
            }
        } catch (RuntimeException var1) {
            throw a(var1);
        }

        return a(var0.getPersistentID());
    }

    public static void a(UUID var0, UUID var1) {
        h.a(var0, var1);
    }

    public static void a(EntityPlayer var0, f_ var1) {
        try {
            if (var0 == null) {
                return;
            }
        } catch (RuntimeException var2) {
            throw a(var2);
        }

        try {
            if (var1 == null) {
                return;
            }
        } catch (RuntimeException var3) {
            throw a(var3);
        }

        a(var0.getPersistentID(), var1.f());
    }

    public static void d(UUID var0) {
        h.a(var0);
    }

    public static void a(EntityPlayer var0) {
        try {
            if (var0 == null) {
                return;
            }
        } catch (RuntimeException var1) {
            throw a(var1);
        }

        d(var0.getPersistentID());
    }

    public static boolean a(UUID var0, World var1) {
        Long var2 = b.get(var0);

        try {
            if (!b(var0)) {
                return false;
            }
        } catch (RuntimeException var5) {
            throw a(var5);
        }

        try {
            if (var2 == null) {
                return true;
            }
        } catch (RuntimeException var3) {
            throw a(var3);
        }

        try {
            if (var1.func_82737_E() - var2 > 0L) {
                return true;
            }
        } catch (RuntimeException var4) {
            throw a(var4);
        }

        return false;
    }

    public static void a(UUID var0, Long var1) {
        try {
            if (var0 == null) {
                Main.LOGGER.log(Level.WARN, "tried to save last cum dosage time on NULL player");
                return;
            }
        } catch (RuntimeException var2) {
            throw a(var2);
        }

        b.put(var0, var1);
    }

    @SubscribeEvent
    public void a(ServerTickEvent var1) {
        try {
            if (var1.phase != Phase.END) {
                return;
            }
        } catch (RuntimeException var11) {
            throw a(var11);
        }

        World var2 = FMLCommonHandler.instance().getMinecraftServerInstance().func_130014_f_();
        ArrayList var3 = new ArrayList();

        for (Entry var5 : h.c()) {
            UUID var6 = (UUID)var5.getKey();
            UUID var7 = (UUID)var5.getValue();
            EntityPlayer var8 = var2.func_152378_a(var6);

            try {
                if (var8 == null) {
                    continue;
                }
            } catch (RuntimeException var10) {
                throw a(var10);
            }

            try {
                if (em.a(var7) == null) {
                    var3.add(var8);
                }
            } catch (RuntimeException var9) {
                throw a(var9);
            }
        }

        for (EntityPlayer var13 : var3) {
            h.a(var13.getPersistentID());
            ge.b.sendTo(new gf(false), (EntityPlayerMP)var13);
        }
    }

    @SubscribeEvent
    public void a(Save var1) {
        World var2 = var1.getWorld();
        var2.func_175693_T().func_75745_a("sexmod:galath_owner_ship", this);
        this.func_76185_a();
    }

    @SubscribeEvent
    public void a(Load var1) {
        World var2 = var1.getWorld();
        var2.func_175693_T().func_75742_a(v.class, "sexmod:galath_owner_ship");
    }

    public void func_76184_a(NBTTagCompound param1) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 000: aload 1
        // 001: ldc "sexmod:ownershipdata"
        // 003: invokevirtual net/minecraft/nbt/NBTTagCompound.func_74775_l (Ljava/lang/String;)Lnet/minecraft/nbt/NBTTagCompound;
        // 006: astore 2
        // 007: aload 2
        // 008: ldc "amount"
        // 00a: invokevirtual net/minecraft/nbt/NBTTagCompound.func_74762_e (Ljava/lang/String;)I
        // 00d: istore 3
        // 00e: bipush 0
        // 00f: istore 4
        // 011: iload 4
        // 013: iload 3
        // 014: if_icmpge 0a5
        // 017: aload 2
        // 018: new java/lang/StringBuilder
        // 01b: dup
        // 01c: invokespecial java/lang/StringBuilder.<init> ()V
        // 01f: ldc "master"
        // 021: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
        // 024: iload 4
        // 026: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
        // 029: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
        // 02c: invokevirtual net/minecraft/nbt/NBTTagCompound.func_186857_a (Ljava/lang/String;)Ljava/util/UUID;
        // 02f: astore 5
        // 031: aload 2
        // 032: new java/lang/StringBuilder
        // 035: dup
        // 036: invokespecial java/lang/StringBuilder.<init> ()V
        // 039: ldc "galath"
        // 03b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
        // 03e: iload 4
        // 040: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
        // 043: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
        // 046: invokevirtual net/minecraft/nbt/NBTTagCompound.func_186857_a (Ljava/lang/String;)Ljava/util/UUID;
        // 049: astore 6
        // 04b: aload 2
        // 04c: new java/lang/StringBuilder
        // 04f: dup
        // 050: invokespecial java/lang/StringBuilder.<init> ()V
        // 053: ldc "lastcumdosage"
        // 055: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
        // 058: iload 4
        // 05a: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
        // 05d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
        // 060: invokevirtual net/minecraft/nbt/NBTTagCompound.func_74763_f (Ljava/lang/String;)J
        // 063: lstore 7
        // 065: aload 5
        // 067: ifnull 076
        // 06a: aload 6
        // 06c: ifnonnull 087
        // 06f: goto 076
        // 072: invokestatic com/trolmastercard/sexmod/v.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 075: athrow
        // 076: getstatic com/trolmastercard/sexmod/Main.LOGGER Lorg/apache/logging/log4j/Logger;
        // 079: ldc "OMFG WHOOP WHOOP SAVING DIDNT WORK CORRECTLY AAAAAAAAAAA"
        // 07b: invokeinterface org/apache/logging/log4j/Logger.fatal (Ljava/lang/String;)V 2
        // 080: goto 09f
        // 083: invokestatic com/trolmastercard/sexmod/v.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 086: athrow
        // 087: getstatic com/trolmastercard/sexmod/v.h Lcom/trolmastercard/sexmod/gl;
        // 08a: aload 5
        // 08c: aload 6
        // 08e: invokevirtual com/trolmastercard/sexmod/gl.a (Ljava/lang/Object;Ljava/lang/Object;)V
        // 091: getstatic com/trolmastercard/sexmod/v.b Ljava/util/HashMap;
        // 094: aload 5
        // 096: lload 7
        // 098: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
        // 09b: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        // 09e: pop
        // 09f: iinc 4 1
        // 0a2: goto 011
        // 0a5: aload 1
        // 0a6: ldc "sexmod:mangownershipdata"
        // 0a8: invokevirtual net/minecraft/nbt/NBTTagCompound.func_74775_l (Ljava/lang/String;)Lnet/minecraft/nbt/NBTTagCompound;
        // 0ab: astore 4
        // 0ad: bipush 0
        // 0ae: istore 5
        // 0b0: aload 4
        // 0b2: new java/lang/StringBuilder
        // 0b5: dup
        // 0b6: invokespecial java/lang/StringBuilder.<init> ()V
        // 0b9: ldc "mang"
        // 0bb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
        // 0be: iload 5
        // 0c0: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
        // 0c3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
        // 0c6: invokevirtual net/minecraft/nbt/NBTTagCompound.func_186855_b (Ljava/lang/String;)Z
        // 0c9: ifne 0d3
        // 0cc: goto 0f9
        // 0cf: invokestatic com/trolmastercard/sexmod/v.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        // 0d2: athrow
        // 0d3: getstatic com/trolmastercard/sexmod/v.i Ljava/util/HashSet;
        // 0d6: aload 4
        // 0d8: new java/lang/StringBuilder
        // 0db: dup
        // 0dc: invokespecial java/lang/StringBuilder.<init> ()V
        // 0df: ldc "mang"
        // 0e1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
        // 0e4: iload 5
        // 0e6: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
        // 0e9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
        // 0ec: invokevirtual net/minecraft/nbt/NBTTagCompound.func_186857_a (Ljava/lang/String;)Ljava/util/UUID;
        // 0ef: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
        // 0f2: pop
        // 0f3: iinc 5 1
        // 0f6: goto 0b0
        // 0f9: aload 1
        // 0fa: ldc "sexmod:mangownershipdata"
        // 0fc: new net/minecraft/nbt/NBTTagCompound
        // 0ff: dup
        // 100: invokespecial net/minecraft/nbt/NBTTagCompound.<init> ()V
        // 103: invokevirtual net/minecraft/nbt/NBTTagCompound.func_74782_a (Ljava/lang/String;Lnet/minecraft/nbt/NBTBase;)V
        // 106: aload 1
        // 107: ldc "sexmod:ownershipdata"
        // 109: new net/minecraft/nbt/NBTTagCompound
        // 10c: dup
        // 10d: invokespecial net/minecraft/nbt/NBTTagCompound.<init> ()V
        // 110: invokevirtual net/minecraft/nbt/NBTTagCompound.func_74782_a (Ljava/lang/String;Lnet/minecraft/nbt/NBTBase;)V
        // 113: return
        // try (46 -> 50): 51 java/lang/RuntimeException
        // try (48 -> 57): 57 java/lang/RuntimeException
        // try (77 -> 89): 89 java/lang/RuntimeException
    }

    public NBTTagCompound func_189551_b(NBTTagCompound var1) {
        NBTTagCompound var2 = new NBTTagCompound();
        var2.func_74768_a("amount", h.e());
        int var3 = 0;

        for (Entry var5 : h.c()) {
            UUID var6 = (UUID)var5.getKey();
            UUID var7 = (UUID)var5.getValue();
            Long var8 = b.get(var6);
            if (var8 == null) {
                var8 = 0L;
            }

            var2.func_186854_a("galath" + var3, var7);
            var2.func_186854_a("master" + var3, var6);
            var2.func_74772_a("lastcumdosage" + var3, var8);
            var3++;
        }

        NBTTagCompound var10 = new NBTTagCompound();
        var3 = 0;

        for (UUID var12 : i) {
            var10.func_186854_a("mang" + var3++, var12);
        }

        var1.func_74782_a("sexmod:ownershipdata", var2);
        var1.func_74782_a("sexmod:mangownershipdata", var10);
        return var1;
    }

    private static RuntimeException a(RuntimeException var0) {
        return var0;
    }
}
