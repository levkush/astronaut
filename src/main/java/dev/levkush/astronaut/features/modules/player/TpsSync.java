package dev.levkush.astronaut.features.modules.player;

import dev.levkush.astronaut.features.setting.Setting;
import dev.levkush.astronaut.features.modules.Module;

public class TpsSync
        extends Module {
    private static TpsSync INSTANCE = new TpsSync();
    public Setting<Boolean> attack = this.register(new Setting<Boolean>("Attack", Boolean.FALSE));
    public Setting<Boolean> mining = this.register(new Setting<Boolean>("Mine", Boolean.TRUE));

    public TpsSync() {
        super("TpsSync", "Syncs your client with the TPS.", Module.Category.PLAYER, true, false, false);
        this.setInstance();
    }

    public static TpsSync getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new TpsSync();
        }
        return INSTANCE;
    }

    private void setInstance() {
        INSTANCE = this;
    }
}

