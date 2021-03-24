package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.adapters.JaneAdapter;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	private static final String[] scriptNames = { "FIgure Joe 1", "Figure Joe 2", "Figure Jane 1" };

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals(scriptNames[0])) {
			FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		} else if (e.getActionCommand().equals(scriptNames[1])) {
			FiguresJoe.figureScript2(driverManager.getCurrentDriver());
		} else if (e.getActionCommand().equals(scriptNames[2])) {
			FiguresJane.figureScript(new JaneAdapter(0, 0, driverManager.getCurrentDriver()));
		}
	}
}
