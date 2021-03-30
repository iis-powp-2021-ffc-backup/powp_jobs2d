package edu.kis.powp.command;

public class ComplexCommandFactory {

    /**
     * A bit inaccurate representation of Shield of David.
     */

    public static DriverCommand createDavidShield(){
        ComplexCommand star = new ComplexCommand();
        star.add(new SetPositionCommand(-50,30));
        star.add(new OperateToCommand(50,30));
        star.add(new OperateToCommand(0,-50));
        star.add(new OperateToCommand(-50,30));
        star.add(new SetPositionCommand(-50,-30));
        star.add(new OperateToCommand(50,-30));
        star.add(new OperateToCommand(0,50));
        star.add(new OperateToCommand(-50,-30));
        return star;
    }

    /**
     * Cube (isometric view).
     */

    public static DriverCommand createCube(){
        ComplexCommand cube = new ComplexCommand();
        cube.add(new SetPositionCommand(50,-50));
        cube.add(new OperateToCommand(-50,-50));
        cube.add(new OperateToCommand(-50,50));
        cube.add(new OperateToCommand(50,50));
        cube.add(new OperateToCommand(50,-50));
        cube.add(new OperateToCommand(100,0));
        cube.add(new OperateToCommand(100,100));
        cube.add(new OperateToCommand(50,50));
        cube.add(new SetPositionCommand(-50,50));
        cube.add(new OperateToCommand(0,100));
        cube.add(new OperateToCommand(100,100));
        return cube;
    }
}
