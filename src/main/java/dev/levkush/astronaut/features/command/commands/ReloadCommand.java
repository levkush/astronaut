package dev.levkush.astronaut.features.command.commands;

import dev.levkush.astronaut.Astronaut;
import dev.levkush.astronaut.features.command.Command;

public class ReloadCommand
        extends Command {
    public ReloadCommand() {
        super("reload", new String[0]);
    }

    @Override
    public void execute(String[] commands) {
        Astronaut.reload();
    }
}

