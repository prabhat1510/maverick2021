/**
 * 
 */
package com.iiht.exceptions;

import java.util.Scanner;

/**
 * @author Admin 
 * 
 * Write a program that requests a student’s age from the user. As we know, everybody’s age is positive. 
 * Therefore, we need to figure out what to do if the user types a negative number. 
 * The expression that checks whether the number entered is positive can be written as:
 * if(studentAge < 0)
 * If the condition is true, the minimum you can do is to send the produced error away.
 * 
 * 
 * input: Negative number or String 
 * output IllegalArgumentException or InputMisatchException
 * 
 */
public class ExceptionHandlingExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int studentAge = 0;
		Scanner scnr = new Scanner(System.in);

		try {
			System.out.print("Student Age: ");
			studentAge = scnr.nextInt();

			if (studentAge < 0)
				throw new IllegalArgumentException();
		} catch (Exception exc) {
			System.out.println(exc.getClass().getSimpleName());
		} 
	}

}
  