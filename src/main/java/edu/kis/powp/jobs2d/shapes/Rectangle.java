package edu.kis.powp.jobs2d.shapes;

import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

public class Rectangle {
    public DriverCommand getCommand() {
        return new ComplexCommand(
                new SetPositionCommand(-50,30),
                new OperateToCommand(-50,-30),
                new OperateToCommand(50,-30),
                new OperateToCommand(50,30),
                new OperateToCommand(-50,30)
        );
    }
}