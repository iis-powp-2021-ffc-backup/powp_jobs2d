package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.List;

public class ComplexCommand implements DriverCommand
{
    private List<DriverCommand> instructions;

    public ComplexCommand(List<DriverCommand> instructions)
    {
        this.instructions = instructions;
    }

    @Override
    public void execute(Job2dDriver driver)
    {
        for (DriverCommand instruction : instructions)
        {
            instruction.execute(driver);
        }
    }
}
