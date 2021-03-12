package edu.kis.powp.jobs2d.drivers.adapters;

import static edu.kis.powp.jobs2d.features.DrawerFeature.getDrawerController;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;

public class LineTypeAdapter extends DrawPanelController implements Job2dDriver {
    private int startX = 0, startY = 0;

    public enum LineType {
        LINEBASIC, LINEDOTTED, LINESPECIAL
    }

    private LineType type = LineType.LINEBASIC;

    public LineTypeAdapter() {
        this(LineType.LINEBASIC);
    }

    public LineTypeAdapter(LineType type) {
        super();
        this.setLineType(type);
    }

    public void setLineType(LineType type) {
        this.type = type;
    }

    @Override
    public void setPosition(int x, int y) {
        this.startX = x;
        this.startY = y;
    }

    private ILine getILine() {
        return LineType.LINESPECIAL == type ? LineFactory.getSpecialLine()
                : (LineType.LINEDOTTED == type ? LineFactory.getDottedLine() : LineFactory.getBasicLine());
    }

    @Override
    public void operateTo(int x, int y) {
        ILine line = getILine();
        line.setStartCoordinates(this.startX, this.startY);
        line.setEndCoordinates(x, y);

        getDrawerController().drawLine(line);
        setPosition(x, y);
    }

    @Override
    public String toString() {
        return "Line Type Adapter";
    }
}