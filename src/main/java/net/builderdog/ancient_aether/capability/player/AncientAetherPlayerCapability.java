package net.builderdog.ancient_aether.capability.player;

import com.aetherteam.aether.network.AetherPacketHandler;
import com.aetherteam.aether.network.packet.AetherPlayerSyncPacket;
import com.aetherteam.nitrogen.network.BasePacket;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.network.simple.SimpleChannel;
import org.apache.commons.lang3.tuple.Triple;

import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class AncientAetherPlayerCapability implements AncientAetherPlayer {
    private final Player player;
    private int gravititeDartCount;

    private final Map<String, Triple<Type, Consumer<Object>, Supplier<Object>>> synchableFunctions = Map.ofEntries(
            Map.entry("setGravititeDartCount", Triple.of(Type.INT, (object) -> setGravititeDartCount((int) object), this::getGravititeDartCount))
    );

    public AncientAetherPlayerCapability(Player player) {
        this.player = player;
    }

    @Override
    public Player getPlayer() {
        return this.player;
    }

    @Override
    public CompoundTag serializeNBT() {
        return new CompoundTag();
    }

    @Override
    public void deserializeNBT(CompoundTag nbt) { }

    @Override
    public Map<String, Triple<Type, Consumer<Object>, Supplier<Object>>> getSynchableFunctions() {
        return this.synchableFunctions;
    }

    @Override
    public void setGravititeDartCount(int count) {
        gravititeDartCount = count;
    }

    @Override
    public int getGravititeDartCount() {
        return gravititeDartCount;
    }

    @Override
    public BasePacket getSyncPacket(String key, Type type, Object value) {
        return new AetherPlayerSyncPacket(this.getPlayer().getId(), key, type, value);
    }

    @Override
    public SimpleChannel getPacketChannel() {
        return AetherPacketHandler.INSTANCE;
    }
}