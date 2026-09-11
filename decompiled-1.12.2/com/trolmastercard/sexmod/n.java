package com.trolmastercard.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.UUID;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class n implements IMessage {
    boolean b;
    UUID d;
    String a;
    String c;

    public n() {
        this.b = false;
    }

    public n(UUID var1, String var2, String var3) {
        this.d = var1;
        this.a = var2;
        this.c = var3;
        this.b = true;
    }

    public void fromBytes(ByteBuf var1) {
        this.d = UUID.fromString(ByteBufUtils.readUTF8String(var1));
        this.a = ByteBufUtils.readUTF8String(var1);
        this.c = ByteBufUtils.readUTF8String(var1);
        this.b = true;
    }

    public void toBytes(ByteBuf var1) {
        ByteBuf var10000;
        String var10001;
        label16: {
            try {
                ByteBufUtils.writeUTF8String(var1, this.d.toString());
                ByteBufUtils.writeUTF8String(var1, this.a);
                var10000 = var1;
                if (this.c == null) {
                    var10001 = "null";
                    break label16;
                }
            } catch (RuntimeException var2) {
                throw a(var2);
            }

            var10001 = this.c;
        }

        ByteBufUtils.writeUTF8String(var10000, var10001);
    }

    private static RuntimeException a(RuntimeException var0) {
        return var0;
    }

// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.modules.decompiler.stats.Statement.getVarDefinitions()" because "stat" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1592)
//   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1835)
//   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:2029)
//   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1619)
//   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1739)
//   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1739)
//   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.remapClashingNames(VarDefinitionHelper.java:1584)
//   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarProcessor.rerunClashing(VarProcessor.java:99)
//   at org.jetbrains.java.decompiler.main.ClassWriter.invokeProcessors(ClassWriter.java:145)
//   at org.jetbrains.java.decompiler.main.ClassWriter.writeClass(ClassWriter.java:379)
//   at org.jetbrains.java.decompiler.main.ClassWriter.writeClass(ClassWriter.java:520)
//   at org.jetbrains.java.decompiler.main.ClassesProcessor.writeClass(ClassesProcessor.java:521)
//   at org.jetbrains.java.decompiler.main.Fernflower.getClassContent(Fernflower.java:200)
//   at org.jetbrains.java.decompiler.struct.ContextUnit.lambda$save$3(ContextUnit.java:221)
}
