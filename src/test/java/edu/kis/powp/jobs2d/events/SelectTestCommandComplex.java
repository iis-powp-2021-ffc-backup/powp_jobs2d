package edu.kis.powp.jobs2d.events;

import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.command.ShapeFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestCommandComplex implements ActionListener {
    private DriverManager driverManager;
    private ComplexShape chosenShape;

    public SelectTestCommandComplex(DriverManager driverManager, ComplexShape chosenShape) {
        this.driverManager = driverManager;
        this.chosenShape = chosenShape;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DriverCommand rectangleCommand = null;
        switch (chosenShape) {
            case C_RECTANGLE:
                rectangleCommand = ShapeFactory.createRectangle();
                break;
            case C_TRIANGLE:
                rectangleCommand = ShapeFactory.createTriangle();
                break;
            case C_CIRCLE:
                rectangleCommand = ShapeFactory.createCircle();
                break;
        }
        if (rectangleCommand != null) {
            rectangleCommand.execute(driverManager.getCurrentDriver());
        }
    }
}
