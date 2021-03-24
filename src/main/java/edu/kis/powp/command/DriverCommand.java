package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public interface DriverCommand {
    void execute(Job2dDriver job2dDriver);
}

class SetPositionCommand implements  DriverCommand{
    int x,y;

    @Override
    public void execute(Job2dDriver job2dDriver) {

    }
}
class OperateToCommand implements  DriverCommand{
    int x,y;

    @Override
    public void execute(Job2dDriver job2dDriver) {

    }
}