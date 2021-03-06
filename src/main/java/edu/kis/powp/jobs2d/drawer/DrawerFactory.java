package edu.kis.powp.jobs2d.drawer;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class DrawerFactory {
    public static IFigureDrawer getBoxDrawer() {
        return new BoxDrawer();
    }

    public static IFigureDrawer getDoodleDrawer() {
        return new DoodleDrawer();
    }

    private static class BoxDrawer implements IFigureDrawer {
        @Override
        public void drawFigure(Job2dDriver driver) {
            FiguresJoe.figureScript1(driver);
        }
    }

    private static class DoodleDrawer implements IFigureDrawer {
        @Override
        public void drawFigure(Job2dDriver driver) {
            FiguresJoe.figureScript2(driver);
        }
    }
}
