package com.fileHandling;

import java.io.File;
import java.io.IOException;

public class Example1 {

	public static void main(String[] args) throws IOException {

//		String name = "Hello";

		/**
		 * byte -
		 * 
		 * char - buffer - object -
		 */

		try {

			File file = new File("D:\\Java\\one.txt");

			if (file.exists()) {
				System.out.println("file is available");
				;
			} else {
				System.out.println("file is not available");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
