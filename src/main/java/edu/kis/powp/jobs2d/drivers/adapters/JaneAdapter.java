package edu.kis.powp.jobs2d.drivers.adapters;

import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.Job2dDriver;

public class JaneAdapter extends AbstractDriver {

    private Job2dDriver currentDriver;

    public JaneAdapter(int x, int y) {
        super(x, y);
    }

    public JaneAdapter(int x, int y, Job2dDriver driver) {
        super(x, y);
        currentDriver = driver;
    }

    @Override
    public void operateTo(int x, int y) {
        currentDriver.operateTo(x, y);
    }

    public void setCurrentDriver(Job2dDriver driver) {
        currentDriver = driver;
    }

    public AbstractDriver getCurrentDriver() {
        return this;
    }
}