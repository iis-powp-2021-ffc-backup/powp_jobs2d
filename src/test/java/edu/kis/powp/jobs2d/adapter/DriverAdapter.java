package edu.kis.powp.jobs2d.adapter;

import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public class DriverAdapter extends AbstractDriver {

    private Job2dDriver driver;

    public DriverAdapter(DriverManager manager) {
        super(0, 0);
        driver = manager.getCurrentDriver();
    }

    @Override
    public void operateTo(int i, int i1) {
        driver.setPosition(getX(), getY());
        driver.operateTo(i, i1);
        setPosition(i, i1);
    }
}
