package edu.kis.powp.command;

import java.util.ArrayList;
import java.util.List;

public class FiguresCommandFactory {

    public static IDriverCommand GetCommandForSquare(int size) {
        List<IDriverCommand> squareCommands = new ArrayList<>();
        squareCommands.add(new SetPositionCommand(-size/2,-size/2));
        squareCommands.add(new OperateToCommand(-size/2,size/2));
        squareCommands.add(new OperateToCommand(size/2,size/2));
        squareCommands.add(new OperateToCommand(size/2,-size/2));
        squareCommands.add(new OperateToCommand(-size/2,-size/2));
        return new ComplexDriverCommand(squareCommands);
    }

    public static IDriverCommand GetCommandForRightTriangle(int length) {
        List<IDriverCommand> squareCommands = new ArrayList<>();
        squareCommands.add(new SetPositionCommand(-length/2,length/2));
        squareCommands.add(new OperateToCommand(-length/2,-length/2));
        squareCommands.add(new OperateToCommand(length/2,length/2));
        squareCommands.add(new OperateToCommand(-length/2,length/2));
        return new ComplexDriverCommand(squareCommands);
    }

}
