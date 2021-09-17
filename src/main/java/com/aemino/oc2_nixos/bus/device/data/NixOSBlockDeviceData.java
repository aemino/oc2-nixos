package com.aemino.oc2_nixos.bus.device.data;

import java.io.IOException;

import com.aemino.oc2_nixos.os.NixOS;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import li.cil.oc2.api.bus.device.data.BlockDeviceData;
import li.cil.sedna.api.device.BlockDevice;
import li.cil.sedna.device.block.ByteBufferBlockDevice;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.registries.ForgeRegistryEntry;

public final class NixOSBlockDeviceData extends ForgeRegistryEntry<BlockDeviceData> implements BlockDeviceData {
    private static final Logger LOGGER = LogManager.getLogger();

    private static final ByteBufferBlockDevice INSTANCE;

    static {
        ByteBufferBlockDevice instance;

        try {
            instance = ByteBufferBlockDevice.createFromStream(NixOS.getRootFilesystem(), true);
        } catch (final IOException e) {
            LOGGER.error(e);
            instance = ByteBufferBlockDevice.create(0, true);
        }

        INSTANCE = instance;
    }

    @Override
    public BlockDevice getBlockDevice() {
        return INSTANCE;
    }

    @Override
    public ITextComponent getDisplayName() {
        return new StringTextComponent("NixOS");
    }
}
