package com.trolmastercard.sexmod.util;

public class AngleUtils {
    public static float a(float var0) {
        return (float)((Math.PI * 2) / (360.0 / var0));
    }

    public static double a(double var0) {
        return (180.0 / Math.PI) * var0;
    }
}
