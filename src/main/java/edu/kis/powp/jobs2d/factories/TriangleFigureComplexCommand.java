package edu.kis.powp.jobs2d.factories;

import edu.kis.powp.jobs2d.commands.ComplexCommand;
import edu.kis.powp.jobs2d.commands.OperateToCommand;
import edu.kis.powp.jobs2d.commands.SetPositionCommand;

public class TriangleFigureComplexCommand implements FigureComplexCommand {

    @Override
    public ComplexCommand createComplexCommand() {
        return new ComplexCommand.Builder()
                .addCommand(new SetPositionCommand(-120, -120))
                .addCommand(new OperateToCommand(120, -120))
                .addCommand(new OperateToCommand(120, 120))
                .addCommand(new OperateToCommand(-120, -120))
                .build();
    }
}
