package edu.kis.powp.command;


import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand{

    private List<DriverCommand> driverCommands = new ArrayList<>();

    public void  queueCommand(DriverCommand driverCommand){
        driverCommands.add(driverCommand);
    }

    @Override
    public void execute() {
        for (DriverCommand command : driverCommands)
            command.execute();
    }
}
