package com.cyvack.crystal_clear;

import com.cyvack.crystal_clear.common.CCCRegistrate;
import com.cyvack.crystal_clear.neoforge.CrystalClearForge;

public class CCCPlatform {
    public static <T extends CCCRegistrate> T getRegistrate() {
        return (T) CrystalClearForge.REGISTRATE;
    }

    public static void finishRegistrate() {
        CrystalClearForge.REGISTRATE.registerEventListeners(CrystalClearForge.getBUS());
    }
}
