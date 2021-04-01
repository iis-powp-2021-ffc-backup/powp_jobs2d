package edu.kis.powp.jobs2d.commands;
import java.util.ArrayList;

public class ComplexCommand implements DriverCommand {
	private ArrayList<DriverCommand> commandList;
	
	ComplexCommand() {
		this.commandList = new ArrayList<DriverCommand>();
	}
	
	ComplexCommand(ArrayList<DriverCommand> commandList) {
		this.commandList = commandList;
	}
	
	public void addCommand(DriverCommand command) {
		commandList.add(command);
	}
	
	@Override
	public void execute() {
		for(DriverCommand command : commandList) {
			command.execute();
		}
	}
}
