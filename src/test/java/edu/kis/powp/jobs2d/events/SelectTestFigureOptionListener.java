package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
        private int scriptNo;

	public SelectTestFigureOptionListener(DriverManager driverManager, int scriptNo) {
		this.driverManager = driverManager;
                this.scriptNo=scriptNo;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
            if(scriptNo==0)
		FiguresJoe.figureScript1(driverManager.getCurrentDriver());
            else if(scriptNo==1)
                FiguresJoe.figureScript2(driverManager.getCurrentDriver());
	}
}
