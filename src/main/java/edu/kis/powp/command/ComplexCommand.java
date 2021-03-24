package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;
import java.util.List;


public class ComplexCommand implements DriverCommand{

    private List <DriverCommand> lista;
    
    ComplexCommand(List <DriverCommand> lista)
    {
        this.lista=lista;
    }
    
    @Override
    public void execute(Job2dDriver job2ddriver) {
        for(int i=0; i< lista.size();i++){
            lista.get(i).execute(job2ddriver);
        }
    }

    
}
