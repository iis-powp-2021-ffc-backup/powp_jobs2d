package edu.kis.powp.command;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand {

    private static List<DriverCommand> list = new ArrayList<DriverCommand>();

    @Override
    public void execute() {
        for (DriverCommand comm : list)
            comm.execute();
    }

    public void addCommand(DriverCommand comm) {
        list.add(comm);
    }

    public void clearCommands() {
        list.clear();
    }

}
