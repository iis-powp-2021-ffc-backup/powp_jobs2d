package edu.kis.powp.command;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand {
  private List<DriverCommand> commands = new ArrayList<>();

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