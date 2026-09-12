package com.schnurritv.sexmod;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class b5 {
   public static final int b = 30;
   BlockPos a;
   b5.a e;
   HashSet<BlockPos> d;
   List<cA> f = new ArrayList<>();
   EnumFacing c = EnumFacing.NORTH;

   public b5(BlockPos var1, b5.a var2, HashSet<BlockPos> var3) {
      this.a = var1;
      this.e = var2;
      this.d = var3;
   }

   public b5(BlockPos var1, b5.a var2, HashSet<BlockPos> var3, EnumFacing var4) {
      this.a = var1;
      this.e = var2;
      this.d = var3;
      this.c = var4;
   }

   public EnumFacing b() {
      return this.c;
   }

   public BlockPos g() {
      return this.a;
   }

   public b5.a c() {
      return this.e;
   }

   public HashSet<BlockPos> f() {
      return this.d;
   }

   public void c(BlockPos var1) {
      this.d.add(var1);
   }

   public void b(HashSet<BlockPos> var1) {
      this.d.addAll(var1);
   }

   public void b(BlockPos var1) {
      this.d.remove(var1);
   }

   public void a(HashSet<BlockPos> var1) {
      try {
         if (!var1.isEmpty()) {
            this.d.removeAll(var1);
         }
      } catch (RuntimeException var2) {
         throw a(var2);
      }
   }

   public boolean a(BlockPos var1) {
      return this.d.contains(var1);
   }

   public boolean c(cA var1) {
      try {
         if (this.e.a <= this.f.size()) {
            return false;
         }
      } catch (RuntimeException var2) {
         throw a(var2);
      }

      this.f.add(var1);
      return true;
   }

   public List<cA> d() {
      return this.f;
   }

   public void e() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.StackOverflowError
      //   at org.jetbrains.java.decompiler.util.InterpreterUtil.makeUniqueKey(InterpreterUtil.java:96)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethod(StructClass.java:165)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:169)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //   at org.jetbrains.java.decompiler.struct.StructClass.getMethodRecursive(StructClass.java:188)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield com/schnurritv/sexmod/b5.f Ljava/util/List;
      // 04: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 09: astore 1
      // 0a: aload 1
      // 0b: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 10: ifeq 4d
      // 13: aload 1
      // 14: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 19: checkcast com/schnurritv/sexmod/cA
      // 1c: astore 2
      // 1d: aload 2
      // 1e: invokevirtual com/schnurritv/sexmod/cA.r ()Ljava/util/UUID;
      // 21: ifnonnull 4a
      // 24: aload 2
      // 25: bipush 0
      // 26: invokevirtual com/schnurritv/sexmod/cA.func_189654_d (Z)V
      // 29: aload 2
      // 2a: bipush 0
      // 2b: putfield com/schnurritv/sexmod/cA.field_70145_X Z
      // 2e: aload 2
      // 2f: getstatic com/schnurritv/sexmod/bj.NULL Lcom/schnurritv/sexmod/bj;
      // 32: invokevirtual com/schnurritv/sexmod/cA.b (Lcom/schnurritv/sexmod/bj;)V
      // 35: aload 2
      // 36: invokevirtual com/schnurritv/sexmod/cA.func_184212_Q ()Lnet/minecraft/network/datasync/EntityDataManager;
      // 39: getstatic com/schnurritv/sexmod/bi.z Lnet/minecraft/network/datasync/DataParameter;
      // 3c: bipush 0
      // 3d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 40: invokevirtual net/minecraft/network/datasync/EntityDataManager.func_187227_b (Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V
      // 43: goto 4a
      // 46: invokestatic com/schnurritv/sexmod/b5.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 49: athrow
      // 4a: goto 0a
      // 4d: aload 0
      // 4e: getfield com/schnurritv/sexmod/b5.f Ljava/util/List;
      // 51: invokeinterface java/util/List.clear ()V 1
      // 56: return
      // try (11 -> 29): 30 java/lang/RuntimeException
   }

   public void a(cA var1) {
      this.f.remove(var1);
   }

   public boolean a() {
      try {
         if (this.e.a <= this.f.size()) {
            return true;
         }
      } catch (RuntimeException var1) {
         throw a(var1);
      }

      return false;
   }

   public boolean b(cA var1) {
      return this.f.contains(var1);
   }

   public static HashSet<BlockPos> a(World param0, BlockPos param1, UUID param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 1
      // 001: astore 3
      // 002: aload 0
      // 003: aload 3
      // 004: invokestatic com/schnurritv/sexmod/b5.b (Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)Z
      // 007: ifne 012
      // 00a: aload 1
      // 00b: invokevirtual net/minecraft/util/math/BlockPos.func_177977_b ()Lnet/minecraft/util/math/BlockPos;
      // 00e: astore 3
      // 00f: goto 002
      // 012: aload 1
      // 013: astore 4
      // 015: aload 0
      // 016: aload 4
      // 018: invokestatic com/schnurritv/sexmod/b5.c (Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)Z
      // 01b: ifne 028
      // 01e: aload 4
      // 020: invokevirtual net/minecraft/util/math/BlockPos.func_177984_a ()Lnet/minecraft/util/math/BlockPos;
      // 023: astore 4
      // 025: goto 015
      // 028: new java/util/HashSet
      // 02b: dup
      // 02c: invokespecial java/util/HashSet.<init> ()V
      // 02f: astore 5
      // 031: aload 4
      // 033: invokevirtual net/minecraft/util/math/BlockPos.func_177956_o ()I
      // 036: aload 3
      // 037: invokevirtual net/minecraft/util/math/BlockPos.func_177956_o ()I
      // 03a: isub
      // 03b: istore 6
      // 03d: bipush 0
      // 03e: istore 7
      // 040: iload 7
      // 042: iload 6
      // 044: if_icmpgt 05f
      // 047: aload 5
      // 049: aload 3
      // 04a: bipush 0
      // 04b: iload 7
      // 04d: bipush 0
      // 04e: invokevirtual net/minecraft/util/math/BlockPos.func_177982_a (III)Lnet/minecraft/util/math/BlockPos;
      // 051: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
      // 054: pop
      // 055: iinc 7 1
      // 058: goto 040
      // 05b: invokestatic com/schnurritv/sexmod/b5.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 05e: athrow
      // 05f: aload 0
      // 060: aload 3
      // 061: invokestatic com/schnurritv/sexmod/b5.a (Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)Ljava/util/HashSet;
      // 064: astore 7
      // 066: new java/util/HashSet
      // 069: dup
      // 06a: invokespecial java/util/HashSet.<init> ()V
      // 06d: astore 8
      // 06f: aload 7
      // 071: invokevirtual java/util/HashSet.iterator ()Ljava/util/Iterator;
      // 074: astore 9
      // 076: aload 9
      // 078: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 07d: ifeq 0bd
      // 080: aload 9
      // 082: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 087: checkcast net/minecraft/util/math/BlockPos
      // 08a: astore 10
      // 08c: aload 10
      // 08e: invokevirtual net/minecraft/util/math/BlockPos.func_177958_n ()I
      // 091: aload 3
      // 092: invokevirtual net/minecraft/util/math/BlockPos.func_177958_n ()I
      // 095: if_icmpne 0ba
      // 098: aload 10
      // 09a: invokevirtual net/minecraft/util/math/BlockPos.func_177952_p ()I
      // 09d: aload 3
      // 09e: invokevirtual net/minecraft/util/math/BlockPos.func_177952_p ()I
      // 0a1: if_icmpne 0ba
      // 0a4: goto 0ab
      // 0a7: invokestatic com/schnurritv/sexmod/b5.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0aa: athrow
      // 0ab: aload 8
      // 0ad: aload 10
      // 0af: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
      // 0b2: pop
      // 0b3: goto 0ba
      // 0b6: invokestatic com/schnurritv/sexmod/b5.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0b9: athrow
      // 0ba: goto 076
      // 0bd: aload 8
      // 0bf: invokevirtual java/util/HashSet.iterator ()Ljava/util/Iterator;
      // 0c2: astore 9
      // 0c4: aload 9
      // 0c6: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0cb: ifeq 0e5
      // 0ce: aload 9
      // 0d0: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0d5: checkcast net/minecraft/util/math/BlockPos
      // 0d8: astore 10
      // 0da: aload 7
      // 0dc: aload 10
      // 0de: invokevirtual java/util/HashSet.remove (Ljava/lang/Object;)Z
      // 0e1: pop
      // 0e2: goto 0c4
      // 0e5: aload 5
      // 0e7: aload 7
      // 0e9: invokevirtual java/util/HashSet.addAll (Ljava/util/Collection;)Z
      // 0ec: pop
      // 0ed: new java/util/HashSet
      // 0f0: dup
      // 0f1: invokespecial java/util/HashSet.<init> ()V
      // 0f4: astore 9
      // 0f6: aload 5
      // 0f8: invokevirtual java/util/HashSet.iterator ()Ljava/util/Iterator;
      // 0fb: astore 10
      // 0fd: aload 10
      // 0ff: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 104: ifeq 15a
      // 107: aload 10
      // 109: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 10e: checkcast net/minecraft/util/math/BlockPos
      // 111: astore 11
      // 113: aload 2
      // 114: invokestatic com/schnurritv/sexmod/bK.a (Ljava/util/UUID;)Ljava/util/Collection;
      // 117: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 11c: astore 12
      // 11e: aload 12
      // 120: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 125: ifeq 157
      // 128: aload 12
      // 12a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 12f: checkcast com/schnurritv/sexmod/b5
      // 132: astore 13
      // 134: aload 13
      // 136: invokevirtual com/schnurritv/sexmod/b5.f ()Ljava/util/HashSet;
      // 139: astore 14
      // 13b: aload 14
      // 13d: aload 11
      // 13f: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
      // 142: ifeq 154
      // 145: aload 9
      // 147: aload 11
      // 149: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
      // 14c: pop
      // 14d: goto 157
      // 150: invokestatic com/schnurritv/sexmod/b5.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 153: athrow
      // 154: goto 11e
      // 157: goto 0fd
      // 15a: aload 5
      // 15c: aload 9
      // 15e: invokevirtual java/util/HashSet.removeAll (Ljava/util/Collection;)Z
      // 161: pop
      // 162: new com/schnurritv/sexmod/b5
      // 165: dup
      // 166: aload 3
      // 167: getstatic com/schnurritv/sexmod/b5$a.FALL_TREE Lcom/schnurritv/sexmod/b5$a;
      // 16a: aload 5
      // 16c: invokespecial com/schnurritv/sexmod/b5.<init> (Lnet/minecraft/util/math/BlockPos;Lcom/schnurritv/sexmod/b5$a;Ljava/util/HashSet;)V
      // 16f: astore 10
      // 171: aload 2
      // 172: aload 10
      // 174: invokestatic com/schnurritv/sexmod/bK.a (Ljava/util/UUID;Lcom/schnurritv/sexmod/b5;)V
      // 177: aload 5
      // 179: areturn
      // try (32 -> 45): 45 java/lang/RuntimeException
      // try (65 -> 75): 76 java/lang/RuntimeException
      // try (70 -> 82): 83 java/lang/RuntimeException
      // try (133 -> 142): 142 java/lang/RuntimeException
   }

   static boolean c(World var0, BlockPos var1) {
      Block var2 = var0.func_180495_p(var1.func_177984_a()).func_177230_c();

      try {
         if (!(var2 instanceof BlockLog)) {
            return true;
         }
      } catch (RuntimeException var3) {
         throw a(var3);
      }

      return false;
   }

   static boolean b(World param0, BlockPos param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: invokevirtual net/minecraft/util/math/BlockPos.func_177977_b ()Lnet/minecraft/util/math/BlockPos;
      // 05: invokevirtual net/minecraft/world/World.func_180495_p (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
      // 08: astore 2
      // 09: aload 2
      // 0a: instanceof net/minecraft/block/BlockLog
      // 0d: ifne 2b
      // 10: aload 2
      // 11: invokeinterface net/minecraft/block/state/IBlockState.func_185904_a ()Lnet/minecraft/block/material/Material; 1
      // 16: getstatic net/minecraft/block/material/Material.field_151579_a Lnet/minecraft/block/material/Material;
      // 19: if_acmpeq 2b
      // 1c: goto 23
      // 1f: invokestatic com/schnurritv/sexmod/b5.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 22: athrow
      // 23: bipush 1
      // 24: goto 2c
      // 27: invokestatic com/schnurritv/sexmod/b5.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2a: athrow
      // 2b: bipush 0
      // 2c: ireturn
      // try (5 -> 12): 13 java/lang/RuntimeException
      // try (8 -> 17): 17 java/lang/RuntimeException
   }

   static HashSet<BlockPos> a(World var0, BlockPos var1) {
      return a(var0, var1, new HashSet<>());
   }

   static HashSet<BlockPos> a(World var0, BlockPos var1, HashSet<BlockPos> var2) {
      try {
         if (var2.contains(var1)) {
            return new HashSet<>();
         }
      } catch (RuntimeException var20) {
         throw a(var20);
      }

      try {
         var2.add(var1);
         if (var0.func_180495_p(var1.func_177982_a(1, 0, 0)).func_177230_c() instanceof BlockLog) {
            var2.addAll(a(var0, var1.func_177982_a(1, 0, 0), var2));
         }
      } catch (RuntimeException var11) {
         throw a(var11);
      }

      try {
         if (var0.func_180495_p(var1.func_177982_a(-1, 0, 0)).func_177230_c() instanceof BlockLog) {
            var2.addAll(a(var0, var1.func_177982_a(-1, 0, 0), var2));
         }
      } catch (RuntimeException var19) {
         throw a(var19);
      }

      try {
         if (var0.func_180495_p(var1.func_177982_a(0, 0, 1)).func_177230_c() instanceof BlockLog) {
            var2.addAll(a(var0, var1.func_177982_a(0, 0, 1), var2));
         }
      } catch (RuntimeException var10) {
         throw a(var10);
      }

      try {
         if (var0.func_180495_p(var1.func_177982_a(0, 0, -1)).func_177230_c() instanceof BlockLog) {
            var2.addAll(a(var0, var1.func_177982_a(0, 0, -1), var2));
         }
      } catch (RuntimeException var18) {
         throw a(var18);
      }

      try {
         if (var0.func_180495_p(var1.func_177982_a(1, 0, 1)).func_177230_c() instanceof BlockLog) {
            var2.addAll(a(var0, var1.func_177982_a(1, 0, 1), var2));
         }
      } catch (RuntimeException var9) {
         throw a(var9);
      }

      try {
         if (var0.func_180495_p(var1.func_177982_a(-1, 0, -1)).func_177230_c() instanceof BlockLog) {
            var2.addAll(a(var0, var1.func_177982_a(-1, 0, -1), var2));
         }
      } catch (RuntimeException var17) {
         throw a(var17);
      }

      try {
         if (var0.func_180495_p(var1.func_177982_a(-1, 0, 1)).func_177230_c() instanceof BlockLog) {
            var2.addAll(a(var0, var1.func_177982_a(-1, 0, 1), var2));
         }
      } catch (RuntimeException var8) {
         throw a(var8);
      }

      try {
         if (var0.func_180495_p(var1.func_177982_a(1, 0, -1)).func_177230_c() instanceof BlockLog) {
            var2.addAll(a(var0, var1.func_177982_a(1, 0, -1), var2));
         }
      } catch (RuntimeException var16) {
         throw a(var16);
      }

      try {
         if (var0.func_180495_p(var1.func_177982_a(0, 1, 0)).func_177230_c() instanceof BlockLog) {
            var2.addAll(a(var0, var1.func_177982_a(0, 1, 0), var2));
         }
      } catch (RuntimeException var7) {
         throw a(var7);
      }

      try {
         if (var0.func_180495_p(var1.func_177982_a(1, 1, 0)).func_177230_c() instanceof BlockLog) {
            var2.addAll(a(var0, var1.func_177982_a(1, 1, 0), var2));
         }
      } catch (RuntimeException var15) {
         throw a(var15);
      }

      try {
         if (var0.func_180495_p(var1.func_177982_a(-1, 1, 0)).func_177230_c() instanceof BlockLog) {
            var2.addAll(a(var0, var1.func_177982_a(-1, 1, 0), var2));
         }
      } catch (RuntimeException var6) {
         throw a(var6);
      }

      try {
         if (var0.func_180495_p(var1.func_177982_a(0, 1, 1)).func_177230_c() instanceof BlockLog) {
            var2.addAll(a(var0, var1.func_177982_a(0, 1, 1), var2));
         }
      } catch (RuntimeException var14) {
         throw a(var14);
      }

      try {
         if (var0.func_180495_p(var1.func_177982_a(0, 1, -1)).func_177230_c() instanceof BlockLog) {
            var2.addAll(a(var0, var1.func_177982_a(0, 1, -1), var2));
         }
      } catch (RuntimeException var5) {
         throw a(var5);
      }

      try {
         if (var0.func_180495_p(var1.func_177982_a(1, 1, 1)).func_177230_c() instanceof BlockLog) {
            var2.addAll(a(var0, var1.func_177982_a(1, 1, 1), var2));
         }
      } catch (RuntimeException var13) {
         throw a(var13);
      }

      try {
         if (var0.func_180495_p(var1.func_177982_a(-1, 1, -1)).func_177230_c() instanceof BlockLog) {
            var2.addAll(a(var0, var1.func_177982_a(-1, 1, -1), var2));
         }
      } catch (RuntimeException var4) {
         throw a(var4);
      }

      try {
         if (var0.func_180495_p(var1.func_177982_a(-1, 1, 1)).func_177230_c() instanceof BlockLog) {
            var2.addAll(a(var0, var1.func_177982_a(-1, 1, 1), var2));
         }
      } catch (RuntimeException var12) {
         throw a(var12);
      }

      try {
         if (var0.func_180495_p(var1.func_177982_a(1, 1, -1)).func_177230_c() instanceof BlockLog) {
            var2.addAll(a(var0, var1.func_177982_a(1, 1, -1), var2));
         }

         return var2;
      } catch (RuntimeException var3) {
         throw a(var3);
      }
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }

   public enum a {
      FALL_TREE(1),
      MINE(3);

      int a;

      a(int var3) {
         this.a = var3;
      }

      int a() {
         return this.a;
      }
   }
}
