package edu.kis.powp.jobs2d.command;
import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.LinkedList;

public class ComplexCommand implements DriverCommand{

    private LinkedList<DriverCommand> commandList;

    public ComplexCommand(){

    }

    public void add(DriverCommand command){
        commandList.add(command);
    }
    @Override
    public void execute(Job2dDriver job2dDriver) {
        for(DriverCommand driver : commandList){
            driver.execute(job2dDriver);
        }
    }
}
