package com.bridgeit.file;

import java.io.File;

public class FileSafe{

	public static void main(String args[]) {
		File fileSafe = new File("temp" + File.separator + "abc.txt");
		System.out.println(fileSafe);

	}
}
