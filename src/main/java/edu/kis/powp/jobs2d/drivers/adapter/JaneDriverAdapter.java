package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.Job2dDriver;

public class JaneDriverAdapter extends AbstractDriver {

    private Job2dDriver currentDriver;

    public JaneDriverAdapter(int x, int y) {
        super(x, y);
    }

    public JaneDriverAdapter(int x, int y, Job2dDriver driver) {
        super(x, y);
        currentDriver = driver;
    }

    public void setCurrentDriver(Job2dDriver driver) {
        currentDriver = driver;
    }

    public AbstractDriver getCurrentDriver() {
        return this;
    }

    @Override
    public void operateTo(int x, int y) {
        currentDriver.operateTo(x, y);
    }
}
