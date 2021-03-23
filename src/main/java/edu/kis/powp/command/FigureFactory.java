package edu.kis.powp.command;
import java.util.ArrayList;
import java.util.List;

public class FigureFactory
{
    public static DriverCommand createRectangle()
    {
        List<DriverCommand> instructions = new ArrayList<>();

        instructions.add(new SetPositionCommand(0,0));
        instructions.add(new OperateToCommand(200,0));
        instructions.add(new OperateToCommand(200,100));
        instructions.add(new OperateToCommand(0,100));
        instructions.add(new OperateToCommand(0,0));

        ComplexCommand complexCommand = new ComplexCommand(instructions);
        return complexCommand;
    }

    public static DriverCommand createTriangle()
    {
        List<DriverCommand> instructions = new ArrayList<>();

        instructions.add(new SetPositionCommand(-100,100));
        instructions.add(new OperateToCommand(-100,-100));
        instructions.add(new OperateToCommand(100,100));
        instructions.add(new OperateToCommand(-100,100));

        ComplexCommand complexCommand = new ComplexCommand(instructions);
        return complexCommand;
    }
}
