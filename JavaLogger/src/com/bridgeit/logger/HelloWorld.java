package com.bridgeit.logger;

import java.util.logging.Logger;

public class HelloWorld {
	private static Logger theLogger = Logger.getLogger(HelloWorld.class.getName());

	public static void main(String[] args) {
		HelloWorld hello = new HelloWorld("Hello world!");
		hello.sayHello();
	}

	private String theMessage;

	public HelloWorld(String message) {
		theMessage = message;
	}

	public void sayHello() {
		theLogger.info("Hello logging!");
		System.err.println(theMessage);
		//System.out.println(theMessage);
	}
}