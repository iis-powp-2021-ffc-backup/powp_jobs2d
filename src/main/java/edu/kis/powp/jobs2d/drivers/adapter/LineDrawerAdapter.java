package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;



public class LineDrawerAdapter implements Job2dDriver {

    private int startX;
    private int startY;

    private final DrawPanelController in;

    public LineDrawerAdapter(){
        in = DrawerFeature.getDrawerController();
    }

    @Override
    public void setPosition(int x, int y) {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void operateTo(int x, int y) {
        ILine specialLine = LineFactory.getSpecialLine();
        specialLine.setStartCoordinates(startX,startY);
        specialLine.setEndCoordinates(x,y);


        in.drawLine(specialLine);
        setPosition(x, y);
    }
}