package edu.kis.powp.jobs2d.events;

import edu.kis.powp.command.ComplexDriverCommand;
import edu.kis.powp.jobs2d.drivers.CommandsCapturingDriverProxy;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class Joe1CaptureSelectTestFigureOptionListener extends AbstractSelectTestFigureOptionListener {

    public Joe1CaptureSelectTestFigureOptionListener(DriverManager driverManager) {
        super(driverManager);
    }

    @Override
    void performTest(DriverManager manager) {
        CommandsCapturingDriverProxy proxy = new CommandsCapturingDriverProxy(manager.getCurrentDriver());
        FiguresJoe.figureScript1(proxy);
        ComplexDriverCommand command = proxy.getCommand();
        System.out.println(command);
    }
}
