package edu.kis.powp.command;
import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand {
  private int x;
  private int y;

  private Job2dDriver driver;

  SetPositionCommand(Job2dDriver _driver, int _x, int _y) {
    this.x = _x;
    this.y = _y;
    this.driver = _driver;
  }
  public void execute() {
    driver.setPosition(x, y);
  } 
}