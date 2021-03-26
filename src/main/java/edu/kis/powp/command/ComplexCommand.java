package edu.kis.powp.command;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.adapter.LineDrawerAdapter;
import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand{
    private List<DriverCommand> listOfCommands;

    public ComplexCommand(List<DriverCommand> commands) {
        this.listOfCommands = commands;
    }

    public ComplexCommand() {
        this.listOfCommands = new ArrayList<>();
    }

    public void addNewCommand(DriverCommand newCommand){
        listOfCommands.add(newCommand);
    }

    @Override
    public void execute() {
        for(DriverCommand command : listOfCommands)
            command.execute();
    }
}
