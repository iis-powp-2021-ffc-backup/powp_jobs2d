package edu.kis.powp.command;
import edu.kis.powp.jobs2d.Job2dDriver;

public class ShapeFactory {
  
  public static ComplexCommand getRectangle(Job2dDriver driver) {
    return new ComplexCommand(
      new SetPositionCommand(driver, -120, 120),
      new OperateToCommand(driver, 120, -120),
      new OperateToCommand(driver, 120, -120),
      new OperateToCommand(driver, 120, 120),
      new OperateToCommand(driver, -120, 120),
      new OperateToCommand(driver, -120, -120),
      new OperateToCommand(driver, 120, 120),
      new SetPositionCommand(driver, 120, -120),
      new OperateToCommand(driver, -120, 120)
    );
  }
}