package edu.kis.powp.jobs2d.events;

import edu.kis.powp.command.CommandFactory;
import edu.kis.powp.command.ComplexCommand;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
        private int scriptNo;
        
        public final int FIRST = 0;
        public final int SECOND = 1;
        public final int PROSTOKAT = 2;
        public final int TROJKAT = 3;

	public SelectTestFigureOptionListener(DriverManager driverManager, int scriptNo) {
		this.driverManager = driverManager;
                this.scriptNo=scriptNo;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
            if(scriptNo==FIRST)
		FiguresJoe.figureScript1(driverManager.getCurrentDriver());
            else if(scriptNo==SECOND)
                FiguresJoe.figureScript2(driverManager.getCurrentDriver());
            else if(scriptNo==PROSTOKAT){
                ComplexCommand prostokat = new ComplexCommand(CommandFactory.prostokat());
                prostokat.execute(driverManager.getCurrentDriver());
            }
            else if(scriptNo==TROJKAT){
                ComplexCommand trojkat = new ComplexCommand(CommandFactory.trojkat());
                trojkat.execute(driverManager.getCurrentDriver());
            }
	}
}
