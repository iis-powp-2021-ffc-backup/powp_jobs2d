package edu.kis.powp.jobs2d.events;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;


public class SelectTestCommandOptionListener implements ActionListener {
    private DriverManager driverManager;

    public SelectTestCommandOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        LinkedList<DriverCommand> commands = new LinkedList<>();
        commands.add(new SetPositionCommand(10,0,driverManager.getCurrentDriver()));
        commands.add(new OperateToCommand(0,-10,driverManager.getCurrentDriver()));
        commands.add(new OperateToCommand(10,-10, driverManager.getCurrentDriver()));
        ComplexCommand complexCommand = new ComplexCommand(commands, driverManager.getCurrentDriver());
        complexCommand.execute();
    }
}