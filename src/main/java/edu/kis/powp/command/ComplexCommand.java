package edu.kis.powp.command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import edu.kis.powp.jobs2d.Job2dDriver;

public class ComplexCommand implements DriverCommand{
    private final List<DriverCommand> commands;

    public ComplexCommand(DriverCommand... commands) {
        this.commands = new ArrayList<>(Arrays.asList(commands));
    }

    @Override
    public void execute(Job2dDriver adapter) {
        for(DriverCommand dc : commands){
            dc.execute(adapter);
        }
    }
}
