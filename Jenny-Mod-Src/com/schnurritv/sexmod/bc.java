package com.schnurritv.sexmod;

import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class bC {
   public static void a() {
      RenderingRegistry.registerEntityRenderingHandler(cA.class, var0 -> new bf(var0, new H(), -0.4));
      RenderingRegistry.registerEntityRenderingHandler(cK.class, var0 -> new bW(var0, new G(), -0.15));
      RenderingRegistry.registerEntityRenderingHandler(ca.class, var0 -> new bW(var0, new E(), 0.05));
      RenderingRegistry.registerEntityRenderingHandler(cZ.class, var0 -> new bW(var0, new J(), -0.2));
      RenderingRegistry.registerEntityRenderingHandler(bH.class, var0 -> new bh(var0, new D(), -0.4));
      RenderingRegistry.registerEntityRenderingHandler(bO.class, var0 -> new be(var0, new B(), -0.4));
      RenderingRegistry.registerEntityRenderingHandler(c4.class, var0 -> new bW(var0, new C(), -0.4));
      RenderingRegistry.registerEntityRenderingHandler(aV.class, bL::new);
      RenderingRegistry.registerEntityRenderingHandler(c9.class, var0 -> new by(var0, new I(), -0.4));
      RenderingRegistry.registerEntityRenderingHandler(ct.class, var0 -> new bG(var0, new F(), -0.6));
      RenderingRegistry.registerEntityRenderingHandler(c7.class, var0 -> new bF(var0, new aD()));
      RenderingRegistry.registerEntityRenderingHandler(cR.class, var0 -> new bJ(var0, new D()));
      RenderingRegistry.registerEntityRenderingHandler(cQ.class, var0 -> new bI(var0, new G()));
      RenderingRegistry.registerEntityRenderingHandler(cw.class, var0 -> new bX(var0, new E()));
      RenderingRegistry.registerEntityRenderingHandler(cT.class, var0 -> new bx(var0, new J()));
      RenderingRegistry.registerEntityRenderingHandler(br.class, var0 -> new bq(var0, new B()));
      RenderingRegistry.registerEntityRenderingHandler(bm.class, var0 -> new bo(var0, new C()));
      RenderingRegistry.registerEntityRenderingHandler(c2.class, var0 -> new bp(var0, new I()));
      RenderingRegistry.registerEntityRenderingHandler(cn.class, var0 -> new bu(var0, new H()));
      RenderingRegistry.registerEntityRenderingHandler(cU.class, var0 -> new bb(var0, new F()));
      RenderingRegistry.registerEntityRenderingHandler(n.class, V::new);
      RenderingRegistry.registerEntityRenderingHandler(a8.class, var0 -> new bd(var0, new aG()));
   }
}
