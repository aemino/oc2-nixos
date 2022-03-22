package com.aemino.oc2_nixos.bus.device.data;

import com.aemino.oc2_nixos.Main;

import li.cil.oc2.api.bus.device.data.Firmware;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public final class FirmwareRegistry {
    private static final DeferredRegister<Firmware> INITIALIZER = DeferredRegister.create(Firmware.class, Main.MOD_ID);

    public static final RegistryObject<Firmware> UBOOT = INITIALIZER.register("uboot", UBootFirmware::new);

    public static void initialize() {
        INITIALIZER.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
