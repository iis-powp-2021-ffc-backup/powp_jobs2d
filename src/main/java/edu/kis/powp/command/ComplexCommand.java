package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand {

    private List<DriverCommand> polecenia;

    public ComplexCommand() {
        polecenia = new ArrayList<>();
    }



    @Override
    public void execute(Job2dDriver driver) {

        for (DriverCommand i:polecenia)
        {
            i.execute(driver);
        }
    }

    public void add(DriverCommand command) {
        polecenia.add(command);
    }
}
