package edu.kis.powp.command;
import edu.kis.powp.jobs2d.Job2dDriver;

public class DriverCommandTest
{
    private static Job2dDriver driver = new StubDriver();


    public static void main(String[] args)
    {
        SetPositionCommand setPositionCommand = new SetPositionCommand(0,0);
        OperateToCommand operateToCommand = new OperateToCommand(7,7);
        setPositionCommand.execute(driver);
        operateToCommand.execute(driver);
    }

    private static class StubDriver implements Job2dDriver
    {
        @Override
        public void setPosition(int x, int y)
        {
            System.out.println("Driver setPosition x: " + x +" and y:"+ y);
        }

        @Override
        public void operateTo(int x, int y)
        {
            System.out.println("Driver operateTo x: " + x +" and y:"+ y);
        }


    };
}