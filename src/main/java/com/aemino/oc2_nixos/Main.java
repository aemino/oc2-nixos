package com.aemino.oc2_nixos;

import net.minecraftforge.fml.common.Mod;

import com.aemino.oc2_nixos.bus.device.data.BlockDeviceDataRegistry;
import com.aemino.oc2_nixos.bus.device.data.FirmwareRegistry;
import com.aemino.oc2_nixos.item.Items;

@Mod(Main.MOD_ID)
public class Main
{
    public static final String MOD_ID = "oc2_nixos";

    public Main() {
        Items.initialize();

        BlockDeviceDataRegistry.initialize();
        FirmwareRegistry.initialize();
    }
}
