package edu.kis.powp.command;

import java.util.ArrayList;

public class ComplexCommand implements DriverCommand {
  private ArrayList<DriverCommand> commands;

  public ComplexCommand(DriverCommand ..._commands) {
    addCommands(_commands);
  }

  public void addCommands(DriverCommand ..._commands) {
    for (DriverCommand command : _commands) {
      commands.add(command);
    }
  }

  public void execute() {
    for (DriverCommand command : commands) {
      command.execute();
    }
  }
}