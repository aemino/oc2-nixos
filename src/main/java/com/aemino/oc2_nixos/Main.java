package com.aemino.oc2_nixos;

import net.minecraftforge.fml.common.Mod;

import com.aemino.oc2_nixos.bus.device.data.BlockDeviceDataRegistration;
import com.aemino.oc2_nixos.bus.device.data.Firmwares;
import com.aemino.oc2_nixos.item.Items;

@Mod(Main.MOD_ID)
public class Main
{
    public static final String MOD_ID = "oc2-nixos";

    public Main() {
        Items.initialize();

        BlockDeviceDataRegistration.initialize();
        Firmwares.initialize();
    }
}
