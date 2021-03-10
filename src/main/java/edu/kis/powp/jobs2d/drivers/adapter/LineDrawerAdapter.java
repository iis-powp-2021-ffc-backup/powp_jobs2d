package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.appbase.Application;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.features.DrawerFeature;
import edu.kis.powp.jobs2d.features.DriverFeature;

import javax.sound.sampled.Line;

/**
 * driver adapter which can draw multiple types of lines.
 */
public class LineDrawerAdapter extends DrawPanelController implements Job2dDriver {
    private int startX = 0, startY = 0;
    private final DrawPanelController dc;
    private ILine line;
    public LineDrawerAdapter() {
        line = LineFactory.getBasicLine();
        dc = DrawerFeature.getDrawerController();
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
        setPosition(x, y);
        dc.drawLine(line);
    }
    public void setLine(LineType t) {
        switch (t) {
            case BASIC:
                line = LineFactory.getBasicLine();
                break;
            case DOTTED:
                line = LineFactory.getDottedLine();
                break;
            case SPECIAL:
                line = LineFactory.getSpecialLine();
                break;
            default:
                line = LineFactory.getBasicLine();
                break;
        }
    }
    @Override
    public String toString() {
        return "Multi-style drawer adapter";
    }
}
