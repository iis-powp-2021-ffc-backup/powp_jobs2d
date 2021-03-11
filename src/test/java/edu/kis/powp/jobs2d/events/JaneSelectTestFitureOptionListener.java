package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.adapter.DriverAdapter;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;

public class JaneSelectTestFitureOptionListener extends AbstractSelectTestFigureOptionListener {

    public JaneSelectTestFitureOptionListener(DriverManager driverManager) {
        super(driverManager);
    }

    @Override
    void performTest(DriverManager manager) {
        DriverAdapter adapter = new DriverAdapter(manager);
        FiguresJane.figureScript(adapter);
    }
}
