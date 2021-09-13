package com.iiht.arrays;
import java.util.Scanner;

/**
 * 
 * @author Prabhat Chandra 
 * Level : Easy 
 * 
 * This program calculates the average marks obtained
 * in a subject by students in a class. 
 * Input:-  Number of students can be N 
 *          Marks of students obtained in subject will be x1,x2,x3 ..... xN
 * Output:- Average of marks obtained
 * 
 */
public class CalculateAverageMarks {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of students in a class:-");
		String[] marks = new String[scanner.nextInt()];
		System.out.println("Enter the marks obtained by " + marks.length + " students in a subject");
		// consuming the <enter> from input above
		scanner.nextLine();
		for (int i = 0; i < marks.length; i++) {
			marks[i] = scanner.nextLine();
		}
		scanner.close();
		// calculate sum of all array elements
		int sum = 0;

		 
		try {
			// calculate average value
			double average = sum / marks.length;
			System.out.println("Average marks obtained by " + marks.length + " studnets in a subject is : " + average);
		} catch (ArithmeticException ae) {
			System.out.println(ae.getClass().getTypeName());
			System.out.println("Number of students cannot be zero");
		}
	}
}
