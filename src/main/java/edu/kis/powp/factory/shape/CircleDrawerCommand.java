package edu.kis.powp.factory.shape;

import java.util.ArrayList;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;

public class CircleDrawerCommand implements ShapeCommand{
    private int radius;

    public CircleDrawerCommand(int radius){
        this.radius = radius;
    }

    @Override
    public ComplexCommand getCommand(){
        ComplexCommand command = new ComplexCommand();
        ArrayList<Double> theta = new ArrayList<>();
        for(double i = 0; i < Math.PI * 2; i += (Math.PI * 2) / 100.0)
            theta.add(i);
        
        double r = Math.sqrt(radius);

        int a = (int) (r * Math.cos(theta.get(0)) );
        int b = (int) (r * Math.sin(theta.get(0)) );
        command.addCommand( new SetPositionCommand(a, b) );

        for(Double x : theta){
            a = (int)(r * Math.cos(x));
            b = (int)(r * Math.sin(x));
            command.addCommand( new OperateToCommand( a, b ) );
        }
        return command;
    }


}