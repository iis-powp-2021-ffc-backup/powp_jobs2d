package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;
import edu.kis.powp.command.ComplexShape;
import edu.kis.powp.command.ShapeFactory;
import edu.kis.powp.command.ComplexShape.ShapeType;

public class SelectTestFigureOptionListener implements ActionListener {

	public enum TestType {
		JOE1, JOE2, SHAPE, COMPLEX
	};

	private DriverManager driverManager;
	private TestType testType;

	public SelectTestFigureOptionListener(DriverManager driverManager, TestType type) {
		this.driverManager = driverManager;
		this.testType = type;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Job2dDriver driver = driverManager.getCurrentDriver();
		switch (testType) {
			case JOE1:
				FiguresJoe.figureScript1(driver);
				break;
			case JOE2:
				FiguresJoe.figureScript2(driver);
				break;
			case SHAPE:
				ShapeFactory.getTriangle(driver).execute();
				break;
			case COMPLEX:
				new ComplexShape(driver, 
					ShapeType.RECTANGLE,
					ShapeType.TRIANGLE
				).execute();
				break;
		}
	}
}
