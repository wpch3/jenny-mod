package com.trolmastercard.sexmod.client.gui;

import com.trolmastercard.sexmod.entity.GirlEntity;
import com.trolmastercard.sexmod.network.UploadModelStringPayload;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;

public class CharacterEditorScreen extends Screen {
    private final GirlEntity a;
    private final UUID b;
    private final Map<EquipmentSlotType, List<String>> c = new LinkedHashMap<>();
    private final Map<EquipmentSlotType, Integer> d = new LinkedHashMap<>();
    private final Map<EquipmentSlotType, Button> e = new LinkedHashMap<>();

    private CharacterEditorScreen(GirlEntity var1) {
        super(Component.literal("Character Editor"));
        this.a = var1;
        this.b = var1.ah();
    }

    public static void a(GirlEntity var0) {
        Minecraft var1 = Minecraft.getInstance();
        var1.execute(() -> var1.setScreen(new CharacterEditorScreen(var0)));
    }

    protected void init() {
        HashMap<com.trolmastercard.sexmod.client.gui.EquipmentSlotType, List<String>> var1 = com.trolmastercard.sexmod.client.CustomModelLoader.a(this.a);
        int var2 = 0;
        int var3 = this.height - 52 - 24;

        for (EquipmentSlotType var7 : com.trolmastercard.sexmod.client.gui.EquipmentSlotType.values()) {
            if (var7 != com.trolmastercard.sexmod.client.gui.EquipmentSlotType.a) {
                ArrayList var8 = new ArrayList();
                var8.add("cross");
                var8.addAll(var1.getOrDefault(var7, List.of()));
                this.c.put(var7, var8);
                this.d.put(var7, 0);
                int var9 = var3 - var2 * 24;
                int var10 = this.width / 2;
                Button var11 = Button.builder(this.c(var7), var2x -> this.b(var7)).bounds(var10 - 100, var9, 200, 20).build();
                this.e.put(var7, var11);
                this.addRenderableWidget(var11);
                var2++;
            }
        }

        this.addRenderableWidget(Button.builder(Component.literal("Apply"), var1x -> this.a()).bounds(this.width / 2 - 100, this.height - 52, 95, 20).build());
        this.addRenderableWidget(
            Button.builder(Component.literal("Cancel"), var1x -> this.onClose()).bounds(this.width / 2 + 5, this.height - 52, 95, 20).build()
        );
    }

    private void b(EquipmentSlotType var1) {
        List var2 = this.c.get(var1);
        int var3 = (this.d.get(var1) + 1) % var2.size();
        this.d.put(var1, var3);
        this.e.get(var1).setMessage(this.c(var1));
    }

    public void a(EquipmentSlotType var1) {
        this.b(var1);
    }

    private Component c(EquipmentSlotType var1) {
        String var2 = this.c.get(var1).get(this.d.get(var1));
        return Component.literal(var1.name() + ": " + var2);
    }

    private void a() {
        HashSet var1 = new HashSet();

        for (Entry var3 : this.c.entrySet()) {
            int var4 = this.d.get(var3.getKey());
            if (var4 != 0) {
                var1.add((String)((List)var3.getValue()).get(var4));
            }
        }

        com.trolmastercard.sexmod.client.ClientUtils.a(new UploadModelStringPayload(GirlEntity.a(var1), this.b.toString()));
        this.onClose();
    }

    public void render(GuiGraphics var1, int var2, int var3, float var4) {
        super.render(var1, var2, var3, var4);
        LivingEntity var5 = this.b();
        if (var5 != null) {
            int var6 = this.width / 2;
            int var7 = this.height / 2 + 40;
            InventoryScreen.renderEntityInInventoryFollowsMouse(var1, var6 - 45, var7 - 90, var6 + 45, var7, 45, 0.0625F, var2, var3, var5);
        }
    }

    private LivingEntity b() {
        return GirlEntity.s(this.b);
    }

    public boolean isPauseScreen() {
        return false;
    }
}
