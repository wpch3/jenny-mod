# Jenny Mod 1.21.1 NeoForge Port Report

- Source of truth: official stable 1.12.2 Forge version (`Trolmastercard-Jenny-Mod-Forge-1.12.2`,
  decompiled to `decompiled-1.12.2/`).
- Starting point: incomplete fan 1.21.1 NeoForge port (this tree, `jenny-neoforge/`).
- Target: 1.21.1 NeoForge, GeckoLib 4.9.2, mod id `sexmod`, package `com.trolmastercard.sexmod`.
- Method: every model behavior below was recovered from 1.12.2 bytecode/decompiled source
  (javap-style disassembly for stub classes, switchmap dumps, exact constants). Nothing is
  guessed except the items explicitly marked INFERRED in section 4.
- Delivery: source only (sandbox cannot compile). Build locally with `BUILD.md`, then report
  errors/gameplay issues for joint iteration.

## 1. Model ports (all pairs)

Base: `client/model/GirlModel.java` (transition default fixed 5 -> 2 to match official).

| Girl | Official class | NPC model | Player model | Notes |
|---|---|---|---|---|
| Goblin | ci | GoblinModel | PlayerGoblinModel | official arrays, preggy, effects, e() fallback |
| Slime | cr | SlimeGirlModel | PlayerSlimeModel | cr arrays, select, bedSlime, hat-copy, +4 OUTFIT equipment |
| Ellie | cx | EllieModel | PlayerEllieModel | coeff map, sit-tracking, arrays, indexed select |
| Bee | c0 | BeeModel | PlayerBeeModel | official arrays, chest gate / hidden / no tracking |
| Jenny | c5 | JennyModel | PlayerJennyModel | official groups + indexed selects |
| Luna | cg | LunaModel | PlayerLunaModel | official groups + indexed selects |
| Bia | cl | BiaModel | PlayerBiaModel | official groups + indexed selects |
| Allie | c2 | AllieModel | PlayerAllieModel | official groups + c2-shape allie select |
| Kobold | c9 | (fan KoboldEntity fixed) | — | c9 arrays verified against official; entity junk removed |
| Galath | cb | GalathModel | PlayerGalathModel | full helper sequence, see section 2 |
| Manglelie | ce | ManglelieModel | — | none exists officially; no player entity |

Outfit selects, pose gates (SIT/chest), eye controllers and bone arrays all follow the
official classes. The fan letter-rotation on hide-arrays was removed everywhere.

## 2. Galath (cb) port detail

`GalathModel` runs the official 12-helper order: k, super, a(em), h, f, b, e, g, j, a(),
c, i, d, then the f_ tail (aE = head.rotX; con_mang pass when the pose is in
{HUG_MANG, MORNING_BLOWJOB_SLOW/FAST/CUM}).

- Geo set is now 3 files: galath, galath, galath_con_mang (official cb.a()).
- cb.c() = {"armorHelmet"} verified official; kept.
- cb.e cloth gates: nippleR/L = !bb, braBoobL/R = bb,
  slip = bb OR pose in {PUSSY_LICKING, MASTERBATE_SITTING, MASTERBATE_SITTING_CUM}.
- cb.g wings hidden exactly during {CORRUPT_SLOW, CORRUPT_FAST, CORRUPT_CUM, COWGIRLCUM}
  (recovered from the f_ switchmap; player er uses the same 4, verified from er$a).
- cb.a(em) BOOST tilt (+45 inside ticks 13..40) + rotationTool flight lerp over the
  f2 state (mapped to G = currX, I = prevX, H = currZ, J = prevZ).
- cb.h RAPE_CHARGE throw-vector (cv.a ported verbatim incl. NaN guards) + bO spin.
- cb.b KNOCK_OUT_FLY velocity pose gated by bool param k (official bP).
- cb.i PUSSY_LICKING head sway (sine triple) + lip-smack sound on sign change.
- cb.d HUG_MANG body2 snap during controller TRANSITIONING.
- cb.a() futa bones follow the `GirlModel.a` hook (official a_.e, default true).
- Official neck tracking does not exist for galath, so the GirlModel addition is
  disabled in this model (same in ManglelieModel, which drives the head itself).
- `PlayerGalathModel`: same mains minus NPC-only helpers (h/b/c/i); coin always hidden
  (official ei gate); boost tilt with zero flight state; official er.b() is hardcoded
  false (bytecode-verified), so no con_mang tail and no aE field on the player.

## 3. Manglelie (ce) port detail

`ManglelieModel` runs super, a(em,proc,partial), b, d, a(em), e.

- Geo set is now manglelie, manglelie, galath_con_mang (official ce.a()).
- ce.c(em) = pose in {THREESOME_SLOW, THREESOME_FAST, THREESOME_CUM} selects c[2].
- ce.a static (also called from the galath tail): skirt/cheek/side visibility from
  dh.a (partnered non-threesome) + cockStage0-2 from the an counter. cockStage/body2
  bones exist only on the con_mang geo; all lookups are null-guarded.
- ce.b(em): galath-head-driven head/upperBody/boobs bends (aE branch formulas verbatim)
  plus accumulating clamped head tracking (T/af, ai/W pairs, 7-degree clamp, FPS-scaled).
- ce.d(em): carry arm IK. aj/V crossfade (easeOutBack), two builders:
  free builder (aE branch, verbatim) and carry builder (world-space arm aims toward the
  carrier eye point, head-yaw sway, morph extras, L/R mirror branch) with the exact
  official constants (35/140/45/90 degrees, 0.1909 scale, 28/32 morph windows).
- ce.a(em): body yaw/scale mirror from the galath bw/bm write-back.
- ce.e(em): legR/lowerArmR/L -45 nudges during corrupt/carry partner poses.

## 4. Entity changes (model contract only, no behavior rewrites)

- `GalathEntity`: + `bb` (clothed), `aE/bw/bm` (model write-back); G/H/I/J made public
  (flight interp state read by the model).
- `ManglelieEntity`: + `aj/V/R/an/T/af/ai/W/carryBlend` (all read/written by ce paths).
- `SlimeGirlEntity` / `PlayerSlimeEntity`: +4 OUTFIT ItemStacks + NBT (slime is not a
  HumanoidGirl, so it needs its own slots; done in an earlier pass).
- Player equipment ("Option A") was NOT implemented: `HumanoidGirlEntity` already syncs
  H/I/J/K/L/M ItemStacks from the persisted G inventory every server AI tick, and
  `GirlModel.getSyncedEquipment` already reads them for every player girl. Adding a
  second set of slots would duplicate live state.

## 5. Divergences, gaps and INFERRED mappings

All of these are stable by construction (null-guarded, zero-defaults). Behavior-side
hooks are listed so they can be closed during gameplay iteration.

1. cb.f (ATTACK_SWORD lunge) skipped: needs the f_.az attack timer; no 1.21.1 analog.
2. GalathEntity.b() means has-master in the fan port, but official f_.b() is a pose
   switch (HUG_MANG + 3 blowjobs). The model checks the pose set directly; behavior
   keeps the fan meaning. Flagged as a fan behavior bug for review.
3. GalathEntity.r() is broken (`G = G` no-op, H never updated): flight orientation is
   frozen at zero, so boostFrameTilt only shows the BOOST-window +45. Official f_
   computation lives in the stub and cannot be recovered; needs a behavior rewrite.
4. cb.k molang -> direct bone drive (armR/head, identical degrees). Geckolib 4.9 has no
   custom-molang API (verified: no molang package, parser removed from GeckoLibCache).
   Unknown identifiers ("armpitch" etc.) are expected to evaluate to 0 and get
   overwritten by the model. If 4.9 ever throws on them, neutralize the 4 keyframes in
   galath.animation.json (masterbate anim) to [0,0,0] and keep the model code as is.
5. cb.a(em) tilt default is ambiguous in the bytecode (default branch encoding); the port
   uses tilt only inside the BOOST window. One-line flip if 1.12.2 shows constant +45.
6. GirlModel.e (Alex/Steve gate) is inherited, not overridden: official cb.e uses
   f_.k/f_.M (stub, unrecoverable).
7. f_.a5 (lick pause flag) has no analog: lick motion/sound always run.
8. f_.bO (charge spin) reads float param l (default 0, never driven).
9. f8.b(F) (carry blend) reads the new carryBlend field (default 0, never driven).
10. INFERRED: f8.a(Vec3d,F) (reach-side test) = carrier on manglelie right side
    (yaw-based half-space test).
11. f_.a(f_,F) (nullable sway override) treated as always null; the official limb/head
    fallback is implemented as head-yaw lerp (at/as fields are bulk-copied with yaw in
    the official disguise code, so they are the head-yaw pair, not limb swing).
12. em.b(String) bone offsets come from BoneOffsetTable rest pivots (exact geo values,
    yaw-rotated) instead of renderer-exact animated positions (no 1.21.1 renderer hook).
13. Manglelie cock stage uses the new an field (default 0); the fan u field is dead and
    untouched.
14. Lip-smack uses random jenny lipsounds (no allie lipsounds in 1.21.1).
15. ce.b head tracking targets (af/W) and ce.d carrier state are behavior-driven in
    official; with zero defaults the port holds still, which is correct at rest.
16. GirlEntity.e(String)/an map is never filled (no renderer hook); models use
    BoneOffsetTable instead of touching it.
17. INFERRED: f8.r() (attached flag) = bool param b (set by the galath spawn code;
    carrier detaches when it clears, matching official usage).
18. INFERRED: f8.b() (carrier entity) = r() (synced carrier id param c).
19. Unused official constants ce.k/ce.i are omitted (never referenced by any decoded path).
20. ManglelieEntity.a(boolean) (param b setter) has no callers except galath spawn;
    threesome flow depending on b() may be partially dead (fan behavior gap).

## 6. Build-verification checklist (API risks)

These compiled against expectation but could not be compile-checked here; the local
build will confirm (each is a one-line fix if the signature differs):

- `AnimationController.getAnimationState() == AnimationController.State.TRANSITIONING`
  (GalathModel/PlayerGalathModel snapHugMangBody).
- `Minecraft.getInstance().getDebugOverlay().showDebugScreen()` (GalathModel.isDebugScreen).
- `GeoBone.getScaleY()` (setter confirmed in repo use; getter assumed symmetric).
- `LivingEntity.yHeadRotO` public field (ManglelieModel.buildCarryPose).
- `Minecraft.getInstance().getFps()` (ManglelieModel.currentFps).
- Raw static access `GirlModel.a` (futa hook).

## 7. Validation done here

- tools/check.py: errors 0 (warnings are the checker's known unresolved-name noise).
- Geo checks: every bone name referenced by the new models was verified against
  galath.geo.json / manglelie.geo.json / galath_con_mang.geo.json
  (body2/cockStage/skirt-side set live only on con_mang as official expects).
- Posemap: all ScenePose constants used (bH, bJ, bK, bO, bT-U-V-W, bX, bY, z, cc, cd,
  ci, cj, ck, ce, cf, cg, ch, cl, cm, cn, bs) verified against tools/posemap.txt.

## 8. Iteration guide

1. Build locally per BUILD.md and paste any compile errors back.
2. In game, check in order: galath idle/walk (no tilt), wings hide in corrupt/cowgirl,
   con_mang geo swap in hug/bj poses, masterbate arm/head aim, lick head + lipsound,
   knockout spin-down, manglelie carry arms + head tracking, threesome geo swap.
3. For behavior gaps (items 1, 3, 8, 9, 15, 20), gameplay feedback decides whether the
   official behavior is worth re-implementing or the zero-defaults are acceptable.
