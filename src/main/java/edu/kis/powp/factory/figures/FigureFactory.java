package edu.kis.powp.factory.figures;

import edu.kis.powp.factory.AbstractFactory;
import edu.kis.powp.factory.Drawing;

public class FigureFactory implements AbstractFactory<Drawing> {

    @Override
    public Drawing create(String shapeType) {

        if ("Rectangle".equalsIgnoreCase(shapeType)) {
            return new Rectangle();
        } else if ("Trapezium".equalsIgnoreCase(shapeType)) {
            return new Trapezium();
        }

        return null;
    }
}
