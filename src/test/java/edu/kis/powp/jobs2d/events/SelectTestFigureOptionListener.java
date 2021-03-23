package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.command.FigureFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
	private DrawingType drawingType;

	public SelectTestFigureOptionListener(DriverManager driverManager, DrawingType drawingType) {
		this.driverManager = driverManager;
		this.drawingType = drawingType;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(drawingType == DrawingType.BOX) {
			FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		}
		if(drawingType == DrawingType.DOODLE) {
			FiguresJoe.figureScript2(driverManager.getCurrentDriver());
		}
		if(drawingType == DrawingType.RECTANGLE) {
			DriverCommand rectangleCommand = FigureFactory.createRectangle();
			rectangleCommand.execute(driverManager.getCurrentDriver());
		}
		if(drawingType == DrawingType.TRIANGLE) {
			DriverCommand triangleCommand = FigureFactory.createTriangle();
			triangleCommand.execute(driverManager.getCurrentDriver());
		}
	}
}
