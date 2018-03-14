package com.bridgeit.file;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {

		String fileSeparator = System.getProperty("file.separator");
		// System.out.println(fileSeparator);

		String absoluteFilePath = fileSeparator + "home" + fileSeparator + "bridgelabz" + fileSeparator
				+ "JavaWorkspace" + fileSeparator + "JavaIo" + fileSeparator + "src" + fileSeparator + "com"
				+ fileSeparator + "bridgeit" + fileSeparator + "file" + fileSeparator + "file1.txt";
		// System.out.println(absoluteFilePath);

		File file = new File(absoluteFilePath);
		if (file.createNewFile()) {
			System.out.println(absoluteFilePath + " File created..");
		} else {
			System.out.println("File " + absoluteFilePath + " already exists");
		}
	}
}
