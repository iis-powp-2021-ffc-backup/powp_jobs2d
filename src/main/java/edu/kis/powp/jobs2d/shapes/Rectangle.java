package edu.kis.powp.jobs2d.shapes;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.jobs2d.Job2dDriver;

public class Rectangle {
    public DriverCommand getCommand() {
        return new ComplexCommand(
                new SetPositionCommand(0,0),
                new OperateToCommand(50,0),
                new OperateToCommand(50,50),
                new OperateToCommand(0,50),
                new OperateToCommand(0,0)
                );
    }
}
