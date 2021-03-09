package edu.kis.powp.jobs2d.drivers.adapters;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;
/**
 * driver adapter to drawer with several bugs.
 */
public class Job2dAdapter extends DrawPanelController implements Job2dDriver{

	private static DrawPanelController drawerController = edu.kis.powp.jobs2d.features.DrawerFeature.getDrawerController();

	private int startX = 0, startY = 0;

	public DrawPanelController getPanelControler() {
		return drawerController;
	}

	public int getStartX() {
		return this.startX;
	}

	public int getStartY() {
		return this.startY;
	}

	public Job2dAdapter() {
		super();
	}

	@Override
	public void setPosition(int x, int y) {
		this.startX = x;
		this.startY = y;
	}

	@Override
	public void operateTo(int x, int y) {
		ILine line = LineFactory.getBasicLine();
		line.setStartCoordinates(getStartX(), getStartY());
		line.setEndCoordinates(x, y);
		drawerController.drawLine(line);
		setPosition(x, y);
		drawLine(line);
	}

	@Override
	public String toString() {
		return "Basic Adapter for Job2dDriver";
	}
}
