package edu.kis.powp.jobs2d.command;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand{
    private List<DriverCommand> commands = new ArrayList<>();

    public void addCommand(DriverCommand driverCommand){
        commands.add(driverCommand);
    }

    @Override
    public void execute() {
        for(DriverCommand command:commands){
            command.execute();
        }
    }
}
