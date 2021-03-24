package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;
import java.util.List;

public class CommandComplex implements DriverCommand  {
    private List<DriverCommand> commands;

    public CommandComplex(List<DriverCommand> commands) {
        this.commands = commands;
    }
    @Override
    public void execute(Job2dDriver driver) {
        for (DriverCommand c : commands) {
            c.execute(driver);
        }
    }
}
