package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;

public class ComplexCommand implements DriverCommand{

    private ArrayList<DriverCommand> driverCommands = new ArrayList<>();

    public void  queueCommand(DriverCommand driverCommand){
        driverCommands.add(driverCommand);
    }

    @Override
    public void execute() {
        for (DriverCommand command : driverCommands)
            command.execute();
    }
}
