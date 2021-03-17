package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.List;

public class ComplexDriverCommand implements IDriverCommand {
    private List<IDriverCommand> commands;

    public ComplexDriverCommand(List<IDriverCommand> commands) {
        this.commands = commands;
    }

    @Override
    public void executeOn(Job2dDriver driver) {
        commands.forEach(command -> command.executeOn(driver));
    }
}
