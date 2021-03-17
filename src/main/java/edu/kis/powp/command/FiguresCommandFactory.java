package edu.kis.powp.command;

import java.util.ArrayList;
import java.util.List;

public class FiguresCommandFactory {

    public static IDriverCommand GetCommandForSquare(int size) {
        List<IDriverCommand> squareCommands = new ArrayList<>();
        squareCommands.add(new SetPositionCommand(0,0));
        squareCommands.add(new OperateToCommand(0,size));
        squareCommands.add(new OperateToCommand(size,size));
        squareCommands.add(new OperateToCommand(size,0));
        squareCommands.add(new OperateToCommand(0,0));
        return new ComplexDriverCommand(squareCommands);
    }

}
