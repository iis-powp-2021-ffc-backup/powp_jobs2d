package edu.kis.powp.command;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.adapter.LineDrawerAdapter;


public class OperateToCommand implements DriverCommand{
    private final int x;
    private final int y;
    private Job2dDriver driver;

    public OperateToCommand(Job2dDriver driver,int x, int y) {
        this.driver = driver;
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute() {
        driver.operateTo(x, y);
    }
}
