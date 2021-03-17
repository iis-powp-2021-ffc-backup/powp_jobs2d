package edu.kis.powp.command;

import java.util.ArrayList;

public class ComplexCommand implements DriverCommand {
  private ArrayList<DriverCommand> commands;

  ComplexCommand(DriverCommand ..._commands) {
    for (DriverCommand command : _commands) {
      commands.add(command);
    }
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