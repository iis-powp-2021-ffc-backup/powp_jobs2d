package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drawer.IFigureDrawer;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
	private IFigureDrawer drawer;

	public SelectTestFigureOptionListener(DriverManager driverManager, IFigureDrawer drawer) {
		this.driverManager = driverManager;
		this.drawer = drawer;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		drawer.drawFigure(driverManager.getCurrentDriver());
	}
}
