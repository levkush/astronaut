package dev.levkush.astronaut.features.command.commands;

import com.mojang.realmsclient.gui.ChatFormatting;
import dev.levkush.astronaut.Astronaut;
import dev.levkush.astronaut.features.command.Command;

public class PrefixCommand
        extends Command {
    public PrefixCommand() {
        super("prefix", new String[]{"<char>"});
    }

    @Override
    public void execute(String[] commands) {
        if (commands.length == 1) {
            Command.sendMessage(ChatFormatting.GREEN + "Current prefix is " + Astronaut.commandManager.getPrefix());
            return;
        }
        Astronaut.commandManager.setPrefix(commands[0]);
        Command.sendMessage("Prefix changed to " + ChatFormatting.GRAY + commands[0]);
    }
}

