/**
 * 
 */
package threadexample;

/**
 * @author admi
 *
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SingleThreadWriteToFile {

	public static void main(String[] args) {
		long startTime = System.nanoTime();

		File dir = new File("C:\\Users\\admi\\Desktop\\output");
		File destination = new File("C:\\Users\\admi\\Desktop\\output\\Destination.txt");
		File[] files = dir.listFiles();
		String content;
		for (File file : files) {
			content = readFromFile(file.getAbsolutePath());
			writeToFile(destination, content);
		}
		long stopTime = System.nanoTime();

		System.out.println("Total execution time is " + (stopTime - startTime));
	}

	private static void writeToFile(File file, String content) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
			writer.write(content);
			writer.flush();
		} catch (IOException e) {
			System.out.println(MessageConstants.UNABLE_TO_WRITE);
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
			System.out.println("File Not Found");
		} catch (IOException e) {
			System.out.println(MessageConstants.UNABLE_TO_READ);
		}
		return content.toString();
	}

}
