package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

class OperateToCommand implements DriverCommand {
    private int x, y;

    OperateToCommand(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute(Job2dDriver job2dDriver) {
        job2dDriver.operateTo(this.x, this.y);
    }
}
