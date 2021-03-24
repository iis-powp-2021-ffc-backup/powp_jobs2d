package edu.kis.powp.command;

import java.util.ArrayList;
import java.util.List;

public class ShapeFactory {
    public static DriverCommand createRectangle() {
        int size = 50;
        List<DriverCommand> instructions = new ArrayList<>();
        instructions.add(new SetPositionCommand(-size, -size));
        instructions.add(new OperateToCommand(size,-size));
        instructions.add(new OperateToCommand(size,size));
        instructions.add(new OperateToCommand(-size,size));
        instructions.add(new OperateToCommand(-size, -size));
        return new CommandComplex(instructions);
    }

    public static DriverCommand createTriangle() {
        List<DriverCommand> instructions = new ArrayList<>();
        int size = 50;
        instructions.add(new SetPositionCommand(-size,-size/2));
        instructions.add(new OperateToCommand(size,-size/2));
        instructions.add(new OperateToCommand(0,size/2));
        instructions.add(new OperateToCommand(-size,-size/2));

        return new CommandComplex(instructions);
    }
    public static DriverCommand createCircle() {
        List<DriverCommand> instructions = new ArrayList<>();
        int size = 50;

        for (float i = 0; i < 2*Math.PI + 1; i += 2*Math.PI/50) {
            int x = (int) (size * Math.cos(i));
            int y = (int) (size * Math.sin(i));
            if (i == 0) {
                instructions.add(new SetPositionCommand(x, y));
            }
            instructions.add(new OperateToCommand(x, y));
        }
        return new CommandComplex(instructions);
    }
}
