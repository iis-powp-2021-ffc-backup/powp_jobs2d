package edu.kis.powp.jobs2d.drivers.adapter;


import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.powp.jobs2d.Job2dDriver;

public class LineDrawerAdapter extends DrawPanelController implements Job2dDriver {

  enum LineType {
    BASIC, DOTTED, SPECIAL
  }

  private int startX = 0, startY = 0;
  private LineType lineType = LineType.BASIC;

	public LineDrawerAdapter() {
		super();
	}

  @Override
	public void setPosition(int x, int y) {
		this.startX = x;
		this.startY = y;
	}

  public void setLineType(LineType type) {
    this.lineType = type;
  }

  private ILine getLine() {
    switch (this.lineType) {
      case BASIC:
        return LineFactory.getBasicLine();
      case DOTTED:
        return LineFactory.getDottedLine();
      case SPECIAL:
        return LineFactory.getSpecialLine();
      default:
        return LineFactory.getBasicLine();
    }
  }

	@Override
	public void operateTo(int x, int y) {
		ILine line = this.getLine();
		line.setStartCoordinates(this.startX, this.startY);
		line.setEndCoordinates(x, y);

		this.drawLine(line);
		this.setPosition(x, y);
	}

	@Override
	public String toString() {
		return "Line drawer adapter driver";
	}
}