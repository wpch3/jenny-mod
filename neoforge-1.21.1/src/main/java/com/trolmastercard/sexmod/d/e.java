package com.trolmastercard.sexmod.d;

import com.trolmastercard.sexmod.Main;

/**
 * Original fan-port gated all NPC ticks behind a machine-bound license key,
 * which deleted every girl when running from a jar. This stable port keeps
 * gameplay enabled (the 1.12.2 release has no such lock).
 */
public final class e {
    private e() {
    }

    public static boolean a() {
        return true;
    }

    public static void b() {
        Main.a.info("[sexmod] features enabled (license gate removed for 1.21.1 stable port).");
    }

    static boolean a(String var0) {
        return true;
    }
}
