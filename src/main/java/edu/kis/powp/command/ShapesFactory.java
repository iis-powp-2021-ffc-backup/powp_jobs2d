package edu.kis.powp.command;


import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.Job2dDriver;

public class ShapesFactory {

    public static DriverCommand getCommands(DriverManager driverManager, Quadrangle figure) {

        return switch ( figure ) {
            case SQUARE -> getCommandsForSquare(driverManager.getCurrentDriver());
            case RHOMBUS -> getCommandsForRhombus(driverManager.getCurrentDriver());
            case CUBE -> getCommandsForCube(driverManager.getCurrentDriver());
        };
    }

    private static DriverCommand getCommandsForCube(Job2dDriver driverManager) {
        ComplexCommand commands = new ComplexCommand();
        commands.addNewCommand(new SetPositionCommand(driverManager, -120, -120));
        commands.addNewCommand(new OperateToCommand(driverManager, 120, -120));
        commands.addNewCommand(new OperateToCommand(driverManager, 120, 120));
        commands.addNewCommand(new OperateToCommand(driverManager, -120, 120));
        commands.addNewCommand(new OperateToCommand(driverManager, -120, -120));
        commands.addNewCommand(new OperateToCommand(driverManager, -80, -160));
        commands.addNewCommand(new OperateToCommand(driverManager, 160, -160));
        commands.addNewCommand(new OperateToCommand(driverManager, 160, 80));
        commands.addNewCommand(new OperateToCommand(driverManager, 120, 120));
        commands.addNewCommand(new SetPositionCommand(driverManager, 120, -120));
        commands.addNewCommand(new OperateToCommand(driverManager, 160, -160));
        return commands;
    }

    private static DriverCommand getCommandsForRhombus(Job2dDriver driverManager) {
        ComplexCommand commands = new ComplexCommand();
        commands.addNewCommand(new SetPositionCommand(driverManager, 0, -150));
        commands.addNewCommand(new OperateToCommand(driverManager, 150, 0));
        commands.addNewCommand(new OperateToCommand(driverManager, 0, 150));
        commands.addNewCommand(new OperateToCommand(driverManager, -150, 0));
        commands.addNewCommand(new OperateToCommand(driverManager, 0, -150));
        return commands;
    }

    private static DriverCommand getCommandsForSquare(Job2dDriver driverManager) {
        ComplexCommand commands = new ComplexCommand();
        commands.addNewCommand(new SetPositionCommand(driverManager, -120, -120));
        commands.addNewCommand(new OperateToCommand(driverManager, 120, -120));
        commands.addNewCommand(new OperateToCommand(driverManager, 120, 120));
        commands.addNewCommand(new OperateToCommand(driverManager, -120, 120));
        commands.addNewCommand(new OperateToCommand(driverManager, -120, -120));
        return commands;
    }
}
