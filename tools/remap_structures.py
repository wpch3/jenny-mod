#!/usr/bin/env python3
"""Remap 1.12.2 sexmod structure .nbt -> 1.21.1 (blocks, blockstates, BEs, entities).

Usage: python3 tools/remap_structures.py   (paths hard-coded below)
Writes remapped files to jenny-neoforge/src/main/resources/data/sexmod/structures/
"""
import gzip
import struct
import uuid

SRC = 'decompiled-1.12.2/assets/sexmod/structures/%s.nbt'
DST = 'jenny-neoforge/src/main/resources/data/sexmod/structures/%s.nbt'
FILES = ['jenny', 'luna', 'bia', 'ellie', 'goblin']
DATA_VERSION_1211 = 4189

WARNINGS = []


def warn(msg):
    WARNINGS.append(msg)
    print('WARN:', msg)


# ---------------- typed NBT ----------------
class T:
    __slots__ = ('tag', 'v')

    def __init__(self, tag, v):
        self.tag = tag
        self.v = v

    def __repr__(self):
        return 'T(%s,%r)' % (self.tag, self.v)


class Reader:
    def __init__(self, data):
        self.d = data
        self.i = 0

    def read(self, n):
        out = self.d[self.i:self.i + n]
        self.i += n
        return out

    def byte(self):
        return self.read(1)[0]


def parse(r, tag):
    if tag == 1:
        return T(1, r.byte())
    if tag == 2:
        return T(2, struct.unpack('>h', r.read(2))[0])
    if tag == 3:
        return T(3, struct.unpack('>i', r.read(4))[0])
    if tag == 4:
        return T(4, struct.unpack('>q', r.read(8))[0])
    if tag == 5:
        return T(5, struct.unpack('>f', r.read(4))[0])
    if tag == 6:
        return T(6, struct.unpack('>d', r.read(8))[0])
    if tag == 7:
        n = struct.unpack('>i', r.read(4))[0]
        return T(7, list(r.read(n)))
    if tag == 8:
        n = struct.unpack('>H', r.read(2))[0]
        return T(8, r.read(n).decode('utf-8'))
    if tag == 9:
        et = r.byte()
        n = struct.unpack('>i', r.read(4))[0]
        return T(9, (et, [parse(r, et) for _ in range(n)]))
    if tag == 10:
        out = {}
        while True:
            tt = r.byte()
            if tt == 0:
                return T(10, out)
            k = parse(r, 8).v
            out[k] = parse(r, tt)
    if tag == 11:
        n = struct.unpack('>i', r.read(4))[0]
        return T(11, [struct.unpack('>i', r.read(4))[0] for _ in range(n)])
    if tag == 12:
        n = struct.unpack('>i', r.read(4))[0]
        return T(12, [struct.unpack('>q', r.read(8))[0] for _ in range(n)])
    raise ValueError(tag)


def load(path):
    r = Reader(gzip.decompress(open(path, 'rb').read()))
    assert r.byte() == 10
    parse(r, 8)
    return parse(r, 10)


def write(buf, t):
    v = t.v
    if t.tag == 1:
        buf.append(v & 0xFF)
    elif t.tag == 2:
        buf += struct.pack('>h', v)
    elif t.tag == 3:
        buf += struct.pack('>i', v)
    elif t.tag == 4:
        buf += struct.pack('>q', v)
    elif t.tag == 5:
        buf += struct.pack('>f', v)
    elif t.tag == 6:
        buf += struct.pack('>d', v)
    elif t.tag == 7:
        buf += struct.pack('>i', len(v))
        buf += bytes(v)
    elif t.tag == 8:
        e = v.encode('utf-8')
        buf += struct.pack('>H', len(e))
        buf += e
    elif t.tag == 9:
        et, items = v
        buf.append(et)
        buf += struct.pack('>i', len(items))
        for it in items:
            write(buf, it)
    elif t.tag == 10:
        for k, it in v.items():
            buf.append(it.tag)
            e = k.encode('utf-8')
            buf += struct.pack('>H', len(e))
            buf += e
            write(buf, it)
        buf.append(0)
    elif t.tag == 11:
        buf += struct.pack('>i', len(v))
        for x in v:
            buf += struct.pack('>i', x)
    elif t.tag == 12:
        buf += struct.pack('>i', len(v))
        for x in v:
            buf += struct.pack('>q', x)
    else:
        raise ValueError(t.tag)


def save(root, path):
    buf = bytearray()
    buf.append(10)
    buf += struct.pack('>H', 0)
    write(buf, root)
    open(path, 'wb').write(gzip.compress(bytes(buf)))


# ---------------- maps ----------------
COLORS = ['white', 'orange', 'magenta', 'light_blue', 'yellow', 'lime', 'pink', 'gray',
          'light_gray', 'cyan', 'purple', 'blue', 'brown', 'green', 'red', 'black']
DYES = ['ink_sac', 'red_dye', 'green_dye', 'cocoa_beans', 'lapis_lazuli', 'purple_dye', 'cyan_dye',
        'light_gray_dye', 'gray_dye', 'pink_dye', 'lime_dye', 'yellow_dye', 'light_blue_dye',
        'magenta_dye', 'orange_dye', 'bone_meal']
WOODS = ['oak', 'spruce', 'birch', 'jungle', 'acacia', 'dark_oak']
ENCH = {0: 'protection', 1: 'fire_protection', 2: 'feather_falling', 3: 'blast_protection',
        4: 'projectile_protection', 5: 'respiration', 6: 'aqua_affinity', 7: 'thorns',
        8: 'depth_strider', 9: 'frost_walker', 10: 'binding_curse', 16: 'sharpness', 17: 'smite',
        18: 'bane_of_arthropods', 19: 'knockback', 20: 'fire_aspect', 21: 'looting',
        22: 'sweeping_edge', 32: 'efficiency', 33: 'silk_touch', 34: 'unbreaking', 35: 'fortune',
        48: 'power', 49: 'punch', 50: 'flame', 51: 'infinity', 61: 'luck_of_the_sea', 62: 'lure',
        70: 'mending', 71: 'vanishing_curse'}
EFFECT = {1: 'speed', 2: 'slowness', 3: 'haste', 4: 'mining_fatigue', 5: 'strength',
          6: 'instant_health', 7: 'instant_damage', 8: 'jump_boost', 9: 'nausea', 10: 'regeneration',
          11: 'resistance', 12: 'fire_resistance', 13: 'water_breathing', 14: 'invisibility',
          15: 'blindness', 16: 'night_vision', 17: 'hunger', 18: 'weakness', 19: 'poison',
          20: 'wither', 21: 'health_boost', 22: 'absorption', 23: 'saturation', 24: 'glowing',
          25: 'levitation', 26: 'luck', 27: 'unluck'}


def remap_block(name, props, sig):
    """(name, props) -> (new_name or None for air-drop, new_props). sig = per-block variant."""
    p = dict(props)
    n = name.split(':')[-1]
    if n == 'air':
        return 'minecraft:air', {}
    if n == 'structure_block':
        return None, {}
    if n == 'grass':
        return 'minecraft:grass_block', {'snowy': p.get('snowy', 'false')}
    if n == 'dirt':
        v = p.get('variant', 'dirt')
        return {'dirt': 'minecraft:dirt', 'coarse_dirt': 'minecraft:coarse_dirt',
                'podzol': 'minecraft:podzol'}.get(v, 'minecraft:dirt'), {}
    if n == 'stone':
        return {'stone': 'minecraft:stone', 'granite': 'minecraft:granite',
                'smooth_granite': 'minecraft:polished_granite', 'diorite': 'minecraft:diorite',
                'smooth_diorite': 'minecraft:polished_diorite', 'andesite': 'minecraft:andesite',
                'smooth_andesite': 'minecraft:polished_andesite'}[p['variant']], {}
    if n == 'log':
        return 'minecraft:%s_log' % p['variant'], {'axis': p['axis']}
    if n == 'planks':
        return 'minecraft:%s_planks' % p['variant'], {}
    if n == 'bed':
        return 'minecraft:%s_bed' % COLORS[sig], {'part': p['part'], 'facing': p['facing'],
                                                 'occupied': p.get('occupied', 'false')}
    if n == 'flower_pot':
        item, data = sig
        pot = {'minecraft:air': None, 'minecraft:red_flower':
               ['potted_poppy', 'potted_blue_orchid', 'potted_allium', 'potted_azure_bluet',
                'potted_red_tulip', 'potted_orange_tulip', 'potted_white_tulip', 'potted_pink_tulip',
                'potted_oxeye_daisy'][data],
               'minecraft:yellow_flower': 'potted_dandelion', 'minecraft:tallgrass': 'potted_fern',
               'minecraft:deadbush': 'potted_dead_bush', 'minecraft:brown_mushroom': 'potted_brown_mushroom',
               'minecraft:red_mushroom': 'potted_red_mushroom', 'minecraft:cactus': 'potted_cactus',
               'minecraft:sapling': 'potted_%s_sapling' % WOODS[(data & 7) % 6]}.get(item, 'SENTINEL')
        if pot == 'SENTINEL':
            warn('flower pot content %s/%s' % (item, data))
            pot = None
        return ('minecraft:flower_pot' if pot is None else 'minecraft:' + pot), {}
    if n in ('banner', 'wall_banner'):
        base = COLORS[sig]
        if n == 'banner':
            return 'minecraft:%s_banner' % base, {'rotation': p['rotation']}
        return 'minecraft:%s_wall_banner' % base, {'facing': p['facing']}
    if n == 'skull':
        stype = sig
        floor = {0: 'skeleton_skull', 1: 'wither_skeleton_skull', 2: 'zombie_head', 3: 'player_head',
                 4: 'creeper_head', 5: 'dragon_head'}[stype]
        wall = {0: 'skeleton_wall_skull', 1: 'wither_skeleton_wall_skull', 2: 'zombie_wall_head',
                3: 'player_wall_head', 4: 'creeper_wall_head', 5: 'dragon_wall_head'}[stype]
        if p.get('facing', 'up') == 'up':
            return 'minecraft:' + floor, {'rotation': '0'}
        return 'minecraft:' + wall, {'facing': p['facing']}
    if n == 'sign':
        return 'minecraft:oak_sign', {'rotation': p['rotation'], 'waterlogged': 'false'}
    if n == 'wall_sign':
        return 'minecraft:oak_wall_sign', {'facing': p['facing'], 'waterlogged': 'false'}
    if n == 'fence':
        return 'minecraft:oak_fence', {'east': p['east'], 'north': p['north'], 'south': p['south'],
                                      'west': p['west'], 'waterlogged': 'false'}
    if n == 'fence_gate':
        return 'minecraft:oak_fence_gate', p
    if n == 'trapdoor':
        return 'minecraft:oak_trapdoor', {'half': p['half'], 'facing': p['facing'],
                                         'open': p['open'], 'waterlogged': 'false'}
    if n == 'wooden_door':
        return 'minecraft:oak_door', p
    if n == 'wooden_slab':
        return 'minecraft:%s_slab' % p['variant'], {'type': p['half'], 'waterlogged': 'false'}
    if n == 'double_wooden_slab':
        return 'minecraft:%s_slab' % p['variant'], {'type': 'double', 'waterlogged': 'false'}
    if n == 'stone_slab':
        slab = {'stone': 'stone_slab', 'sandstone': 'sandstone_slab', 'cobblestone': 'cobblestone_slab',
                'brick': 'brick_slab', 'stone_brick': 'stone_brick_slab',
                'nether_brick': 'nether_brick_slab', 'quartz': 'quartz_slab',
                'red_sandstone': 'red_sandstone_slab', 'purpur': 'purpur_slab',
                'wood_old': 'oak_slab'}[p['variant']]
        return 'minecraft:' + slab, {'type': p['half'], 'waterlogged': 'false'}
    if n == 'stonebrick':
        return {'stonebrick': 'minecraft:stone_bricks', 'mossy_stonebrick': 'minecraft:mossy_stone_bricks',
                'cracked_stonebrick': 'minecraft:cracked_stone_bricks',
                'chiseled_stonebrick': 'minecraft:chiseled_stone_bricks'}[p['variant']], {}
    if n == 'monster_egg':
        return {'stone': 'minecraft:infested_stone', 'cobblestone': 'minecraft:infested_cobblestone',
                'stone_brick': 'minecraft:infested_stone_bricks',
                'mossy_stonebrick': 'minecraft:infested_mossy_stone_bricks',
                'cracked_stonebrick': 'minecraft:infested_cracked_stone_bricks',
                'chiseled_stonebrick': 'minecraft:infested_chiseled_stone_bricks'}[p['variant']], {}
    if n == 'cobblestone_wall':
        q = {k: p[k] for k in ('east', 'north', 'south', 'west', 'up')}
        q['waterlogged'] = 'false'
        return ('minecraft:mossy_cobblestone_wall' if p.get('variant') == 'mossy'
                else 'minecraft:cobblestone_wall'), q
    if n == 'tallgrass':
        t = p.get('type', 'grass')
        if t == 'deadbush':
            return 'minecraft:dead_bush', {}
        if t == 'fern':
            return 'minecraft:fern', {}
        return 'minecraft:short_grass', {}
    if n == 'red_flower':
        return 'minecraft:' + p['type'], {}
    if n == 'wool':
        return 'minecraft:%s_wool' % p['color'], {}
    if n == 'carpet':
        return 'minecraft:%s_carpet' % p['color'], {}
    if n == 'stained_glass_pane':
        return 'minecraft:%s_stained_glass_pane' % p['color'], {
            'east': p['east'], 'north': p['north'], 'south': p['south'], 'west': p['west'],
            'waterlogged': 'false'}
    if n == 'stained_hardened_clay':
        return 'minecraft:%s_terracotta' % p['color'], {}
    if n == 'snow_layer':
        return 'minecraft:snow', {'layers': p['layers']}
    if n == 'cauldron':
        return ('minecraft:cauldron', {}) if p.get('level', '0') == '0' else (
            'minecraft:water_cauldron', {'level': p['level']})
    if n == 'anvil':
        return ['minecraft:anvil', 'minecraft:chipped_anvil',
                'minecraft:damaged_anvil'][int(p.get('damage', '0'))], {'facing': p['facing']}
    if n == 'piston':
        return 'minecraft:piston', {'facing': p['facing']}
    if n == 'piston_head':
        return 'minecraft:piston_head', p
    if n in ('glass_pane', 'iron_bars'):
        q = {k: p[k] for k in ('east', 'north', 'south', 'west')}
        q['waterlogged'] = 'false'
        return 'minecraft:' + n, q
    if n == 'iron_trapdoor':
        q = {'half': p['half'], 'facing': p['facing'], 'open': p['open'], 'waterlogged': 'false',
             'powered': p.get('powered', 'false')}
        return 'minecraft:iron_trapdoor', q
    if n in ('chest', 'furnace', 'jukebox', 'crafting_table', 'bookshelf', 'glowstone', 'netherrack',
             'cobblestone', 'concrete', 'concrete_powder', 'torch', 'fire', 'water', 'end_rod',
             'redstone_block',
             'tripwire_hook', 'piston', 'oak_stairs', 'spruce_stairs', 'birch_stairs',
             'dark_oak_stairs', 'quartz_stairs', 'stone_stairs', 'stone_brick_stairs',
             'dark_oak_door', 'birch_door', 'spruce_door', 'iron_door', 'dark_oak_fence',
             'spruce_fence', 'nether_brick_fence', 'spruce_fence_gate'):
        return 'minecraft:' + n, p
    raise KeyError(name)


VARIANT_BLOCKS = {'bed', 'skull', 'flower_pot', 'banner', 'wall_banner'}


def block_sig(name, nbt):
    n = name.split(':')[-1]
    v = nbt.v if nbt else {}
    if n == 'bed':
        return v['color'].v
    if n == 'skull':
        return v.get('SkullType', T(1, 0)).v
    if n == 'flower_pot':
        return (v.get('Item', T(8, 'minecraft:air')).v, v.get('Data', T(4, 0)).v)
    if n in ('banner', 'wall_banner'):
        return v.get('Base', T(1, 15)).v
    return None


def remap_block_entity(name, nbt):
    """1.12 block nbt -> 1.21 block nbt (or None to strip)."""
    n = name.split(':')[-1]
    v = nbt.v
    if n in ('bed', 'furnace', 'sign', 'wall_sign', 'jukebox', 'flower_pot', 'structure_block'):
        if n == 'furnace' and v.get('Items') and v['Items'].v[1]:
            warn('non-empty furnace kept emptied')
        return None
    if n == 'chest':
        items = []
        for it in (v.get('Items').v[1] if v.get('Items') else []):
            items.append(convert_item(it))
        out = {}
        if items:
            out['items'] = T(9, (10, items))
        if v.get('Lock') and v['Lock'].v:
            out['lock'] = T(8, v['Lock'].v)
        if v.get('LootTable'):
            out['loot_table'] = T(8, v['LootTable'].v)
            if v.get('LootTableSeed') is not None:
                out['loot_table_seed'] = T(3, v['LootTableSeed'].v)
        return T(10, out) if out else None
    if n == 'skull':
        out = {}
        if 'Rot' in v:
            out['rotation'] = T(3, v['Rot'].v)
        if 'Owner' in v:
            o = v['Owner']
            prof = {}
            if o.tag == 8:
                prof['name'] = T(8, o.v)
            else:
                ov = o.v
                if 'Name' in ov:
                    prof['name'] = T(8, ov['Name'].v)
                if 'Id' in ov:
                    u = uuid.UUID(ov['Id'].v)
                    barr = u.bytes
                    prof['id'] = T(11, [struct.unpack('>i', barr[i:i + 4])[0] for i in (0, 4, 8, 12)])
                if 'Properties' in ov:
                    prof['properties'] = ov['Properties']
            out['profile'] = T(10, prof)
        return T(10, out) if out else None
    if n in ('banner', 'wall_banner'):
        pats = []
        for pt in (v.get('Patterns').v[1] if v.get('Patterns') else []):
            pv = pt.v
            pats.append(T(10, {'pattern': T(8, 'minecraft:' + pv['Pattern'].v),
                               'color': T(8, COLORS[pv['Color'].v])}))
        return T(10, {'patterns': T(9, (10, pats))}) if pats else None
    warn('unhandled block entity ' + name)
    return None


# ---------------- items ----------------
def remap_item_id(item_id, damage):
    n = item_id.split(':')[-1]
    simple = {'wooden_door': 'oak_door', 'wooden_slab': None, 'fish': None, 'cooked_fish': None,
              'dye': None, 'planks': None, 'sapling': None, 'log': None, 'tallgrass': None,
              'red_flower': None, 'yellow_flower': 'dandelion', 'stone_slab': None, 'stonebrick': None,
              'monster_egg': None, 'cobblestone_wall': None, 'dirt': None, 'sand': None, 'wool': None,
              'carpet': None, 'stained_glass_pane': None, 'stained_hardened_clay': None,
              'double_wooden_slab': None, 'stone': None, 'grass': 'grass_block', 'bed': None,
              'banner': None, 'skull': None, 'sign': 'oak_sign', 'boat': 'oak_boat',
              'speckled_melon': 'glistering_melon_slice', 'cooked_porkchop': 'cooked_porkchop'}
    if n == 'fish':
        return 'minecraft:' + ['cod', 'salmon', 'tropical_fish', 'pufferfish'][damage]
    if n == 'cooked_fished' or n == 'cooked_fish':
        return 'minecraft:' + ['cooked_cod', 'cooked_salmon'][damage]
    if n == 'dye':
        return 'minecraft:' + DYES[damage]
    if n in ('planks', 'sapling', 'log'):
        wood = WOODS[damage % 6]
        return 'minecraft:' + {'planks': '%s_planks', 'sapling': '%s_sapling', 'log': '%s_log'}[n] % wood
    if n == 'tallgrass':
        return 'minecraft:' + (['dead_bush', 'short_grass', 'fern'][damage] if damage < 3 else 'short_grass')
    if n == 'red_flower':
        return 'minecraft:' + ['poppy', 'blue_orchid', 'allium', 'azure_bluet', 'red_tulip',
                               'orange_tulip', 'white_tulip', 'pink_tulip', 'oxeye_daisy'][damage]
    if n == 'stone_slab':
        return 'minecraft:' + ['stone_slab', 'sandstone_slab', 'cobblestone_slab', 'brick_slab',
                               'stone_brick_slab', 'nether_brick_slab', 'quartz_slab'][damage]
    if n == 'stonebrick':
        return 'minecraft:' + ['stone_bricks', 'mossy_stone_bricks', 'cracked_stone_bricks',
                               'chiseled_stone_bricks'][damage]
    if n == 'monster_egg':
        return 'minecraft:' + ['infested_stone', 'infested_cobblestone', 'infested_stone_bricks',
                               'infested_mossy_stone_bricks', 'infested_cracked_stone_bricks',
                               'infested_chiseled_stone_bricks'][damage]
    if n == 'cobblestone_wall':
        return 'minecraft:' + ['cobblestone_wall', 'mossy_cobblestone_wall'][damage]
    if n == 'dirt':
        return 'minecraft:' + ['dirt', 'coarse_dirt', 'podzol'][damage]
    if n == 'sand':
        return 'minecraft:' + ['sand', 'red_sand'][damage]
    if n == 'wool':
        return 'minecraft:' + COLORS[damage] + '_wool'
    if n == 'carpet':
        return 'minecraft:' + COLORS[damage] + '_carpet'
    if n == 'stained_glass_pane':
        return 'minecraft:' + COLORS[damage] + '_stained_glass_pane'
    if n == 'stained_hardened_clay':
        return 'minecraft:' + COLORS[damage] + '_terracotta'
    if n == 'double_wooden_slab':
        return 'minecraft:' + WOODS[damage % 6] + '_slab'
    if n == 'stone':
        return 'minecraft:' + ['stone', 'granite', 'polished_granite', 'diorite', 'polished_diorite',
                               'andesite', 'polished_andesite'][damage]
    if n == 'bed':
        return 'minecraft:' + COLORS[damage] + '_bed'
    if n == 'banner':
        return 'minecraft:' + COLORS[damage] + '_banner'
    if n == 'skull':
        return 'minecraft:' + ['skeleton_skull', 'wither_skeleton_skull', 'zombie_head', 'player_head',
                               'creeper_head', 'dragon_head'][damage]
    if n == 'coal' and damage == 1:
        return 'minecraft:charcoal'
    if n == 'golden_apple' and damage == 1:
        return 'minecraft:enchanted_golden_apple'
    if n in simple and simple[n]:
        return 'minecraft:' + simple[n]
    if item_id.startswith('minecraft:'):
        return item_id
    return item_id


def convert_item(comp):
    """1.12 item compound {id,Count,Damage,tag?} -> 1.21 {id,count,components?} (+slot passthrough)."""
    v = comp.v
    if 'id' not in v:
        return T(10, {'id': T(8, 'minecraft:air')})
    item_id = v['id'].v
    count = v.get('Count', v.get('count', T(1, 1))).v
    damage = v.get('Damage', T(2, 0)).v
    new_id = remap_item_id(item_id, damage)
    out = {'id': T(8, new_id), 'count': T(3, count)}
    if 'Slot' in v:
        out['slot'] = T(3, v['Slot'].v)
    if 'slot' in v:
        out['slot'] = T(3, v['slot'].v)
    comps = {}
    tag = v.get('tag')
    if tag:
        tv = tag.v
        if 'display' in tv:
            dv = tv['display'].v
            if 'Name' in dv:
                comps['minecraft:custom_name'] = T(8, dv['Name'].v)
            if 'Lore' in dv:
                _, lines = dv['Lore'].v
                comps['minecraft:lore'] = T(9, (8, [T(8, x.v) for x in lines]))
            for k in dv:
                if k not in ('Name', 'Lore'):
                    warn('item display subtag ' + k)
        if 'ench' in tv:
            _, ench = tv['ench'].v
            levels = {}
            for e in ench:
                ev = e.v
                levels['minecraft:' + ENCH[ev['id'].v]] = T(3, ev['lvl'].v)
            comps['minecraft:enchantments'] = T(10, {'levels': T(10, levels)})
        if 'StoredEnchantments' in tv:
            _, ench = tv['StoredEnchantments'].v
            levels = {}
            for e in ench:
                ev = e.v
                levels['minecraft:' + ENCH[ev['id'].v]] = T(3, ev['lvl'].v)
            comps['minecraft:stored_enchantments'] = T(10, {'levels': T(10, levels)})
        if 'EntityTag' in tv:
            comps['minecraft:entity_data'] = tv['EntityTag']
        if 'Potion' in tv:
            comps['minecraft:potion'] = T(8, tv['Potion'].v)
        if 'CustomPotionEffects' in tv:
            _, effs = tv['CustomPotionEffects'].v
            ce = []
            for e in effs:
                ev = e.v
                ce.append(T(10, {'id': T(8, 'minecraft:' + EFFECT[ev['Id'].v]),
                                 'amplifier': T(1, ev.get('Amplifier', T(1, 0)).v),
                                 'duration': T(3, ev.get('Duration', T(3, 200)).v)}))
            comps['minecraft:potion_contents'] = T(10, {'custom_effects': T(9, (10, ce))})
        if 'SkullOwner' in tv:
            o = tv['SkullOwner']
            if o.tag == 8:
                comps['minecraft:profile'] = T(10, {'name': T(8, o.v)})
            else:
                comps['minecraft:profile'] = o
        if 'map' in tv:
            comps['minecraft:map_id'] = T(3, tv['map'].v)
        if 'RepairCost' in tv:
            comps['minecraft:repair_cost'] = T(3, tv['RepairCost'].v)
        if 'HideFlags' in tv:
            hf = tv['HideFlags'].v
            if hf & 32:
                comps['minecraft:hide_additional_tooltip'] = T(10, {})
            if hf & 128:
                comps['minecraft:hide_tooltip'] = T(10, {})
        if 'BlockEntityTag' in tv:
            bet = tv['BlockEntityTag'].v
            if 'Base' in bet:
                comps['minecraft:base_color'] = T(8, COLORS[bet['Base'].v])
            if 'Patterns' in bet:
                _, pats = bet['Patterns'].v
                plist = []
                for pt in pats:
                    pv = pt.v
                    plist.append(T(10, {'pattern': T(8, 'minecraft:' + pv['Pattern'].v),
                                        'color': T(8, COLORS[pv['Color'].v])}))
                comps['minecraft:banner_patterns'] = T(9, (10, plist))
            if 'Items' in bet:
                _, sh = bet['Items'].v
                comps['minecraft:container'] = T(9, (10, [convert_item(x) for x in sh]))
            for k in bet:
                if k not in ('Base', 'Patterns', 'Items'):
                    warn('BlockEntityTag subtag ' + k)
        if 'Explosion' in tv:
            comps['minecraft:firework_explosion'] = tv['Explosion']
        if 'Fireworks' in tv:
            comps['minecraft:fireworks'] = tv['Fireworks']
        if 'pages' in tv:
            _, pages = tv['pages'].v
            comps['minecraft:writable_book_content'] = T(10, {
                'pages': T(9, (10, [T(10, {'raw': T(8, x.v)}) for x in pages]))})
        for k in tv:
            if k not in ('display', 'ench', 'StoredEnchantments', 'EntityTag', 'Potion',
                         'CustomPotionEffects', 'SkullOwner', 'map', 'RepairCost', 'HideFlags',
                         'BlockEntityTag', 'Explosion', 'Fireworks', 'pages', 'author', 'title',
                         'resolved', 'generation'):
                warn('item tag subtag ' + k)
        if 'author' in tv:
            comps['minecraft:written_book_content'] = T(10, {
                'title': T(10, {'raw': T(8, tv.get('title', T(8, '')).v)}),
                'author': T(8, tv['author'].v),
                'pages': T(9, (10, []))})
    if damage and new_id == item_id and item_id.startswith('minecraft:'):
        comps['minecraft:damage'] = T(3, damage)
    if comps:
        out['components'] = T(10, comps)
    return T(10, out)


# ---------------- entities ----------------
def clean_entity(nbt):
    v = dict(nbt.v)
    for k in ('UUIDMost', 'UUIDLeast', 'ForgeData', 'ForgeCaps', 'ForgeDataVersion', 'homeX', 'homeY',
              'homeZ', 'UpdateBlocked', 'Dimension'):
        v.pop(k, None)
    for k in ('Item',):
        if k in v:
            v[k] = convert_item(v[k])
    for k in ('HandItems', 'ArmorItems'):
        if k in v:
            _, items = v[k].v
            v[k] = T(9, (10, [convert_item(x) for x in items]))
    for k in ('Inventory', 'inventory', 'Items'):
        if k in v and v[k].tag == 9:
            et, items = v[k].v
            if et == 10:
                v[k] = T(9, (10, [convert_item(x) if x.tag == 10 else x for x in items]))
    if v.get('Saddle') is not None:
        if v['Saddle'].v:
            v['SaddleItem'] = T(10, {'id': T(8, 'minecraft:saddle'), 'count': T(3, 1)})
        del v['Saddle']
    if 'ActiveEffects' in v:
        _, effs = v['ActiveEffects'].v
        ne = []
        for e in effs:
            ev = e.v
            if ev['Id'].v in EFFECT:
                ne.append(T(10, {'id': T(8, 'minecraft:' + EFFECT[ev['Id'].v]),
                                 'amplifier': T(1, ev.get('Amplifier', T(1, 0)).v),
                                 'duration': T(3, ev.get('Duration', T(3, 200)).v),
                                 'ambient': T(1, ev.get('Ambient', T(1, 0)).v),
                                 'show_particles': T(1, ev.get('ShowParticles', T(1, 1)).v)}))
        if ne:
            v['active_effects'] = T(9, (10, ne))
        del v['ActiveEffects']
    eid = v['id'].v if 'id' in v else ''
    if eid == 'minecraft:ocelot' and ('OwnerUUID' in v or 'Owner' in v):
        v['id'] = T(8, 'minecraft:cat')
        ct = v.pop('CatType', T(3, 0)).v
        v['variant'] = T(8, 'minecraft:' + ['tabby', 'all_black', 'red', 'siamese'][ct]
                       if ct < 4 else 'minecraft:tabby')
        ou = v.pop('OwnerUUID', v.pop('Owner', None))
        if ou is not None and ou.tag == 8:
            try:
                u = uuid.UUID(ou.v)
                barr = u.bytes
                v['Owner'] = T(11, [struct.unpack('>i', barr[i:i + 4])[0] for i in (0, 4, 8, 12)])
            except ValueError:
                warn('bad owner uuid ' + ou.v)
    elif eid == 'minecraft:ocelot':
        v.pop('CatType', None)
    return T(10, v)


# ---------------- main ----------------
def process(name):
    root = load(SRC % name).v
    pal = root['palette'].v[1]
    blocks = root['blocks'].v[1]
    names = [e.v['Name'].v for e in pal]
    props = [({k: x.v for k, x in e.v.get('Properties', T(10, {})).v.items()}) for e in pal]
    # expansion pass for per-block variants
    key_of = {}
    new_names = []
    new_props = []
    new_sig = []

    def entry_for(state, sig):
        key = (state, str(sig))
        if key not in key_of:
            key_of[key] = len(new_names)
            new_names.append(names[state])
            new_props.append(props[state])
            new_sig.append(sig)
        return key_of[key]

    remapped_states = []
    for b in blocks:
        bv = b.v
        st = bv['state'].v
        nbt = bv.get('nbt')
        n = names[st].split(':')[-1]
        sig = block_sig(names[st], nbt) if n in VARIANT_BLOCKS else None
        remapped_states.append(entry_for(st, sig))
    # remap palette
    air_idx = None
    final_names = []
    final_props = []
    idx_map = {}
    for i, (nm, pr, sg) in enumerate(zip(new_names, new_props, new_sig)):
        try:
            rn, rp = remap_block(nm, pr, sg)
        except KeyError:
            warn('UNKNOWN BLOCK ' + nm + ' ' + str(pr))
            rn, rp = 'minecraft:air', {}
        if rn is None:
            if air_idx is None:
                air_idx = len(final_names)
                final_names.append('minecraft:air')
                final_props.append({})
            idx_map[i] = air_idx
        else:
            key = (rn, str(sorted(rp.items())))
            found = None
            for j, (fn, fp) in enumerate(zip(final_names, final_props)):
                if (fn, str(sorted(fp.items()))) == key:
                    found = j
                    break
            if found is None:
                found = len(final_names)
                final_names.append(rn)
                final_props.append(rp)
            idx_map[i] = found
    # rebuild blocks
    out_blocks = []
    for b, st in zip(blocks, remapped_states):
        bv = dict(b.v)
        bv['state'] = T(3, idx_map[st])
        if 'nbt' in bv:
            conv = remap_block_entity(new_names[st], b.v['nbt'])
            if conv is None:
                bv.pop('nbt', None)
            else:
                bv['nbt'] = conv
        out_blocks.append(T(10, bv))
    # entities
    out_ents = []
    for e in root.get('entities', T(9, (10, []))).v[1]:
        ev = dict(e.v)
        ev['nbt'] = clean_entity(ev['nbt'])
        out_ents.append(T(10, ev))
    # show custom inventories for verification
    for e in out_ents:
        nbt = e.v['nbt'].v
        if 'inventory' in nbt:
            inv = nbt['inventory']
            if inv.tag == 9:
                print('  inventory-list of', nbt['id'].v, ':',
                      [(x.v.get('Slot', T(0, -1)).v, x.v.get('id', T(8, '?')).v) for x in inv.v[1][:8]])
            else:
                print('  inventory-compound of', nbt['id'].v, 'keys:', sorted(inv.v.keys()))
    new_root = T(10, {
        'DataVersion': T(3, DATA_VERSION_1211),
        'size': root['size'],
        'author': root.get('author', T(8, 'sexmod')),
        'palettes': T(9, (9, [T(9, (10, [
            T(10, {'Name': T(8, fn),
                   'Properties': T(10, {k: T(8, x) for k, x in fp.items()})})
            for fn, fp in zip(final_names, final_props)]))])),
        'blocks': T(9, (10, out_blocks)),
        'entities': T(9, (10, out_ents)),
    })
    save(new_root, DST % name)
    print('%s: palette %d -> %d, blocks %d, entities %d' % (
        name, len(pal), len(final_names), len(out_blocks), len(out_ents)))


if __name__ == '__main__':
    import os
    os.makedirs('jenny-neoforge/src/main/resources/data/sexmod/structures', exist_ok=True)
    for f in FILES:
        process(f)
    print('warnings:', len(WARNINGS))
