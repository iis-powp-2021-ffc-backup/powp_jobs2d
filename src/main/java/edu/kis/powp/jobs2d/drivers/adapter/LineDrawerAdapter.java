package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.legacy.drawer.shape.line.SpecialLine;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;

public class LineDrawerAdapter extends DrawPanelController implements Job2dDriver {
    private int startX,startY;

    public LineDrawerAdapter(){ super(); }

    @Override
    public void setPosition(int x, int y) {
        startX = x;
        startY = y;
    }

    @Override
    public void operateTo(int x, int y) {
        ILine specialLine = LineFactory.getSpecialLine();
        specialLine.setStartCoordinates(startX,startY);
        specialLine.setEndCoordinates(x,y);
        DrawerFeature.getDrawerController().drawLine(specialLine);

        startX = x;
        startY = y;
    }
}
