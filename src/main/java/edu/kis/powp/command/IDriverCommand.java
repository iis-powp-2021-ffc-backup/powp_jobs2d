package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public interface IDriverCommand {
    void executeOn(Job2dDriver driver);
}