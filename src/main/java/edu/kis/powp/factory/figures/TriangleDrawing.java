package edu.kis.powp.factory.figures;

import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.composer.ComplexCommand;
import edu.kis.powp.jobs2d.Job2dDriver;

public class TriangleDrawing {

    private TriangleDrawing() {

    }

    public static ComplexCommand getDrawing(Job2dDriver driver) {
        int baseSize = 60;
        int height = 60;

        return new ComplexCommand(
                new SetPositionCommand(0, 0, driver),
                new OperateToCommand(Math.floorDiv(baseSize, 2), height, driver),
                new OperateToCommand(Math.floorDiv(baseSize, 2), -height, driver),
                new OperateToCommand( 0, 0, driver)
        );
    }
}
