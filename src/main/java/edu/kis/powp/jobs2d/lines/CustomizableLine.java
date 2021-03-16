package edu.kis.powp.jobs2d.lines;

import edu.kis.legacy.drawer.shape.line.AbstractLine;

import java.awt.Color;

public class CustomizableLine extends AbstractLine{
    public CustomizableLine(Color color, float thickness, boolean dotted){
        super();
        this.color = color;
        this.thickness = thickness;
        this.dotted = dotted;
    }
    public CustomizableLine(Color color, float thickness){
        this(color, thickness, false);
    }
    public CustomizableLine(Color color){
        this(color, 3.0f, false);
    }
    public CustomizableLine(){
        this(Color.BLACK, 3.0f, false);
    }

    /**
     * Setter for color
     * @param color - exapme: Color.BLACK, Color.WHITE
     */
    public void setColor(Color color){
        this.color = color;
    }

    /**
     * Setter for thickness
     * @param thickness - float (0, inf)
     */
    public void setThickness(float thickness){
        this.thickness = thickness;
    }

    /**
     * Setter for dotted line (dotted if true)
     * @param dotted - boolean true/false
     */
    public void setDotted(boolean dotted){
        this.dotted = dotted;
    }

}