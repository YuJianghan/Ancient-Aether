package net.builderdog.ancient_aether.block;

import com.aetherteam.aether.block.AetherBlockStateProperties;
import com.aetherteam.aether.block.natural.AetherLogBlock;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import org.jetbrains.annotations.Nullable;

public class AncientAetherLogBlock extends AetherLogBlock {
    public AncientAetherLogBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(AetherBlockStateProperties.DOUBLE_DROPS, false));
    }

    @Override
    public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
        if(context.getItemInHand().getItem() instanceof AxeItem) {
            if(state.is(net.builderdog.ancient_aether.block.AncientAetherBlocks.HIGHLANDS_PINE_LOG.get())) {
                return  net.builderdog.ancient_aether.block.AncientAetherBlocks.STRIPPED_HIGHLANDS_PINE_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(net.builderdog.ancient_aether.block.AncientAetherBlocks.HIGHLANDS_PINE_WOOD.get())) {
                return  net.builderdog.ancient_aether.block.AncientAetherBlocks.STRIPPED_HIGHLANDS_PINE_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(net.builderdog.ancient_aether.block.AncientAetherBlocks.SAKURA_LOG.get())) {
                return  net.builderdog.ancient_aether.block.AncientAetherBlocks.STRIPPED_SAKURA_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(net.builderdog.ancient_aether.block.AncientAetherBlocks.SAKURA_WOOD.get())) {
                return  AncientAetherBlocks.STRIPPED_SAKURA_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }
        return super.getToolModifiedState(state, context, toolAction, simulate);
    }
}
