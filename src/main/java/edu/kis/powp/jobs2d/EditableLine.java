package edu.kis.powp.jobs2d;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.line.AbstractLine;

import java.awt.*;

public class EditableLine extends AbstractLine {
    public EditableLine() {
        this.color = Color.GREEN;
        this.thickness = 3.0F;
        this.dotted = false;
    }

    public void setColor(Color color){
        this.color=color;
    }

    public void setThickness(float thickness){
        this.thickness=thickness;
    }

}
