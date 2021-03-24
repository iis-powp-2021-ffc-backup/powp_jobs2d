package edu.kis.powp.command;

import java.util.ArrayList;

import edu.kis.powp.jobs2d.Job2dDriver;

public class ComplexCommand implements DriverCommand {
    ArrayList<DriverCommand> commands;

    public ComplexCommand(){
        commands = new ArrayList<>();
    }

    public void addCommand(DriverCommand command){
        commands.add(command);
    }
    
    @Override
    public void execute(Job2dDriver driver) {
        for(DriverCommand command : commands)
            command.execute(driver);
    }
}