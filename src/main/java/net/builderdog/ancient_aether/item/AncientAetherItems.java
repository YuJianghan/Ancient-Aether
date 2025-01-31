package net.builderdog.ancient_aether.item;

import com.aetherteam.aether.item.AetherItems;
import com.aetherteam.aether.item.food.WhiteAppleItem;
import com.aetherteam.aether.item.miscellaneous.DungeonKeyItem;
import com.aetherteam.aether.item.miscellaneous.MoaEggItem;
import net.builderdog.ancient_aether.AncientAether;
import net.builderdog.ancient_aether.block.AncientAetherBlocks;
import net.builderdog.ancient_aether.entity.misc.AncientAetherBoatEntity;
import net.builderdog.ancient_aether.entity.AncientAetherEntities;
import net.builderdog.ancient_aether.entity.moa.AncientAetherMoaTypes;
import net.builderdog.ancient_aether.item.consumables.ValkyrieWineItem;
import net.builderdog.ancient_aether.item.loot.*;
import net.builderdog.ancient_aether.item.loot.accessories.*;
import net.builderdog.ancient_aether.item.misc.AncientAetherBoatItem;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.aetherteam.aether.item.AetherItems.AETHER_LOOT;

public class AncientAetherItems {
    public static final DeferredRegister<Item> ITEMS =
           DeferredRegister.create(ForgeRegistries.ITEMS, AncientAether.MOD_ID);

    //Tooltips
    public static final Component ANCIENT_DUNGEON_TOOLTIP = Component.translatable("ancient_aether.dungeon.ancient_dungeon").withStyle(Style.EMPTY.withItalic(true).withColor(TextColor.parseColor("#5C70A8")));

    //Misc
    public static final RegistryObject<Item> AEROGEL_BOTTLE = ITEMS.register("aerogel_bottle", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIVINE_CRYSTAL = ITEMS.register("divine_crystal", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ANCIENT_RUNE = ITEMS.register("ancient_rune", () -> new Item(new Item.Properties().rarity(AETHER_LOOT)));
    public static final RegistryObject<Item> ANCIENT_DUNGEON_KEY = ITEMS.register("ancient_dungeon_key", () -> new DungeonKeyItem(new ResourceLocation(AncientAether.MOD_ID, "ancient"), new Item.Properties().stacksTo(1).rarity(AETHER_LOOT).fireResistant()));

    //Dungeon Loot
    public static final RegistryObject<SwordItem> ANCIENT_SWORD = ITEMS.register("ancient_sword", AncientSwordItem::new);
    public static final RegistryObject<Item> GRAVITITE_DART_SHOOTER = ITEMS.register("gravitite_dart_shooter", () -> new GravititeDartShooterItem(AetherItems.GOLDEN_DART, (new Item.Properties().stacksTo(1).rarity(AETHER_LOOT))));
    public static final RegistryObject<Item> STRENGTH_STONE = ITEMS.register("strength_stone", () -> new StrengthStoneItem(new Item.Properties().stacksTo(1).rarity(AETHER_LOOT)));
    public static final RegistryObject<Item> ANCIENT_RING = ITEMS.register("ancient_ring", () -> new AncientRingItem(new Item.Properties().stacksTo(1).rarity(AETHER_LOOT)));
    public static final RegistryObject<Item> ANCIENT_PENDANT = ITEMS.register("ancient_pendant", () -> new AncientPendantItem(new Item.Properties().stacksTo(1).rarity(AETHER_LOOT)));
    public static final RegistryObject<Item> HEALTH_RING = ITEMS.register("health_ring", () -> new HealthRingItem(new Item.Properties().stacksTo(1).rarity(AETHER_LOOT)));
    public static final RegistryObject<Item> HEALTH_PENDANT = ITEMS.register("health_pendant", () -> new HealthPendantItem(new Item.Properties().stacksTo(1).rarity(AETHER_LOOT)));

    //Signs
    public static final RegistryObject<Item> HIGHSPROOT_SIGN = ITEMS.register("highsproot_sign", () -> new SignItem(new Item.Properties().stacksTo(16), AncientAetherBlocks.HIGHSPROOT_SIGN.get(), AncientAetherBlocks.HIGHSPROOT_WALL_SIGN.get()));
    public static final RegistryObject<Item> SAKURA_SIGN = ITEMS.register("sakura_sign", () -> new SignItem(new Item.Properties().stacksTo(16), AncientAetherBlocks.SAKURA_SIGN.get(), AncientAetherBlocks.SAKURA_WALL_SIGN.get()));
    public static final RegistryObject<Item> HIGHSPROOT_HANGING_SIGN = ITEMS.register("highsproot_hanging_sign", () -> new HangingSignItem(AncientAetherBlocks.HIGHSPROOT_HANGING_SIGN.get(), AncientAetherBlocks.HIGHSPROOT_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> SAKURA_HANGING_SIGN = ITEMS.register("sakura_hanging_sign", () -> new HangingSignItem(AncientAetherBlocks.SAKURA_HANGING_SIGN.get(), AncientAetherBlocks.SAKURA_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    //Food
    public static final RegistryObject<Item> GRAPES = ITEMS.register("grapes", () -> new Item(new Item.Properties().rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.6f).build())));
    public static final RegistryObject<Item> VALKYRIE_WINE = ITEMS.register("valkyrie_wine", () -> new ValkyrieWineItem(new Item.Properties().rarity(Rarity.COMMON).stacksTo(16).food((new FoodProperties.Builder()).nutrition(0).saturationMod(0f).build())));
    public static final RegistryObject<Item> CRYSTAL_FRUIT = ITEMS.register("crystal_fruit", WhiteAppleItem::new);

    //Boats
    public static final RegistryObject<Item> HIGHSPROOT_BOAT = ITEMS.register("highsproot_boat", () -> new AncientAetherBoatItem(false, new Item.Properties().stacksTo(1), AncientAetherBoatEntity.Type.HIGHLANDS_PINE));
    public static final RegistryObject<Item> HIGHSPROOT_CHEST_BOAT = ITEMS.register("highsproot_chest_boat", () -> new AncientAetherBoatItem(true, new Item.Properties().stacksTo(1),  AncientAetherBoatEntity.Type.HIGHLANDS_PINE));
    public static final RegistryObject<Item> SAKURA_BOAT = ITEMS.register("sakura_boat", () -> new AncientAetherBoatItem(false, new Item.Properties().stacksTo(1), AncientAetherBoatEntity.Type.SAKURA));
    public static final RegistryObject<Item> SAKURA_CHEST_BOAT = ITEMS.register("sakura_chest_boat", () -> new AncientAetherBoatItem(true, new Item.Properties().stacksTo(1), AncientAetherBoatEntity.Type.SAKURA));


    //Spawn Eggs
    public static final RegistryObject<SpawnEggItem> HIGHLAND_BUFFALO_SPAWN_EGG = ITEMS.register("highland_buffalo_spawn_egg", () -> new ForgeSpawnEggItem(AncientAetherEntities.HIGHLAND_BUFFALO, 0x4B6F89, 0x96C4D3, new Item.Properties()));
    public static final RegistryObject<SpawnEggItem> ROOTHYRN_SPAWN_EGG = ITEMS.register("roothyrn_spawn_egg", () -> new ForgeSpawnEggItem(AncientAetherEntities.ROOTHYRN, 0x737558, 0x6FA871, new Item.Properties()));
    public static final RegistryObject<SpawnEggItem> AERONAUTIC_LEAPER_SPAWN_EGG = ITEMS.register("aeronautic_leaper_spawn_egg", () -> new ForgeSpawnEggItem(AncientAetherEntities.AERONAUTIC_LEAPER, 0x35343D, 0xB7B2FF, new Item.Properties()));
    public static final RegistryObject<SpawnEggItem> ANCIENT_GUARDIAN_SPAWN_EGG = ITEMS.register("ancient_guardian_spawn_egg", () -> new ForgeSpawnEggItem(AncientAetherEntities.ANCIENT_GUARDIAN, 0xB7B2FF, 0x35343D, new Item.Properties()));
    public static final RegistryObject<SpawnEggItem> ANCIENT_CORE_SPAWN_EGG = ITEMS.register("ancient_core_spawn_egg", () -> new ForgeSpawnEggItem(AncientAetherEntities.ANCIENT_CORE, 0xCC6C80, 0x35343D, new Item.Properties()));
    public static final RegistryObject<SpawnEggItem> WYND_ZEPHYR_SPAWN_EGG = ITEMS.register("wynd_zephyr_spawn_egg", () -> new ForgeSpawnEggItem(AncientAetherEntities.WYND_ZEPHYR, 0xA9C5C9, 0x47585B, new Item.Properties()));
    public static final RegistryObject<Item> SAKURA_MOA_EGG = ITEMS.register("sakura_moa_egg", () -> new MoaEggItem(AncientAetherMoaTypes.SAKURA, 0xD09FA9, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
