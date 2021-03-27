package edu.kis.powp.jobs2d.command;
import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.LinkedList;

public class ComplexCommand implements DriverCommand{

    private LinkedList<DriverCommand> commandList;

    public ComplexCommand(LinkedList<DriverCommand> commandList){
        this.commandList = commandList;

    }

    public static final class CommandBulider{
        private LinkedList<DriverCommand> commandList = new LinkedList<>();

        public CommandBulider add(DriverCommand command){
            commandList.add(command);
            return this;
        }

        public ComplexCommand bulid(){
            return new ComplexCommand(commandList);
        }
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
