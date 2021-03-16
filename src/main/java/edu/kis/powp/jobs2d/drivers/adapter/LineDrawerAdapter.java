package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;

public class LineDrawerAdapter {

    private LineType lineType = LineType.BasicLine;

    public LineDrawerAdapter() {
        super();
    }

    public void setLineType(LineType lineType) {
        this.lineType = lineType;
    }

    public ILine getLine() {
        ILine line;
        switch (lineType) {
            case DottedLine:
                line = LineFactory.getDottedLine();
                break;
            case SpecialLine:
                line = LineFactory.getSpecialLine();
                break;
            default:
                line = LineFactory.getBasicLine();
        }
        return line;
    }
}
