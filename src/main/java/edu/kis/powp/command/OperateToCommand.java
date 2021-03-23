package edu.kis.powp.command;

import edu.kis.powp.jobs2d.drivers.adapter.DefaultJob2dAdapter;

public class OperateToCommand implements DriverCommand{
    private int x;
    private int y;

    OperateToCommand(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute(DefaultJob2dAdapter adapter) {
        adapter.operateTo(x, y);
    }
}
