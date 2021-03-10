package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;

import static edu.kis.powp.jobs2d.features.DrawerFeature.getDrawerController;

public class LineDrawerAdapter extends DrawPanelController implements Job2dDriver {
    private int startX = 0, startY = 0;
    private ILine line;

    public LineDrawerAdapter() {
        super();
        line = LineFactory.getSpecialLine();
    }


    public void setTypeLine(String type){
        if(type.equals("basic"))
            line = LineFactory.getBasicLine();
        else if(type.equals("special"))
            line = LineFactory.getSpecialLine();
    }


    @Override
    public void setPosition(int x, int y) {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void operateTo(int x, int y) {
        line.setStartCoordinates(this.startX, this.startY);
        line.setEndCoordinates(x, y);
        getDrawerController().drawLine(line);
        setPosition(x, y);
    }



    @Override
    public String toString() {
        return "Adapter with different types of lines";
    }
}
