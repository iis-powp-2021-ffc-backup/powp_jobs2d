package edu.kis.powp.factory;


import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.util.LinkedList;


public class Rectangle {

    public static DriverCommand getDrawCommand(DriverManager driverManager) {
        LinkedList<DriverCommand> commandList = new LinkedList<DriverCommand>();
        commandList.add(new SetPositionCommand(0,0, driverManager.getCurrentDriver()));
        commandList.add(new OperateToCommand(150,0, driverManager.getCurrentDriver()));
        commandList.add(new OperateToCommand(150,100, driverManager.getCurrentDriver()));
        commandList.add(new OperateToCommand(0,100, driverManager.getCurrentDriver()));
        commandList.add(new OperateToCommand(0,0, driverManager.getCurrentDriver()));

        return new ComplexCommand(commandList, driverManager.getCurrentDriver());
    }
}