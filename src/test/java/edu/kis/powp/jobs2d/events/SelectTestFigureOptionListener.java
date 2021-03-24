package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

import edu.kis.powp.factory.FigureTypes;
import edu.kis.powp.factory.FiguresFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.adapter.JaneDriverAdapter;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private final DriverManager driverManager;
	private final FigureTypes figureType;

	public SelectTestFigureOptionListener(DriverManager driverManager, FigureTypes figureType) {
		this.driverManager = driverManager;
		this.figureType = figureType;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (figureType) {
			case JOE_1:
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
				break;
			case JOE_2:
				FiguresJoe.figureScript2(driverManager.getCurrentDriver());
				break;
			case JANE:
				FiguresJane.figureScript(new JaneDriverAdapter(0, 0, driverManager.getCurrentDriver()));
				break;
			case CIRCLE:
			case TRIANGLE:
			case RECTANGLE:
			case QUADRILATERAL:
				Objects.requireNonNull(FiguresFactory.getFigureCommands(figureType, driverManager.getCurrentDriver()))
						.execute();
				break;
		}
	}
}
