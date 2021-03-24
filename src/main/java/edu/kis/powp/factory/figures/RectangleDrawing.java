package edu.kis.powp.factory.figures;

import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.composer.ComplexCommand;
import edu.kis.powp.jobs2d.Job2dDriver;

public class RectangleDrawing {

    private RectangleDrawing() {

    }

    public static ComplexCommand getDrawing(Job2dDriver driver) {
        int width = 60;
        int height = 60;

        return new ComplexCommand(
                new SetPositionCommand(Math.floorDiv(width, 2), Math.floorDiv(height, 2), driver),
                new OperateToCommand(Math.floorDiv(width, 2), Math.floorDiv(-height, 2), driver),
                new OperateToCommand(Math.floorDiv(-width, 2), Math.floorDiv(-height, 2), driver),
                new OperateToCommand(Math.floorDiv(-width, 2), Math.floorDiv(height, 2), driver),
                new OperateToCommand(Math.floorDiv(width, 2), Math.floorDiv(height, 2), driver)
        );
    }
}
