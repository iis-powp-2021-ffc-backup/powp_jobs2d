package edu.kis.powp.factory.figures;

import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.composer.ComplexCommand;
import edu.kis.powp.jobs2d.Job2dDriver;

public class CircleDrawing {

    private CircleDrawing() {}

    /**
     * It uses parametric form equation of circle to calculate x and y coordinates
     * @param driver determines used driver for drawing
     * @return commands to draw a circle
     */
    public static ComplexCommand getDrawing(Job2dDriver driver) {

        double radius = 60;

        ComplexCommand circleCommands = new ComplexCommand(
                new SetPositionCommand(
                        (int)(radius * Math.cos(0.0)),
                        (int)(radius * Math.sin(0.0)),
                        driver)
        );

        for (double angle = 2 * Math.PI / radius; angle < 2 * Math.PI + 1; angle += 2 * Math.PI / radius) {
            int x = (int)(radius * Math.cos(angle));
            int y = (int)(radius * Math.sin(angle));
            circleCommands.addCommand(new OperateToCommand(x, y, driver));
        }

        return circleCommands;
    }
}
