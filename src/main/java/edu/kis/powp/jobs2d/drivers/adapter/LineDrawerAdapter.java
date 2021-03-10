package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.powp.jobs2d.features.LineFeature;

public class LineDrawerAdapter extends PanelDrawerAdapter {

    private ILine line = LineFeature.getLine();

    @Override
    public void operateTo(int x, int y) {
        line.setStartCoordinates(this.startX, this.startY);
        line.setEndCoordinates(x, y);
        drawerController.drawLine(line);
        setPosition(x, y);
    }

    public void setLine(ILine line) {
        this.line = line;
    }

    @Override
    public String toString() {
        return "Line Drawer Simulator";
    }
}
