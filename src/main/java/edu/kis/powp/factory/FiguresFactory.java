package edu.kis.powp.factory;

import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.composer.ComplexCommand;
import edu.kis.powp.jobs2d.Job2dDriver;

public class FiguresFactory {

    public static ComplexCommand getTriangle(Job2dDriver driver, int height, int baseSize) {
        return new ComplexCommand(
                new SetPositionCommand(0, 0, driver),
                new OperateToCommand(Math.floorDiv(baseSize, 2), height, driver),
                new OperateToCommand(Math.floorDiv(baseSize, 2), -height, driver),
                new OperateToCommand( 0, 0, driver)
        );
    }

    public static ComplexCommand getRectangle(Job2dDriver driver, int width, int height) {
        return new ComplexCommand(
                new SetPositionCommand(Math.floorDiv(width, 2), Math.floorDiv(height, 2), driver),
                new OperateToCommand(Math.floorDiv(width, 2), Math.floorDiv(-height, 2), driver),
                new OperateToCommand(Math.floorDiv(width, 2), Math.floorDiv(height, 2), driver),
                new OperateToCommand(Math.floorDiv(-width, 2), Math.floorDiv(height, 2), driver),
                new OperateToCommand(Math.floorDiv(-width, 2), Math.floorDiv(-height, 2), driver)
        );
    }

    /**
     * It uses parametric form equation of circle to calculate x and y coordinates
     * @param driver determines used driver for drawing
     * @return commands to draw a circle
     */
    public static ComplexCommand getCircle(Job2dDriver driver, double radius) {

        ComplexCommand circleCommands = new ComplexCommand(
            new SetPositionCommand(
                    (int)(radius * Math.cos(0.0)),
                    (int)(radius * Math.sin(0.0)),
                    driver)
        );

        for (double angle = 2 * Math.PI / radius; angle < 2 * Math.PI; angle += 2 * Math.PI / radius) {
            int x = (int)(radius * Math.cos(angle));
            int y = (int)(radius * Math.sin(angle));
            circleCommands.addCommand(new OperateToCommand(x, y, driver));
        }

        return circleCommands;
    }
}
