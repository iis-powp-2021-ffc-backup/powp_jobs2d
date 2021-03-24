package edu.kis.powp.command;

public class CommandFactory {

    public static DriverCommand getDrawRectangleCommand(int x, int y, int width, int height) {
        ComplexDriverCommand command = new ComplexDriverCommand();
        command.addCommand(new SetPositionCommand(x, y));
        command.addCommand(new OperateToCommand(x+width, y));
        command.addCommand(new OperateToCommand(x+width, y+height));
        command.addCommand(new OperateToCommand(x, y+height));
        command.addCommand(new OperateToCommand(x, y));
        return command;
    }

    public static DriverCommand getDrawTriangleCommand(int x, int y, int width, int height) {
        ComplexDriverCommand command = new ComplexDriverCommand();
        command.addCommand(new SetPositionCommand(x, y));
        command.addCommand(new OperateToCommand(x+width, y));
        command.addCommand(new OperateToCommand(x+(width/2), y+height));
        command.addCommand(new OperateToCommand(x, y));
        return command;
    }

}
