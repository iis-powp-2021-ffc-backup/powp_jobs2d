package edu.kis.powp.factory;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.jobs2d.Job2dDriver;

public class FigureFactory {

    public static DriverCommand square(Job2dDriver job2dDriver){
        ComplexCommand command = new ComplexCommand();
        command.queueCommand(new SetPositionCommand(0,0,job2dDriver));
        command.queueCommand(new OperateToCommand(0,50,job2dDriver));
        command.queueCommand(new OperateToCommand(50,50,job2dDriver));
        command.queueCommand(new OperateToCommand(50,0,job2dDriver));
        command.queueCommand(new OperateToCommand(0,0,job2dDriver));

        return command;
    }

    public static DriverCommand rectangle(Job2dDriver job2dDriver){
        ComplexCommand command = new ComplexCommand();
        command.queueCommand(new SetPositionCommand(0,0,job2dDriver));
        command.queueCommand(new OperateToCommand(0,80,job2dDriver));
        command.queueCommand(new OperateToCommand(50,80,job2dDriver));
        command.queueCommand(new OperateToCommand(50,0,job2dDriver));
        command.queueCommand(new OperateToCommand(0,0,job2dDriver));

        return command;
    }

    public static DriverCommand cross(Job2dDriver job2dDriver){
        ComplexCommand command = new ComplexCommand();
        command.queueCommand(new SetPositionCommand(0,0,job2dDriver));
        command.queueCommand(new OperateToCommand(0,80,job2dDriver));
        command.queueCommand(new SetPositionCommand(0,60,job2dDriver));
        command.queueCommand(new OperateToCommand(40,60,job2dDriver));
        command.queueCommand(new SetPositionCommand(0,60,job2dDriver));
        command.queueCommand(new OperateToCommand(-40,60,job2dDriver));


        return command;
    }
}
