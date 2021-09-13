package com.iiht.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class HighestAndLowestMarks {

	/**
	 * 
	 * @author Prabhat Chandra 
	 * Level : Easy 
	 * 
	 * This program finds the highest and lowest marks obtained in a subject by students in a class. 
	 * Input:-  Number of students can be N 
	 *          Marks of students obtained in subject will be x1,x2,x3 ..... xN
	 * Output:- Average of marks obtained
	 * 
	 */
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String[] marks = null;
		try {
			System.out.println("Enter the number of students in a class:-");
			marks = new String[scanner.nextInt()];
			System.out.println("Enter the marks obtained by " + marks.length + " students in a subject");
			// consuming the <enter> from input above
			scanner.nextLine();
			for (int i = 0; i < marks.length; i++) {
				marks[i] = scanner.nextLine();
			}
		} catch (NegativeArraySizeException nase) {
			System.out.println("Enter the number of students greater than 0");
		} finally {
			scanner.close();
		}

		if (marks.length > 1) {
			highestAndLowestMarks(marks);
		} else if (marks.length == 1){
			System.out.println("Number of students in a class should be more than one to find highest and lowest");
			
		} else {
			System.out.println("Number of students in a class cannot be zero");
		}

	}

	public static void highestAndLowestMarks(String[] marks) {
		int highest = Integer.MIN_VALUE;
		int lowest = Integer.MAX_VALUE;
		for (int i = 0; i < marks.length; i++) {
			int number = Integer.parseInt(marks[i]);
			if (number > highest) {
				highest = number;
			} else if (number < lowest) {
				lowest = number;
			}
		}
		System.out.println("Highest marks obtained by a student in a class : " + highest);
		System.out.println("Lowest marks obtained by a student in a class is : " + lowest);
	}

}
