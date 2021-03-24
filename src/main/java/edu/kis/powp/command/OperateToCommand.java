package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand{
    private int x;
    private int y;

    public void execute(Job2dDriver Job2dDriver){
        Job2dDriver.operateTo(x,y);
    }

    public OperateToCommand(int x, int y){
        this.x = x;
        this.y = y;
    }
}
