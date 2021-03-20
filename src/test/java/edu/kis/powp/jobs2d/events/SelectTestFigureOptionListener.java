package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.factories.ComplexCommandFactory;
import edu.kis.powp.jobs2d.factories.FigureType;
import edu.kis.powp.jobs2d.figures.FigureDamian;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestFigureOptionListener implements ActionListener {

    private final DriverManager driverManager;
    private final FigureType figureType;

    public SelectTestFigureOptionListener(DriverManager driverManager, FigureType figureType) {
        this.driverManager = driverManager;
        this.figureType = figureType;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
		Job2dDriver driver = driverManager.getCurrentDriver();
		switch (figureType) {
			case FIGURE_JOE_1:
				FiguresJoe.figureScript1(driver);
				break;
			case FIGURE_JOE_2:
				FiguresJoe.figureScript2(driver);
				break;
			case FIGURE_DAMIAN_1:
				FigureDamian.figureScript1(driver);
				break;
			default:
				ComplexCommandFactory.getFigureComplexCommand(figureType).execute(driver);
				break;
		}
    }
}
