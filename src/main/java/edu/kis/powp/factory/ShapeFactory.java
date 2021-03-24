package edu.kis.powp.factory;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.factory.shape.CircleDrawerCommand;
import edu.kis.powp.factory.shape.RectangleDrawerCommand;

public class ShapeFactory {
    public static ComplexCommand getCircleCommand(int radius){
        return new CircleDrawerCommand(radius).getCommand();
    }

    public static ComplexCommand getRectangleCommand(int width, int height){
        return new RectangleDrawerCommand(width, height).getCommand();
    }
}