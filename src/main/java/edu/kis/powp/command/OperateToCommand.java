package edu.kis.powp.command;

import edu.kis.powp.jobs2d.drivers.adapter.DefaultJob2dAdapter;

public class OperateToCommand implements DriverCommand{
    private int x;
    private int y;
    private final DefaultJob2dAdapter adapter;

    OperateToCommand(int x, int y, DefaultJob2dAdapter adapter){
        this.x = x;
        this.y = y;
        this.adapter = adapter;
    }

    @Override
    public void execute() {
        adapter.operateTo(x, y);
    }
}
