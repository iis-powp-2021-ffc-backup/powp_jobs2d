package edu.kis.powp.command;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand{
	List<DriverCommand> list;

	ComplexCommand(){
		list = new ArrayList<DriverCommand>();
	}
	void addCommand(DriverCommand c){
		list.add(c);
	}
	void clearCommands(){
		list.clear();
	}

	@Override public void execute(){
		for(DriverCommand c : list) c.execute();
		clearCommands();
	}	
}