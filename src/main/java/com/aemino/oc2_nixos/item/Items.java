package com.aemino.oc2_nixos.item;

import java.util.function.Supplier;

import com.aemino.oc2_nixos.Main;
import com.aemino.oc2_nixos.bus.device.data.BlockDeviceDataRegistry;
import com.aemino.oc2_nixos.bus.device.data.FirmwareRegistry;

import li.cil.oc2.common.item.FlashMemoryWithExternalDataItem;
import li.cil.oc2.common.item.HardDriveWithExternalDataItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class Items {
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);

    public static final RegistryObject<HardDriveWithExternalDataItem> HARD_DRIVE_CUSTOM = register("hard_drive_custom",
            () -> new HardDriveWithExternalDataItem(BlockDeviceDataRegistry.NIXOS.getId(), DyeColor.BLUE));

    public static final RegistryObject<FlashMemoryWithExternalDataItem> FLASH_MEMORY_CUSTOM = register(
            "flash_memory_custom", () -> new FlashMemoryWithExternalDataItem(FirmwareRegistry.UBOOT.getId()));

    public static void initialize() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> factory) {
        return ITEMS.register(name, factory);
    }
}
