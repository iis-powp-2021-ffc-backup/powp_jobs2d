package edu.kis.powp.command;

import java.util.ArrayList;
import java.util.List;

public class CommandFactory{
    
    public static List<DriverCommand> prostokat() {
        List<DriverCommand> lista = new ArrayList<DriverCommand>();
        lista.add(new SetPositionCommand(100,200));
        lista.add(new OperateToCommand(100,-200));
        lista.add(new OperateToCommand(-100,-200));
        lista.add(new OperateToCommand(-100,200));
        lista.add(new OperateToCommand(100, 200));
        return lista;
    }
    
    public static List<DriverCommand> trojkat() {
        List<DriverCommand> lista = new ArrayList<DriverCommand>();
        lista.add(new SetPositionCommand(100,100));
        lista.add(new OperateToCommand(-100,100));
        lista.add(new OperateToCommand(0,-100));
        lista.add(new OperateToCommand(100, 100));
        return lista;
    }
}
