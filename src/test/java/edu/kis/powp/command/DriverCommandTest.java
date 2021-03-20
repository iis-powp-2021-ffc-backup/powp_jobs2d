package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class DriverCommandTest {
	public static void main(String[] args) {
		Job2dDriver driver = new StubDriver();
		IDriverCommand resetPositionCommand = new SetPositionCommand(0,0);
		IDriverCommand operateToCommand = new OperateToCommand(100,100);

		resetPositionCommand.executeOn(driver);
		operateToCommand.executeOn(driver);
		resetPositionCommand.executeOn(driver);
	}
}
