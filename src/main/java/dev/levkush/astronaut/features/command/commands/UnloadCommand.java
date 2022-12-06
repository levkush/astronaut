package dev.levkush.astronaut.features.command.commands;

import dev.levkush.astronaut.Astronaut;
import dev.levkush.astronaut.features.command.Command;

public class UnloadCommand
        extends Command {
    public UnloadCommand() {
        super("unload", new String[0]);
    }

    @Override
    public void execute(String[] commands) {
        Astronaut.unload(true);
    }
}

