package edu.kis.powp.command;

import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.SetPositionCommand;

public class ShapesFactories {


    public static ComplexCommand drawRectangle(int x, int y, int off1, int off2)
    {
        ComplexCommand comm = new ComplexCommand();

        comm.add(new SetPositionCommand(x, y));
        comm.add(new OperateToCommand(x+off1, y));
        comm.add(new OperateToCommand(x+off1, y+off2));
        comm.add(new OperateToCommand(x, y+off2));
        comm.add(new OperateToCommand(x, y));

        return comm;
    }


    public static ComplexCommand drawTriangle(int x, int y, int off1, int off2)
    {
        ComplexCommand comm = new ComplexCommand();

        comm.add(new SetPositionCommand(x, y));
        comm.add(new OperateToCommand(x, y+off1));
        comm.add(new OperateToCommand(x+off2, y+off1));
        comm.add(new OperateToCommand(x, y));

        return comm;
    }

    public static ComplexCommand drawSquare(int x, int y, int off1, int off2)
    {

        ComplexCommand comm = new ComplexCommand();

        comm.add(new SetPositionCommand(x, y));
        comm.add(new OperateToCommand(x+off1, y));
        comm.add(new OperateToCommand(x+off1, y+off1));
        comm.add(new OperateToCommand(x, y+off1));
        comm.add(new OperateToCommand(x, y));

        return comm;
    }





}
