#!/usr/bin/env python3
"""Mechanical migration: decompiled-1.21.1 (obfuscated pkgs) -> jenny-neoforge
readable packages/classes.

Strategy (safe by construction):
  1. Replace fully-qualified old names (com.trolmastercard.sexmod....) first.
     FQNs are unambiguous (javac resolves longest-package-prefix; same rule).
  2. Rewrite imports of old classes.
  3. Replace same-package / single-import simple names ONLY in positions that
     provably denote a type (type positions + static/nested/enum member access
     resolved via a member database built from the jar's .class files).
  4. Apply hand-written fixups for known decompiler artifacts.
  5. Emit files into the new package tree.

Run: python3 tools/migrate.py
Verify: python3 tools/check.py
"""
import os
import re
import sys
import zipfile

sys.path.insert(0, os.path.join(os.path.dirname(os.path.abspath(__file__))))
from classinfo import parse_class  # noqa: E402

ROOT = "/home/user/jenny-mod"
SRC = os.path.join(ROOT, "decompiled-1.21.1/com/trolmastercard/sexmod")
JAR = os.path.join(ROOT, "jenny-mod1.21.1/jenny-mod-dist-1.21.1.jar")
DST = os.path.join(ROOT, "jenny-neoforge/src/main/java/com/trolmastercard/sexmod")
OLD_BASE = "com.trolmastercard.sexmod"

# Jar truth sets (dotted FQN; nested as outer$inner). Built once in main().
JAR_TOP = set()
JAR_NESTED = set()


def build_jar_sets():
    z = zipfile.ZipFile(JAR)
    for n in z.namelist():
        if not n.startswith("com/trolmastercard/sexmod/") or not n.endswith(".class"):
            continue
        p = n[:-len(".class")].replace("/", ".")
        if "$" in p:
            JAR_NESTED.add(p)
        else:
            JAR_TOP.add(p)

# old_rel_path -> (old_simple_class, new_package_suffix, new_simple_class)
# new_package_suffix "" = com.trolmastercard.sexmod root.
CLASS_MAP = {
    # root
    "a": ("a", "", "EyeAndKoboldColor"),
    # block
    "a/a": ("a", "block", "ModFireBlock"),
    # client handlers
    "b/a": ("a", "client", "BedChestHighlighter"),
    "b/b": ("b", "client", "ClientUtils"),
    "b/c": ("c", "client", "GalathChargeWatcher"),
    "b/d": ("d", "server", "ServerEventHandler"),
    "b/e": ("e", "client", "HandRenderHandler"),
    "b/f": ("f", "client", "HornyMeterOverlay"),
    "b/g": ("g", "client", "GalathFlightOverlay"),
    "b/h": ("h", "client", "ClientSetup"),
    "b/i": ("i", "client", "FirstPersonCamera"),
    "b/j": ("j", "client", "NearbyNpcFinder"),
    "b/k": ("k", "client", "SceneHintOverlay"),
    "b/l": ("l", "client", "MovementInputHandler"),
    # models (missing-source ones are reconstructed by hand, not migrated)
    "b/a/b": ("B", "client.model", "PlayerLunaModel"),
    "b/a/g": ("g", "client.model", "CrossModel"),
    "b/a/h": ("h", "client.model", "KoboldStaffModel"),
    "b/a/j": ("j", "client.model", "GalathModel"),
    "b/a/k": ("k", "client.model", "GalathCoinModel"),
    "b/a/l": ("l", "client.model", "GeoModelBase"),
    "b/a/n": ("n", "client.model", "JennyModel"),
    "b/a/p": ("p", "client.model", "KoboldEggModel"),
    "b/a/q": ("q", "client.model", "LunaModel"),
    "b/a/r": ("r", "client.model", "ManglelieModel"),
    "b/a/s": ("s", "client.model", "GirlModel"),
    "b/a/t": ("t", "client.model", "PlayerAllieModel"),
    "b/a/x": ("x", "client.model", "PlayerGalathModel"),
    "b/a/z": ("z", "client.model", "PlayerJennyModel"),
    # sourceless models (jar-verified via SourceFile attr; in SKIP: refs map, files hand-written)
    "b/a/a": ("a", "client.model", "ModelSource"),
    "b/a/c": ("c", "client.model", "AllieModel"),
    "b/a/d": ("d", "client.model", "AllieLampModel"),
    "b/a/e": ("e", "client.model", "BeeModel"),
    "b/a/f": ("f", "client.model", "BiaModel"),
    "b/a/i": ("i", "client.model", "EllieModel"),
    "b/a/m": ("m", "client.model", "GoblinModel"),
    "b/a/o": ("o", "client.model", "KoboldModel"),
    "b/a/u": ("u", "client.model", "PlayerBeeModel"),
    "b/a/v": ("v", "client.model", "PlayerBiaModel"),
    "b/a/w": ("w", "client.model", "PlayerEllieModel"),
    "b/a/y": ("y", "client.model", "PlayerGoblinModel"),
    # renderers
    "b/b/a": ("A", "client.renderer", "PlayerJennyRenderer"),
    "b/b/b": ("B", "client.renderer", "PlayerKoboldRenderer"),
    "b/b/c": ("C", "client.renderer", "PlayerLunaRenderer"),
    "b/b/d": ("D", "client.renderer", "PlayerSlimeRenderer"),
    "b/b/e": ("E", "client.renderer", "PyrocinicalRenderer"),
    "b/b/f": ("F", "client.renderer", "SlimeGirlRenderer"),
    "b/b/g": ("g", "client.renderer", "KoboldStaffRenderer"),
    "b/b/h": ("h", "client.renderer", "EllieRenderer"),
    "b/b/i": ("i", "client.renderer", "EnergyBallRenderer"),
    "b/b/j": ("j", "client.renderer", "FriendlySlimeRenderer"),
    "b/b/k": ("k", "client.renderer", "GalathRenderer"),
    "b/b/l": ("l", "client.renderer", "GalathCoinRenderer"),
    "b/b/m": ("m", "client.renderer", "GoblinRenderer"),
    "b/b/n": ("n", "client.renderer", "JennyRenderer"),
    "b/b/o": ("o", "client.renderer", "KoboldRenderer"),
    "b/b/p": ("p", "client.renderer", "KoboldEggRenderer"),
    "b/b/q": ("q", "client.renderer", "LunaRenderer"),
    "b/b/r": ("r", "client.renderer", "LunaHookRenderer"),
    "b/b/s": ("s", "client.renderer", "ManglelieRenderer"),
    "b/b/t": ("t", "client.renderer", "GirlRenderer"),
    "b/b/u": ("u", "client.renderer", "PlayerAllieRenderer"),
    "b/b/v": ("v", "client.renderer", "PlayerBeeRenderer"),
    "b/b/w": ("w", "client.renderer", "PlayerBiaRenderer"),
    "b/b/x": ("x", "client.renderer", "PlayerEllieRenderer"),
    "b/b/y": ("y", "client.renderer", "PlayerGalathRenderer"),
    "b/b/z": ("z", "client.renderer", "PlayerGoblinRenderer"),
    # commands
    "c/a": ("a", "command", "ClientCommands"),
    "c/b": ("b", "command", "SexmodCommand"),
    # data / utils
    "d/a": ("a", "util", "BiMap"),
    "d/b": ("b", "client", "CustomModelLoader"),
    "d/c": ("c", "server", "TribeData"),
    "d/d": ("d", "server", "KoboldDen"),
    "d/f": ("f", "util", "ModState"),
    # server gameplay
    "e/a": ("a", "server", "SceneManager"),
    "e/b": ("b", "server", "NpcSpawner"),
    "e/c": ("c", "server", "GalathFightManager"),
    "e/d": ("d", "client.debug", "DebugScreenOpener"),
    "e/e": ("e", "server.debug", "DebugSceneTester"),
    # entities
    "f/a": ("a", "entity", "CustomModelEntity"),
    "f/a/a": ("a", "entity.ai", "BodyguardGoal"),
    "f/b": ("b", "entity", "EnergyBallEntity"),
    "f/b/a": ("a", "entity", "AllieEntity"),
    "f/b/b": ("b", "entity", "BeeEntity"),
    "f/b/c": ("c", "entity", "BiaEntity"),
    "f/b/d": ("d", "entity", "EllieEntity"),
    "f/b/e": ("e", "entity", "GalathEntity"),
    "f/b/f": ("f", "entity", "GoblinEntity"),
    "f/b/g": ("g", "entity", "JennyEntity"),
    "f/b/h": ("h", "entity", "KoboldEntity"),
    "f/b/i": ("i", "entity", "LunaEntity"),
    "f/b/j": ("j", "entity", "ManglelieEntity"),
    "f/b/k": ("k", "entity", "GirlEntity"),
    "f/b/l": ("l", "entity", "HumanoidGirlEntity"),
    "f/b/m": ("m", "entity", "ContainerGirlEntity"),
    "f/b/n": ("n", "entity", "VariantGirlEntity"),
    "f/b/o": ("o", "entity", "SlimeGirlEntity"),
    "f/c": ("c", "entity", "FriendlySlimeEntity"),
    "f/c/a": ("a", "entity.player", "PlayerGirlEntity"),
    "f/c/b": ("b", "entity.player", "PlayerVariantGirlEntity"),
    "f/c/c": ("c", "entity.player", "PlayerAllieEntity"),
    "f/c/d": ("d", "entity.player", "PlayerBeeEntity"),
    "f/c/e": ("e", "entity.player", "PlayerBiaEntity"),
    "f/c/f": ("f", "entity.player", "PlayerEllieEntity"),
    "f/c/g": ("g", "entity.player", "PlayerGalathEntity"),
    "f/c/h": ("h", "entity.player", "PlayerGoblinEntity"),
    "f/c/i": ("i", "entity.player", "PlayerJennyEntity"),
    "f/c/j": ("j", "entity.player", "PlayerKoboldEntity"),
    "f/c/k": ("k", "entity.player", "PlayerLunaEntity"),
    "f/c/l": ("l", "entity.player", "PlayerSlimeEntity"),
    "f/d": ("d", "entity", "KoboldEggEntity"),
    "f/e": ("e", "entity", "LunaHookEntity"),
    "f/f": ("f", "entity", "PyrocinicalEntity"),
    "f/g": ("g", "entity", "KoboldDayPhase"),
    "f/h": ("h", "entity", "NpcType"),
    "f/i": ("i", "entity", "GalathBehavior"),
    "f/j": ("j", "entity", "ScenePose"),
    "f/k": ("k", "entity", "GalathCallback"),
    "f/l": ("l", "entity", "GalathCondition"),
    "f/m": ("m", "entity", "GalathEffect"),
    "f/n": ("n", "entity", "GalathTrigger"),
    "f/o": ("o", "entity", "GalathCheck"),
    "f/p": ("p", "entity", "Triggerable"),
    "f/q": ("q", "entity", "OwnableNpc"),
    # gui
    "h/a": ("a", "client.gui", "EquipmentSlotType"),
    "h/b": ("b", "client.gui", "NpcActionScreen"),
    "h/c": ("c", "client.gui", "CharacterEditorScreen"),
    "h/d": ("d", "client.gui", "CharacterSelectScreen"),
    "h/e": ("e", "client.gui", "NpcEquipmentScreen"),
    "h/f": ("f", "client.gui", "NpcStorageScreen"),
    "h/g": ("g", "client.gui", "DragonStaffScreen"),
    "h/h": ("h", "client.gui", "GirlInteractScreen"),
    "h/i": ("i", "client.gui", "TribeNameScreen"),
    # registries
    "i/a": ("a", "registry", "ModBlocks"),
    "i/b": ("b", "registry", "ModEntities"),
    "i/c": ("c", "registry", "ModItems"),
    "i/d": ("d", "registry", "ModMenus"),
    "i/e": ("e", "registry", "ModSounds"),
    # menus
    "j/a": ("a", "menu", "NpcEquipmentMenu"),
    "j/b": ("b", "menu", "NpcStorageMenu"),
    "j/c": ("c", "menu", "NpcContainer"),
    # items
    "k/a": ("a", "item", "AllieLampItem"),
    "k/b": ("b", "item", "KoboldStaffItem"),
    "k/c": ("c", "item", "GalathCoinItem"),
    "k/d": ("d", "item", "KoboldEggItem"),
    "k/e": ("e", "item", "LunaRodItem"),
    "k/f": ("f", "item", "NpcEditorWandItem"),
    "k/g": ("g", "item", "TribeClaimItem"),
    # network
    "l/a": ("a", "network", "PacketHandler"),
    "l/b": ("b", "network", "AdvanceScenePayload"),
    "l/c": ("c", "network", "ClaimTribePayload"),
    "l/d": ("d", "network", "FellTreePayload"),
    "l/e": ("e", "network", "EndScenePayload"),
    "l/f": ("f", "network", "MenuActionPayload"),
    "l/g": ("g", "network", "NotifyGalathCoinGiftPayload"),
    "l/h": ("h", "network", "NotifyOwnershipPayload"),
    "l/i": ("i", "network", "OpenBeeChestPayload"),
    "l/j": ("j", "network", "RequestCancelTaskPayload"),
    "l/k": ("k", "network", "RequestMinePayload"),
    "l/l": ("l", "network", "RequestNpcActionPayload"),
    "l/m": ("m", "network", "RequestSitNpcPayload"),
    "l/n": ("n", "network", "ResetPlayablePayload"),
    "l/o": ("o", "network", "SendChatMessagePayload"),
    "l/p": ("p", "network", "SendCompanionHomePayload"),
    "l/q": ("q", "network", "SetNpcHomePayload"),
    "l/r": ("r", "network", "SetTribeFollowModePayload"),
    "l/s": ("s", "network", "SyncBlocksPayload"),
    "l/t": ("t", "network", "SyncNpcDialoguePayload"),
    "l/u": ("u", "network", "SyncNpcSpecificsPayload"),
    "l/v": ("v", "network", "SyncPlayableStatePayload"),
    "l/w": ("w", "network", "UploadModelStringPayload"),
    # misc utils
    "m/a": ("a", "util", "AngleUtils"),
    "m/b": ("b", "util", "ColorRGBA"),
    "m/c": ("c", "util", "SuccubusDrainDamage"),
    "m/d": ("d", "util", "GalathSlainDamage"),
    "m/e": ("e", "entity", "KoboldAction"),
    "m/f": ("f", "entity", "GoblinColorA"),
    "m/g": ("g", "entity", "GoblinColorB"),
    "m/h": ("h", "entity", "GoblinColorC"),
    "m/i": ("i", "util", "LerpUtils"),
    "m/j": ("j", "util", "MiscUtils"),
    "m/k": ("k", "util", "EntityTargetUtils"),
    "m/l": ("l", "util", "SideUtils"),
    "m/m": ("m", "util", "DoublePair"),
    "m/n": ("n", "util", "Float3"),
    "m/o": ("o", "util", "RotationMath"),
    "m/p": ("p", "util", "BlockPosUtils"),
    # player data
    "n/a": ("a", "server", "PlayerModData"),
}

# Handled separately (hand-written reconstructions / deletions).
SKIP = {
    "Main",      # hand-written Sexmod (license gate removed)
    "d/e", "g/a",  # license DRM: deleted
    # model sources missing from decompilation: reconstructed by hand
    "b/a/a", "b/a/c", "b/a/d", "b/a/e", "b/a/f", "b/a/i",
    "b/a/m", "b/a/o", "b/a/u", "b/a/v", "b/a/w", "b/a/y",
}
# Classes with no source at all (reconstructed by hand); still need FQN mapping.
EXTRA_FQN = {
    "b/a/A": ("A", "client.model", "PlayerKoboldModel"),
    "b/a/C": ("C", "client.model", "PlayerSlimeModel"),
    "b/a/D": ("D", "client.model", "SlimeGirlModel"),
    "b/a/b": ("b", "client.model", "BoneGroups"),
    "b/b/a": ("a", "client.renderer", "NpcRenderUtils"),
    "b/b/b": ("b", "client.renderer", "AllieRenderer"),
    "b/b/c": ("c", "client.renderer", "AllieLampRenderer"),
    "b/b/d": ("d", "client.renderer", "BeeRenderer"),
    "b/b/e": ("e", "client.renderer", "BiaRenderer"),
    "b/b/f": ("f", "client.renderer", "CustomModelEntityRenderer"),
    "Main": ("Main", "", "Sexmod"),
}


def new_fqn_pkg(suffix):
    return OLD_BASE if not suffix else OLD_BASE + "." + suffix


def build_maps():
    old2new_fqn = {}
    for rel, (old_cls, new_pkg, new_cls) in list(CLASS_MAP.items()) + list(EXTRA_FQN.items()):
        old_pkg = rel.rsplit("/", 1)[0].replace("/", ".") if "/" in rel else ""
        old_fqn = OLD_BASE + ("." + old_pkg if old_pkg else "") + "." + old_cls
        new_fqn = new_fqn_pkg(new_pkg) + "." + new_cls
        old2new_fqn[old_fqn] = new_fqn
    return old2new_fqn


def build_member_db():
    """oldFQN -> {static:set, inst:set} + supers chain, from jar classes."""
    z = zipfile.ZipFile(JAR)
    db = {}
    supers = {}
    for n in z.namelist():
        if not n.endswith(".class") or "$" in n or not n.startswith("com/trolmastercard/sexmod/"):
            continue
        try:
            r = parse_class(z.read(n))
        except Exception as ex:
            print("WARN: classinfo failed for", n, ex)
            continue
        fqn = r["class"].replace("/", ".")
        sm, im, sf, iff = set(), set(), set(), set()
        for acc, name, _desc in r["methods"]:
            if name in ("<init>", "<clinit>"):
                continue
            (sm if int(acc, 16) & 0x0008 else im).add(name)
        for acc, name, _desc in r["fields"]:
            (sf if int(acc, 16) & 0x0008 else iff).add(name)
        db[fqn] = {"sm": sm, "im": im, "sf": sf, "if": iff}
        supers[fqn] = (r["super"] or "").replace("/", ".")
    return db, supers


def is_static_member(db, supers, fqn, member, depth=0):
    """True if member is static/nested/enumconst of fqn (walk custom supers)."""
    seen = set()
    cur = fqn
    while cur and cur not in seen and depth < 12:
        seen.add(cur)
        depth += 1
        e = db.get(cur)
        if e:
            if member in e["sm"] or member in e["sf"]:
                return True
            if member in e["im"] or member in e["if"]:
                return False
        cur = supers.get(cur)
        if not cur or not cur.startswith(OLD_BASE):
            break
    return None  # unknown (vanilla-inherited or missing info)


def has_method(db, supers, fqn, member):
    """True if fqn (or a custom super) declares method member (any staticness)."""
    seen = set()
    cur = fqn
    depth = 0
    while cur and cur not in seen and depth < 12:
        seen.add(cur)
        depth += 1
        e = db.get(cur)
        if e and (member in e["sm"] or member in e["im"]):
            return True
        cur = supers.get(cur)
        if not cur or not cur.startswith(OLD_BASE):
            break
    return False


def is_static_field(db, supers, fqn, member):
    """True if fqn (or a custom super) declares a static field member."""
    seen = set()
    cur = fqn
    depth = 0
    while cur and cur not in seen and depth < 12:
        seen.add(cur)
        depth += 1
        e = db.get(cur)
        if e and member in e["sf"]:
            return True
        cur = supers.get(cur)
        if not cur or not cur.startswith(OLD_BASE):
            break
    return False


def classify_use(pre, fol):
    """Classify how an FQN hit is used: 'type' | 'method' | 'value' | 'parengroup'.

    pre/fol: ~16 chars of code before/after the hit (same segment).
    'method': bare call `P.M(` (no `new`). 'value': field/const position.
    'parengroup': `(X)` shape - caller resolves via member data.
    """
    if re.search(r"new\s+$", pre):
        return "type"
    if re.search(r"\b(?:throws|implements|permits|extends)\b[^;{}()]*$", pre):
        return "type"  # decl lists: FQN before ; or { is a type
    if re.search(r"\binstanceof\s+$", pre):
        return "type"
    if re.search(r"@\s*$", pre):
        return "type"  # annotation use @X / @X(...)
    if re.search(r"[\w$]<[^<>(){};]*$", pre):
        return "type"  # generics middle: Map<A, X, ...> (unspaced < only)
    if re.search(r"import\s+(static\s+)?$", pre):
        return "type"
    if not fol:
        return "type"
    c0 = fol[0]
    if c0 == "(":
        return "method"
    if c0 == "[":
        return "type" if re.match(r"\[\s*\]", fol) else "value"
    if c0 == ":":
        return "type" if fol.startswith("::") else "value"
    if c0 == "?":
        return "value"
    if c0 == ".":
        return "type"  # varargs `X...` / spaced dot (greedy hit took members)
    if c0 == ";":
        return "value"  # non-import `;` (imports returned above)
    if c0 == ")" and re.search(r"\(\s*$", pre):
        return "parengroup"  # `(X)` cast-vs-group: caller decides via members
    if c0 in ",)}":
        return "value"
    if c0 in "<>{":
        return "type"  # generics / extends-brace
    if c0 == ">":
        return "type"  # generics close
    if c0 in "=!&|^+-*/%~":
        return "value"  # assign / compare / arithmetic / bitwise
    if c0 in "\"'":
        return "value"  # string concat
    if c0.isspace():
        w = fol.lstrip()[:1]
        if not w:
            return "type"  # EOL: decompiler keeps `;` same-line; brace-next-line is type ctx
        if w == "(":
            return "method"
        if w == "[":
            return "type" if re.match(r"\[\s*\]", fol.lstrip()) else "value"
        if w in ".{":
            return "type"
        if w == "<":
            return "value"  # `X <` comparison (generics args never space-led)
        if w == ">":
            return "value"  # `X >` comparison (generics close never spaced)
        if re.match(r"[A-Za-z_$]", w):
            return "type"  # declaration `X name` / return type
        return "value"
    return "type"


TOKEN_RE = re.compile(
    r"(?P<str>\"(?:\\.|[^\"\\])*\"|'(?:\\.|[^'\\])*')"
    r"|(?P<comment>//[^\n]*|/\*.*?\*/)"
    r"|(?P<code>[^\"'/]+|/(?![*/])|'(?![^']*'))",
    re.DOTALL,
)


def split_segments(text):
    """Yield (kind, start, end) for code vs string/comment segments."""
    for m in TOKEN_RE.finditer(text):
        kind = "str" if m.group("str") is not None else ("comment" if m.group("comment") is not None else "code")
        yield kind, m.start(), m.end()


def replace_outside_strings(text, pattern, repl_fn):
    """Apply regex replacement only inside code segments (not strings/comments)."""
    out = []
    last = 0
    for kind, s, e in split_segments(text):
        if kind == "code":
            out.append(text[last:s])
            out.append(pattern.sub(repl_fn, text[s:e]))
            last = e
    out.append(text[last:])
    return "".join(out)


def declared_fields(text):
    """Heuristic set of field names declared at class level (for shadow checks)."""
    names = set()
    for m in re.finditer(
        r"^\s*(?:public|private|protected|static|final|transient|volatile|synchronized|\s)+"
        r"[\w.<>\[\]?,\s]+\s+(\w+)\s*(?:=[^;]*|;)\s*$",
        text, re.MULTILINE,
    ):
        cand = m.group(1)
        if cand not in ("class", "interface", "enum", "record", "return", "new", "extends", "implements"):
            # exclude method declarations (name followed by '(' on same logical line is handled by '=' / ';' anchor)
            names.add(cand)
    # enum constants at line starts inside enums: `    a,` / `    A(0, ...),`
    for m in re.finditer(r"^\s{4}(\w+)\s*(?:\(|,|;)\s*$", text, re.MULTILINE):
        names.add(m.group(1))
    return names


def nested_types(text):
    """Indented (nested) type declarations: name set."""
    out = set()
    for m in re.finditer(r"^\s+(?:public|private|protected|static|final|abstract|\s)*(?:class|enum|record|interface)\s+(\w+)", text, re.M):
        out.add(m.group(1))
    return out


def migrate_file(rel, old_cls, new_pkg, new_cls, old2new_fqn, db, supers, report):
    with open(os.path.join(SRC, rel + ".java"), encoding="utf-8") as fh:
        text = fh.read()

    old_pkg = rel.rsplit("/", 1)[0].replace("/", ".") if "/" in rel else ""
    old_fqn = OLD_BASE + ("." + old_pkg if old_pkg else "") + "." + old_cls
    new_pkg_fqn = new_fqn_pkg(new_pkg)

    # ---- 0. hand fixups for decompiler artifacts (before generic passes) ----
    if rel == "f/c/a":
        # self-references over-qualified as `c.a` (11 type-position uses);
        # reduce to bare `a` so generic passes rename the own class normally.
        text = replace_outside_strings(text, re.compile(r"\bc\.a\b"), lambda m: "a")
    elif rel.startswith("f/c/"):
        # siblings' `extends c.a` denotes top-level f/c/a (PlayerGirlEntity),
        # NOT nested f/c$a (a Goal) - jar hierarchy confirms.
        if "extends c.a" in text:
            text = replace_outside_strings(
                text, re.compile(r"\bextends c\.a\b"), lambda m: "extends PlayerGirlEntity"
            )
    if rel == "f/b/k":
        # DRM gate in GirlEntity.tick: keep the licensed branch only.
        drm_old = (
            "    public void tick() {\n"
            "        if (!com.trolmastercard.sexmod.d.e.a()) {\n"
            "            if (!this.level().isClientSide()) {\n"
            "                this.discard();\n"
            "            }\n"
            "        } else {\n"
            "            super.tick();\n"
            "            this.at();\n"
            "            if (!this.level().isClientSide()) {\n"
            "                this.b();\n"
            "            }\n"
            "        }\n"
            "    }\n"
        )
        drm_new = (
            "    public void tick() {\n"
            "        super.tick();\n"
            "        this.at();\n"
            "        if (!this.level().isClientSide()) {\n"
            "            this.b();\n"
            "        }\n"
            "    }\n"
        )
        if text.count(drm_old) != 1:
            report.append((rel, "DRM-PATCH-FAIL", "tick gate text not found once"))
        else:
            text = text.replace(drm_old, drm_new)
    if rel == "f/c":
        # `...f.c.{a,b,c,d}` (8 sites): the file's OWN nested goals/move
        # control, NOT the f/c/a-d player siblings (no other file references
        # these nested; f/c references no f/c/a-l siblings at all).
        text = replace_outside_strings(
            text, re.compile(r"\bcom\.trolmastercard\.sexmod\.f\.c\.([abcd])\b"),
            lambda m: "FriendlySlimeEntity." + m.group(1),
        )
    if rel == "f/e":
        # `e.a.{a,b,c}` (7 value-sites): consts of nested enum a. 4a keeps
        # them (field `e` is boolean -> verdict False); the enum type is
        # proven by the `private e.a k` declaration in the same file.
        text = replace_outside_strings(
            text, re.compile(r"\be\.a\.([abc])\b"), lambda m: "LunaHookEntity.a." + m.group(1)
        )

    # ---- 1. FQN replacement (jar-guided, follower-aware) ----
    fqn_pat = re.compile(r"\bcom\.trolmastercard\.sexmod(?:\.[A-Za-z_$][\w$]*)+")

    def fqn_decide(hit, pre, fol):
        if re.search(r"\bpackage\s+$", pre):
            return hit  # own package declaration (pass 5 rewrites it)
        parts = hit.split(".")
        pstar = None
        for k in range(len(parts), 0, -1):
            prefix = ".".join(parts[:k])
            if prefix in old2new_fqn:
                pstar = prefix
                break
        p1 = None
        for k in range(len(parts), 0, -1):
            prefix = ".".join(parts[:k])
            if prefix in JAR_TOP:
                p1 = prefix
                break
        if pstar is None:
            if p1 is not None:
                report.append((rel, "UNMAPPED-FQN", p1))
                return hit
            rest0 = hit[len(OLD_BASE) + 1:]
            if rest0 and all(s[:1].islower() for s in rest0.split(".")):
                return hit  # bare package path (pass 5 rewrites decls)
            report.append((rel, "UNMAPPED-FQN", hit))
            return hit
        if p1 is not None and len(p1) > len(pstar):
            # jar-real but unmapped head (DRM / dead): type-use stays loud,
            # member-namespace use maps the head when verified.
            m1 = p1[len(pstar):].lstrip(".").split(".")[0]
            use = classify_use(pre, fol)
            if use == "parengroup":
                use = "value" if is_static_field(db, supers, pstar, m1) else "type"
            if use == "type":
                report.append((rel, "UNMAPPED-FQN", p1))
                return hit
            if use == "method" and has_method(db, supers, pstar, m1):
                return old2new_fqn[pstar] + hit[len(pstar):]
            if use == "value" and is_static_field(db, supers, pstar, m1):
                return old2new_fqn[pstar] + hit[len(pstar):]
            report.append((rel, "UNMAPPED-FQN", p1))
            return hit
        rest = hit[len(pstar):]
        if rest:
            # mapped head class + member chain; dual-head field re-read check
            m = rest[1:].split(".", 1)[0]
            m1 = pstar.rsplit(".", 1)[-1]
            par = pstar.rsplit(".", 1)[0] if "." in pstar else ""
            fld = par in old2new_fqn and is_static_field(db, supers, par, m1)
            hd = (is_static_member(db, supers, pstar, m) is True) or (
                pstar + "$" + m in JAR_NESTED
            )
            if fld and not hd and m not in ("class", "this", "super"):
                # NOTE: .class/.this/.super bind to the TYPE head, never a field re-read
                return old2new_fqn[par] + "." + m1 + rest
            if fld and hd:
                report.append((rel, "AMBIGUOUS-FQN", hit))
            return old2new_fqn[pstar] + rest
        use = classify_use(pre, fol)
        if use == "parengroup":
            m1 = pstar.rsplit(".", 1)[-1]
            par = pstar.rsplit(".", 1)[0] if "." in pstar else ""
            use = "value" if (par in old2new_fqn and is_static_field(db, supers, par, m1)) else "type"
        if use == "type":
            return old2new_fqn[pstar]
        m1 = pstar.rsplit(".", 1)[-1]
        par = pstar.rsplit(".", 1)[0] if "." in pstar else ""
        if par in old2new_fqn:
            if use == "method" and has_method(db, supers, par, m1):
                return old2new_fqn[par] + "." + m1
            if use == "value" and is_static_field(db, supers, par, m1):
                return old2new_fqn[par] + "." + m1
        report.append((rel, "CONTRA-FQN", hit + " :: " + use))
        return old2new_fqn[pstar]

    segs_out = []
    for _kind, _s, _e in split_segments(text):
        _seg = text[_s:_e]
        if _kind != "code":
            segs_out.append(_seg)
            continue
        _buf = []
        _last = 0
        for _m in fqn_pat.finditer(_seg):
            _pre = _seg[max(0, _m.start() - 16):_m.start()]
            _fol = _seg[_m.end():_m.end() + 16]
            _buf.append(_seg[_last:_m.start()])
            _buf.append(fqn_decide(_m.group(0), _pre, _fol))
            _last = _m.end()
        _buf.append(_seg[_last:])
        segs_out.append("".join(_buf))
    text = "".join(segs_out)

    # ---- 2. imports of old classes ----
    def imp_repl(m):
        path = m.group(2)
        parts = path.split(".")
        for k in range(len(parts), 0, -1):
            prefix = ".".join(parts[:k])
            if prefix in old2new_fqn:
                suffix = "".join("." + p for p in parts[k:])
                return m.group(1) + old2new_fqn[prefix] + suffix + ";"
        if len(parts[3]) == 1:
            # old-style path (single-letter pkg): genuinely unmapped (DRM/dead)
            report.append((rel, "UNMAPPED-IMPORT", path))
        return m.group(0)  # else: already migrated by pass 1, keep silent

    text = replace_outside_strings(
        text, re.compile(r"(import\s+(?:static\s+)?)(com\.trolmastercard\.sexmod(?:\.[A-Za-z_$][\w$]*)+);"), imp_repl
    )

    # ---- 3. scope: simple name -> oldFQN ----
    scope = {}
    # same package top-level classes
    for r2, (oc2, _np2, nc2) in list(CLASS_MAP.items()) + list(EXTRA_FQN.items()):
        pkg2 = r2.rsplit("/", 1)[0].replace("/", ".") if "/" in r2 else ""
        if pkg2 == old_pkg and r2 not in ("d/e", "g/a"):
            # NOTE: SKIPped-but-mapped classes (12 models etc.) stay in scope:
            # same-package bare refs to them must still map. Only the DRM
            # classes (deleted, never mapped) are excluded.
            scope.setdefault(oc2, (OLD_BASE + ("." + pkg2 if pkg2 else "") + "." + oc2, nc2))
    # single-type imports (old names, pre-rewrite? imports already rewritten;
    # capture from ORIGINAL text instead)
    with open(os.path.join(SRC, rel + ".java"), encoding="utf-8") as fh:
        orig = fh.read()
    imported_names = set()
    for m in re.finditer(r"import\s+(?:static\s+)?com\.trolmastercard\.sexmod(?:\.[A-Za-z_$][\w$]*)*\.([A-Za-z_$][\w$]*);", orig):
        imported_names.add(m.group(1))
    # map imported simple names via old2new (find oldFQN ending with .name, prefer exact import path)
    for m in re.finditer(r"import\s+(?:static\s+)?(com\.trolmastercard\.sexmod(?:\.[A-Za-z_$][\w$]*)+);", orig):
        path = m.group(1)
        parts = path.split(".")
        for k in range(len(parts), 0, -1):
            prefix = ".".join(parts[:k])
            if prefix in old2new_fqn:
                new_simple = old2new_fqn[prefix].rsplit(".", 1)[-1]
                # only register if the import's last segment is the class itself
                if k == len(parts):
                    scope[parts[-1]] = (prefix, new_simple)
                break
    # nested + fields shadow simple names
    nested = nested_types(text)
    fields = declared_fields(text)
    for n in nested:
        scope.pop(n, None)
    # own class simple name always in scope (declaration + self refs)
    own_old_fqn = old_fqn
    scope[old_cls] = (own_old_fqn, new_cls)

    # ---- 4. simple-name replacement (type positions + provable static access) ----
    # 4a. member access: X.member
    access_pat = re.compile(r"(^|[^\w$.])([A-Za-z_$][\w$]*)\.([A-Za-z_$][\w$]*)")

    def access_repl(m):
        pre, x, mem = m.group(1), m.group(2), m.group(3)
        if mem in ("class", "this", "super"):
            return m.group(0)  # 4b owns X.class / X.this / X.super - keep silent here
        if x not in scope:
            return m.group(0)
        # preceded by '.' or a word char? (then x is itself a member, not a type root)
        # (regex \b ensures left boundary; check char before)
        # NOTE: called on code segments; check via match string context is complex,
        # so rely on: nested.<member> etc. Rare; member_db check below guards it.
        fqn, new_simple = scope[x]
        verdict = is_static_member(db, supers, fqn, mem)
        if verdict is True:
            return pre + new_simple + "." + mem
        if verdict is False:
            return m.group(0)
        # unknown member: conservative - keep if a field/var named x may exist
        if x in fields or x in nested:
            report.append((rel, "AMBIGUOUS-ACCESS", f"{x}.{mem}"))
            return m.group(0)
        return pre + new_simple + "." + mem

    text = replace_outside_strings(text, access_pat, access_repl)

    # 4b. type positions
    type_patterns = [
        r"(?<![\w$.])(new\s+)(__X__)(?=\s*[\[(<])",          # new X( / new X[ / new X<
        r"(?<![\w$.])(__X__)(?=\s*\.\s*class\b)",             # X.class
        r"(?<![\w$.])(__X__)(?=\s*\.\s*(?:this|super)\b)",    # X.this / X.super
        # (X) cast: must NOT follow a name/]/) (else call/arg/paren-expr),
        # must be followed by an expression start; `instanceof`/`->` after
        # `)` means parenthesized var/lambda instead.
        r"(?<![\w$\])}\"])(\(\s*)(__X__)(\s*\))(?=\s*(?!instanceof\b|->)[\w\"'(@(0-9+\-!~])",
        r"(\binstanceof\s+)(__X__)\b",
        r"(\bextends\s+)(__X__)\b",
        r"(\bimplements\s+[\w.,\s]*?)(?<![\w$.])(__X__)\b",
        r"(\bthrows\s+[\w.,\s]*?)(?<![\w$.])(__X__)\b",
        r"(<\s*)(__X__)(\s*[,>])",                            # generics open
        r"([<][^()<>;]*?,\s*)(__X__)(\s*>)",                  # generics close (non-first arg only)
        r"([<][^()<>;]*?,\s*)(__X__)(?=\s*,)",                # generics middle (must sit inside <>: no ()<>; between < and ,)
        r"(\?\s+extends\s+)(__X__)\b",                        # ? extends X
        r"(\?\s+super\s+)(__X__)\b",                          # ? super X
        r"(?<![\w$.@])(__X__)(?=\s*\[\s*\])",                 # X[]
        r"(?<![\w$.])(__X__)(?=::new\b)",                      # X::new (always a type)
        r"(@\s*)(__X__)\b",                                    # annotations
        # declarations: `X name` / `X name =` / `X name;` / `X name,` / `X name)`
        r"(?<![\w$.])(__X__)(?=\s+(?:\w+)\s*[=;,)])",
        # method return type: `X name(` (decompiler never emits `name (` for calls)
        r"(?<![\w$.])(__X__)(?=\s+\w+\s*\()",
        r"(?<![\w$.])(__X__)(\s*\.\.\.\s+\w+)",               # varargs
        r"(\(\s*)(__X__)(?=\s+\w+\s*[,)])",                   # params (X v, / X v)
        r"(,\s*)(__X__)(?=\s+\w+\s*[,)])",
        # foreach: for (X v : ...)
        r"(\bfor\s*\(\s*)(__X__)(?=\s+\w+\s*:)",
    ]
    # Dotted twins: `X.mem` chains in the same forced-type contexts. Nested
    # types never rename, so only X maps; bare patterns require non-dot after
    # X, hence twins are disjoint from (and generated from) the bare ones.
    _DOT = r"(?:\.\s*\w+)+"
    def _twin(_pat):
        _m = re.search(r"\(?__X__\)?", _pat)
        assert _m and _pat.count("__X__") == 1, _pat
        _r = "(__X__)" + _DOT if _m.group(0).startswith("(") else "__X__" + _DOT
        return _pat[:_m.start()] + _r + _pat[_m.end():]
    type_patterns = type_patterns + [_twin(_p) for _p in type_patterns]
    for name in sorted(scope, key=len, reverse=True):
        fqn, new_simple = scope[name]
        if name == new_simple:
            continue
        # skip if an import/vanilla type with same simple name exists that is NOT ours:
        # (single-type-imports of other packages, java.lang)
        skip_simple = False
        for m in re.finditer(r"import\s+(?!static)([\w.]+)\." + re.escape(name) + r";", text):
            if not m.group(1).startswith("com.trolmastercard.sexmod"):
                skip_simple = True
        if name in ("String", "Object", "Class", "Enum", "Record", "System", "Math", "Override"):
            skip_simple = True
        if skip_simple:
            report.append((rel, "SKIP-SHADOWED", name))
            continue
        for pat in type_patterns:
            rx = re.compile(pat.replace("__X__", re.escape(name)))

            def tp_repl(m, _ns=new_simple, _on=name):
                if not m.lastindex:
                    # lookaround-only pattern: the whole match is the name
                    return _ns if m.group(0) == _on else m.group(0)
                out = []
                for gi in range(1, m.lastindex + 1):
                    g = m.group(gi)
                    out.append(_ns if g == _on else (g if g is not None else ""))
                # re-assemble: spans between groups are preserved via indices
                res = []
                pos = m.start()
                for gi in range(1, m.lastindex + 1):
                    s, e = m.span(gi)
                    if s < 0:
                        continue
                    res.append(m.string[pos:s])
                    res.append(out[gi - 1])
                    pos = e
                res.append(m.string[pos:m.end()])
                return "".join(res)

            text = replace_outside_strings(text, rx, tp_repl)
        # X::method (non-constructor) references: rename when provably the type.
        rx = re.compile(r"(?<![\w$.])(" + re.escape(name) + r")(::)(\w+)")

        def mr_repl(m, _ns=new_simple, _on=name, _fq=fqn):
            meth = m.group(3)
            if _on == old_cls or meth == "new":
                return _ns + m.group(2) + meth
            if is_static_member(db, supers, _fq, meth) is True:
                return _ns + m.group(2) + meth
            if _on not in fields and _on not in nested:
                return _ns + m.group(2) + meth
            report.append((rel, "AMBIGUOUS-REF", f"{_on}::{meth}"))
            return m.group(0)

        text = replace_outside_strings(text, rx, mr_repl)

    # ---- 5. package declaration ----
    text = replace_outside_strings(
        text,
        re.compile(r"^package com\.trolmastercard\.sexmod(?:\.[\w.]+)?;", re.MULTILINE),
        lambda m: "package " + new_pkg_fqn + ";",
    )

    # ---- 6. own declaration rename (leftover safety net) ----
    # class/enum/record/interface <old> -> <new> at top level
    text = replace_outside_strings(
        text,
        re.compile(
            r"^((?:public\s+)?(?:final\s+)?(?:abstract\s+)?(?:class|enum|record|interface)\s+)" + re.escape(old_cls) + r"\b",
            re.MULTILINE,
        ),
        lambda m: m.group(1) + new_cls,
    )
    # constructor declarations <old>(...) { -> <new>(...) { (line-anchored
    # declaration shape only: excludes method calls `old(...)` and enum
    # constant initializers `old(...),` which never end the line with `{`).
    # When a nested type shares the name, only outer-level (one indent) ctors
    # denote the outer class.
    ctor_indent = r"    " if old_cls in nested else r"\s*"
    text = replace_outside_strings(
        text,
        re.compile(
            r"^(" + ctor_indent + r"(?:public|private|protected)?\s*)" + re.escape(old_cls) + r"(\s*\([^;{}]*\)\s*(?:throws\b[^{};]*)?\{)",
            re.MULTILINE,
        ),
        lambda m: m.group(1) + new_cls + m.group(2),
    )

    # ---- 4c. add missing imports for cross-package bare refs ----
    # (same-package input refs whose target moved to another output package)
    _n2f = {}
    _dup = set()
    for _r2, (_o2, _np2, _nc2) in list(CLASS_MAP.items()) + list(EXTRA_FQN.items()):
        _f = new_fqn_pkg(_np2) + "." + _nc2
        if _nc2 in _n2f and _n2f[_nc2] != _f:
            _dup.add(_nc2)
        _n2f.setdefault(_nc2, _f)
    for _d in sorted(_dup):
        report.append((rel, "IMPORT-DUPE", _d))
        del _n2f[_d]
    _own = {_nc2 for _r2, (_o2, _np2, _nc2) in list(CLASS_MAP.items()) + list(EXTRA_FQN.items()) if _np2 == new_pkg}
    _have = set(re.findall(r"^import\s+(?:static\s+)?[\w.]+\.([\w$]+);", text, re.M))
    _nest = set(re.findall(r"^\s+(?:public|private|protected|static|final|abstract|\s)*(?:class|enum|record|interface)\s+(\w+)", text, re.M))
    _need = set()
    if _n2f:
        _rx = re.compile(r"(?<![\w$.])(?:" + "|".join(sorted(map(re.escape, _n2f), key=len, reverse=True)) + r")(?![\w$])")
        for _kd, _sd, _ed in split_segments(text):
            if _kd != "code":
                continue
            for _m2 in _rx.finditer(text[_sd:_ed]):
                _nm = _m2.group(0)
                if _nm in _own or _nm in _have or _nm in _nest:
                    continue
                _need.add(_nm)
    if _need:
        _ins = "".join("import " + _n2f[_nm] + ";\n" for _nm in sorted(_need))
        _ml = list(re.finditer(r"^import\s+.*;$", text, re.M))
        if _ml:
            _pos = _ml[-1].end()
        else:
            _mp = re.search(r"^package\s+.*;$", text, re.M)
            _pos = _mp.end() if _mp else 0
        text = text[:_pos] + "\n" + _ins.rstrip("\n") + text[_pos:]
        report.append((rel, "IMPORT-ADDED", ",".join(sorted(_need))))

    out_dir = os.path.join(DST, *([] if not new_pkg else new_pkg.split(".")))
    os.makedirs(out_dir, exist_ok=True)
    with open(os.path.join(out_dir, new_cls + ".java"), "w", encoding="utf-8") as fh:
        fh.write(text)
    return text


def main():
    old2new = build_maps()
    print("class mappings:", len(old2new))
    db, supers = build_member_db()
    print("member db classes:", len(db))
    build_jar_sets()
    print("jar top-level classes:", len(JAR_TOP))
    for k in old2new:
        assert k in JAR_TOP, "mapped oldFQN missing from jar: " + k
    report = []
    done = []
    for rel, (old_cls, new_pkg, new_cls) in sorted(CLASS_MAP.items()):
        if rel in SKIP:
            continue
        try:
            migrate_file(rel, old_cls, new_pkg, new_cls, old2new, db, supers, report)
            done.append(rel)
        except Exception as ex:
            print("FAIL", rel, type(ex).__name__, ex)
            raise
    print("migrated files:", len(done))
    print("---- report ----")
    for rel, kind, msg in report:
        print(f"{rel}: [{kind}] {msg}")
    print("report lines:", len(report))


if __name__ == "__main__":
    main()
