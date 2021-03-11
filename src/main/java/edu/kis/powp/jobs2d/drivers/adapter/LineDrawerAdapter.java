package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static edu.kis.powp.jobs2d.features.DrawerFeature.getDrawerController;


/**
 * Driver adapter to drawer susceptible of drawing various lines
 * @author Oskar Mikus
 */
public class LineDrawerAdapter extends DrawPanelController implements Job2dDriver, ActionListener {
    private int startX = 0, startY = 0;
    static private ILine lineWithType = LineFactory.getSpecialLine();

    public LineDrawerAdapter() {
        super();
    }

    @Override
    public void setPosition(int x, int y) {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void operateTo(int x, int y) {
        lineWithType.setStartCoordinates(this.startX, this.startY);
        lineWithType.setEndCoordinates(x, y);
        getDrawerController().drawLine(lineWithType);
        setPosition(x, y);
    }

    public static void setLineType(String type) {
        if ("basic".equalsIgnoreCase(type)) {
            lineWithType = LineFactory.getBasicLine();
        } else if ("dotted".equalsIgnoreCase(type)) {
            lineWithType = LineFactory.getDottedLine();
        } else if ("special".equalsIgnoreCase(type)) {
            lineWithType = LineFactory.getSpecialLine();
        }
    }

    @Override
    public String toString() {
        return "LineDrawerAdapter, pos x: " + startX + ", pos y: " + startY;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setLineType(e.getActionCommand());
    }
}
