package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;
import java.util.List;

public class ComplexCommand implements DriverCommand {
    private List<DriverCommand> commands;

    public ComplexCommand(List<DriverCommand> commands) {
        this.commands = commands;
    }

    @Override
    public void execute(Job2dDriver driver) {
        for (int i = 0; i < commands.size(); i++) {
            commands.get(i).execute(driver);
        }
    }
}