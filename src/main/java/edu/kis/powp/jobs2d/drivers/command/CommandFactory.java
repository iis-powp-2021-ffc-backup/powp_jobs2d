package edu.kis.powp.jobs2d.drivers.command;

public class CommandFactory {

    public static DriverCommand getTriangle(int x, int y, int width, int length) {
        ComplexCommand command = new ComplexCommand();
        command.addCommand(new SetPositionCommand(x, y));
        command.addCommand(new OperateToCommand(x+(width/2), y+length));
        command.addCommand(new OperateToCommand(x-(width/2),y+length));
        command.addCommand(new OperateToCommand(x, y));
        return command;
    }

    public static  DriverCommand getSquare(int x, int y, int length) {
        ComplexCommand command = new ComplexCommand();
        command.addCommand(new SetPositionCommand(x, y));
        command.addCommand(new OperateToCommand(x, y+length));
        command.addCommand(new OperateToCommand(x+length, y+length));
        command.addCommand(new OperateToCommand(x+length, y));
        command.addCommand(new OperateToCommand(x, y));
        return command;
    }


}
