package net.builderdog.ancient_aether.item;

import com.aetherteam.aether.block.AetherBlocks;
import com.aetherteam.aether.item.AetherCreativeTabs;
import com.aetherteam.aether.item.AetherItems;
import net.builderdog.ancient_aether.AncientAether;
import net.builderdog.ancient_aether.block.AncientAetherBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;

import static com.aetherteam.aether.item.AetherCreativeTabs.AETHER_BUILDING_BLOCKS;

@Mod.EventBusSubscriber(modid = AncientAether.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class AncientAetherCreativeModeTabs {

    @SubscribeEvent
    public static void buildCreativeModeTabs(BuildCreativeModeTabContentsEvent event) {
        CreativeModeTab tab = event.getTab();

        if (tab == AETHER_BUILDING_BLOCKS.get()) {
            event.getEntries().putAfter(new ItemStack(AetherBlocks.GOLDEN_OAK_WOOD.get()), new ItemStack(AncientAetherBlocks.HIGHSPROOT_LOG.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            if (ModList.get().isLoaded("aether_genesis")) {
                event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.HIGHSPROOT_LOG.get()), new ItemStack(AncientAetherBlocks.HIGHSPROOT_LOG_WALL.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            }
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.HIGHSPROOT_LOG.get()), new ItemStack(AncientAetherBlocks.HIGHSPROOT_WOOD.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            if (ModList.get().isLoaded("aether_genesis")) {
                event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.HIGHSPROOT_WOOD.get()), new ItemStack(AncientAetherBlocks.HIGHSPROOT_WOOD_WALL.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            }
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.HIGHSPROOT_WOOD.get()), new ItemStack(AncientAetherBlocks.STRIPPED_HIGHSPROOT_LOG.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            if (ModList.get().isLoaded("aether_genesis")) {
                event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.STRIPPED_HIGHSPROOT_LOG.get()), new ItemStack(AncientAetherBlocks.STRIPPED_HIGHSPROOT_LOG_WALL.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            }
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.STRIPPED_HIGHSPROOT_LOG.get()), new ItemStack(AncientAetherBlocks.STRIPPED_HIGHSPROOT_WOOD.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            if (ModList.get().isLoaded("aether_genesis")) {
                event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.STRIPPED_HIGHSPROOT_WOOD.get()), new ItemStack(AncientAetherBlocks.STRIPPED_HIGHSPROOT_WOOD_WALL.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            }
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.STRIPPED_HIGHSPROOT_WOOD.get()), new ItemStack(AncientAetherBlocks.HIGHSPROOT_PLANKS.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.HIGHSPROOT_PLANKS.get()), new ItemStack(AncientAetherBlocks.HIGHSPROOT_STAIRS.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.HIGHSPROOT_STAIRS.get()), new ItemStack(AncientAetherBlocks.HIGHSPROOT_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.HIGHSPROOT_SLAB.get()), new ItemStack(AncientAetherBlocks.HIGHSPROOT_FENCE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.HIGHSPROOT_FENCE.get()), new ItemStack(AncientAetherBlocks.HIGHSPROOT_FENCE_GATE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.HIGHSPROOT_FENCE_GATE.get()), new ItemStack(AncientAetherBlocks.HIGHSPROOT_DOOR.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.HIGHSPROOT_DOOR.get()), new ItemStack(AncientAetherBlocks.HIGHSPROOT_TRAPDOOR.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.HIGHSPROOT_TRAPDOOR.get()), new ItemStack(AncientAetherBlocks.HIGHSPROOT_PRESSURE_PLATE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.HIGHSPROOT_PRESSURE_PLATE.get()), new ItemStack(AncientAetherBlocks.HIGHSPROOT_BUTTON.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.HIGHSPROOT_BUTTON.get()), new ItemStack(AncientAetherBlocks.SAKURA_LOG.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.SAKURA_LOG.get()), new ItemStack(AncientAetherBlocks.SAKURA_WOOD.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            if (ModList.get().isLoaded("aether_genesis")) {
                event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.SAKURA_LOG.get()), new ItemStack(AncientAetherBlocks.SAKURA_LOG_WALL.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            }
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.SAKURA_WOOD.get()), new ItemStack(AncientAetherBlocks.STRIPPED_SAKURA_LOG.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            if (ModList.get().isLoaded("aether_genesis")) {
                event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.SAKURA_WOOD.get()), new ItemStack(AncientAetherBlocks.SAKURA_WOOD_WALL.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            }
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.STRIPPED_SAKURA_LOG.get()), new ItemStack(AncientAetherBlocks.STRIPPED_SAKURA_WOOD.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            if (ModList.get().isLoaded("aether_genesis")) {
                event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.STRIPPED_SAKURA_LOG.get()), new ItemStack(AncientAetherBlocks.STRIPPED_SAKURA_LOG_WALL.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            }
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.STRIPPED_SAKURA_WOOD.get()), new ItemStack(AncientAetherBlocks.SAKURA_PLANKS.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            if (ModList.get().isLoaded("aether_genesis")) {
                event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.STRIPPED_SAKURA_WOOD.get()), new ItemStack(AncientAetherBlocks.STRIPPED_SAKURA_WOOD_WALL.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            }
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.SAKURA_PLANKS.get()), new ItemStack(AncientAetherBlocks.SAKURA_STAIRS.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.SAKURA_STAIRS.get()), new ItemStack(AncientAetherBlocks.SAKURA_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.SAKURA_SLAB.get()), new ItemStack(AncientAetherBlocks.SAKURA_FENCE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.SAKURA_FENCE.get()), new ItemStack(AncientAetherBlocks.SAKURA_FENCE_GATE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.SAKURA_FENCE_GATE.get()), new ItemStack(AncientAetherBlocks.SAKURA_DOOR.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.SAKURA_DOOR.get()), new ItemStack(AncientAetherBlocks.SAKURA_TRAPDOOR.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.SAKURA_TRAPDOOR.get()), new ItemStack(AncientAetherBlocks.SAKURA_PRESSURE_PLATE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.SAKURA_PRESSURE_PLATE.get()), new ItemStack(AncientAetherBlocks.SAKURA_BUTTON.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AetherBlocks.HOLYSTONE_BRICKS.get()), new ItemStack(AncientAetherBlocks.HOLYSTONE_BRICK_MOSAIC.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.BUFFALO_WOOL.get()), new ItemStack(AncientAetherBlocks.BUFFALO_WOOL.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.BUFFALO_WOOL.get()), new ItemStack(AncientAetherBlocks.BUFFALO_CARPET.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AetherBlocks.AEROGEL_WALL.get()), new ItemStack(AncientAetherBlocks.AEROGEL_GLASS.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.AEROGEL_GLASS.get()), new ItemStack(AncientAetherBlocks.AEROGEL_GLASS_PANE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.AEROGEL_GLASS_PANE.get()), new ItemStack(AncientAetherBlocks.AEROGEL_GLASS_DOOR.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.AEROGEL_GLASS_DOOR.get()), new ItemStack(AncientAetherBlocks.AEROGEL_GLASS_TRAPDOOR.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }

        if (tab == AetherCreativeTabs.AETHER_NATURAL_BLOCKS.get()) {
            event.getEntries().putAfter(new ItemStack(AetherBlocks.AETHER_DIRT.get()), new ItemStack(AncientAetherBlocks.DIVINE_GRAVEL.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AetherBlocks.AMBROSIUM_ORE.get()), new ItemStack(AncientAetherBlocks.AETHER_QUARTZ_ORE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AetherBlocks.GOLDEN_OAK_LOG.get()), new ItemStack(AncientAetherBlocks.HIGHSPROOT_LOG.get()), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.HIGHSPROOT_LOG.get()), new ItemStack(AncientAetherBlocks.SAKURA_LOG.get()), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.getEntries().putAfter(new ItemStack(AetherBlocks.SKYROOT_LEAVES.get()), new ItemStack(AncientAetherBlocks.DIVINE_SKYROOT_LEAVES.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AetherBlocks.SKYROOT_SAPLING.get()), new ItemStack(AncientAetherBlocks.DIVINE_SKYROOT_SAPLING.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AetherBlocks.GOLDEN_OAK_LEAVES.get()), new ItemStack(AncientAetherBlocks.HIGHSPROOT_LEAVES.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.HIGHSPROOT_LEAVES.get()), new ItemStack(AncientAetherBlocks.FROSTED_HIGHSPROOT_LEAVES.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.FROSTED_HIGHSPROOT_LEAVES.get()), new ItemStack(AncientAetherBlocks.SAKURA_LEAVES.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AetherBlocks.GOLDEN_OAK_SAPLING.get()), new ItemStack(AncientAetherBlocks.HIGHSPROOT_SAPLING.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.HIGHSPROOT_SAPLING.get()), new ItemStack(AncientAetherBlocks.FROSTED_HIGHSPROOT_SAPLING.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.FROSTED_HIGHSPROOT_SAPLING.get()), new ItemStack(AncientAetherBlocks.SAKURA_SAPLING.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.SAKURA_SAPLING.get()), new ItemStack(AncientAetherBlocks.CRYSTAL_SAPLING.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AetherBlocks.BERRY_BUSH.get()), new ItemStack(AncientAetherBlocks.DRIFT_WEED.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AetherBlocks.PURPLE_FLOWER.get()), new ItemStack(AncientAetherBlocks.HIGHLAND_VIOLA.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AetherBlocks.WHITE_FLOWER.get()), new ItemStack(AncientAetherBlocks.SKY_BLUES.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.SKY_BLUES.get()), new ItemStack(AncientAetherBlocks.WYND_THISTLE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.WYND_THISTLE.get()), new ItemStack(AncientAetherBlocks.SAKURA_BLOSSOMS.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.SAKURA_BLOSSOMS.get()), new ItemStack(AncientAetherBlocks.TRAPPED_SAKURA_BLOSSOMS.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.SAKURA_LEAVES.get()), new ItemStack(AncientAetherBlocks.CRYSTAL_LEAVES.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AetherBlocks.BLUE_AERCLOUD.get()), new ItemStack(AncientAetherBlocks.VIOLET_AERCLOUD.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            if (!ModList.get().isLoaded("lost_aether_content")) {
                event.getEntries().remove(new ItemStack(AetherBlocks.CRYSTAL_LEAVES.get()));
                event.getEntries().remove(new ItemStack(AetherBlocks.CRYSTAL_FRUIT_LEAVES.get()));
            }
        }

        if (tab == AetherCreativeTabs.AETHER_EQUIPMENT_AND_UTILITIES.get()) {
            event.getEntries().putAfter(new ItemStack(AetherItems.FLAMING_SWORD.get()), new ItemStack(AncientAetherItems.ANCIENT_SWORD.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AetherItems.BLACK_MOA_EGG.get()), new ItemStack(AncientAetherItems.SAKURA_MOA_EGG.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putBefore(new ItemStack(AetherItems.BLUE_MOA_EGG.get()), new ItemStack(AncientAetherItems.ANCIENT_RUNE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AetherItems.SKYROOT_CHEST_BOAT.get()), new ItemStack(AncientAetherItems.HIGHSPROOT_BOAT.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherItems.HIGHSPROOT_BOAT.get()), new ItemStack(AncientAetherItems.HIGHSPROOT_CHEST_BOAT.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherItems.HIGHSPROOT_CHEST_BOAT.get()), new ItemStack(AncientAetherItems.SAKURA_BOAT.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherItems.SAKURA_BOAT.get()), new ItemStack(AncientAetherItems.SAKURA_CHEST_BOAT.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AetherItems.GOLD_DUNGEON_KEY.get()), new ItemStack(AncientAetherItems.ANCIENT_DUNGEON_KEY.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AetherItems.ENCHANTED_DART.get()), new ItemStack(AncientAetherItems.GRAVITITE_DART_SHOOTER.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }

        if (tab == AetherCreativeTabs.AETHER_FOOD_AND_DRINKS.get()) {
            event.getEntries().putAfter(new ItemStack(AetherItems.ENCHANTED_BERRY.get()), new ItemStack(AncientAetherItems.GRAPES.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AetherItems.SKYROOT_POISON_BUCKET.get()), new ItemStack(AncientAetherItems.VALKYRIE_WINE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().remove(new ItemStack(AetherItems.WHITE_APPLE.get()));
        }

        if (tab == AetherCreativeTabs.AETHER_SPAWN_EGGS.get()) {
            event.getEntries().putAfter(new ItemStack(AetherItems.BLACK_MOA_EGG.get()), new ItemStack(AncientAetherItems.SAKURA_MOA_EGG.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AetherItems.GOLDEN_SWET_SPAWN_EGG.get()), new ItemStack(AncientAetherItems.HIGHLAND_BUFFALO_SPAWN_EGG.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AetherItems.AERBUNNY_SPAWN_EGG.get()), new ItemStack(AncientAetherItems.AERONAUTIC_LEAPER_SPAWN_EGG.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putBefore(new ItemStack(AetherItems.SENTRY_SPAWN_EGG.get()), new ItemStack(AncientAetherItems.ROOTHYRN_SPAWN_EGG.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putBefore(new ItemStack(AetherItems.WHIRLWIND_SPAWN_EGG.get()), new ItemStack(AncientAetherItems.WYND_ZEPHYR_SPAWN_EGG.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }

        if (tab == AetherCreativeTabs.AETHER_INGREDIENTS.get()) {
            event.getEntries().putBefore(new ItemStack(AetherItems.SKYROOT_POISON_BUCKET.get()), new ItemStack(AncientAetherItems.AEROGEL_BOTTLE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherItems.ANCIENT_RUNE.get()), new ItemStack(AncientAetherItems.ANCIENT_RUNE.get()), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            event.getEntries().putAfter(new ItemStack(AetherBlocks.ENCHANTED_GRAVITITE.get()), new ItemStack(AncientAetherItems.DIVINE_CRYSTAL.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }

        if (tab == AetherCreativeTabs.AETHER_FUNCTIONAL_BLOCKS.get()) {
            event.getEntries().putAfter(new ItemStack(AetherBlocks.AMBROSIUM_TORCH.get()), new ItemStack(AncientAetherBlocks.HOLYSTONE_LANTERN.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.HOLYSTONE_LANTERN.get()), new ItemStack(AncientAetherBlocks.SENTRY_LANTERN.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.SENTRY_LANTERN.get()), new ItemStack(AncientAetherBlocks.ANGELIC_LANTERN.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.ANGELIC_LANTERN.get()), new ItemStack(AncientAetherBlocks.HELLFIRE_LANTERN.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            if (ModList.get().isLoaded("lost_aether_content")) {
                event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.HELLFIRE_LANTERN.get()), new ItemStack(AncientAetherBlocks.GALE_LANTERN.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            }
            event.getEntries().putBefore(new ItemStack(AncientAetherBlocks.HOLYSTONE_VASE.get()), new ItemStack(AncientAetherBlocks.ANCIENT_HOLYSTONE_VASE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putBefore(new ItemStack(AetherBlocks.TREASURE_CHEST.get()), new ItemStack(AncientAetherBlocks.HOLYSTONE_VASE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AetherBlocks.SKYROOT_BOOKSHELF.get()), new ItemStack(AncientAetherBlocks.HIGHSPROOT_BOOKSHELF.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.HIGHSPROOT_BOOKSHELF.get()), new ItemStack(AncientAetherBlocks.SAKURA_BOOKSHELF.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.HELLFIRE_LANTERN.get()), new ItemStack(AncientAetherBlocks.AEROTIC_LANTERN.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.GALE_LANTERN.get()), new ItemStack(AncientAetherBlocks.AMBROSIUM_CAMPFIRE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AetherBlocks.SKYROOT_HANGING_SIGN.get()), new ItemStack(AncientAetherBlocks.HIGHSPROOT_SIGN.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.HIGHSPROOT_SIGN.get()), new ItemStack(AncientAetherItems.HIGHSPROOT_HANGING_SIGN.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherItems.HIGHSPROOT_HANGING_SIGN.get()), new ItemStack(AncientAetherBlocks.SAKURA_SIGN.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.SAKURA_SIGN.get()), new ItemStack(AncientAetherItems.SAKURA_HANGING_SIGN.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.DEACTIVATED_ANCIENT_OBELISK.get()), new ItemStack(AncientAetherBlocks.DEACTIVATED_ANCIENT_OBELISK.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.DEACTIVATED_ANCIENT_OBELISK.get()), new ItemStack(AncientAetherBlocks.ANCIENT_OBELISK.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }

        if (tab == AetherCreativeTabs.AETHER_REDSTONE_BLOCKS.get()) {
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.CRACKED_SLIDER.get()), new ItemStack(AncientAetherBlocks.CRACKED_SLIDER.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AetherBlocks.INCUBATOR.get()), new ItemStack(AncientAetherBlocks.WIND_BLOWER.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putBefore(new ItemStack(AetherBlocks.ALTAR.get()), new ItemStack(AncientAetherBlocks.BUFFALO_WOOL.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }

        if (tab == AetherCreativeTabs.AETHER_ARMOR_AND_ACCESSORIES.get()) {
            event.getEntries().putAfter(new ItemStack(AetherItems.IRON_BUBBLE.get()), new ItemStack(AncientAetherItems.STRENGTH_STONE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AetherItems.ICE_PENDANT.get()), new ItemStack(AncientAetherItems.ANCIENT_RING.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherItems.ANCIENT_RING.get()), new ItemStack(AncientAetherItems.ANCIENT_PENDANT.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherItems.ANCIENT_PENDANT.get()), new ItemStack(AncientAetherItems.HEALTH_RING.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherItems.HEALTH_RING.get()), new ItemStack(AncientAetherItems.HEALTH_PENDANT.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }

        if (tab == AetherCreativeTabs.AETHER_DUNGEON_BLOCKS.get()) {
            event.getEntries().putAfter(new ItemStack(AetherBlocks.CARVED_WALL.get()), new ItemStack(AncientAetherBlocks.CARVED_STONE_MOSAIC.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.CARVED_STONE_MOSAIC.get()), new ItemStack(AncientAetherBlocks.LOCKED_CARVED_STONE_MOSAIC.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AetherBlocks.ANGELIC_WALL.get()), new ItemStack(AncientAetherBlocks.ANGELIC_STONE_MOSAIC.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.ANGELIC_STONE_MOSAIC.get()), new ItemStack(AncientAetherBlocks.LOCKED_ANGELIC_STONE_MOSAIC.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AetherBlocks.HELLFIRE_WALL.get()), new ItemStack(AncientAetherBlocks.HELLFIRE_STONE_MOSAIC.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.HELLFIRE_STONE_MOSAIC.get()), new ItemStack(AncientAetherBlocks.LOCKED_HELLFIRE_STONE_MOSAIC.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AetherBlocks.TREASURE_DOORWAY_LIGHT_HELLFIRE_STONE.get()), new ItemStack(AncientAetherBlocks.AEROTIC_STONE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.AEROTIC_STONE.get()), new ItemStack(AncientAetherBlocks.LOCKED_AEROTIC_STONE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.LOCKED_AEROTIC_STONE.get()), new ItemStack(AncientAetherBlocks.TRAPPED_AEROTIC_STONE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.TRAPPED_AEROTIC_STONE.get()), new ItemStack(AncientAetherBlocks.BOSS_DOORWAY_AEROTIC_STONE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.BOSS_DOORWAY_AEROTIC_STONE.get()), new ItemStack(AncientAetherBlocks.TREASURE_DOORWAY_AEROTIC_STONE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.TREASURE_DOORWAY_AEROTIC_STONE.get()), new ItemStack(AncientAetherBlocks.AEROTIC_STAIRS.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.AEROTIC_STAIRS.get()), new ItemStack(AncientAetherBlocks.AEROTIC_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.AEROTIC_SLAB.get()), new ItemStack(AncientAetherBlocks.AEROTIC_WALL.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.AEROTIC_WALL.get()), new ItemStack(AncientAetherBlocks.AEROTIC_STONE_MOSAIC.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.AEROTIC_STONE_MOSAIC.get()), new ItemStack(AncientAetherBlocks.LOCKED_AEROTIC_STONE_MOSAIC.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.LOCKED_AEROTIC_STONE_MOSAIC.get()), new ItemStack(AncientAetherBlocks.LIGHT_AEROTIC_STONE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.LIGHT_AEROTIC_STONE.get()), new ItemStack(AncientAetherBlocks.LOCKED_LIGHT_AEROTIC_STONE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.LOCKED_LIGHT_AEROTIC_STONE.get()), new ItemStack(AncientAetherBlocks.TRAPPED_LIGHT_AEROTIC_STONE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.TRAPPED_LIGHT_AEROTIC_STONE.get()), new ItemStack(AncientAetherBlocks.BOSS_DOORWAY_LIGHT_AEROTIC_STONE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.BOSS_DOORWAY_LIGHT_AEROTIC_STONE.get()), new ItemStack(AncientAetherBlocks.TREASURE_DOORWAY_LIGHT_AEROTIC_STONE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.TREASURE_DOORWAY_LIGHT_AEROTIC_STONE.get()), new ItemStack(AncientAetherBlocks.CORRUPTED_LIGHT_AEROTIC_STONE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.CORRUPTED_LIGHT_AEROTIC_STONE.get()), new ItemStack(AncientAetherBlocks.LOCKED_CORRUPTED_LIGHT_AEROTIC_STONE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.LOCKED_CORRUPTED_LIGHT_AEROTIC_STONE.get()), new ItemStack(AncientAetherBlocks.TRAPPED_CORRUPTED_LIGHT_AEROTIC_STONE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.TRAPPED_CORRUPTED_LIGHT_AEROTIC_STONE.get()), new ItemStack(AncientAetherBlocks.BOSS_DOORWAY_CORRUPTED_LIGHT_AEROTIC_STONE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.BOSS_DOORWAY_CORRUPTED_LIGHT_AEROTIC_STONE.get()), new ItemStack(AncientAetherBlocks.TREASURE_DOORWAY_CORRUPTED_LIGHT_AEROTIC_STONE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            if (ModList.get().isLoaded("lost_aether_content")) {
                event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.GALE_STONE_MOSAIC.get()), new ItemStack(AncientAetherBlocks.GALE_STONE_MOSAIC.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                event.getEntries().putAfter(new ItemStack(AncientAetherBlocks.GALE_STONE_MOSAIC.get()), new ItemStack(AncientAetherBlocks.LOCKED_GALE_STONE_MOSAIC.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            }
        }
    }
}
