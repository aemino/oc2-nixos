package com.aemino.oc2_nixos.bus.device.data;

import java.io.IOException;

import com.aemino.oc2_nixos.firmware.UBoot;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import li.cil.oc2.api.bus.device.data.Firmware;
import li.cil.sedna.api.memory.MemoryMap;
import li.cil.sedna.memory.MemoryMaps;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.registries.ForgeRegistryEntry;

public final class UBootFirmware extends ForgeRegistryEntry<Firmware> implements Firmware {
    private static final Logger LOGGER = LogManager.getLogger();

    @Override
    public boolean run(final MemoryMap memory, final long startAddress) {
        try {
            if (UBoot.getFirmware() == null) {
                LOGGER.info("U-Boot firmware InputStream is null");
            } else {
                LOGGER.info("U-Boot firmware InputStream is non-null");
            }

            MemoryMaps.store(memory, startAddress, UBoot.getFirmware());
            MemoryMaps.store(memory, startAddress + 0x200000, UBoot.getBootloader());
            return true;
        } catch (final IOException e) {
            LOGGER.error(e);
            return false;
        }
    }

    @Override
    public ITextComponent getDisplayName() {
        return new StringTextComponent("U-Boot");
    }
}
