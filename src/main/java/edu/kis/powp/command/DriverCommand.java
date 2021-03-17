package edu.kis.powp.command;

interface DriverCommand {
    void execute();
}

class SetPositionCommand implements DriverCommand{
    private int x, y;

    @Override
    public void execute() {

    }
}

class OperateToCommand implements DriverCommand{
    private int x, y;

    @Override
    public void execute() {

    }
}
