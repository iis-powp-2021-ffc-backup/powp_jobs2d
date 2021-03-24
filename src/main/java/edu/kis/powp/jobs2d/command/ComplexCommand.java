package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;

public class ComplexCommand implements DriverCommand{
    private ArrayList<DriverCommand> commands = new ArrayList<>();

    public void addCommand(DriverCommand driverCommand){
        commands.add(driverCommand);
    }

    @Override
    public void execute(Job2dDriver job2dDriver) {
        for(DriverCommand command:commands){
            command.execute(job2dDriver);
        }
    }
}
