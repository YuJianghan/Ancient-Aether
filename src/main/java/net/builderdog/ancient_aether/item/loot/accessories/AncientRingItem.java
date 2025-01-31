package net.builderdog.ancient_aether.item.loot.accessories;

import com.aetherteam.aether.item.accessories.ring.RingItem;
import net.builderdog.ancient_aether.client.AncientAetherSoundEvents;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ItemStack;
import top.theillusivec4.curios.api.SlotContext;

import java.util.UUID;

public class AncientRingItem extends RingItem {
    private static final UUID ATTACK_SPEED_UUID = UUID.fromString("1022E1C-E2D5-4A0B-9562-55C75FE53A1E");

    public AncientRingItem(Properties properties) {
        super(AncientAetherSoundEvents.ITEM_ACCESSORY_EQUIP_ANCIENT_RING, properties);
    }
    @Override
    public void curioTick(SlotContext slotContext, ItemStack stack) {
        LivingEntity livingEntity = slotContext.entity();
        AttributeInstance attackSpeed = livingEntity.getAttribute(Attributes.ATTACK_SPEED);
        if (attackSpeed != null) {
            if (!attackSpeed.hasModifier(getdamageModifier())) {
                attackSpeed.addTransientModifier(getdamageModifier());
            }
        }
    }
    @Override
    public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
        LivingEntity livingEntity = slotContext.entity();
        AttributeInstance attackSpeed = livingEntity.getAttribute(Attributes.ATTACK_SPEED);
        if (attackSpeed != null) {
            if (attackSpeed.hasModifier(getdamageModifier())) {
                attackSpeed.removeModifier(getdamageModifier());
            }
        }
    }
    public AttributeModifier getdamageModifier() {
        return new AttributeModifier(ATTACK_SPEED_UUID, "Attack Speed increase", 0.1, AttributeModifier.Operation.ADDITION);
    }
}
