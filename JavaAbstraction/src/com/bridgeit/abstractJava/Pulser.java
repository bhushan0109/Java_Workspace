package com.bridgeit.abstractJava;

public class Pulser extends Bike {

	@Override
	public void run() {
		System.out.println("Run Safely..");
	}

	public static void main(String args[]) {

		Bike bike = new Pulser();
		bike.run();

	}

}
