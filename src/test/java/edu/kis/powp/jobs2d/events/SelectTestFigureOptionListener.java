package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;
import edu.kis.powp.jobs2d.Figure;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
	Figure figure;

	public SelectTestFigureOptionListener(DriverManager driverManager, Figure figure) {
		this.driverManager = driverManager;
		this.figure = figure;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if ( figure == Figure.FIGURE1)
			FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		else
			FiguresJoe.figureScript2(driverManager.getCurrentDriver());
	}
}
