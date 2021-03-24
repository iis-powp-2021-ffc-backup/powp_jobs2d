package edu.kis.powp.factory.shape;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;

public class RectangleDrawerCommand implements ShapeCommand{
    private int width;
    private int height;

    public RectangleDrawerCommand(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public ComplexCommand getCommand(){
        ComplexCommand command = new ComplexCommand();
        int x = 0, y = 0;

        command.addCommand(new SetPositionCommand(x+width, y));
        command.addCommand(new OperateToCommand(x, y+height));
        command.addCommand(new OperateToCommand(x-width, y));
        command.addCommand(new OperateToCommand(x, y-height));
        command.addCommand(new OperateToCommand(x+width, y));

        return command;
    }
}