package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class PatternFactory {
    public static enum Patterns {
        RECTANGLE, TRIANGLE, LINE_VERTICAL, LINE_HORIZONTAL
    }

    private Patterns pattern;
    private int size;
    private Job2dDriver driver;

    PatternFactory(Patterns pattern, int size, Job2dDriver driver) {
        this.pattern = pattern;
        this.size = size;
        this.driver = driver;
    }

    public static ComplexCommand getPattern(Patterns pattern, int size, Job2dDriver driver) {
        return new PatternFactory(pattern, size, driver).getCommand();
    }

    public ComplexCommand getCommand() {
        ComplexCommand comm = new ComplexCommand();
        switch (pattern) {
        case RECTANGLE:
            comm.addCommand(new SetPositionCommand(-size, -size, driver));
            comm.addCommand(new OperateToCommand(size, -size, driver));
            comm.addCommand(new OperateToCommand(size, size, driver));
            comm.addCommand(new OperateToCommand(-size, size, driver));
            comm.addCommand(new OperateToCommand(-size, -size, driver));
            break;
        case TRIANGLE:
            comm.addCommand(new SetPositionCommand(0, 0, driver));
            comm.addCommand(new OperateToCommand(-size, -size, driver));
            comm.addCommand(new OperateToCommand(size, -size, driver));
            comm.addCommand(new OperateToCommand(0, 0, driver));
            break;
        case LINE_VERTICAL:
            comm.addCommand(new SetPositionCommand(-size, 0, driver));
            comm.addCommand(new OperateToCommand(size, 0, driver));
            break;
        case LINE_HORIZONTAL:
            comm.addCommand(new SetPositionCommand(0, -size, driver));
            comm.addCommand(new OperateToCommand(0, size, driver));
        }
        return comm;
    }
}
