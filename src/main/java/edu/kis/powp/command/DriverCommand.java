package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.LoggerDriver;

public interface DriverCommand {
     void execute(Job2dDriver driver);
}
