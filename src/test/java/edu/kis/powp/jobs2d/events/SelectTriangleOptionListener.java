package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.command.ShapesFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTriangleOptionListener implements ActionListener {

    private DriverManager driverManager;

    public SelectTriangleOptionListener(DriverManager driverManager){
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new ShapesFactory().getTriangle().execute(driverManager.getCurrentDriver());
    }
}
