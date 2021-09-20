/**
 * 
 */
package threadexample;

import java.io.File;

/**
 * @author admi
 *
 */
public class MultithreadingWriteToFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		long startTime = System.nanoTime();
		File dir = new File("C:\\Users\\admi\\Desktop\\output");
		File destination = new File("C:\\Users\\admi\\Desktop\\output\\DestinationMultiThread.txt");
		File[] files = dir.listFiles();
		for (File file : files) {
			Writer w1 = new Writer(file, destination);
			Thread t = new Thread(w1);
			t.setPriority(Thread.MAX_PRIORITY);
			t.start();

		}
		long stopTime = System.nanoTime();

		System.out.println("Total execution time is " + (stopTime - startTime));

	}

}
