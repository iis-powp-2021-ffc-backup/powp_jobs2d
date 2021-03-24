package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand{
    private final List<DriverCommand> driverCommandList
            = new ArrayList<>();
    public void addCommand(DriverCommand driverCommand)
    {
        driverCommandList.add(driverCommand);
    }

    @Override
    public void execute(Job2dDriver job2dDriver) {
        for(DriverCommand operation: driverCommandList)
        {
            operation.execute(job2dDriver);
        }
    }
}
