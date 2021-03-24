package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.jobs2d.Job2dDriver;

public class CommandsCapturingDriverProxy implements Job2dDriver {

    private Job2dDriver driver;
    private ComplexCommand commands = new ComplexCommand();

    public CommandsCapturingDriverProxy(Job2dDriver driver) {
        this.driver = driver;
    }

    public void setPosition(int x, int y) {
        commands.addCommand(new SetPositionCommand(x, y));
        driver.setPosition(x, y);
    }

    public void operateTo(int x, int y) {
        commands.addCommand(new OperateToCommand(x, y));
        driver.operateTo(x, y);
    }

    public ComplexCommand getCommands() {
        return commands;
    }
}
