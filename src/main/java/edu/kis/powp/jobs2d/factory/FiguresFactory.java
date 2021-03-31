package edu.kis.powp.jobs2d.factory;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

public class FiguresFactory {

    public static DriverCommand rectangle(Job2dDriver job2dDriver){
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.addCommand(new SetPositionCommand(-50,-100,job2dDriver));
        complexCommand.addCommand(new OperateToCommand(-50,100,job2dDriver));
        complexCommand.addCommand(new OperateToCommand(50,100,job2dDriver));
        complexCommand.addCommand(new OperateToCommand(50,-100,job2dDriver));
        complexCommand.addCommand(new OperateToCommand(-50,-100,job2dDriver));
        return complexCommand;
    }

    public static DriverCommand triangle(Job2dDriver job2dDriver){
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.addCommand(new SetPositionCommand(-50,0,job2dDriver));
        complexCommand.addCommand(new OperateToCommand(50,0,job2dDriver));
        complexCommand.addCommand(new OperateToCommand(0,-50,job2dDriver));
        complexCommand.addCommand(new OperateToCommand(-50,0,job2dDriver));
        return complexCommand;
    }

    public static DriverCommand rhombus(Job2dDriver job2dDriver){
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.addCommand(new SetPositionCommand(-50,-50,job2dDriver));
        complexCommand.addCommand(new OperateToCommand(50,-50,job2dDriver));
        complexCommand.addCommand(new OperateToCommand(75,50,job2dDriver));
        complexCommand.addCommand(new OperateToCommand(-25,50,job2dDriver));
        complexCommand.addCommand(new OperateToCommand(-50,-50,job2dDriver));
        return complexCommand;
    }
}
