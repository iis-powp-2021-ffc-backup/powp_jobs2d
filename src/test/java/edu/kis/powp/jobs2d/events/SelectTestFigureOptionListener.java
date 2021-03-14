package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.features.DrawerFeature;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
	private int figureNumber;
	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	public void setFigureNumber(int figureNumber) {
		this.figureNumber = figureNumber;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(figureNumber == 1){
			FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		}
		else
			FiguresJoe.figureScript2(driverManager.getCurrentDriver());

	}
}

