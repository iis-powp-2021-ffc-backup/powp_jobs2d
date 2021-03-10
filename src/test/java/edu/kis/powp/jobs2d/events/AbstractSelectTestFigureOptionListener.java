package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;

public abstract class AbstractSelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;

	public AbstractSelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		performTest(driverManager);
	}

	abstract void performTest(DriverManager manager);
}
