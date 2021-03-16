package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.features.DriverFeature;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectJaneOptionListener implements ActionListener {

    private DriverManager driverManager;

    public SelectJaneOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(DriverFeature.getDriverManager().getCurrentDriver() instanceof AbstractDriver)
            FiguresJane.figureScript((AbstractDriver)DriverFeature.getDriverManager().getCurrentDriver());
    }
}