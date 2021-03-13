package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.EditableLine;
import edu.kis.powp.jobs2d.Job2dDriver;

import java.awt.*;

import static edu.kis.powp.jobs2d.features.DrawerFeature.getDrawerController;

public class EditableLineAdapter extends DrawPanelController implements Job2dDriver{
    private int startX = 0, startY = 0;

    public EditableLineAdapter() {
        super();
    }

    @Override
    public void setPosition(int x, int y) {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void operateTo(int x, int y) {
        EditableLine line = new EditableLine();
        line.setColor(Color.MAGENTA);
        line.setStartCoordinates(this.startX, this.startY);
        line.setEndCoordinates(x, y);


        getDrawerController().drawLine(line);

        setPosition(x, y);
    }

    @Override
    public String toString() {
        return "editableLine";
    }
}

