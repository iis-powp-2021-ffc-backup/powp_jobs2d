package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
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
    public void operateTo(int x, int y) {
        ILine line = LineFactory.getBasicLine();
        line.setStartCoordinates(getX(),getY());
        line.setEndCoordinates(x,y);

        DrawerFeature.getDrawerController().drawLine(line);
        setPosition(x,y);
    }
}
