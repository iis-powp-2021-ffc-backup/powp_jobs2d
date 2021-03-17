package edu.kis.powp.command;
import edu.kis.powp.jobs2d.drivers.adapter.LineDrawerAdapter;

public class OperateToCommand implements DriverCommand{
    private final LineDrawerAdapter adapter;
    private final int x;
    private final int y;

    public OperateToCommand(int x, int y) {
        this.x = x;
        this.y = y;
        adapter = new LineDrawerAdapter();
    }

    @Override
    public void execute() {
        adapter.operateTo(x, y);
    }
}
