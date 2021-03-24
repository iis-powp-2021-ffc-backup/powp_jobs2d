package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.shapes.Triangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTriangleOptionListener implements ActionListener {
    private final DriverManager driver;

    public SelectTriangleOptionListener(DriverManager driver) {
        this.driver = driver;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new Triangle().getCommand().execute(driver.getCurrentDriver());
    }
}