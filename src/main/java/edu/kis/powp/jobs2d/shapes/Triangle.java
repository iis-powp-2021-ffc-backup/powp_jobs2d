package edu.kis.powp.jobs2d.shapes;

import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

public class Triangle {
    public DriverCommand getCommand() {
        return new ComplexCommand(
                new SetPositionCommand(0,30),
                new OperateToCommand(-15,0),
                new OperateToCommand(15,0),
                new OperateToCommand(0,30)
        );
    }
}