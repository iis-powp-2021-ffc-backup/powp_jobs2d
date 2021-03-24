package edu.kis.powp.jobs2d.events;

import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.factory.ShapeFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListenerCircle implements ActionListener {
    private DriverManager driverManager;

	public SelectTestFigureOptionListenerCircle(DriverManager driverManager)  {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
        ComplexCommand command = ShapeFactory.getCircleCommand(20000);
        command.execute(driverManager.getCurrentDriver());
	}
}