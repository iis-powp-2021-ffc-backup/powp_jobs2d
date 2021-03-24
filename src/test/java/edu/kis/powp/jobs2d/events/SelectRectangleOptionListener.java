package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.shapes.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectRectangleOptionListener implements ActionListener {
    private final DriverManager driver;

    public SelectRectangleOptionListener(DriverManager driver) {
        this.driver = driver;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new Rectangle().getCommand().execute(driver.getCurrentDriver());
    }
}