package net.builderdog.ancient_aether.datagen.resources;

import net.builderdog.ancient_aether.AncientAether;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.structure.Structure;

public class AncientAetherStructureRegistry {
    public static final ResourceKey<Structure> ANCIENT_DUNGEON = createKey();

    private static ResourceKey<Structure> createKey() {
        return ResourceKey.create(Registries.STRUCTURE, new ResourceLocation(AncientAether.MOD_ID, "ancient_dungeon"));
    }
}