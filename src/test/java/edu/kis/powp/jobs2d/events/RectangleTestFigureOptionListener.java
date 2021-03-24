package edu.kis.powp.jobs2d.events;

import edu.kis.powp.command.CommandFactory;
import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class RectangleTestFigureOptionListener extends AbstractSelectTestFigureOptionListener {

    public RectangleTestFigureOptionListener(DriverManager driverManager) {
        super(driverManager);
    }

    @Override
    void performTest(DriverManager manager) {
        DriverCommand command = CommandFactory.getDrawRectangleCommand(-20, -30, 40, 60);
        command.execute(manager.getCurrentDriver());
    }
}
