package dev.levkush.astronaut.features.command.commands;

import com.mojang.realmsclient.gui.ChatFormatting;
import dev.levkush.astronaut.Astronaut;
import dev.levkush.astronaut.features.command.Command;

public class HelpCommand
        extends Command {
    public HelpCommand() {
        super("help");
    }

    @Override
    public void execute(String[] commands) {
        HelpCommand.sendMessage("Commands: ");
        for (Command command : Astronaut.commandManager.getCommands()) {
            HelpCommand.sendMessage(ChatFormatting.GRAY + Astronaut.commandManager.getPrefix() + command.getName());
        }
    }
}

