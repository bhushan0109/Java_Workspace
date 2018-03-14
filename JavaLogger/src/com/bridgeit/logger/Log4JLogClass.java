package com.bridgeit.logger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Log4JLogClass {

	static Logger logger = Logger.getLogger(Log4JLogClass.class.getName());

	public static void main(String args[]) {
		logger.warning("Log a WARNING message,If the logger is currently enabled"
				+ " for the WARNING message level then the given message is "
				+ "forwarded to all the" + " registered output Handler objects.!");

		logger.info("Log an INFO message,If the logger is currently "
				+ "enabled for the INFO message level then the given message"
				+ " is forwarded to all the registered output Handler objects.");
		
	   }
	}


