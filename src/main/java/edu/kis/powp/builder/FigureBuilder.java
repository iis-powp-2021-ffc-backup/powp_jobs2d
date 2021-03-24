package edu.kis.powp.builder;

import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.composer.ComplexCommand;

import java.util.LinkedList;
import java.util.List;

public final class FigureBuilder {
    private final List<DriverCommand> commands = new LinkedList<>();

    public FigureBuilder addCommand(DriverCommand command) {
        commands.add(command);
        return this;
    }

    public ComplexCommand build() {
        return new ComplexCommand(commands);
    }
}
