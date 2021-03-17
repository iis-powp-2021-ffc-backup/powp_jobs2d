package edu.kis.powp.factory.crosses;

import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.composer.ComplexCommand;
import edu.kis.powp.factory.Drawing;

public class SimpleCross implements Drawing {

    @Override
    public ComplexCommand getShape() {
        ComplexCommand crossDrawing = new ComplexCommand();
//        crossDrawing.addCommand(new OperateToCommand());
        return null;
    }
}
