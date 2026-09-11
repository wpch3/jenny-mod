package com.trolmastercard.sexmod;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.AbstractMap.SimpleEntry;
import java.util.Map.Entry;
import javax.annotation.Nonnull;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class a extends GuiScreen {
    public static final ResourceLocation k = new ResourceLocation("sexmod", "textures/gui/clothing_icons.png");
    static final int r = 20;
    static final float j = 0.25F;
    int n = 0;
    int l = 0;
    float o = 0.0F;
    public static float b = 0.0F;
    protected static List<Integer> a = new ArrayList<>();
    protected static int s = 0;
    protected static int h = 0;
    em c;
    boolean p = false;
    gq q;
    public static List<Entry<gw, Entry<List<String>, Integer>>> m = new ArrayList<>();
    final UUID g;
    int i;
    int t;
    public boolean f = false;
    int d = 0;
    int e = 1;

    public a(@Nonnull em var1) {
        this.field_146297_k = Minecraft.func_71410_x();
        this.g = var1.f();
        fy var2 = fy.a(var1);
        if (var2 == null) {
            var2 = fy.JENNY;
        }

        try {
            Constructor var3 = var2.npcClass.getConstructor(World.class);
            this.c = (em)var3.newInstance(this.field_146297_k.field_71441_e);
            this.c.b(true);
        } catch (Exception var11) {
            var11.printStackTrace();
        }

        this.e();
        String var15 = var1.C();
        this.c.func_184212_Q().func_187227_b(em.b, var15);
        int var4 = 0;

        for (String var6 : this.c.Y()) {
            gw var7 = br.e(var6);

            try {
                if (gw.CUSTOM_BONE.equals(var7)) {
                    var4++;
                }
            } catch (Exception var14) {
                throw a(var14);
            }

            Entry var8 = null;

            label65: {
                label79: {
                    try {
                        if (gw.CUSTOM_BONE.equals(var7) && var4 > 1) {
                            break label79;
                        }
                    } catch (Exception var13) {
                        throw a(var13);
                    }

                    Iterator var9 = m.iterator();

                    while (true) {
                        if (!var9.hasNext()) {
                            break label65;
                        }

                        Entry var10 = (Entry)var9.next();
                        if (((gw)var10.getKey()).equals(var7)) {
                            var8 = var10;
                        }
                    }
                }

                var8 = b(this.c);
            }

            try {
                if (var8 == null) {
                    continue;
                }
            } catch (Exception var12) {
                throw a(var12);
            }

            m.remove(var8);
            int var16 = ((List)((Entry)var8.getValue()).getKey()).indexOf(var6);
            if (var16 == -1) {
                var16 = 0;
            }

            ((Entry)var8.getValue()).setValue(var16);
            m.add(var8);
        }
    }

    public void func_146274_d() throws IOException {
        super.func_146274_d();
        this.q.func_178039_p();
    }

    public static HashSet<String> b() {
        HashSet var0 = new HashSet();

        for (Entry var2 : m) {
            try {
                if (((List)((Entry)var2.getValue()).getKey()).size() == 1) {
                    continue;
                }
            } catch (RuntimeException var6) {
                throw a(var6);
            }

            Entry var3 = (Entry)var2.getValue();
            List var4 = (List)var3.getKey();
            Integer var5 = (Integer)var3.getValue();
            var0.add(var4.get(var5));
        }

        return var0;
    }

    public static Entry<gw, Entry<List<String>, Integer>> b(em var0) {
        ArrayList var1 = new ArrayList();
        var1.add("cross");
        var1.addAll(br.a(var0).get(gw.CUSTOM_BONE));
        return new SimpleEntry<>(gw.CUSTOM_BONE, new SimpleEntry<>(var1, 0));
    }

    void e() {
        m.clear();
        List var1 = this.c.d(this.g);
        this.i = var1.size();
        m.addAll(var1);

        for (gw var5 : gw.values()) {
            try {
                if (var5 == gw.GIRL_SPECIFIC) {
                    continue;
                }
            } catch (RuntimeException var8) {
                throw a(var8);
            }

            ArrayList var6 = new ArrayList();
            var6.add("cross");
            m.add(new SimpleEntry<>(var5, new SimpleEntry<>(var6, 0)));
        }

        for (Entry var10 : br.a(this.c).entrySet()) {
            Entry var11 = null;

            for (Entry var14 : m) {
                if (((gw)var10.getKey()).equals(var14.getKey())) {
                    var11 = var14;
                }
            }

            try {
                if (var11 == null) {
                    continue;
                }
            } catch (RuntimeException var7) {
                throw a(var7);
            }

            int var13 = m.indexOf(var11);
            m.remove(var11);
            ((List)((Entry)var11.getValue()).getKey()).addAll((Collection)var10.getValue());
            m.add(var13, var11);
        }
    }

    public void func_73866_w_() {
        this.q = new gq(this.field_146297_k, this);
    }

    public void func_146280_a(Minecraft var1, int var2, int var3) {
        super.func_146280_a(var1, var2, var3);
        this.n = this.a(76.0F);
        this.l = this.b(89.0F);
        this.o = 90.0F;
    }

    boolean a(int var1, int var2, int var3, int var4, int var5, int var6) {
        try {
            if (var1 < var3) {
                return false;
            }
        } catch (RuntimeException var10) {
            throw a(var10);
        }

        try {
            if (var1 > var5) {
                return false;
            }
        } catch (RuntimeException var8) {
            throw a(var8);
        }

        try {
            if (var2 < var4) {
                return false;
            }
        } catch (RuntimeException var9) {
            throw a(var9);
        }

        try {
            return var2 <= var6;
        } catch (RuntimeException var7) {
            throw a(var7);
        }
    }

    public void func_73863_a(int var1, int var2, float var3) {
        try {
            super.func_73863_a(var1, var2, var3);
            if (this.p) {
                b = b + b6.a(h, s, var3);
            }
        } catch (RuntimeException var8) {
            throw a(var8);
        }

        this.a();
        this.field_146297_k.field_71446_o.func_110577_a(k);
        int var4 = this.n - this.a(15.0F);
        int var5 = this.l - 20;

        a var10000;
        int var10001;
        int var10002;
        byte var10003;
        byte var10004;
        label32: {
            try {
                var10000 = this;
                var10001 = var4;
                var10002 = var5;
                var10003 = 100;
                if (this.a(var1, var2, var4, var5, var4 + 20, var5 + 20)) {
                    var10004 = 40;
                    break label32;
                }
            } catch (RuntimeException var7) {
                throw a(var7);
            }

            var10004 = 20;
        }

        try {
            var10000.func_73729_b(var10001, var10002, var10003, var10004, 20, 20);
            if (br.g() == null) {
                this.b(var4, var1, var2);
            }
        } catch (RuntimeException var6) {
            throw a(var6);
        }

        this.a(this.n, this.l, this.o, this.c, 1.2345679F);
        this.c.func_70071_h_();
        this.q.func_148128_a(var1, var2, var3);
    }

    void b(int var1, int var2, int var3) {
        int var4 = this.l - 40;

        a var10000;
        int var10001;
        int var10002;
        byte var10003;
        byte var10004;
        label41: {
            try {
                var10000 = this;
                var10001 = var1;
                var10002 = var4;
                var10003 = 120;
                if (this.a(var2, var3, var1, var4, var1 + 20, var4 + 20)) {
                    var10004 = 40;
                    break label41;
                }
            } catch (RuntimeException var7) {
                throw a(var7);
            }

            var10004 = 20;
        }

        label34: {
            try {
                var10000.func_73729_b(var10001, var10002, var10003, var10004, 20, 20);
                var4 -= 20;
                var10000 = this;
                var10001 = var1;
                var10002 = var4;
                var10003 = 20;
                if (this.a(var2, var3, var1, var4, var1 + 20, var4 + 20)) {
                    var10004 = 170;
                    break label34;
                }
            } catch (RuntimeException var6) {
                throw a(var6);
            }

            var10004 = 150;
        }

        label27: {
            try {
                var10000.func_73729_b(var10001, var10002, var10003, var10004, 20, 20);
                var4 -= 20;
                var10000 = this;
                var10001 = var1;
                var10002 = var4;
                var10003 = 0;
                if (this.a(var2, var3, var1, var4, var1 + 20, var4 + 20)) {
                    var10004 = 170;
                    break label27;
                }
            } catch (RuntimeException var5) {
                throw a(var5);
            }

            var10004 = 150;
        }

        var10000.func_73729_b(var10001, var10002, var10003, var10004, 20, 20);
    }

    public boolean func_73868_f() {
        return false;
    }

    void c() {
        this.field_146297_k.func_147118_V().func_147682_a(PositionedSoundRecord.func_184371_a(SoundEvents.field_187909_gi, 1.0F));
        HashSet var1 = new HashSet();
        ArrayList var2 = new ArrayList();

        for (Entry var4 : m) {
            try {
                if (var4.getKey() == gw.GIRL_SPECIFIC) {
                    var2.add(((Entry)var4.getValue()).getValue());
                    continue;
                }
            } catch (RuntimeException var9) {
                throw a(var9);
            }

            Entry var5 = (Entry)var4.getValue();
            Integer var6 = (Integer)var5.getValue();

            try {
                if (var6 == 0) {
                    continue;
                }
            } catch (RuntimeException var8) {
                throw a(var8);
            }

            String var7 = (String)((List)var5.getKey()).get(var6);
            var1.add(var7);
        }

        ge.b.sendToServer(new fw(em.a(var1), this.g, var2));
        this.field_146297_k.field_71439_g.func_71053_j();
    }

    public void a(gw var1, boolean var2, int var3) {
        this.field_146297_k.func_147118_V().func_147682_a(PositionedSoundRecord.func_184371_a(SoundEvents.field_187909_gi, 1.0F));
        ArrayList var4 = new ArrayList();
        ArrayList var5 = new ArrayList();
        int var6 = 0;

        for (Entry var8 : m) {
            try {
                if (((gw)var8.getKey()).equals(var1)) {
                    var4.add(var8);
                    var5.add(var6);
                }
            } catch (RuntimeException var20) {
                throw a(var20);
            }

            var6++;
        }

        try {
            if (var4.size() == 0) {
                return;
            }
        } catch (RuntimeException var16) {
            throw a(var16);
        }

        Entry var21;
        int var22;
        if (var4.size() == 1) {
            var21 = (Entry)var4.get(0);
            var22 = (Integer)var5.get(0);
        } else {
            int var9;
            label87: {
                label86: {
                    try {
                        if (this.i == 0 || var3 > this.i - 1 + gw.a()) {
                            break label86;
                        }
                    } catch (RuntimeException var19) {
                        throw a(var19);
                    }

                    var9 = var3;
                    break label87;
                }

                var9 = var3 - (this.i + gw.a());
            }

            var21 = (Entry)var4.get(var9);
            var22 = (Integer)var5.get(var9);
        }

        try {
            if (var21 == null) {
                return;
            }
        } catch (RuntimeException var18) {
            throw a(var18);
        }

        Entry var23 = (Entry)var21.getValue();
        int var10 = (Integer)var23.getValue();
        int var11 = ((List)var23.getKey()).size();

        label71: {
            label70: {
                try {
                    if (var2) {
                        if (++var10 < var11) {
                            break label71;
                        }
                        break label70;
                    }
                } catch (RuntimeException var17) {
                    throw a(var17);
                }

                if (--var10 < 0) {
                    var10 = var11 - 1;
                }
                break label71;
            }

            var10 = 0;
        }

        m.set(var22, new SimpleEntry<>((gw)var21.getKey(), new SimpleEntry<>((List<String>)((Entry)var21.getValue()).getKey(), var10)));
        ArrayList var12 = new ArrayList();

        for (Entry var14 : m) {
            try {
                if (var14.getKey() == gw.GIRL_SPECIFIC) {
                    var12.add(var14);
                }
            } catch (RuntimeException var15) {
                throw a(var15);
            }
        }

        this.c.b(var12);
    }

    public void a(int var1, int var2, float var3, cy var4) {
        this.a(var1, var2, var3, var4, 1.876945F);
    }

    public void a(cy var1) {
        a var10000;
        int var10001;
        int var10002;
        float var10003;
        cy var10004;
        float var10005;
        byte var10006;
        label16: {
            try {
                var10000 = this;
                var10001 = this.n;
                var10002 = this.l;
                var10003 = this.o;
                var10004 = var1;
                var10005 = 2.876945F;
                if (var1.f) {
                    var10006 = 1;
                    break label16;
                }
            } catch (RuntimeException var2) {
                throw a(var2);
            }

            var10006 = 0;
        }

        var10000.a(var10001, var10002, var10003, var10004, var10005, var10006);
    }

    public void a(String var1, int var2, int var3) {
        this.func_146279_a(var1, var2, var3);
    }

    protected void func_146273_a(int var1, int var2, int var3, long var4) {
        try {
            super.func_146273_a(var1, var2, var3, var4);
            if (var3 != 0) {
                return;
            }
        } catch (RuntimeException var7) {
            throw a(var7);
        }

        try {
            if (var1 < this.field_146294_l / 2) {
                return;
            }
        } catch (RuntimeException var8) {
            throw a(var8);
        }

        int var6 = var1 - this.t;
        a.add(var6);
        this.t = var1;
    }

    protected void func_73864_a(int var1, int var2, int var3) throws IOException {
        try {
            super.func_73864_a(var1, var2, var3);
            this.q.func_148179_a(var1, var2, var3);
            if (var3 != 0) {
                return;
            }
        } catch (URISyntaxException var15) {
            throw a(var15);
        }

        this.f = true;
        this.p = true;
        this.t = var1;
        int var4 = this.n - this.a(15.0F);
        int var5 = this.l - 20;

        try {
            if (this.a(var1, var2, var4, var5, var4 + 20, var5 + 20)) {
                this.c();
            }
        } catch (URISyntaxException var14) {
            throw a(var14);
        }

        try {
            if (br.g() != null) {
                return;
            }
        } catch (URISyntaxException var10) {
            throw a(var10);
        }

        var5 = this.l - 40;
        if (this.a(var1, var2, var4, var5, var4 + 20, var5 + 20)) {
            this.field_146297_k.func_147118_V().func_147682_a(PositionedSoundRecord.func_184371_a(SoundEvents.field_187909_gi, 1.0F));
            this.field_146297_k.field_71439_g.func_71053_j();
            int var19 = br.b(true);

            try {
                if (var19 != 0) {
                    br.d = true;
                    return;
                }
            } catch (URISyntaxException var11) {
                throw a(var11);
            }

            em var7 = em.b(this.g);

            try {
                if (var7 != null) {
                    a(var7);
                }
            } catch (URISyntaxException var8) {
                throw a(var8);
            }
        } else {
            try {
                var5 -= 20;
                if (this.a(var1, var2, var4, var5, var4 + 20, var5 + 20)) {
                    Desktop.getDesktop().open(new File(br.d()));
                    return;
                }
            } catch (URISyntaxException var9) {
                throw a(var9);
            }

            try {
                var5 -= 20;
                if (this.a(var1, var2, var4, var5, var4 + 20, var5 + 20)) {
                    try {
                        Desktop.getDesktop().browse(new URI("http://fapcraft.org/assets/video/tutorial/girl_wand.mp4"));
                    } catch (URISyntaxException var12) {
                        throw new RuntimeException(var12);
                    }
                }
            } catch (IOException var13) {
                throw a(var13);
            }
        }
    }

    protected void func_146286_b(int var1, int var2, int var3) {
        try {
            super.func_146286_b(var1, var2, var3);
            if (var3 == 0) {
                this.p = false;
                this.f = false;
            }
        } catch (RuntimeException var4) {
            throw a(var4);
        }

        this.d = h;
    }

    int a(float var1) {
        return Math.round(this.field_146294_l * (var1 / 100.0F));
    }

    int b(float var1) {
        return Math.round(this.field_146295_m * (var1 / 100.0F));
    }

    public void func_146281_b() {
        super.func_146281_b();
        this.c.field_70170_p.func_72973_f(this.c);
        a.clear();
        m.clear();
    }

    public em d() {
        return this.c;
    }

    public void a(int var1, int var2, int var3, int var4) {
        this.field_146297_k.field_71446_o.func_110577_a(k);
        this.func_73729_b(var1, var2, var3, var4, 20, 20);
    }

    public void a(int var1, int var2, int var3) {
        this.a(var1, var2, var3, 0);
    }

    public void a(int var1, int var2, e1 var3) {
        this.a(var1, var2, var3.c, var3.b);
    }

    void a(int var1, int var2, float var3, EntityLivingBase var4, float var5) {
        this.a(var1, var2, var3, var4, var5, 0);
    }

    void a(int var1, int var2, float var3, EntityLivingBase var4, float var5, int var6) {
        float var7 = var4.field_70761_aq;
        float var8 = var4.field_70177_z;
        float var9 = var4.field_70125_A;
        float var10 = var4.field_70758_at;
        float var11 = var4.field_70759_as;
        var4.field_70761_aq = 0.0F;
        var4.field_70177_z = 0.0F;
        var4.field_70125_A = 0.0F;
        var4.field_70758_at = 0.0F;
        var4.field_70759_as = 0.0F;
        GlStateManager.func_179142_g();
        GlStateManager.func_179094_E();
        GlStateManager.func_179109_b(var1, var2, 50.0F);
        GlStateManager.func_179152_a(-var3, var3, var3);
        GlStateManager.func_179114_b(180.0F, 0.0F, 0.0F, 1.0F);
        GlStateManager.func_179114_b(135.0F, 0.0F, 1.0F, 0.0F);
        RenderHelper.func_74519_b();
        GlStateManager.func_179114_b(-135.0F, 0.0F, 1.0F, 0.0F);
        GlStateManager.func_179109_b(0.0F, 0.0F, var6);
        GlStateManager.func_179114_b(b, 0.0F, 1.0F, 0.0F);
        GlStateManager.func_179114_b(0.25F, 1.0F, 0.0F, 0.0F);
        GlStateManager.func_179109_b(0.0F, 0.0F, 0.0F);
        RenderManager var12 = Minecraft.func_71410_x().func_175598_ae();
        var12.func_178631_a(180.0F);
        var12.func_178633_a(false);
        var12.func_188391_a(var4, 0.0, 0.0, 0.0, 0.0F, var5, false);
        var12.func_178633_a(true);
        GlStateManager.func_179121_F();
        RenderHelper.func_74518_a();
        GlStateManager.func_179101_C();
        GlStateManager.func_179138_g(OpenGlHelper.field_77476_b);
        GlStateManager.func_179090_x();
        GlStateManager.func_179138_g(OpenGlHelper.field_77478_a);
        var4.field_70761_aq = var7;
        var4.field_70177_z = var8;
        var4.field_70125_A = var9;
        var4.field_70758_at = var10;
        var4.field_70759_as = var11;
    }

    void a() {
        try {
            if (this.p) {
                return;
            }
        } catch (RuntimeException var5) {
            throw a(var5);
        }

        float var1 = Minecraft.func_175610_ah();
        if (var1 == 0.0F) {
            var1 = 0.1F;
        }

        try {
            if (this.d == 0) {
                b = b + this.e * 10 / var1;
                return;
            }
        } catch (RuntimeException var4) {
            throw a(var4);
        }

        try {
            b = b + this.d / var1;
            this.d = (int)(this.d * (1.0F - 0.25F / var1));
            if (Math.abs(this.d) > 10) {
                return;
            }
        } catch (RuntimeException var2) {
            throw a(var2);
        }

        a var10000;
        byte var10001;
        label33: {
            try {
                var10000 = this;
                if (this.d > 0) {
                    var10001 = 1;
                    break label33;
                }
            } catch (RuntimeException var3) {
                throw a(var3);
            }

            var10001 = -1;
        }

        var10000.e = var10001;
        this.d = 0;
    }

    @SideOnly(Side.CLIENT)
    public static void a(@Nonnull em param0) {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.RuntimeException: parsing failure!
        //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
        //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
        //
        // Bytecode:
        // 00: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
        // 03: astore 1
        // 04: aload 1
        // 05: getfield net/minecraft/client/Minecraft.field_71462_r Lnet/minecraft/client/gui/GuiScreen;
        // 08: instanceof com/trolmastercard/sexmod/a
        // 0b: ifeq 13
        // 0e: return
        // 0f: invokestatic com/trolmastercard/sexmod/a.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 12: athrow
        // 13: invokestatic com/trolmastercard/sexmod/br.g ()Ljava/lang/String;
        // 16: ifnull 26
        // 19: invokestatic com/trolmastercard/sexmod/br.b ()Z
        // 1c: ifeq 2e
        // 1f: goto 26
        // 22: invokestatic com/trolmastercard/sexmod/a.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 25: athrow
        // 26: bipush 1
        // 27: goto 2f
        // 2a: invokestatic com/trolmastercard/sexmod/a.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 2d: athrow
        // 2e: bipush 0
        // 2f: istore 2
        // 30: iload 2
        // 31: ifne 62
        // 34: aload 1
        // 35: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
        // 38: new net/minecraft/util/text/TextComponentString
        // 3b: dup
        // 3c: new java/lang/StringBuilder
        // 3f: dup
        // 40: invokespecial java/lang/StringBuilder.<init> ()V
        // 43: ldc "You have to whitelist the server to use its custom models. "
        // 45: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
        // 48: getstatic net/minecraft/util/text/TextFormatting.YELLOW Lnet/minecraft/util/text/TextFormatting;
        // 4b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
        // 4e: ldc "/whitelistserver"
        // 50: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
        // 53: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
        // 56: invokespecial net/minecraft/util/text/TextComponentString.<init> (Ljava/lang/String;)V
        // 59: bipush 1
        // 5a: invokevirtual net/minecraft/client/entity/EntityPlayerSP.func_146105_b (Lnet/minecraft/util/text/ITextComponent;Z)V
        // 5d: return
        // 5e: invokestatic com/trolmastercard/sexmod/a.a (Ljava/lang/Exception;)Ljava/lang/Exception;
        // 61: athrow
        // 62: aload 1
        // 63: aload 1
        // 64: aload 0
        // 65: invokedynamic run (Lnet/minecraft/client/Minecraft;Lcom/trolmastercard/sexmod/em;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, com/trolmastercard/sexmod/a.lambda$openUI$0 (Lnet/minecraft/client/Minecraft;Lcom/trolmastercard/sexmod/em;)V, ()V ]
        // 6a: invokevirtual net/minecraft/client/Minecraft.func_152344_a (Ljava/lang/Runnable;)Lcom/google/common/util/concurrent/ListenableFuture;
        // 6d: pop
        // 6e: return
        // try (2 -> 7): 7 java/lang/RuntimeException
        // try (9 -> 13): 14 java/lang/RuntimeException
        // try (11 -> 18): 18 java/lang/RuntimeException
        // try (22 -> 42): 42 java/lang/RuntimeException
    }

    private static Exception a(Exception var0) {
        return var0;
    }

    @SideOnly(Side.CLIENT)
    public static class b {
        @SubscribeEvent
        @SideOnly(Side.CLIENT)
        public void a(KeyInputEvent param1) {
            // $VF: Couldn't be decompiled
            // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
            // java.lang.RuntimeException: parsing failure!
            //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
            //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
            //
            // Bytecode:
            // 00: getstatic com/trolmastercard/sexmod/ClientProxy.keyBindings [Lnet/minecraft/client/settings/KeyBinding;
            // 03: bipush 1
            // 04: aaload
            // 05: invokevirtual net/minecraft/client/settings/KeyBinding.func_151468_f ()Z
            // 08: ifne 10
            // 0b: return
            // 0c: invokestatic com/trolmastercard/sexmod/a$b.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 0f: athrow
            // 10: getstatic com/trolmastercard/sexmod/br.d Z
            // 13: ifeq 3c
            // 16: bipush 0
            // 17: bipush 1
            // 18: invokestatic com/trolmastercard/sexmod/br.b (Z)I
            // 1b: if_icmpeq 2d
            // 1e: goto 25
            // 21: invokestatic com/trolmastercard/sexmod/a$b.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 24: athrow
            // 25: bipush 1
            // 26: goto 2e
            // 29: invokestatic com/trolmastercard/sexmod/a$b.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 2c: athrow
            // 2d: bipush 0
            // 2e: putstatic com/trolmastercard/sexmod/br.d Z
            // 31: getstatic com/trolmastercard/sexmod/br.d Z
            // 34: ifeq 3c
            // 37: return
            // 38: invokestatic com/trolmastercard/sexmod/a$b.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 3b: athrow
            // 3c: invokestatic net/minecraft/client/Minecraft.func_71410_x ()Lnet/minecraft/client/Minecraft;
            // 3f: astore 2
            // 40: aload 2
            // 41: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
            // 44: invokevirtual net/minecraft/client/entity/EntityPlayerSP.getPersistentID ()Ljava/util/UUID;
            // 47: invokestatic com/trolmastercard/sexmod/ei.d (Ljava/util/UUID;)Lcom/trolmastercard/sexmod/ei;
            // 4a: astore 3
            // 4b: aload 3
            // 4c: ifnonnull 65
            // 4f: aload 2
            // 50: getfield net/minecraft/client/Minecraft.field_71439_g Lnet/minecraft/client/entity/EntityPlayerSP;
            // 53: new net/minecraft/util/text/TextComponentString
            // 56: dup
            // 57: ldc "You have to turn into the girl you want to customize"
            // 59: invokespecial net/minecraft/util/text/TextComponentString.<init> (Ljava/lang/String;)V
            // 5c: bipush 1
            // 5d: invokevirtual net/minecraft/client/entity/EntityPlayerSP.func_146105_b (Lnet/minecraft/util/text/ITextComponent;Z)V
            // 60: return
            // 61: invokestatic com/trolmastercard/sexmod/a$b.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
            // 64: athrow
            // 65: aload 3
            // 66: invokestatic com/trolmastercard/sexmod/a.a (Lcom/trolmastercard/sexmod/em;)V
            // 69: return
            // try (0 -> 6): 6 java/lang/RuntimeException
            // try (8 -> 14): 15 java/lang/RuntimeException
            // try (10 -> 19): 19 java/lang/RuntimeException
            // try (22 -> 26): 26 java/lang/RuntimeException
            // try (35 -> 46): 46 java/lang/RuntimeException
        }

        @SubscribeEvent
        @SideOnly(Side.CLIENT)
        public void a(ClientTickEvent var1) {
            com.trolmastercard.sexmod.a.h = com.trolmastercard.sexmod.a.s;
            com.trolmastercard.sexmod.a.s = 0;

            for (Integer var3 : com.trolmastercard.sexmod.a.a) {
                com.trolmastercard.sexmod.a.s = com.trolmastercard.sexmod.a.s + var3;
            }

            com.trolmastercard.sexmod.a.a.clear();
        }

        private static RuntimeException a(RuntimeException var0) {
            return var0;
        }
    }
}
