package edu.kis.powp.jobs2d.factories;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.commands.ComplexCommand;
import edu.kis.powp.jobs2d.commands.DriverCommand;
import edu.kis.powp.jobs2d.commands.OperateToCommand;
import edu.kis.powp.jobs2d.commands.SetPositionCommand;

import java.util.ArrayList;

public class TriangleFigureComplexCommand implements FigureComplexCommand {

    @Override
    public ComplexCommand createComplexCommand() {
        ArrayList<DriverCommand> commands = new ArrayList<>();
        commands.add(new SetPositionCommand(-120, -120));
        commands.add(new OperateToCommand(120, -120));
        commands.add(new OperateToCommand(120, 120));
        commands.add(new OperateToCommand(-120, -120));

        return new ComplexCommand(commands);
    }
}
