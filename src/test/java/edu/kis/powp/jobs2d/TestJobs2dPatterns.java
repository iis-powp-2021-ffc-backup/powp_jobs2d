package edu.kis.powp.jobs2d;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.kis.legacy.drawer.panel.DefaultDrawerFrame;
import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.powp.appbase.Application;
import edu.kis.powp.jobs2d.drivers.adapter.LineDrawerAdapter;
import edu.kis.powp.jobs2d.drivers.adapter.DrawerAdapter;
import edu.kis.powp.jobs2d.events.SelectChangeVisibleOptionListener;
import edu.kis.powp.jobs2d.events.SelectTestFigureOptionListener;
import edu.kis.powp.jobs2d.events.TestFigure2OptionListener;
import edu.kis.powp.jobs2d.features.DrawerFeature;
import edu.kis.powp.jobs2d.features.DriverFeature;
import edu.kis.powp.command.Quadrangle;


public class TestJobs2dPatterns {
	private final static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);


	/**
	 * Setup test concerning preset figures in context.
	 * 
	 * @param application Application context.
	 */
	private static void setupPresetTests(Application application) {
		SelectTestFigureOptionListener selectTestFigureOptionListener = new SelectTestFigureOptionListener( DriverFeature.getDriverManager(), Figure.FIGURE1);
		application.addTest("Figure Joe 1", selectTestFigureOptionListener);

		SelectTestFigureOptionListener selectTestFigureOptionListener2 = new SelectTestFigureOptionListener( DriverFeature.getDriverManager(), Figure.FIGURE2);
		application.addTest("Figure Joe 2", selectTestFigureOptionListener2);

		TestFigure2OptionListener listener3 = new TestFigure2OptionListener( DriverFeature.getDriverManager(), Quadrangle.SQUARE);
		application.addTest("Figure SQUARE", listener3);

		TestFigure2OptionListener listener4 = new TestFigure2OptionListener( DriverFeature.getDriverManager(), Quadrangle.RHOMBUS);
		application.addTest("Figure RHOMBUS", listener4);

		TestFigure2OptionListener listener5 = new TestFigure2OptionListener( DriverFeature.getDriverManager(), Quadrangle.CUBE);
		application.addTest("Figure CUBE", listener5);
	}

	/**
	 * Setup driver manager, and set default driver for application.
	 * 
	 * @param application Application context.
	 */
	private static void setupDrivers(Application application) {
		Job2dDriver loggerDriver = new LoggerDriver();
		DriverFeature.addDriver("Logger Driver", loggerDriver);
		DriverFeature.getDriverManager().setCurrentDriver(loggerDriver);

		Job2dDriver testDriver = new DrawerAdapter();
		DriverFeature.addDriver("Buggy Simulator", testDriver);

		LineDrawerAdapter testDriver2 = new LineDrawerAdapter();
		testDriver2.setTypeLine("basic");
		DriverFeature.addDriver("Simulator2 (basic)", testDriver2);

		LineDrawerAdapter testDriver3 = new LineDrawerAdapter();
		testDriver3.setTypeLine("special");
		DriverFeature.addDriver("Simulator2 (special)", testDriver3);

		DriverFeature.updateDriverInfo();
	}

	/**
	 * Auxiliary routines to enable using Buggy Simulator.
	 * 
	 * @param application Application context.
	 */
	private static void setupDefaultDrawerVisibilityManagement(Application application) {
		DefaultDrawerFrame defaultDrawerWindow = DefaultDrawerFrame.getDefaultDrawerFrame();
		application.addComponentMenuElementWithCheckBox(DrawPanelController.class, "Default Drawer Visibility",
				new SelectChangeVisibleOptionListener(defaultDrawerWindow), true);
		defaultDrawerWindow.setVisible(true);
	}

	/**
	 * Setup menu for adjusting logging settings.
	 * 
	 * @param application Application context.
	 */
	private static void setupLogger(Application application) {
		application.addComponentMenu(Logger.class, "Logger", 0);
		application.addComponentMenuElement(Logger.class, "Clear log",
				(ActionEvent e) -> application.flushLoggerOutput());
		application.addComponentMenuElement(Logger.class, "Fine level", (ActionEvent e) -> logger.setLevel(Level.FINE));
		application.addComponentMenuElement(Logger.class, "Info level", (ActionEvent e) -> logger.setLevel(Level.INFO));
		application.addComponentMenuElement(Logger.class, "Warning level",
				(ActionEvent e) -> logger.setLevel(Level.WARNING));
		application.addComponentMenuElement(Logger.class, "Severe level",
				(ActionEvent e) -> logger.setLevel(Level.SEVERE));
		application.addComponentMenuElement(Logger.class, "OFF logging", (ActionEvent e) -> logger.setLevel(Level.OFF));
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				Application app = new Application("2d jobs Visio");
				DrawerFeature.setupDrawerPlugin(app);

				DriverFeature.setupDriverPlugin(app);
				setupDrivers(app);
				setupPresetTests(app);
				setupLogger(app);

				app.setVisibility(true);
			}
		});
	}

}
