package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.command.ComplexDriverCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.jobs2d.Job2dDriver;

public class CommandsCapturingDriverProxy implements Job2dDriver {

    private Job2dDriver driver;
    private ComplexDriverCommand commands = new ComplexDriverCommand();

    public CommandsCapturingDriverProxy(Job2dDriver driver) {
        this.driver = driver;
    }

    @Override
    public void setPosition(int x, int y) {
        commands.addCommand(new SetPositionCommand(x, y));
        driver.setPosition(x, y);
    }

    @Override
    public void operateTo(int x, int y) {
        commands.addCommand(new OperateToCommand(x, y));
        driver.operateTo(x, y);
    }

    public ComplexDriverCommand getCommand() {
        return commands;
    }
}
