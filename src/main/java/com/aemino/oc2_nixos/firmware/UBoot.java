package com.aemino.oc2_nixos.firmware;

import java.io.InputStream;

public final class UBoot {
    public static InputStream getFirmware() {
        return UBoot.class.getClassLoader().getResourceAsStream("generated/custom_fw_jump.bin");
    }

    public static InputStream getBootloader() {
        return UBoot.class.getClassLoader().getResourceAsStream("generated/u-boot.bin");
    }
}
