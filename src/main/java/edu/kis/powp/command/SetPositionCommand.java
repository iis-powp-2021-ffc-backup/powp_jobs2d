package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

class SetPositionCommand implements DriverCommand {
    private int x, y;

    SetPositionCommand(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute(Job2dDriver job2dDriver) {
        job2dDriver.setPosition(this.x, this.y);
    }
}
