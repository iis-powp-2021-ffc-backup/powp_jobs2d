package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.util.ArrayList;
import java.util.List;

public class ShapeFactory {

    public static ComplexCommand createRectangle() {
        List<DriverCommand> commandList = new ArrayList<>();
        commandList.add(new SetPositionCommand(0, 0));
        commandList.add(new OperateToCommand(100, 0));
        commandList.add(new OperateToCommand(100, 150));
        commandList.add(new OperateToCommand(0, 150));
        commandList.add(new OperateToCommand(0, 0));
        return new ComplexCommand(commandList);
    }

    public static ComplexCommand createTriangle() {
        ArrayList<DriverCommand> commands = new ArrayList<>();
        commands.add(new SetPositionCommand(-120, -120));
        commands.add(new OperateToCommand(-120, 120));
        commands.add(new OperateToCommand(120, 120));
        commands.add(new OperateToCommand(-120, -120));

        return new ComplexCommand(commands);
    }

    public static ComplexCommand createTrapezoid(){
       return new ComplexCommand.Builder()
                .addCommand(new SetPositionCommand(0,0))
                .addCommand(new OperateToCommand(100,0))
                .addCommand(new OperateToCommand(130,100))
                .addCommand(new OperateToCommand(30,100))
                .addCommand(new OperateToCommand(0,0))
                .build();
    }



}
