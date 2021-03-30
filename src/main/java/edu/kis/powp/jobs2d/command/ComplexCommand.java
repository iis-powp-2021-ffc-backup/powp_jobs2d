package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand{
    private final List<DriverCommand> commands;
    public ComplexCommand(){
        commands = new ArrayList<>();
    }
    public ComplexCommand addCommand(DriverCommand command){
        commands.add(command);
        return this;
    }
    @Override
    public void execute(Job2dDriver jobs2Driver) {
        for(DriverCommand command:commands){
            command.execute(jobs2Driver);
        }
    }
}
