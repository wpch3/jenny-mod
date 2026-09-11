# 在本机编译 Jenny Mod 1.21.1（NeoForge）

沙盒没有 JDK，必须在你的 Windows + JDK 21 上构建。

## 环境

- 已确认 JDK：
  `C:\Users\Administrator\AppData\Local\Programs\Eclipse Adoptium\jdk-21.0.12.101-hotspot\bin\java.exe`
- NeoForge **1.21.1**
- 依赖 **GeckoLib NeoForge 1.21.1**（`geckolib_version` 见 `gradle.properties`）

## 一次性：生成 Gradle Wrapper

在空目录下载官方 NeoForge 1.21.1 MDK 也可以，但本目录已含源码。若没有 `gradlew.bat`：

1. 安装 Gradle 8.8+，或从 https://github.com/neoforged/moddev-gradle 对照 MDK。
2. 更省事：去 https://files.minecraftforge.net/ 不对，去
   https://projects.neoforged.net/ 下载 **1.21.1 MDK**，把 MDK 里的
   `gradlew`、`gradlew.bat`、`gradle/wrapper/` 复制进本目录 `neoforge-1.21.1/`。

## 编译

CMD：

```bat
cd /d C:\Users\Administrator\Downloads\jenny-mod\neoforge-1.21.1
set JAVA_HOME=C:\Users\Administrator\AppData\Local\Programs\Eclipse Adoptium\jdk-21.0.12.101-hotspot
gradlew.bat build
```

成功后 jar 在：

`neoforge-1.21.1\build\libs\jenny-mod-1.21.1-stable.1.jar`

放到 `.minecraft\mods`，同时安装对应版本 **GeckoLib**。

## 已在源码里修的问题

1. **授权锁**：同人版从 jar 运行会把所有 NPC `discard()`。已改为始终启用。
2. **动作通道叠 idle**：idle 时 action 控制器不再再播一遍全身动画（T 姿/错动作主因之一）。
3. **Jenny 循环标记**：intro / start / strip / payment / cum / attack / throwpearl 改为播一次并停在末帧，循环动作仍 LOOP。

## 尚未 1.12 完全对等（下一阶段）

- 1.12 有约 400+ 混淆类（世界生成部落、完整 AI、更多动作状态机）。
- 1.21 同人只有约 190 个类，功能子集。要 100% 对等必须按 1.12 逐系统移植。
- 其他角色的 loop 标记尚未逐条对齐。
- Gradle NeoForge 插件版本需用你本机 MDK 的 wrapper 验证；首次 `build` 报错把日志发回来。
