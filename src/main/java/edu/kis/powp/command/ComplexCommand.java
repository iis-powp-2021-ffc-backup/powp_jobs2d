package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand{
    private List<DriverCommand> commands;

    public ComplexCommand(List<DriverCommand> commands){
        this.commands=commands;
    }

    @Override
    public void execute(Job2dDriver driver) {
        for(int i=0;i<commands.size();i++){
            commands.get(i).execute(driver);
        }
    }

    public static final class Builder{
        private List<DriverCommand> commandsList = new ArrayList<>();

        public Builder addCommand(DriverCommand command){
            commandsList.add(command);
            return this;
        }

        public ComplexCommand build(){
            ComplexCommand complexCommand = new ComplexCommand(commandsList);
            return complexCommand;
        }
    }
}
