package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

class StubDriver implements Job2dDriver {

    @Override
    public void operateTo(int x, int y) {
        System.out.println("Driver operate to (" + x + ", " + y + ")");
    }

    @Override
    public void setPosition(int x, int y) {
        System.out.println("Driver Position set to (" + x + ", " + y + ")");
    }
};
