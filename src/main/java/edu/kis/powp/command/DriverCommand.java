package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public interface DriverCommand {
    void execute(Job2dDriver job2dDriver);
}

class SetPositionCommand implements  DriverCommand{

    int x,y;

    public SetPositionCommand(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute(Job2dDriver job2dDriver) {

    }
}
class OperateToCommand implements  DriverCommand{

    int x,y;

    public OperateToCommand(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute(Job2dDriver job2dDriver) {

    }
}