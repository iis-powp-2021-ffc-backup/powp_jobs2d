package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.shapes.RectangleShape;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectRectangleListener implements ActionListener {
    private final DriverManager driver;
    public SelectRectangleListener(DriverManager driver){
        this.driver = driver;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        RectangleShape.getShapeCommand().execute(driver.getCurrentDriver());
    }
}
