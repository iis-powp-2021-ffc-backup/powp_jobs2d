package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand{
    private List<DriverCommand> commandList;

    public ComplexCommand(){
        commandList = new ArrayList<>();
    }

    @Override
    public void execute(Job2dDriver jobsDriver) {
        for (DriverCommand command : this.commandList){
            command.execute(jobsDriver);
        }
    }

    public void add(DriverCommand command){
        this.commandList.add(command);
    }

    public void addAll(List<DriverCommand> commandList){
        this.commandList.addAll(commandList);
    }
}
