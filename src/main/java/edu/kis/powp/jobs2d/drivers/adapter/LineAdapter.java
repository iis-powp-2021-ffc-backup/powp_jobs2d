package edu.kis.powp.jobs2d.drivers.adapter;

import static edu.kis.powp.jobs2d.features.DrawerFeature.getDrawerController;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;

public class LineAdapter extends DrawPanelController implements Job2dDriver{
	private int startX = 0, startY = 0;

	public enum LineType {
		BASICLINE, DOTTEDLINE, SPECIALLINE
	}
	private LineType lineT = LineType.BASICLINE;
	
	public void setLineType(LineType l) {
		lineT=l;
	}
	
	public LineAdapter() {
		super();
	}
	public LineAdapter(LineType l) {
		super();
		setLineType(l);
	}

	private ILine getLine() {
		if(lineT==LineType.BASICLINE) return LineFactory.getBasicLine();
		if(lineT==LineType.DOTTEDLINE) return LineFactory.getDottedLine();
		if(lineT==LineType.SPECIALLINE) return LineFactory.getSpecialLine();
		return LineFactory.getBasicLine();
	}

	@Override
	public void setPosition(int x, int y) {
		this.startX = x;
		this.startY = y;
	}

	@Override
	public void operateTo(int x, int y) {
		ILine line = getLine();
		line.setStartCoordinates(this.startX, this.startY);
		line.setEndCoordinates(x, y);

		getDrawerController().drawLine(line);
		setPosition(x, y);
	}
	@Override
	public String toString() {
		return "Line Adapter";
	}
}
