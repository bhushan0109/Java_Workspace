package com.bridgeit.logger;

import java.util.logging.Logger;

public class Log4JExample {

	static Logger logger = Logger.getLogger(Log4JExample.class.getName());

	public static void main(String args[]) {
		logger.info("This is info msg..");
		logger.warning("This is warning.!");

	}
}
