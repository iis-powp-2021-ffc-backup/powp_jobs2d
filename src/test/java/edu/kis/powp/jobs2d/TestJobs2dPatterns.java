package edu.kis.powp.jobs2d;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.kis.legacy.drawer.panel.DefaultDrawerFrame;
import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.powp.appbase.Application;
import edu.kis.powp.factory.FigureTypes;
import edu.kis.powp.jobs2d.drivers.adapter.DrawerAdapter;
import edu.kis.powp.jobs2d.drivers.adapter.LineDrawerAdapter;
import edu.kis.powp.jobs2d.events.SelectChangeVisibleOptionListener;
import edu.kis.powp.jobs2d.events.SelectTestFigureOptionListener;
import edu.kis.powp.jobs2d.features.DrawerFeature;
import edu.kis.powp.jobs2d.features.DriverFeature;

public class TestJobs2dPatterns {
	private final static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	/**
	 * Setup test concerning preset figures in context.
	 * 
	 * @param application Application context.
	 */
	private static void setupPresetTests(Application application) {

		Map<String, FigureTypes> tests = new LinkedHashMap<>();
		tests.put("Figure Joe 1", FigureTypes.JOE_1);
		tests.put("Figure Joe 2", FigureTypes.JOE_2);
		tests.put("Figure Jane", FigureTypes.JANE);
		tests.put("Circle", FigureTypes.CIRCLE);
		tests.put("Rectangle", FigureTypes.RECTANGLE);
		tests.put("Triangle", FigureTypes.TRIANGLE);
		tests.put("Quadrilateral", FigureTypes.QUADRILATERAL);

		tests.forEach((name, type) -> application.addTest(
				name, new SelectTestFigureOptionListener(DriverFeature.getDriverManager(), type))
		);
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

		Job2dDriver variousLineDriver = new LineDrawerAdapter();
		DriverFeature.addDriver("Various line drawer", variousLineDriver);

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
	 * Set Up line properties for LineDrawerAdapter
	 * @param application Application context.
	 */
	private static void setupLineMenu(Application application) {
		application.addComponentMenu(LineDrawerAdapter.class, "Line properties");
		application.addComponentMenuElement(LineDrawerAdapter.class, "Basic", (ActionEvent e) -> LineDrawerAdapter.setLineType(e.getActionCommand()));
		application.addComponentMenuElement(LineDrawerAdapter.class, "Dotted", (ActionEvent e) -> LineDrawerAdapter.setLineType(e.getActionCommand()));
		application.addComponentMenuElement(LineDrawerAdapter.class, "Special", (ActionEvent e) -> LineDrawerAdapter.setLineType(e.getActionCommand()));
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				Application app = new Application("2d jobs Visio");
				DrawerFeature.setupDrawerPlugin(app);
				setupDefaultDrawerVisibilityManagement(app);

				DriverFeature.setupDriverPlugin(app);
				setupDrivers(app);
				setupPresetTests(app);
				setupLogger(app);
				setupLineMenu(app);

				app.setVisibility(true);
			}
		});
	}
}
