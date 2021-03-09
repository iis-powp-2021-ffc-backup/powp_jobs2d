package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;

public class ExtendedJob2dAdapter extends DefaultJob2dAdapter {

    public enum Line {
        CONTINUOUS,
        DOTTED,
        SPECIAL
    }

    private Line line = Line.SPECIAL;

    public ExtendedJob2dAdapter() {
        super();
    }

    public void setLine(Line type) {
        this.line = type;
    }

    private ILine getLine() {
        switch (this.line) {
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
        ILine line = getLine();

        line.setStartCoordinates(super.getStartX(), super.getStartY());
        line.setEndCoordinates(x, y);

        getDrawPanelController().drawLine(line);

        setPosition(x, y);

        drawLine(line);
    }

    @Override
    public String toString() {
        return "Extended Adapter";
    }
}