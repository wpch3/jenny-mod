# 构建指南（Jenny Mod · NeoForge 1.21.1 移植版）

> 目标环境：Minecraft 1.21.1 + NeoForge 21.1.x + GeckoLib 4.9.x + Java 21

## 1. 准备工作

1. 安装 **JDK 21**（推荐 Microsoft / Temurin / Oracle 任一发行版），并设置 `JAVA_HOME`。
   验证：`java -version` 应显示 `21`。
2. 保证构建机可访问互联网（Gradle 插件门户、Mojang、NeoForged、GeckoLib/Cloudsmith、Modrinth 仓库）。
3. （可选）安装 IntelliJ IDEA，打开本目录即可自动同步 Gradle 工程。

## 2. 首次构建

```bash
cd jenny-neoforge

# Linux / macOS
chmod +x gradlew
./gradlew build

# Windows
gradlew.bat build
```

> 说明：仓库中没有提交 `gradle/wrapper/gradle-wrapper.jar`（二进制引导文件）。
> - 若本机已安装 Gradle 8.10+：先执行一次 `gradle wrapper --gradle-version 9.2.1` 生成 wrapper，再用 `./gradlew`。
> - 若使用 IntelliJ：直接打开工程，IDE 会自动配置 Gradle，无需手动处理 wrapper。

首次构建会下载 Minecraft、NeoForge、Parchment 映射与 GeckoLib，耗时约 5–20 分钟（视网络而定）。

## 3. 产物

构建成功后，mod jar 位于：

```
build/libs/sexmod-1.1.0.jar
```

把它与 `geckolib-neoforge-1.21.1-4.9.2.jar` 一起放入客户端/服务端的 `mods/` 文件夹即可。
GeckoLib 下载地址：https://modrinth.com/mod/geckolib （选 NeoForge 1.21.1 / 4.9.x）。

## 4. 常用任务

| 命令 | 说明 |
|---|---|
| `./gradlew build` | 完整构建（含测试与 jar） |
| `./gradlew runClient` | 启动游戏客户端联调 |
| `./gradlew runServer` | 启动集成服务端联调 |
| `./gradlew runData` | 运行数据生成（如需重新生成数据文件） |

## 5. 版本说明

- `gradle.properties` 中固定：`neo_version=21.1.250`、`geckolib_version=4.9.2`。
- 如需升级 NeoForge/GeckoLib 小版本，直接改这两个属性后重新构建即可；
  若升级涉及大版本（如 GeckoLib 5.x），动画/渲染 API 会有破坏性变更，需要同步改代码。

## 6. 构建失败排查

1. `Could not resolve net.neoforged...`：检查网络/代理，确认能访问 `maven.neoforged.org`。
2. `Could not resolve software.bernie.geckolib...`：确认能访问 `dl.cloudsmith.io`，
   或改用 Modrinth 坐标（见 `build.gradle` 注释）：`maven.modrinth:8BmcQJ2H:tPkJmim6`。
3. `Unsupported class file major version`：Gradle 用的 JDK 不是 21，检查 `JAVA_HOME`
   与 `org.gradle.java.home`。
4. 报代码编译错误：把完整报错贴给移植作者，按《移植报告》联调（见仓库根目录 `PORT_REPORT.md`）。
