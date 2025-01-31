package net.builderdog.ancient_aether.entity.moa;

import com.aetherteam.aether.api.AetherMoaTypes;
import com.aetherteam.aether.api.registers.MoaType;
import net.builderdog.ancient_aether.AncientAether;
import net.builderdog.ancient_aether.item.AncientAetherItems;
import net.minecraftforge.registries.*;

public class AncientAetherMoaTypes {
    public static final DeferredRegister<MoaType> MOA_TYPES = DeferredRegister.create(AetherMoaTypes.MOA_TYPE_REGISTRY_KEY, AncientAether.MOD_ID);
    public static final RegistryObject<MoaType> SAKURA = MOA_TYPES.register("sakura",
            () -> new MoaType((new MoaType.Properties())
                    .egg(AncientAetherItems.SAKURA_MOA_EGG)
                    .maxJumps(10).speed(0.155F).spawnChance(0)
                    .texture("textures/entity/mob/moa/sakura_moa.png")));



}
