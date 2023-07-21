package com.peasenet.mod;

import com.peasenet.mods.movement.ModFastMine;
import com.peasenet.main.GavinsMod;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FastMineMod implements ModInitializer {

    /**
     * Runs the mod initializer.
     */
    @Override
    public void onInitialize() {
        GavinsMod.addMod(new ModFastMine());
    }
}
