package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.command.Quadrangle;
import edu.kis.powp.command.ShapesFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.command.DriverCommand;

public class TestFigure2OptionListener implements ActionListener {
    private DriverManager driverManager;
    private Quadrangle figure;

    public TestFigure2OptionListener(DriverManager driverManager, Quadrangle figure) {
        this.driverManager = driverManager;
        this.figure = figure;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(driverManager.getCurrentDriver());
        DriverCommand driver = ShapesFactory.getCommands(driverManager, this.figure);
        driver.execute();
    }

}
