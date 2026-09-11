# Jenny / Sexmod 反编译指南（给移植用）

目标：**NeoForge 1.21.1**，功能与 `Trolmastercard-Jenny-Mod-Forge-1.12.2` 对等。  
本仓库目前只有 `.class`，没有 Java 源码，无法直接编译或逐条修动作。

请在你本机（已装 JDK 17 或 21）按下面做完，把**源码目录**发回本仓库。

---

## 0. 准备

1. 安装 **JDK 17 或 21 都可以**（NeoForge 1.21.1 官方就是 JDK 21；反编译用 21 没问题）。
   在 CMD 里执行 `java -version`，应看到 `21.x.x`。
2. 你已下载的 Vineflower：
   `C:\Users\Administrator\Downloads\vineflower-1.12.0.jar`
3. 本地仓库：
   `C:\Users\Administrator\Downloads\jenny-mod`
4. 可选备选：CFR、JD-GUI、Recaf（看不懂 Vineflower 输出时对照）。

不要用在线网站上传模组。

### 若报 `UnsupportedClassVersionError` / class file version 61.0 vs 52.0

说明 `java` 命令指向的是 **Java 8**。先查本机到底有哪些 JDK：

```bat
where java
java -version
dir "C:\Program Files\Java"
dir "C:\Program Files\Eclipse Adoptium"
dir "C:\Program Files\Microsoft"
dir "C:\Program Files\Java\jdk-21*"
```

本机 JDK 21（已确认）：

`C:\Users\Administrator\AppData\Local\Programs\Eclipse Adoptium\jdk-21.0.12.101-hotspot\bin\java.exe`

不要用裸的 `java`（那是 Java 8）。先验证：

```bat
"C:\Users\Administrator\AppData\Local\Programs\Eclipse Adoptium\jdk-21.0.12.101-hotspot\bin\java.exe" -version
```

能显示 `21` 后再用同一条 `java.exe` 跑 Vineflower（见下方命令）。  
若根本没有 jdk-17/21：去 https://adoptium.net/ 下载 **Temurin 21 (JDK, Windows x64 MSI)**，安装时勾选 **Set JAVA_HOME** 和 **Add to PATH**，然后**关掉 CMD 重开**。安装后可把旧 Java 8 从 PATH 里拿掉，避免再次抢命令。

---

## 1. 反编译 1.12.2 稳定版（功能权威）

仓库里已经是解包后的目录：

```
Trolmastercard-Jenny-Mod-Forge-1.12.2/
  com/trolmastercard/sexmod/*.class
  assets/sexmod/...
```

在 **CMD**（不要用 PowerShell 的话也可以，命令相同）里整段复制：

```bat
cd /d C:\Users\Administrator\Downloads\jenny-mod

java -jar C:\Users\Administrator\Downloads\vineflower-1.12.0.jar --decompile-inner --decompile-generics --ascii-strings --indent-string="    " Trolmastercard-Jenny-Mod-Forge-1.12.2  decompiled-1.12.2
```

完成后应出现：

```
decompiled-1.12.2/com/trolmastercard/sexmod/*.java
```

**注意：** 类名多半是 `a.java`、`b.java` 这种混淆名，这是原模组自己混淆的，正常。不要改名，整包原样交回来。

---

## 2. 反编译 1.21.1 同人版（API 参考）

同人发行包在：

```
jenny-mod1.21.1/jenny-mod-dist-1.21.1.jar
```

或已解包目录：

```
jenny-mod1.21.1/jenny-mod-dist-1.21.1/
```

```bat
java -jar vineflower.jar --decompile-inner --decompile-generics --ascii-strings --indent-string="    " jenny-mod1.21.1/jenny-mod-dist-1.21.1  decompiled-1.21.1
```

完成后应出现：

```
decompiled-1.21.1/com/trolmastercard/sexmod/**/*.java
```

---

## 3. 请把这些交回来（缺一不可）

把下面**整个目录**放进本仓库（或打 zip 发我）：

- `decompiled-1.12.2/`（1.12 功能权威源码）
- `decompiled-1.21.1/`（1.21 NeoForge 调用方式参考）

可选但很有用：

- 你玩 1.21.1 同人版时的**缺陷清单**（哪个角色、哪个动作、缺哪个物品/交互）
- 若你另有未混淆的 1.12 源码工程，直接给那个，比 Vineflower 结果更好

---

## 4. 常见问题

**Q: 反编译报错 / 输出很少？**  
先确认对的是**含 `com/trolmastercard/sexmod` 的那一层**，不要只反编译外层 installer（`jenny-mod1.21.1` 根目录是安装器，真正模组在 `jenny-mod-dist-1.21.1`）。

**Q: 要不要一起反编译 GeckoLib？**  
不要。GeckoLib 用 NeoForge 1.21.1 官方依赖即可（`[4.9,)`）。

**Q: 类名全是 a/b/c 怎么办？**  
交给移植工程处理。你只要保证 1.12 和 1.21.1 **两套都反编译完整**。

**Q: 我只会用图形界面？**  
用 Recaf 打开 jar → 选 File → Export / Decompile 整个包到文件夹。导出的 `.java` 同样放进上面两个目录名即可。

---

## 5. 我这边拿到源码后会做什么

1. 以 1.12 逻辑为准，对照 1.21.1 同人版的 NeoForge/GeckoLib 写法。
2. 建可编译的 NeoForge 1.21.1 工程，资源用 1.12 的 geo/animation/sound。
3. 修动作控制器、网络包、实体属性、物品/刷怪蛋注册，做到功能对等。
4. 不能保证一次提交就过编译（还缺 JDK 的沙盒要在你机器或后续环境里 `gradlew build`）。

**现在请先跑第 1、2 步，把 `decompiled-1.12.2` 和 `decompiled-1.21.1` 放进仓库。**
