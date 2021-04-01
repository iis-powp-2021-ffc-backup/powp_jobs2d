package edu.kis.powp.jobs2d.commands;
import edu.kis.powp.jobs2d.Job2dDriver;

public class FigureFactory {
	public static enum Shapes {
		RECTANGLE, LINE, TRIANGLE
	}
	
	private Shapes shape;
	private int size;
	private Job2dDriver driver;
	
	public FigureFactory(Shapes shape, int size, Job2dDriver driver) {
		this.shape = shape;
		this.size = size;
		this.driver = driver;
	}
	
	private ComplexCommand getRectangle() {
		ComplexCommand cc = new ComplexCommand();
		cc.addCommand(new SetPositionCommand(size, size, driver));
		cc.addCommand(new OperateToCommand(size, -size, driver));
		cc.addCommand(new OperateToCommand(-size, -size, driver));
		cc.addCommand(new OperateToCommand(-size, size, driver));
		cc.addCommand(new OperateToCommand(size, size, driver));
		return cc;		
	}
	
	private ComplexCommand getTriangle() {
		ComplexCommand cc = new ComplexCommand();
		cc.addCommand(new SetPositionCommand(0, 0, driver));
		cc.addCommand(new OperateToCommand(size, -size, driver));
		cc.addCommand(new OperateToCommand(-size, -size, driver));
		cc.addCommand(new OperateToCommand(0, 0, driver));
		return cc;
	}
	
	private ComplexCommand getLine() {
		ComplexCommand cc = new ComplexCommand();
		cc.addCommand(new SetPositionCommand(size, 0, driver));
		cc.addCommand(new OperateToCommand(-size, 0, driver));
		return cc;
	}
	public ComplexCommand getCommand() {
		if(shape==Shapes.RECTANGLE) return getRectangle();
		if(shape==Shapes.LINE) return getLine();
		if(shape==Shapes.TRIANGLE) return getTriangle();
		return new ComplexCommand();
	}
	

}
