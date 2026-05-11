package com.cyvack.crystal_clear.neoforge;

import com.cyvack.crystal_clear.common.CrystalClear;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

import static com.cyvack.crystal_clear.common.CrystalClear.MOD_ID;

@Mod(MOD_ID)
public class CrystalClearForge {

    public static final CCCRegistrateForge REGISTRATE = new CCCRegistrateForge(CrystalClear.MOD_ID);
    private static IEventBus BUS;

    public CrystalClearForge(IEventBus bus) {
        BUS = bus;
        bus.addListener(CCCRenderRegistration::onClientSetup);
        CrystalClear.init();
    }

    public static IEventBus getBUS() {
        return BUS;
    }
}
