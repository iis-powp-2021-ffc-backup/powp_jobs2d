package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

class ComplexCommand implements DriverCommand {
    List<DriverCommand> commands = new ArrayList<>();

    public void addComand(DriverCommand command) {
        commands.add(command);
    }

    @Override
    public void execute(Job2dDriver job2dDriver) {
        commands.forEach(c -> c.execute(job2dDriver));
    }
}
