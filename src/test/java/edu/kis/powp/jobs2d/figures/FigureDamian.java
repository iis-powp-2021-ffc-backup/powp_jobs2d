package edu.kis.powp.jobs2d.figures;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.commands.OperateToCommand;
import edu.kis.powp.jobs2d.commands.SetPositionCommand;

public class FigureDamian {
    public static void figureScript1(Job2dDriver driver) {
        new SetPositionCommand(-120, -120).execute(driver);
        new OperateToCommand(-120, -120).execute(driver);
        new OperateToCommand(120, -120).execute(driver);
        new OperateToCommand(120, 120).execute(driver);
        new OperateToCommand(-120, 120).execute(driver);
        new OperateToCommand(-50, -120).execute(driver);
    }
}
