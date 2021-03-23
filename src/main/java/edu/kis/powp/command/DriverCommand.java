package edu.kis.powp.command;

import edu.kis.powp.jobs2d.drivers.adapter.DefaultJob2dAdapter;

public interface DriverCommand {
    void execute(DefaultJob2dAdapter adapter);
}
