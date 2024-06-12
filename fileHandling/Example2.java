package com.fileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example2 {

	public static void main(String[] args) throws IOException {

		FileOutputStream out = null;

//		String name1 = "Hello";
		String name2 = ", World";

		byte values[] = name2.getBytes();

		/**
		 * byte -
		 * 
		 * char - buffer - object -
		 */

		try {

			File file = new File("D:\\Java\\one.txt");

			if (file.exists()) {
				out = new FileOutputStream(file);
				out.write(values);
			} else {
				System.out.println("file is not available");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			out.close();
		}

	}

}
