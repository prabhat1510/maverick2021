package com.designpatterndemo.bridge;

import java.util.Scanner;

/**
 * 
 * @author Prabhat Chandra Level : Easy
 * 
 *         This program demonstrate the uses of ArithmeticException in Java.
 *         Input:- Salary of an employee can be N where N is a positive number.
 * 
 *         Output:- Exceptions must be thrown
 * 
 */
public class SolutionExceptionHandling {

	public static final CalculatePowerOf calculatePowerOf = new CalculatePowerOf();
	public static final Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		while (in.hasNextInt()) {
			int n = in.nextInt();
			int p = in.nextInt();

			try {
				System.out.println(calculatePowerOf.power(n, p));
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

}

class CalculatePowerOf {
	/*
	 * Create the method long power(int, int) here.
	 */
	public long power(final int n, final int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        } else if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        }
        return (long)Math.pow(n, p);
   }

}
