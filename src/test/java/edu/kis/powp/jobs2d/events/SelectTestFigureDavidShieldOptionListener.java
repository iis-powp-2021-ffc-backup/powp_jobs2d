package edu.kis.powp.jobs2d.events;

import edu.kis.powp.command.ComplexCommandFactory;
import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestFigureDavidShieldOptionListener implements ActionListener {

    private DriverManager driverManager;

    public SelectTestFigureDavidShieldOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DriverCommand command = ComplexCommandFactory.createDavidShield();
        command.execute(driverManager.getCurrentDriver());
    }

}
