/*
$VF: Unable to decompile class
Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
java.lang.StackOverflowError
  at java.base/java.io.ByteArrayInputStream.read(ByteArrayInputStream.java:175)
  at java.base/java.io.DataInputStream.readFully(DataInputStream.java:208)
  at java.base/java.io.DataInputStream.readUnsignedShort(DataInputStream.java:341)
  at org.jetbrains.java.decompiler.struct.attr.StructLineNumberTableAttribute.initContent(StructLineNumberTableAttribute.java:24)
  at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:72)
  at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:55)
  at org.jetbrains.java.decompiler.struct.attr.StructCodeAttribute.initContent(StructCodeAttribute.java:54)
  at org.jetbrains.java.decompiler.struct.StructMember.readAttributes(StructMember.java:72)
  at org.jetbrains.java.decompiler.struct.StructMethod.create(StructMethod.java:44)
  at org.jetbrains.java.decompiler.struct.StructClass.create(StructClass.java:86)
  at org.jetbrains.java.decompiler.struct.ContextUnit.tryLoadClass(ContextUnit.java:102)
  at org.jetbrains.java.decompiler.struct.StructContext.tryLoadClass(StructContext.java:110)
  at org.jetbrains.java.decompiler.struct.StructContext.lambda$getClass$0(StructContext.java:81)
*/