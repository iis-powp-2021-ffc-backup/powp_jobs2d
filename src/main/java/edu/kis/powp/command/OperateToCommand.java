package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand{
	private int x, y;
	private Job2dDriver driver;
	
	OperateToCommand(int x, int y, Job2dDriver d){
		this.x = x;
		this.y = y;
		driver = d;
	}

	@Override public void execute() {
		driver.operateTo(x, y);
	}
}
