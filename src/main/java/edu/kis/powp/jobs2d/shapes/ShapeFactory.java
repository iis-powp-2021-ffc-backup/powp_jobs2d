package edu.kis.powp.jobs2d.shapes;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.adapter.DefaultJob2dAdapter;
import edu.kis.powp.jobs2d.Job2dDriver;

public class ShapeFactory {

    public static ComplexCommand getTriangle() {
        return new ComplexCommand(
                new SetPositionCommand(0, 0),
                new OperateToCommand(-100, 100),
                new OperateToCommand(100, 100),
                new OperateToCommand(0, 0)
        );
    }

    public static ComplexCommand getStar() {
        return new ComplexCommand(
                new SetPositionCommand(-40, 0),
                new OperateToCommand(0, -100),
                new OperateToCommand(40, 0),
                new OperateToCommand(-60, -70),
                new OperateToCommand(60, -70),
                new OperateToCommand(-40, 0)
        );
    }
}