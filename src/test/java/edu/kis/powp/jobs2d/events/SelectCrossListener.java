package edu.kis.powp.jobs2d.events;

import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.factory.FigureFactory;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.adapter.DrawLineAdapter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectCrossListener implements ActionListener {
    private DriverManager driverManager;

    public SelectCrossListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DriverCommand command = FigureFactory.cross(driverManager.getCurrentDriver());
        command.execute();
    }
}
