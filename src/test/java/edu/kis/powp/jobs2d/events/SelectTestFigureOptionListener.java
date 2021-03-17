package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

import edu.kis.powp.command.ShapeFactory;

public class SelectTestFigureOptionListener implements ActionListener {

	public enum TestType {
		JOE1, JOE2, SHAPE
	};

	private DriverManager driverManager;
	private TestType testType;

	public SelectTestFigureOptionListener(DriverManager driverManager, TestType type) {
		this.driverManager = driverManager;
		this.testType = type;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (testType) {
			case JOE1:
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
				break;
			case JOE2:
				FiguresJoe.figureScript2(driverManager.getCurrentDriver());
				break;
			case SHAPE:
				ShapeFactory.getRectangle(driverManager.getCurrentDriver()).execute();
				break;
		}
	}
}
