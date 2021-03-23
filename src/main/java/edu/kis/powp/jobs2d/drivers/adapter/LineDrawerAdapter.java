package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.legacy.drawer.shape.line.SpecialLine;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;

public class LineDrawerAdapter implements Job2dDriver {
    private int startX,startY;
    private ILine line = LineFactory.getBasicLine();
    private DrawPanelController drawController;

    public enum LineType{BASIC, DOTTED, SPECIAL};

    public LineDrawerAdapter(DrawPanelController drawController) {
        this.drawController = drawController;
    }

    @Override
    public void setPosition(int x, int y) {
        startX = x;
        startY = y;
    }

    @Override
    public void operateTo(int x, int y) {
        line.setStartCoordinates(startX,startY);
        line.setEndCoordinates(x,y);
        drawController.drawLine(line);

        startX = x;
        startY = y;
    }

    public void changeLine(LineType type){
        switch (type){
            case BASIC: line = LineFactory.getBasicLine();
            break;
            case DOTTED: line = LineFactory.getDottedLine();
            break;
            case SPECIAL: line = LineFactory.getSpecialLine();
            break;
        }
    }
}
