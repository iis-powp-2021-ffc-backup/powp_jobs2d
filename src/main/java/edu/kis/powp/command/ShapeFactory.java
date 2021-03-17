package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class ShapeFactory{
	public static void drawSquare(Job2dDriver driver){
		ComplexCommand complex = new ComplexCommand();
		complex.addCommand(new SetPositionCommand(20, 20, driver));
		complex.addCommand(new OperateToCommand(30, 20, driver));
		complex.addCommand(new OperateToCommand(30, 30, driver));
		complex.addCommand(new OperateToCommand(20, 30, driver));
		complex.addCommand(new OperateToCommand(20, 20, driver));
		complex.execute();
	}
	public static void drawTriangle(Job2dDriver driver){
		ComplexCommand complex = new ComplexCommand();
		complex.addCommand(new SetPositionCommand(20, 20, driver));
		complex.addCommand(new OperateToCommand(30, 20, driver));
		complex.addCommand(new OperateToCommand(30, 30, driver));
		complex.addCommand(new OperateToCommand(20, 20, driver));
		complex.execute();
	}
}