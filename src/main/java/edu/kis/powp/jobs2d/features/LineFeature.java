package edu.kis.powp.jobs2d.features;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.appbase.Application;

import java.awt.event.ActionEvent;

public class LineFeature {
    private static ILine line = LineFactory.getSpecialLine();
    private static Application app;

    public static ILine getCurrentLine()
    {
        return line;
    }

    public static void setupLineMenu(Application application) {
        app = application;
        app.addComponentMenu(LineFeature.class, "Lines");
        app.addComponentMenuElement(LineFeature.class, "Dotted",
                (ActionEvent e) -> line = LineFactory.getDottedLine());
        app.addComponentMenuElement(LineFeature.class, "Special",
                (ActionEvent e) -> line = LineFactory.getSpecialLine());
        app.addComponentMenuElement(LineFeature.class, "Basic",
                (ActionEvent e) -> line = LineFactory.getBasicLine());
    }
}
