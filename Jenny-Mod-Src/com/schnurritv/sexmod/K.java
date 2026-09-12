package com.schnurritv.sexmod;

import net.minecraft.entity.Entity;

public enum k {
   JENNY(cK.class, 177013, cQ.class, 12388645),
   ELLIE(ca.class, 228922, cw.class, 46348348),
   BIA(bH.class, 230053, cR.class, 65456415),
   SLIME(cZ.class, 168597, cT.class, 54816432),
   BEE(c4.class, 4663354, bm.class, 48648638),
   ALLIE(bO.class, 5614613, br.class, 64867483),
   LUNA(c9.class, 6816463, c2.class, 681234824),
   KOBOLD(cA.class, 5648456, cn.class, 62484851, true),
   GOBLIN(ct.class, 4567275, cU.class, 6584344, true);

   public final int npcID;
   public final int playerID;
   public final Class<? extends bi> npcClass;
   public final Class<? extends bg> playerClass;
   public final boolean isNpcOnly;
   public final int editorID;
   public final boolean hasSpecifics;

   k(Class<? extends bi> var3, int var4, Class<? extends bg> var5, int var6, boolean var7) {
      this.npcID = var4;
      this.playerID = var6;
      this.npcClass = var3;
      this.playerClass = var5;
      this.isNpcOnly = false;
      this.hasSpecifics = var7;
      this.editorID = f.i++;
   }

   k(Class<? extends bi> var3, int var4, Class<? extends bg> var5, int var6) {
      this.npcID = var4;
      this.playerID = var6;
      this.npcClass = var3;
      this.playerClass = var5;
      this.isNpcOnly = false;
      this.hasSpecifics = false;
      this.editorID = f.i++;
   }

   k(Class<? extends bi> var3, int var4) {
      this.npcID = var4;
      this.npcClass = var3;
      this.isNpcOnly = true;
      this.hasSpecifics = false;
      this.editorID = f.i++;
      this.playerClass = null;
      this.playerID = 0;
   }

   public static k a(String var0) {
      for (k var4 : values()) {
         try {
            if (var4.toString().equalsIgnoreCase(var0)) {
               return var4;
            }
         } catch (RuntimeException var5) {
            throw a(var5);
         }
      }

      return JENNY;
   }

   public static k a(Entity var0) {
      try {
         if (!(var0 instanceof bi)) {
            return null;
         }
      } catch (RuntimeException var9) {
         throw a(var9);
      }

      bi var1 = (bi)var0;
      Class var2 = var1.getClass();

      for (k var6 : values()) {
         try {
            if (var2.equals(var6.npcClass)) {
               return var6;
            }
         } catch (RuntimeException var7) {
            throw a(var7);
         }

         try {
            if (var2.equals(var6.playerClass)) {
               return var6;
            }
         } catch (RuntimeException var8) {
            throw a(var8);
         }
      }

      return null;
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }
}
