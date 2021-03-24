package edu.kis.powp.jobs2d.events;

import edu.kis.powp.command.CommandFactory;
import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public class TriangleTestFigureOptionListener extends AbstractSelectTestFigureOptionListener {

    public TriangleTestFigureOptionListener(DriverManager driverManager) {
        super(driverManager);
    }

    @Override
    void performTest(DriverManager manager) {
        DriverCommand command = CommandFactory.getDrawTriangleCommand(-100, -50, 200, 200);
        command.execute(manager.getCurrentDriver());
    }
}
