package edu.kis.powp.jobs2d.shapes;

import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

public class RectangleShape {
    public static DriverCommand getShapeCommand() {
        return new ComplexCommand()
                .addCommand(new SetPositionCommand(0, 0))
                .addCommand(new OperateToCommand(30, 0))
                .addCommand(new OperateToCommand(30, 30))
                .addCommand(new OperateToCommand(0, 30))
                .addCommand(new OperateToCommand(0, 0));
    }
}
