package edu.kis.powp.jobs2d.events;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.factory.ShapeFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public class SelectTestFigureOptionListenerRectangle implements ActionListener {
    private DriverManager driverManager;

	public SelectTestFigureOptionListenerRectangle(DriverManager driverManager)  {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
        ComplexCommand command = ShapeFactory.getRectangleCommand(200, 200);
        command.execute(driverManager.getCurrentDriver());
	}
}