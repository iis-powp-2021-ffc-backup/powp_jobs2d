package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
	private boolean alternativeActionFlag = false;
	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}
	public void selectAlternativeAction(){
		this.alternativeActionFlag = true;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(alternativeActionFlag)
			FiguresJoe.figureScript2(driverManager.getCurrentDriver());
		else
			FiguresJoe.figureScript1(driverManager.getCurrentDriver());
	}
}
