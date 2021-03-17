package edu.kis.powp.command;
import edu.kis.powp.jobs2d.Job2dDriver;

public class ShapeFactory {
  
  public static ComplexCommand getTriangle(Job2dDriver driver) {
    return new ComplexCommand(
      new SetPositionCommand(driver, 0, 0),
      new OperateToCommand(driver, 100, 100),
      new OperateToCommand(driver, 100, -100),
      new OperateToCommand(driver, 0, 0)
    );
  }

  public static ComplexCommand getRectangle(Job2dDriver driver) {
    return new ComplexCommand(
      new SetPositionCommand(driver, -100, -100),
      new OperateToCommand(driver, 100, -100),
      new OperateToCommand(driver, 100, 100),
      new OperateToCommand(driver, -100, 100),
      new OperateToCommand(driver, -100, -100)
    );
  }
}