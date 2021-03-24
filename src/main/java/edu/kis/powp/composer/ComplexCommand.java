package edu.kis.powp.composer;

import edu.kis.powp.command.DriverCommand;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComplexCommand implements DriverCommand {

    private List<DriverCommand> commands = new ArrayList<>();

    public ComplexCommand() {
    }

    public ComplexCommand(DriverCommand ...commands) {
        this.commands.addAll(Arrays.asList(commands));
    }

    public ComplexCommand(List<DriverCommand> commands) {
        this.commands = commands;
    }

    public void addCommand(DriverCommand ...commands) {
        this.commands.addAll(Arrays.asList(commands));
    }

    @Override
    public void execute() {
        commands.forEach(DriverCommand::execute);
    }
}
