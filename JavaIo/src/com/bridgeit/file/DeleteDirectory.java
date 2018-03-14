package com.bridgeit.file;

import java.io.File;

public class DeleteDirectory {

	public static void main(String[] args) {

		File directory = new File("/home/bridgelabz/JavaWorkspace/JavaIo/src/com/bridgeit/dir");
		if (directory.isDirectory() == false) {

			System.out.println("Not a directory,Do nothing");
			return;
		}

		File[] listFiles = directory.listFiles();
		// System.out.println(listFiles);
		for (File file : listFiles) {
			System.out.println("Deleting " + file.getName());
			file.delete();
		}

		// now directory is empty, so we can delete it
		System.out.println("Deleting Directory. Success = " + directory.delete());
	}
}
