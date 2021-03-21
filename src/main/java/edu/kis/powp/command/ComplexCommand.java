package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;
import java.util.LinkedList;

public class ComplexCommand implements DriverCommand{

    private Job2dDriver job2dDriver;
    private LinkedList<DriverCommand> list;

    public ComplexCommand(LinkedList<DriverCommand> list, Job2dDriver job2dDriver){
        this.job2dDriver = job2dDriver;
        this.list = list;
    }

    private ComplexCommand() {}

    @Override
    public void execute() {
        list.forEach(command -> command.execute());
    }

    public static final class Builder{
        private LinkedList<DriverCommand> list = new LinkedList<>();
        private Job2dDriver job2dDriver;

        public Builder addCommand(DriverCommand command){
            list.add(command);
            return this;
        }

        public Builder setJob2dDriver(Job2dDriver job2dDriver){
            this.job2dDriver = job2dDriver;
            return this;
        }

        public ComplexCommand build(){
            ComplexCommand complexCommand = new ComplexCommand();

            if(job2dDriver == null)
                throw new IllegalStateException("job2dDriver cannot be empty");
            if(list.size()==0)
                throw new IllegalStateException("CommandList cannot be empty");

            complexCommand.list = this.list;
            complexCommand.job2dDriver = this.job2dDriver;
            return complexCommand;
        }
    }
}
