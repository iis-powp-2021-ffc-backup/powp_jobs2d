package edu.kis.powp.command;
import java.util.ArrayList;
import java.util.List;

public class FiguresFactory
{
    public static DriverCommand createTriangle()
    {
        List<DriverCommand> commandsList = new ArrayList<>();
        commandsList.add(new SetPositionCommand(-200,0));
        commandsList.add(new OperateToCommand(200,0));
        commandsList.add(new OperateToCommand(0,-100));
        commandsList.add(new OperateToCommand(-200,0));
        return new ComplexCommand(commandsList);
    }

    public static DriverCommand createParallelogram()
    {
        List<DriverCommand> commandsList = new ArrayList<>();
        commandsList.add(new SetPositionCommand(-100,-100));
        commandsList.add(new OperateToCommand(100,-100));
        commandsList.add(new OperateToCommand(150,100));
        commandsList.add(new OperateToCommand(-50,100));
        commandsList.add(new OperateToCommand(-100,-100));
        return new ComplexCommand(commandsList);

    }
}