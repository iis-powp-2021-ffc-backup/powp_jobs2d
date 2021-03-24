package edu.kis.powp.factory.figures;

import edu.kis.powp.builder.FigureBuilder;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.composer.ComplexCommand;
import edu.kis.powp.jobs2d.Job2dDriver;

public class QuadrilateralDrawing  {

    public static ComplexCommand getDrawing(Job2dDriver driver) {
        int initial_x = 30;
        int initial_y = 30;
        int highBaseSize = 60;
        int lowBaseSize = 100;
        int height = 60;

        return new FigureBuilder()
                .addCommand(new SetPositionCommand(initial_x, initial_y, driver))
                .addCommand(new OperateToCommand(initial_x + highBaseSize, initial_y, driver))
                .addCommand(new OperateToCommand(initial_x + (lowBaseSize - highBaseSize) / 2, initial_y - height, driver))
                .addCommand(new OperateToCommand(-lowBaseSize, initial_y - height, driver))
                .addCommand(new OperateToCommand(initial_x, initial_y, driver))
                .build();
    }
}
