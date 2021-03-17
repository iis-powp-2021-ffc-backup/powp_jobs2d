package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements IDriverCommand {
    private int x;
    private int y;

    public OperateToCommand(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public void executeOn(Job2dDriver driver) {
        driver.operateTo(x, y);
    }
}