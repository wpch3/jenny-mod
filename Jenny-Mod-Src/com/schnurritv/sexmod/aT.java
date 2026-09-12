package com.schnurritv.sexmod;

import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

public class at {
   public static SimpleNetworkWrapper a;
   private static int b = 0;

   private static int a() {
      return b++;
   }

   public static void b() {
      a = NetworkRegistry.INSTANCE.newSimpleChannel("sexmodchannel");
      a.registerMessage(aw$a.class, aw.class, a(), Side.CLIENT);
      a.registerMessage(aw$a.class, aw.class, a(), Side.SERVER);
      a.registerMessage(a5.a.class, a5.class, a(), Side.CLIENT);
      a.registerMessage(b0.a.class, b0.class, a(), Side.SERVER);
      a.registerMessage(T$a.class, T.class, a(), Side.SERVER);
      a.registerMessage(cD$a.class, cD.class, a(), Side.SERVER);
      a.registerMessage(bZ$a.class, bZ.class, a(), Side.SERVER);
      a.registerMessage(ac$a.class, ac.class, a(), Side.CLIENT);
      a.registerMessage(ac$a.class, ac.class, a(), Side.SERVER);
      a.registerMessage(R$a.class, R.class, a(), Side.SERVER);
      a.registerMessage(c$a.class, c.class, a(), Side.SERVER);
      a.registerMessage(cY.a.class, cY.class, a(), Side.SERVER);
      a.registerMessage(com.schnurritv.sexmod.N.a.class, N.class, a(), Side.SERVER);
      a.registerMessage(b9.a.class, b9.class, a(), Side.SERVER);
      a.registerMessage(ar.a.class, ar.class, a(), Side.SERVER);
      a.registerMessage(aM$a.class, aM.class, a(), Side.SERVER);
      a.registerMessage(a3.a.class, a3.class, a(), Side.SERVER);
      a.registerMessage(u$a.class, u.class, a(), Side.SERVER);
      a.registerMessage(bl$a.class, bl.class, a(), Side.SERVER);
      a.registerMessage(b6.a.class, b6.class, a(), Side.SERVER);
      a.registerMessage(cF.a.class, cF.class, a(), Side.SERVER);
      a.registerMessage(cF.a.class, cF.class, a(), Side.CLIENT);
      a.registerMessage(com.schnurritv.sexmod.bw.a.class, bw.class, a(), Side.SERVER);
      a.registerMessage(b_.a.class, b_.class, a(), Side.SERVER);
      a.registerMessage(com.schnurritv.sexmod.o.a.class, o.class, a(), Side.SERVER);
      a.registerMessage(com.schnurritv.sexmod.ck.a.class, ck.class, a(), Side.SERVER);
      a.registerMessage(com.schnurritv.sexmod.aH.a.class, aH.class, a(), Side.SERVER);
      a.registerMessage(l.a.class, l.class, a(), Side.SERVER);
      a.registerMessage(b7.a.class, b7.class, a(), Side.SERVER);
      a.registerMessage(b7.a.class, b7.class, a(), Side.CLIENT);
      a.registerMessage(com.schnurritv.sexmod.aF.a.class, aF.class, a(), Side.SERVER);
      a.registerMessage(O.a.class, O.class, a(), Side.SERVER);
      a.registerMessage(com.schnurritv.sexmod.aR.a.class, aR.class, a(), Side.CLIENT);
      a.registerMessage(com.schnurritv.sexmod.aR.a.class, aR.class, a(), Side.SERVER);
      a.registerMessage(com.schnurritv.sexmod.L.a.class, L.class, a(), Side.SERVER);
      a.registerMessage(af.a.class, af.class, a(), Side.CLIENT);
      a.registerMessage(s$a.class, s.class, a(), Side.SERVER);
      a.registerMessage(bU$a.class, bU.class, a(), Side.SERVER);
      a.registerMessage(i$a.class, i.class, a(), Side.CLIENT);
      a.registerMessage(cS.a.class, cS.class, a(), Side.CLIENT);
      a.registerMessage(c8.a.class, c8.class, a(), Side.SERVER);
      a.registerMessage(as$a.class, as.class, a(), Side.SERVER);
      a.registerMessage(as$a.class, as.class, a(), Side.CLIENT);
      a.registerMessage(bD$b.class, bD.class, a(), Side.SERVER);
      a.registerMessage(bD$b.class, bD.class, a(), Side.CLIENT);
   }
}
