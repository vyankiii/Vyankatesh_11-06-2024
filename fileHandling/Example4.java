package com.fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Example4 {

	public static void main(String[] args) throws IOException {

		FileInputStream input = null;

		try {

			File file = new File("D:\\Java\\one.txt");

			if (file.exists()) {
				input = new FileInputStream(file);

				int index = 0;

				while ((index = input.read()) != -1) {
					System.out.print((char) index);
				}

			} else {
				System.out.println("file is not available");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			input.close();
		}

	}

}
