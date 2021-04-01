package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.commands.FigureFactory;
import edu.kis.powp.jobs2d.commands.FigureFactory.Shapes;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
	
	public enum FigureType {
		FJOE1, FJOE2, FRECT, FLINE, FTRNG
	}
	
	private FigureType type;

	public SelectTestFigureOptionListener(DriverManager driverManager, FigureType type) {
		this.driverManager = driverManager;
		this.type = type;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(type==FigureType.FJOE1) FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		else if(type==FigureType.FJOE2) FiguresJoe.figureScript2(driverManager.getCurrentDriver());
		else if(type==FigureType.FRECT) {
			FigureFactory ff = new FigureFactory(Shapes.RECTANGLE, 100, driverManager.getCurrentDriver());
			ff.getCommand().execute();
		}
		else if(type==FigureType.FLINE) {
			FigureFactory ff = new FigureFactory(Shapes.LINE, 100, driverManager.getCurrentDriver());
			ff.getCommand().execute();
		}
		else if(type==FigureType.FTRNG) {
			FigureFactory ff = new FigureFactory(Shapes.TRIANGLE, 100, driverManager.getCurrentDriver());
			ff.getCommand().execute();
		}
	}
}
