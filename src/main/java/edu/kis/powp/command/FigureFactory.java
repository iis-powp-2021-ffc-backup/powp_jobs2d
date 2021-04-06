package edu.kis.powp.command;
import java.util.ArrayList;
import java.util.List;

public class FigureFactory
{
    public static DriverCommand createRectangle()
    {
        List<DriverCommand> instructions = new ArrayList<>();

        instructions.add(new SetPositionCommand(0,0));
        instructions.add(new OperateToCommand(300,0));
        instructions.add(new OperateToCommand(300,150));
        instructions.add(new OperateToCommand(0,150);
        instructions.add(new OperateToCommand(0,0));

        ComplexCommand complexCommand = new ComplexCommand(instructions);
        return complexCommand;
    }

    public static DriverCommand createTriangle()
    {
        List<DriverCommand> instructions = new ArrayList<>();

        instructions.add(new SetPositionCommand(-200,200));
        instructions.add(new OperateToCommand(-200,-200));
        instructions.add(new OperateToCommand(200,200));
        instructions.add(new OperateToCommand(-200,200));

        ComplexCommand complexCommand = new ComplexCommand(instructions);
        return complexCommand;
    }
}