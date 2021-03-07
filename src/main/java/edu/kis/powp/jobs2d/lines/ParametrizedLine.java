package edu.kis.powp.jobs2d.lines;

import edu.kis.legacy.drawer.shape.line.AbstractLine;

import java.awt.*;

public class ParametrizedLine extends AbstractLine {
    public ParametrizedLine(Color color, float thickness, boolean isDotted) {
        this.color = color;
        this.thickness = thickness;
        this.dotted = isDotted;
    }
}
