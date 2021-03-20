package edu.kis.powp.jobs2d.drawer;

import edu.kis.powp.command.FiguresCommandFactory;
import edu.kis.powp.command.IDriverCommand;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class DrawerFactory {
    public static IFigureDrawer getBoxDrawer() {
        return new BoxDrawer();
    }

    public static IFigureDrawer getDoodleDrawer() {
        return new DoodleDrawer();
    }

    public static IFigureDrawer getJaneDrawer() {
        return new JaneDrawer();
    }

    public static IFigureDrawer getSquareDrawer() {
        return new SquareDrawer();
    }

    public static IFigureDrawer getTriangleDrawer() {
        return new TriangleDrawer();
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

    private static class JaneDrawer implements IFigureDrawer {
        @Override
        public void drawFigure(Job2dDriver driver) {
            AbstractDrawerAdapter adapter = new AbstractDrawerAdapter(driver);
            FiguresJane.figureScript(adapter);
        }
    }

    private static class SquareDrawer implements IFigureDrawer {
        @Override
        public void drawFigure(Job2dDriver driver) {
            IDriverCommand squareCommand = FiguresCommandFactory.GetCommandForSquare(100);
            squareCommand.executeOn(driver);
        }
    }

    private static class TriangleDrawer implements IFigureDrawer {
        @Override
        public void drawFigure(Job2dDriver driver) {
            IDriverCommand squareCommand = FiguresCommandFactory.GetCommandForRightTriangle(100);
            squareCommand.executeOn(driver);
        }
    }
}
