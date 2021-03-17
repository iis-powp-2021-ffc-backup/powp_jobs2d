package edu.kis.powp.command;
import edu.kis.powp.jobs2d.drivers.adapter.LineDrawerAdapter;

public class SetPositionCommand implements DriverCommand{
    private final LineDrawerAdapter adapter;
    private final int x;
    private final int y;

    public SetPositionCommand(int x, int y) {
        this.x = x;
        this.y = y;
        adapter = new LineDrawerAdapter();
    }

    @Override
    public void execute() {
        adapter.setPosition(x, y);
    }
}
