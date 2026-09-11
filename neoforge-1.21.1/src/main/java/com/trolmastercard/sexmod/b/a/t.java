package com.trolmastercard.sexmod.b.a;

import net.minecraft.resources.ResourceLocation;

public class t extends s<com.trolmastercard.sexmod.f.c.c> {
    public t() {
        // $VF: Couldn't be decompiled
        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
        // java.lang.StackOverflowError
        //   at java.base/java.io.ByteArrayInputStream.read(ByteArrayInputStream.java:175)
        //   at java.base/java.io.DataInputStream.readFully(DataInputStream.java:208)
        //   at java.base/java.io.DataInputStream.readUnsignedShort(DataInputStream.java:341)
        //   at org.jetbrains.java.decompiler.struct.attr.StructLineNumberTableAttribute.initContent(StructLineNumberTableAttribute.java:24)
        //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:72)
        //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:55)
        //   at org.jetbrains.java.decompiler.struct.attr.StructCodeAttribute.initContent(StructCodeAttribute.java:54)
        //   at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:72)
        //   at org.jetbrains.java.decompiler.struct.StructMethod.create(StructMethod.java:44)
        //   at org.jetbrains.java.decompiler.struct.StructClass.create(StructClass.java:86)
        //   at org.jetbrains.java.decompiler.struct.ContextUnit.tryLoadClass(ContextUnit.java:102)
        //   at org.jetbrains.java.decompiler.struct.StructContext.tryLoadClass(StructContext.java:110)
        //   at org.jetbrains.java.decompiler.struct.StructContext.lambda$getClass$0(StructContext.java:81)
        //
        // Bytecode:
        // 0: aload 0
        // 1: invokespecial com/trolmastercard/sexmod/b/a/s.<init> ()V
        // 4: return
    }

    @Override
    protected ResourceLocation[] i() {
        return new ResourceLocation[]{
            ResourceLocation.fromNamespaceAndPath("sexmod", "allie/allie"),
            ResourceLocation.fromNamespaceAndPath("sexmod", "allie/armored"),
            ResourceLocation.fromNamespaceAndPath("sexmod", "allie/allie")
        };
    }

    @Override
    public ResourceLocation j() {
        return ResourceLocation.fromNamespaceAndPath("sexmod", "textures/entity/allie/allie.png");
    }

    @Override
    public ResourceLocation a(com.trolmastercard.sexmod.f.b.k var1) {
        return ResourceLocation.fromNamespaceAndPath("sexmod", "allie/allie");
    }

    @Override
    public String[] a() {
        return new String[]{"armorHelmet"};
    }

    @Override
    public String[] c() {
        return new String[]{"armorShoulderR", "armorShoulderL", "armorChest", "armorBoobs"};
    }

    @Override
    public String[] d() {
        return new String[]{"boobsFlesh", "clothes", "clothesR", "clothesL"};
    }
}
