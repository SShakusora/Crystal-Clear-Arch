package com.cyvack.crystal_clear.neoforge;

import com.cyvack.crystal_clear.common.CCCRegistrate;

import static com.cyvack.crystal_clear.neoforge.CrystalClearForge.REGISTRATE;

public class CCCPlatformImpl {

    public static <T extends CCCRegistrate> T getRegistrate() {
        return (T) REGISTRATE;
    }

    public static void finishRegistrate() {
        REGISTRATE.registerEventListeners(CrystalClearForge.getBUS());
    }
}
