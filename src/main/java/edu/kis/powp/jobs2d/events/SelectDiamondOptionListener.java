package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.shapes.Diamond;
import edu.kis.powp.jobs2d.shapes.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectDiamondOptionListener implements ActionListener {
	private final DriverManager driver;

	public SelectDiamondOptionListener(DriverManager driver) {
		this.driver = driver;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new Diamond().getCommand().execute(driver.getCurrentDriver());
	}
}
