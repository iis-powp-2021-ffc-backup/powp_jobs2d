package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class Joe1SelectTestFitureOptionListener extends AbstractSelectTestFigureOptionListener {

    public Joe1SelectTestFitureOptionListener(DriverManager driverManager) {
        super(driverManager);
    }

    @Override
    void performTest(DriverManager manager) {
        FiguresJoe.figureScript1(manager.getCurrentDriver());
    }
}
