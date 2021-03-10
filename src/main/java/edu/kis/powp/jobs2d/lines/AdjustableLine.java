package edu.kis.powp.jobs2d.lines;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.line.AbstractLine;

import java.awt.*;

public class AdjustableLine extends AbstractLine {

    public void setDotted(boolean dotted) {
        this.dotted = dotted;
    }

    public void setThickness(float thickness) {
        this.thickness = thickness;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setStyleLike(ILine other) {
        dotted = other.isDotted();
        thickness = other.getThickness();
        color = other.getColor();
    }
}
