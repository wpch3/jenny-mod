package com.schnurritv.sexmod;

import java.util.HashMap;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class i$a implements IMessageHandler<i, IMessage> {
   public IMessage a(i param1, MessageContext param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 1
      // 01: getfield com/schnurritv/sexmod/i.b Z
      // 04: ifeq 18
      // 07: aload 2
      // 08: getfield net/minecraftforge/fml/common/network/simpleimpl/MessageContext.side Lnet/minecraftforge/fml/relauncher/Side;
      // 0b: getstatic net/minecraftforge/fml/relauncher/Side.CLIENT Lnet/minecraftforge/fml/relauncher/Side;
      // 0e: if_acmpeq 1e
      // 11: goto 18
      // 14: invokestatic com/schnurritv/sexmod/i$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 17: athrow
      // 18: aconst_null
      // 19: areturn
      // 1a: invokestatic com/schnurritv/sexmod/i$a.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1d: athrow
      // 1e: aload 0
      // 1f: aload 1
      // 20: getfield com/schnurritv/sexmod/i.c Ljava/util/HashMap;
      // 23: invokevirtual com/schnurritv/sexmod/i$a.a (Ljava/util/HashMap;)V
      // 26: aconst_null
      // 27: areturn
      // try (0 -> 7): 8 java/lang/RuntimeException
      // try (3 -> 12): 12 java/lang/RuntimeException
   }

   @SideOnly(Side.CLIENT)
   public void a(HashMap<k, String> var1) {
      Minecraft var2 = Minecraft.func_71410_x();
      var2.func_152344_a(() -> var2.func_147108_a(new j(var1)));
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }
}
