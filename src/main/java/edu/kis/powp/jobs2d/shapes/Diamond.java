package edu.kis.powp.jobs2d.shapes;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;

public class Diamond {
    public DriverCommand getCommand() {
        return new ComplexCommand(
                new SetPositionCommand(-50,0),
                new OperateToCommand(0,50),
                new OperateToCommand(50,0),
                new OperateToCommand(0,-50),
                new OperateToCommand(-50,0)
                );
    }
}
