package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;

public class JaneDrawerAdapter extends AbstractDriver implements Job2dDriver {
    public JaneDrawerAdapter() {
        super(0,0);
    }

    @Override
    public void operateTo(int x1, int y1) {
        ILine line = LineFactory.getBasicLine();
        line.setStartCoordinates(getX(),getY());
        line.setEndCoordinates(x1,y1);
        DrawerFeature.getDrawerController().drawLine(line);

        setPosition(x1,y1);
    }
}
