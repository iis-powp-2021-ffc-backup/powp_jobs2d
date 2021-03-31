package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;
import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.command.FiguresFactory;
public class SelectTestFigureOptionListener implements ActionListener {

    private DriverManager driverManager;
    public SelectTestFigureOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()) {
			case "Figure Joe 1":
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
				break;
			case "Figure Joe 2":
				FiguresJoe.figureScript2(driverManager.getCurrentDriver());
				break;
			case "Triangle":
				DriverCommand triangle = FiguresFactory.createTriangle();
				triangle.execute(driverManager.getCurrentDriver());
				break;
			case "Parallelogram":
				DriverCommand parallelogram = FiguresFactory.createParallelogram();
				parallelogram.execute(driverManager.getCurrentDriver());
				break;
		}
    }
}