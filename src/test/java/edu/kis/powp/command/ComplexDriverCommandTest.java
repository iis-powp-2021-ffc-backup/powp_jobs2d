package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class ComplexDriverCommandTest {
    public static void main(String[] args) {
        Job2dDriver driver = new StubDriver();
        IDriverCommand squareCommand = FiguresCommandFactory.GetCommandForSquare(50);

        squareCommand.executeOn(driver);
    }
}
