package com.aemino.oc2_nixos.os;

import java.io.InputStream;

public final class NixOS {
    public static InputStream getRootFilesystem() {
        // return NixOS.class.getClassLoader().getResourceAsStream("generated/rootfs.TODO");
        return new InputStream() {
            @Override
            public int read() {
                return -1;
            }
        };
    }
}
