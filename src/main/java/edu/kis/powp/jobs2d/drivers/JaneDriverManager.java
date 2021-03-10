package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.LoggerDriver;

public class JaneDriverManager extends AbstractDriver {
    private Job2dDriver currentDriver = new LoggerDriver();

    public JaneDriverManager(int x, int y) {
        super(x, y);
    }
    public synchronized void setCurrentDriver(Job2dDriver driver) {
        currentDriver = driver;
    }

    public synchronized AbstractDriver getCurrentDriver() {
        return this;
    }

    @Override
    public void operateTo(int i, int i1) {
        currentDriver.operateTo(i, i1);
    }
}
