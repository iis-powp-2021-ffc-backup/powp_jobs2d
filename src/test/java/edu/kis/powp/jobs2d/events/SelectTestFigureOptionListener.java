package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.adapter.JaneDriverAdapter;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if ("Figure Joe 1".equals(command)) {
			FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		} else if ("Figure Joe 2".equals(command)) {
			FiguresJoe.figureScript2(driverManager.getCurrentDriver());
		} else if ("Figure Jane".equalsIgnoreCase(command)) {
			FiguresJane.figureScript(new JaneDriverAdapter(0, 0, driverManager.getCurrentDriver()));
		}
	}
}
