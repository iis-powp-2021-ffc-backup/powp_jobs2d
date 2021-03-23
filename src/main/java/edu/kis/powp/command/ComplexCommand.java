package edu.kis.powp.command;

import java.util.List;
import edu.kis.powp.jobs2d.drivers.adapter.DefaultJob2dAdapter;

public class ComplexCommand implements DriverCommand{
    private List<DriverCommand> commands;

    ComplexCommand(List<DriverCommand> commands){
        this.commands = commands;
    }

    public void addCommands(DriverCommand command) {
        commands.add(command);
    }

    @Override
    public void execute(DefaultJob2dAdapter adapter) {
        for(DriverCommand dc : commands){
            dc.execute(adapter);
        }
    }
}
