package com.bridgeit.log;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LoggingExample {

	static Logger logger = Logger.getLogger(com.bridgeit.log.LoggingExample.class.getName());

	public static void main(String[] args) {

		try {
			LogManager.getLogManager().readConfiguration(
					new FileInputStream("/home/bridgelabz/JavaWorkspace/JavaLogging/src/com/bridgeit/log/file1.txt"));
		} catch (SecurityException | IOException e) {
			e.printStackTrace();
		}

		logger.setLevel(Level.FINE);
		logger.addHandler(new ConsoleHandler());
		// adding custom handler to receive logging msg
		logger.addHandler(new MyHandler());
		try {
			// FileHandler file name with max size and number of log files limit
			Handler fileHandler = new FileHandler(
					"/home/bridgelabz/JavaWorkspace/JavaLogging/src/com/bridgeit/log/file1.txt", 10, 5);

			fileHandler.setFormatter(new MyFormatter());

			// Set a Filter to control output on this Handler.
			fileHandler.setFilter(new MyFilter());
			logger.addHandler(fileHandler);

			for (int i = 0; i < 10; i++) {
				// logging messages
				logger.log(Level.INFO, "Msg" + i);
			}
			logger.log(Level.CONFIG, "Config data");
		} catch (SecurityException | IOException e) {
			e.printStackTrace();
		}
	}
}
