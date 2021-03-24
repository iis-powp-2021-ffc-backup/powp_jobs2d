package edu.kis.powp.jobs2d;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.kis.powp.appbase.Application;
import edu.kis.powp.jobs2d.drivers.adapter.LineDrawerAdapter;
import edu.kis.powp.jobs2d.drivers.adapter.PanelDrawerAdapter;
import edu.kis.powp.jobs2d.events.*;
import edu.kis.powp.jobs2d.features.DrawerFeature;
import edu.kis.powp.jobs2d.features.DriverFeature;
import edu.kis.powp.jobs2d.features.LineFeature;

public class TestJobs2dPatterns {
	private final static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	/**
	 * Setup test concerning preset figures in context.
	 * 
	 * @param application Application context.
	 */
	private static void setupPresetTests(Application application) {
		AbstractSelectTestFigureOptionListener Joe1TestFigureOptionListener = new Joe1SelectTestFigureOptionListener(
				DriverFeature.getDriverManager());
		AbstractSelectTestFigureOptionListener Joe2TestFigureOptionListener = new Joe2SelectTestFigureOptionListener(
				DriverFeature.getDriverManager());
		AbstractSelectTestFigureOptionListener JaneTestFigureOptionListener = new JaneSelectTestFigureOptionListener(
				DriverFeature.getDriverManager());
		AbstractSelectTestFigureOptionListener rectangleTestFigureOptionListener = new RectangleTestFigureOptionListener(
				DriverFeature.getDriverManager());
		AbstractSelectTestFigureOptionListener triangleTestFigureOptionListener = new TriangleTestFigureOptionListener(
				DriverFeature.getDriverManager());
		AbstractSelectTestFigureOptionListener joe1CaptureSelectTestFigureOptionListener = new Joe1CaptureSelectTestFigureOptionListener(
				DriverFeature.getDriverManager());

		application.addTest("Figure Joe 1", Joe1TestFigureOptionListener);
		application.addTest("Figure Joe 2", Joe2TestFigureOptionListener);
		application.addTest("Figure Jane", JaneTestFigureOptionListener);
		application.addTest("Rectangle shape", rectangleTestFigureOptionListener);
		application.addTest("Triangle shape", triangleTestFigureOptionListener);
		application.addTest("Capture Figure Joe 1", joe1CaptureSelectTestFigureOptionListener);
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

		Job2dDriver panelDrawerDriver = new PanelDrawerAdapter();
		DriverFeature.addDriver("Panel Drawer Simulator", panelDrawerDriver);

		Job2dDriver lineDrawerDriver = new LineDrawerAdapter();
		DriverFeature.addDriver("Line Drawer Simulator", lineDrawerDriver);

		DriverFeature.updateDriverInfo();
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
				LineFeature.setupLineFeature(app);

				DriverFeature.setupDriverPlugin(app);
				setupDrivers(app);
				setupPresetTests(app);
				setupLogger(app);

				app.setVisibility(true);
			}
		});
	}

}
