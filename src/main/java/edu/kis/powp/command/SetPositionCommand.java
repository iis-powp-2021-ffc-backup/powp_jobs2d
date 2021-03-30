package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand{
    private int x;
    private int y;

    public void execute(Job2dDriver jobDriver){ jobDriver.setPosition(x,y); }

    public SetPositionCommand(int x, int y){
        this.x = x;
        this.y = y;
    }
}
