package edu.kis.powp.jobs2d.features;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.appbase.Application;
import edu.kis.powp.jobs2d.lines.AdjustableLine;

import java.awt.*;

public class LineFeature {

    public static final float[] THICKNESSES = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 7.0f, 10.0f};
    public static final Color[] COLORS = {Color.BLACK, Color.BLUE, Color.RED, Color.CYAN, Color.GREEN, Color.PINK};
    public static final String[] COLORS_NAMES = {"Black", "Blue", "Red", "Cyan", "Green", "Pink"};

    private static AdjustableLine line = new AdjustableLine();

    public static void setupLineFeature(Application application) {
        application.addComponentMenu(Color.class, "Line color", 0);
        application.addComponentMenu(Float.class, "Line thickness", 0);
        application.addComponentMenu(Boolean.class, "Line dotted", 0);
        application.addComponentMenu(String.class, "Line presets", 0);

        application.addComponentMenuElement(Boolean.class, "True", e -> line.setDotted(true));
        application.addComponentMenuElement(Boolean.class, "False", e -> line.setDotted(false));

        for (float thickness : THICKNESSES) {
            application.addComponentMenuElement(Float.class, "" + thickness, e -> line.setThickness(thickness));
        }

        for(int i=0; i<COLORS.length; i++) {
            String name = COLORS_NAMES[i];
            Color color = COLORS[i];
            application.addComponentMenuElement(Color.class, name, e -> line.setColor(color));
        }

        application.addComponentMenuElement(String.class, "Basic", e -> line.setStyleLike(LineFactory.getBasicLine()));
        application.addComponentMenuElement(String.class, "Dotted", e -> line.setStyleLike(LineFactory.getDottedLine()));
        application.addComponentMenuElement(String.class, "Special", e -> line.setStyleLike(LineFactory.getSpecialLine()));
    }

    public static ILine getLine() {
        return line;
    }
}
