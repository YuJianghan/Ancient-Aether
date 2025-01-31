package net.builderdog.ancient_aether.item.consumables;

import com.aetherteam.aether.item.miscellaneous.ConsumableItem;
import net.builderdog.ancient_aether.item.AncientAetherItems;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.item.ItemUtils;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.level.Level;

public class ValkyrieWineItem extends Item implements ConsumableItem {
    public ValkyrieWineItem(Properties properties) {
        super(properties);
    }
    @Override
    public ItemStack finishUsingItem(ItemStack itemstack, Level level, LivingEntity user) {
        ItemStack retval = new ItemStack(AncientAetherItems.AEROGEL_BOTTLE.get());
        super.finishUsingItem(itemstack, level, user);
        if (!level.isClientSide()) {
         user.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 500, 0));
         }
        if (itemstack.isEmpty()) {
            return retval;
        } else {
            if (user instanceof Player player && !player.getAbilities().instabuild) {
                if (!player.getInventory().add(retval))
                    player.drop(retval, false);
            }
            return itemstack;
        }
    }

    @Override
    public int getUseDuration(ItemStack stack) {
        return 32;
    }

    @Override
    public UseAnim getUseAnimation(ItemStack stack) {
        return UseAnim.DRINK;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level worldIn, Player playerIn, InteractionHand handIn) {
        return ItemUtils.startUsingInstantly(worldIn, playerIn, handIn);
    }
}
