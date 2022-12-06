package dev.levkush.astronaut.features.modules.movement;

import dev.levkush.astronaut.features.modules.Module;

public class Speed
        extends Module {
    public Speed() {
        super("Speed", "Speed.", Module.Category.MOVEMENT, true, false, false);
    }

    @Override
    public String getDisplayInfo() {
        return "Strafe";
    }
}

