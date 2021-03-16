package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;

/**
 * driver adapter to drawer with several bugs.
 */
public class DrawerAdapter extends DrawPanelController implements Job2dDriver {
	private int startX = 0, startY = 0;
	private final DrawPanelController drawerController;
	private  LineDrawerAdapter lineDrawerAdapter;
	public DrawerAdapter() {
		drawerController = DrawerFeature.getDrawerController();
		this.lineDrawerAdapter = new LineDrawerAdapter();
	}

	public void setLineDrawerAdapter(LineDrawerAdapter lineDrawerAdapter) {
		this.lineDrawerAdapter = lineDrawerAdapter;
	}
	public void setLineType(LineType lineType){
		System.out.println("adapter "+lineType);
		lineDrawerAdapter.setLineType(lineType);
	}

	@Override
	public void setPosition(int x, int y) {
		this.startX = x;
		this.startY = y;
	}

	@Override
	public void operateTo(int x, int y) {
		ILine line = lineDrawerAdapter.getLine();
		line.setStartCoordinates(this.startX, this.startY);
		line.setEndCoordinates(x, y);
		drawerController.drawLine(line);
		setPosition(x,y);
	}

	@Override
	public String toString() {
		return "@Q!$!@$!#@$(*#@&Q(%^*#@";
	}
}
