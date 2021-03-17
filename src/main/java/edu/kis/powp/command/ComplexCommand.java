package edu.kis.powp.command;

import java.util.ArrayList;

public class ComplexCommand implements DriverCommand{
    private ArrayList<DriverCommand> commands;

    ComplexCommand(ArrayList<DriverCommand> commands){
        this.commands = commands;
    }

    public void addCommands(DriverCommand command) {
        commands.add(command);
    }

    @Override
    public void execute() {
        for(DriverCommand dc : commands){
            dc.execute();
        }
    }
}
