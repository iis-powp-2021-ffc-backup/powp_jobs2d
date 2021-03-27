package edu.kis.powp.jobs2d;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.kis.legacy.drawer.panel.DefaultDrawerFrame;
import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.powp.appbase.Application;
import edu.kis.powp.jobs2d.drivers.adapter.DrawerAdapter;
import edu.kis.powp.jobs2d.drivers.adapter.JaneDrawerAdapter;
import edu.kis.powp.jobs2d.drivers.adapter.LineDrawerAdapter;
import edu.kis.powp.jobs2d.events.*;
import edu.kis.powp.jobs2d.features.DrawerFeature;
import edu.kis.powp.jobs2d.features.DriverFeature;
import edu.kis.powp.command.ShapesFactories;


public class TestJobs2dPatterns {
	private final static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	/**
	 * Setup test concerning preset figures in context.
	 * 
	 * @param application Application context.
	 */
	private static void setupPresetTests(Application application) {
		SelectTestFigureOptionListener selectTestFigureOptionListener = new SelectTestFigureOptionListener(
				DriverFeature.getDriverManager());

		application.addTest("Figure Test", selectTestFigureOptionListener);

		SelectJoe1OptionListener selectJoe1FigureOptionListener = new SelectJoe1OptionListener(
				DriverFeature.getDriverManager());
		application.addTest("Figure Joe 1", selectJoe1FigureOptionListener);

		SelectJoe2OptionListener selectJoe2FigureOptionListener = new SelectJoe2OptionListener(
				DriverFeature.getDriverManager());
		application.addTest("Figure Joe 2", selectJoe2FigureOptionListener);

		SelectJaneOptionListener selectJaneOptionListener = new SelectJaneOptionListener(
				DriverFeature.getDriverManager());
		application.addTest("Figure Jane", selectJaneOptionListener);


		ActionListener rectangle = new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				ShapesFactories.drawRectangle(0,0, 50, 25).execute(DriverFeature.getDriverManager().getCurrentDriver());
			}
		};

		ActionListener square = new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				ShapesFactories.drawSquare(50,50, 50,0).execute(DriverFeature.getDriverManager().getCurrentDriver());
			}
		};

		ActionListener triangle = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				ShapesFactories.drawTriangle(-50,-50, 50, 50).execute(DriverFeature.getDriverManager().getCurrentDriver());
			}
		};


		application.addTest("Rectangle", rectangle);
		application.addTest("Square", square);
		application.addTest("Triangle", triangle);
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

		Job2dDriver specialDriver = new LineDrawerAdapter();
		DriverFeature.addDriver("Line Simulator", specialDriver);

		Job2dDriver janDriver = new JaneDrawerAdapter();
		DriverFeature.addDriver("Jan Driver", janDriver);

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
				//setupDefaultDrawerVisibilityManagement(app);

				DriverFeature.setupDriverPlugin(app);
				setupDrivers(app);
				setupPresetTests(app);
				setupLogger(app);


				app.setVisibility(true);
			}
		});
	}

}
