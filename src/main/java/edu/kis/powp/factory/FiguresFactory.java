package edu.kis.powp.factory;

import edu.kis.powp.composer.ComplexCommand;
import edu.kis.powp.factory.figures.CircleDrawing;
import edu.kis.powp.factory.figures.RectangleDrawing;
import edu.kis.powp.factory.figures.TriangleDrawing;
import edu.kis.powp.jobs2d.Job2dDriver;

/**
 * Allows to get ComplexCommand commands for drawings
 * @see edu.kis.powp.composer.ComplexCommand
 */

public class FiguresFactory {

    public static ComplexCommand getFigureCommands(FigureTypes figureType, Job2dDriver driver) {
        switch (figureType) {
            case CIRCLE:
                return CircleDrawing.getDrawing(driver);
            case TRIANGLE:
                return TriangleDrawing.getDrawing(driver);
            case RECTANGLE:
                return RectangleDrawing.getDrawing(driver);
            default:
                return null;
        }
    }
}
