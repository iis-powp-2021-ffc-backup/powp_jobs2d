package edu.kis.powp.command;

import java.util.ArrayList;
import java.util.List;

import edu.kis.powp.jobs2d.Job2dDriver;

public class ComplexShape implements DriverCommand {
  public enum ShapeType {
    TRIANGLE, RECTANGLE
  };

  private List<ComplexCommand> shapes = new ArrayList<>();
  private Job2dDriver driver;

  public ComplexShape(Job2dDriver _driver, ShapeType ...shapeTypes) {
    this.driver = _driver;
    addShapes(shapeTypes);
  }

  public void addShapes(ShapeType ...shapeTypes) {
    for (ShapeType type : shapeTypes) {
      switch (type) {
        case TRIANGLE:
          shapes.add(ShapeFactory.getTriangle(driver));
          break;
        case RECTANGLE:
          shapes.add(ShapeFactory.getRectangle(driver));
          break;
      }
    }
  }

  public void execute() {
    for (ComplexCommand shape : shapes) {
      shape.execute();
    }
  }
}