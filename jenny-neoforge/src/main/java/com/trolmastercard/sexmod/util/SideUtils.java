package com.trolmastercard.sexmod.util;

import com.trolmastercard.sexmod.Sexmod;
import net.minecraft.server.MinecraftServer;
import net.neoforged.neoforge.server.ServerLifecycleHooks;

public class SideUtils {
    public static boolean a() {
        String var0 = Thread.currentThread().getName().toLowerCase();
        if (var0.contains("server")) {
            return true;
        }

        if (var0.contains("client")) {
            return false;
        }

        MinecraftServer var1 = ServerLifecycleHooks.getCurrentServer();
        if (var1 == null) {
            return false;
        }

        boolean var2 = var1.isSameThread();
        Sexmod.a.warn("couldn't clarify if is running on a server or client thread. Came to the solution onServer=" + var2);
        return var2;
    }
}
