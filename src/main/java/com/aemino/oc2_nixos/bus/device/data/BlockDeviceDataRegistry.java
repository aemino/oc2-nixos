package com.aemino.oc2_nixos.bus.device.data;

import com.aemino.oc2_nixos.Main;

import li.cil.oc2.api.bus.device.data.BlockDeviceData;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public final class BlockDeviceDataRegistry {
    private static final DeferredRegister<BlockDeviceData> INITIALIZER = DeferredRegister.create(BlockDeviceData.class, Main.MOD_ID);

    public static final RegistryObject<BlockDeviceData> NIXOS = INITIALIZER.register("nixos", NixOSBlockDeviceData::new);

    public static void initialize() {
        INITIALIZER.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
