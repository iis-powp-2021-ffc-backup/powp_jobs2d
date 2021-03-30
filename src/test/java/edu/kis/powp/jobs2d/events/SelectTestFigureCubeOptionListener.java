package edu.kis.powp.jobs2d.events;

import edu.kis.powp.command.ComplexCommandFactory;
import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestFigureCubeOptionListener implements ActionListener{

    private DriverManager driverManager;

    public SelectTestFigureCubeOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DriverCommand command = ComplexCommandFactory.createCube();
        command.execute(driverManager.getCurrentDriver());
    }
}
