package edu.kis.powp.jobs2d.factory;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

public class FiguresFactory {

    public static DriverCommand rectangle(Job2dDriver job2dDriver){
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.addCommand(new SetPositionCommand(-20,-40,job2dDriver));
        complexCommand.addCommand(new OperateToCommand(-20,40,job2dDriver));
        complexCommand.addCommand(new OperateToCommand(20,40,job2dDriver));
        complexCommand.addCommand(new OperateToCommand(-20,40,job2dDriver));
        complexCommand.addCommand(new OperateToCommand(-20,-40,job2dDriver));
        return complexCommand;
    }

    public static DriverCommand triangle(Job2dDriver job2dDriver){
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.addCommand(new SetPositionCommand(-20,0,job2dDriver));
        complexCommand.addCommand(new OperateToCommand(20,0,job2dDriver));
        complexCommand.addCommand(new OperateToCommand(0,20,job2dDriver));
        return complexCommand;
    }

}
