package edu.kis.powp.factory;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public class Hexagon {

    public static DriverCommand getDrawCommand(DriverManager driverManager) {
        return new ComplexCommand.Builder()
                .addCommand(new SetPositionCommand(0,0, driverManager.getCurrentDriver()))
                .addCommand(new OperateToCommand(100,0, driverManager.getCurrentDriver()))
                .addCommand(new OperateToCommand(200,-100, driverManager.getCurrentDriver()))
                .addCommand(new OperateToCommand(100,-200, driverManager.getCurrentDriver()))
                .addCommand(new OperateToCommand(0,-200, driverManager.getCurrentDriver()))
                .addCommand(new OperateToCommand(-100,-100, driverManager.getCurrentDriver()))
                .addCommand(new OperateToCommand(0,0, driverManager.getCurrentDriver()))
                .setJob2dDriver(driverManager.getCurrentDriver())
                .build();
    }
}