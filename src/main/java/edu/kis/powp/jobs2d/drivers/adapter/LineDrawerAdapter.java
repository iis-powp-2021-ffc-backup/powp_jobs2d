package edu.kis.powp.jobs2d.drivers.adapter;

import static edu.kis.powp.jobs2d.features.DrawerFeature.getDrawerController;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;

public class LineDrawerAdapter extends DrawPanelController implements Job2dDriver  {
	private int startX = 0, startY = 0;
	
	public enum LineType {
		BASICL, DOTTEDL, SPECIALL
	}
	private LineType lineT = LineType.BASICL;
	
	public void setLineType(LineType lineT) {
		this.lineT=lineT;
	}
	
	public LineDrawerAdapter() {
		super();
	}
	
	public LineDrawerAdapter(LineType lineT) {
		super();
		this.lineT=lineT;
	}
	
	@Override
	public void setPosition(int x, int y) {
		this.startX = x;
		this.startY = y;
	}
	
	private ILine getILine() {
		if(lineT==LineType.BASICL) return LineFactory.getBasicLine();
		else if(lineT==LineType.DOTTEDL) return LineFactory.getDottedLine();
		else if(lineT==LineType.SPECIALL) return LineFactory.getSpecialLine();
		return LineFactory.getBasicLine();
	}
	
	@Override
	public void operateTo(int x, int y) {
		ILine line = getILine();
		line.setStartCoordinates(this.startX, this.startY);
		line.setEndCoordinates(x, y);
		
		getDrawerController().drawLine(line);
		setPosition(x,y);
	}
	
	@Override
	public String toString() {
		return "Line Drawer Adapter";
	}
}
