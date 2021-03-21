package edu.kis.powp.jobs2d.commands;

import java.util.ArrayList;

public class RectangleFigureComplexCommand implements FigureComplexCommand {
    @Override
    public ComplexCommand createComplexCommand() {
        ArrayList<DriverCommand> commands = new ArrayList<>();
        commands.add(new SetPositionCommand(-120, -120));
        commands.add(new OperateToCommand(-120, -120));
        commands.add(new OperateToCommand(120, -120));
        commands.add(new OperateToCommand(120, 120));
        commands.add(new OperateToCommand(-120, 120));
        commands.add(new OperateToCommand(-120, -120));

        return new ComplexCommand(commands);
    }
}
