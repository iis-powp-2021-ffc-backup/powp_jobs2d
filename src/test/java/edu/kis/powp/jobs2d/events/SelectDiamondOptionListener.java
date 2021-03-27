package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.command.ShapesFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectDiamondOptionListener implements ActionListener {
    private DriverManager driverManager;
    public SelectDiamondOptionListener(DriverManager driverManager){
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new ShapesFactory().getDiamond().execute(driverManager.getCurrentDriver());

    }
}
