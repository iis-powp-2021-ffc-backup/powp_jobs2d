package edu.kis.powp.jobs2d.drawer;

import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.Job2dDriver;

public class AbstractDrawerAdapter extends AbstractDriver {
    private Job2dDriver driver;

    public AbstractDrawerAdapter(Job2dDriver driver)
    {
        super(0,0);
        this.driver = driver;
    }

    @Override
    public void operateTo(int x, int y) {
        driver.operateTo(x, y);
    }
}
