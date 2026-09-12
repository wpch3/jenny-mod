package com.trolmastercard.sexmod;

import net.minecraft.ChatFormatting;
import net.minecraft.core.Vec3i;

public enum EyeAndKoboldColor {
    a(69, 141, 113, 91, 167, 128, 9, ChatFormatting.DARK_GREEN),
    b(241, 177, 77, 255, 226, 170, 4, ChatFormatting.YELLOW),
    c(230, 27, 57, 253, 232, 239, 14, ChatFormatting.RED),
    d(196, 148, 207, 246, 188, 96, 10, ChatFormatting.DARK_PURPLE),
    e(170, 208, 47, 230, 214, 104, 5, ChatFormatting.GREEN),
    f(173, 138, 128, 118, 151, 180, 2, ChatFormatting.LIGHT_PURPLE),
    g(92, 92, 110, 198, 193, 165, 7, ChatFormatting.DARK_GRAY),
    h(200, 145, 112, 253, 228, 198, 12, ChatFormatting.GOLD),
    i(65, 84, 116, 104, 137, 146, 11, ChatFormatting.DARK_BLUE),
    j(100, 163, 206, 138, 235, 242, 3, ChatFormatting.DARK_AQUA),
    k(136, 136, 134, 255, 255, 255, 0, ChatFormatting.GRAY);

    private final Vec3i l;
    private final Vec3i m;
    private final int n;
    private final ChatFormatting o;

    EyeAndKoboldColor(int var3, int var4, int var5, int var6, int var7, int var8, int var9, ChatFormatting var10) {
        this.l = new Vec3i(var3, var4, var5);
        this.m = new Vec3i(var6, var7, var8);
        this.n = var9;
        this.o = var10;
    }

    public static int a(EyeAndKoboldColor var0) {
        int var1 = 0;

        for (EyeAndKoboldColor var5 : values()) {
            if (var0 == var5) {
                return var1;
            }

            var1++;
        }

        return var1;
    }

    public static EyeAndKoboldColor a(String var0) {
        try {
            return valueOf(var0);
        } catch (IllegalArgumentException var2) {
            return a;
        }
    }

    public static EyeAndKoboldColor a(Vec3i var0) {
        for (EyeAndKoboldColor var4 : values()) {
            if (var0.equals(var4.a())) {
                return var4;
            }
        }

        return a;
    }

    public Vec3i a() {
        return this.l;
    }

    public Vec3i b() {
        return this.m;
    }

    public ChatFormatting c() {
        return this.o;
    }
}
