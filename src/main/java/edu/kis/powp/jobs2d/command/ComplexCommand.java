package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComplexCommand implements DriverCommand {
    private final List<DriverCommand> commands;

    public ComplexCommand(DriverCommand... commands) {
        this.commands = new ArrayList<>(Arrays.asList(commands));
    }

    @Override
    public void execute(Job2dDriver job2dDriver) {
        commands.forEach(c -> c.execute(job2dDriver));
    }
}