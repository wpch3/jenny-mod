package com.trolmastercard.sexmod;

import com.mojang.logging.LogUtils;
import com.trolmastercard.sexmod.d.e;
import com.trolmastercard.sexmod.i.b;
import com.trolmastercard.sexmod.i.c;
import com.trolmastercard.sexmod.i.d;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod("sexmod")
public class Main {
    public static final Logger a = LogUtils.getLogger();

    public Main(IEventBus var1, ModContainer var2) {
        a.info("Jenny Mod (26.1.2 NeoForge port) loading");
        e.b();
        com.trolmastercard.sexmod.i.a.a(var1);
        b.a(var1);
        com.trolmastercard.sexmod.i.e.a(var1);
        d.a(var1);
        c.a(var1);
        var1.addListener(b::a);
    }
}
