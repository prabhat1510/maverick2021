package threadexample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Writer implements Runnable {
	File source;
	File destination;

	public Writer(File source, File destination) {
		this.source = source;
		this.destination = destination;
	}

	public void run() {
		String content;
		content = readFromFile(source.getAbsolutePath());
		writeToFile(destination, content);
	}

	private static void writeToFile(File file, String content) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
			writer.write(content);
			writer.write("file content written");
			writer.flush();
		} catch (IOException e) {
			System.out.println(System.class.getName()+"--"+MessageConstants.UNABLE_TO_WRITE);
		}

	}

	static String readFromFile(String filename) {
		StringBuffer content = new StringBuffer();
		try {
			String text;
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			while ((text = reader.readLine()) != null) {
				content.append(text);
				content.append("\n");

			}

		} catch (FileNotFoundException e) {
			System.out.println(System.class.getName()+"--"+MessageConstants.FILE_NOT_FOUND);
		} catch (IOException e) {
			System.out.println(System.class.getName()+"--"+MessageConstants.UNABLE_TO_READ);
		}
		return content.toString();
	}

}
