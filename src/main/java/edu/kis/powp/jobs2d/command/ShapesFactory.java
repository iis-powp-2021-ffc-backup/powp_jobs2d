package edu.kis.powp.jobs2d.command;


public class ShapesFactory {

    public DriverCommand getDiamond(){
        return new ComplexCommand.CommandBulider()
                .add(new SetPositionCommand(-100, 0))
                .add(new OperateToCommand(0, 100))
                .add(new OperateToCommand(100, 0))
                .add(new OperateToCommand(0, -100))
                .add(new OperateToCommand(-100, 0))
                .bulid();
    }

    public DriverCommand getRectangle(){
        return new ComplexCommand.CommandBulider()
                .add(new SetPositionCommand(-100, 0))
                .add(new OperateToCommand(-100, 100))
                .add(new OperateToCommand(100, 100))
                .add(new OperateToCommand(100, 0))
                .add(new OperateToCommand(-100, 0))
                .bulid();
    }

    public DriverCommand getTriangle(){

        return new ComplexCommand.CommandBulider()
                .add(new SetPositionCommand(-100, 0))
                .add(new OperateToCommand(100, 0))
                .add(new OperateToCommand(-50, 100))
                .add(new OperateToCommand(-100, 0))
                .bulid();
    }



}
