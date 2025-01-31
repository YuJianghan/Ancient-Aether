package net.builderdog.ancient_aether.event.hooks;

import net.builderdog.ancient_aether.AncientAetherTags;
import net.builderdog.ancient_aether.item.AncientAetherItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;

import java.util.List;

public class ItemHooks {
    /**
     * Adds a tooltip to loot items in the creative inventory, indicating what dungeon(s) they can be found in.
     * @param components The old {@link List} of {@link Component}s for the item.
     * @param stack The loot {@link ItemStack}.
     * @param flag The {@link TooltipFlag} for what type of tooltip this is.
     * @see com.aetherteam.aether.event.listeners.ItemListener#onTooltipAdd(ItemTooltipEvent)
     */
    public static void addDungeonTooltips(List<Component> components, ItemStack stack, TooltipFlag flag) {
        if (flag.isCreative()) {
            int position = components.size();
            Component itemName = stack.getItem().getName(stack);
            for (int i = 0; i < position; i++) {
                Component component = components.get(i);
                if (component.getString().equals(itemName.getString())) {
                    position = i + 1;
                    break;
                }
            }
            if (stack.is(AncientAetherTags.Items.ANCIENT_DUNGEON_LOOT)) {
                components.add(position, AncientAetherItems.ANCIENT_DUNGEON_TOOLTIP);
            }
        }
    }
}