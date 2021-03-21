package edu.kis.powp.factory;

import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;


public class ShapeFactory {


    public static DriverCommand getShape(DriverManager driverManager, String type) {
        switch (type) {
            case "rectangle":
                return Rectangle.getDrawCommand(driverManager);
            case "triangle":
                return Triangle.getDrawCommand(driverManager);
            case "hexagon":
                return Hexagon.getDrawCommand(driverManager);
            default:
                return null;
        }
    }
}