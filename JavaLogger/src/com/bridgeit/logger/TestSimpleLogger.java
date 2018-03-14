package com.bridgeit.logger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TestSimpleLogger {

	static Logger logger = Logger.getLogger(com.bridgeit.logger.TestSimpleLogger.class.getName());

	public static void main(String[] args) {
		logger.info("Logging begins..");
		try {
			throw new Exception("Simulating an Exception.. ");
		} catch (Exception ex) {

			logger.log(Level.SEVERE, ex.getMessage());
		}
		logger.info("Done..");
	}
}
