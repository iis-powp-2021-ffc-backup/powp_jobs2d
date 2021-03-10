package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.JaneDriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestJane implements ActionListener {

    private DriverManager driverManager;

    public SelectTestJane(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JaneDriverManager jd = new JaneDriverManager(0, 0);
        jd.setCurrentDriver(driverManager.getCurrentDriver());
        FiguresJane.figureScript(jd.getCurrentDriver());
    }
}
