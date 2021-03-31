package edu.kis.powp.jobs2d.events;

import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.factory.FigureFactory;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.adapter.DrawLineAdapter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectSquareListener implements ActionListener {

    private DriverManager driverManager;

    public SelectSquareListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DriverCommand command = FigureFactory.square(driverManager.getCurrentDriver());
        command.execute();
    }
}
