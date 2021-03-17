package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

class ComplexCommand implements DriverCommand {
    List<DriverCommand> commands = new ArrayList<>();

    @Override
    public void execute(Job2dDriver job2dDriver) {

    }
}
