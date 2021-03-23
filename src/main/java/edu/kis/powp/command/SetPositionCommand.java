package edu.kis.powp.command;

import edu.kis.powp.jobs2d.drivers.adapter.DefaultJob2dAdapter;

public class SetPositionCommand implements DriverCommand{
    private int x;
    private int y;

    SetPositionCommand(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute(DefaultJob2dAdapter adapter) {
        adapter.setPosition(x, y);
    }
}
