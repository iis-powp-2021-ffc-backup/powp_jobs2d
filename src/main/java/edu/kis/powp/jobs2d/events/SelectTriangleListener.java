package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.shapes.RectangleShape;
import edu.kis.powp.jobs2d.shapes.TriangleShape;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTriangleListener implements ActionListener {

    private final DriverManager driver;
    public SelectTriangleListener(DriverManager driver){
        this.driver = driver;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        TriangleShape.getShapeCommand().execute(driver.getCurrentDriver());

    }
}
