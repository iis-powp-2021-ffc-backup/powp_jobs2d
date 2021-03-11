package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class Joe2SelectTestFigureOptionListener extends AbstractSelectTestFigureOptionListener {

    public Joe2SelectTestFigureOptionListener(DriverManager driverManager) {
        super(driverManager);
    }

    @Override
    void performTest(DriverManager manager) {
        FiguresJoe.figureScript2(manager.getCurrentDriver());
    }
}
