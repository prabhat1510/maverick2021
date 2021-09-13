package com.designpatterndemo.bridge;

import java.util.Arrays;
import java.util.Scanner;

public class SingleFileEasy {

	public static void main(String arg[])
	{
		
	    int numOfArrElement = 0,count=0;
		System.out.println("Enter number of elements in array:-"+numOfArrElement);
		
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			String[] tokens = scanner.nextLine().split("\\s");
			System.out.println(Arrays.toString(tokens));
			//if(numOfArrElement=count)
		}

		scanner.close();
		
		// enter string u want here.
		String x[]={"Raj","77","101","99","Jio"};
		int cn=0,cs=0;

		//print array elements
		System.out.println("Array elements are: ");
		for(int i=0; i<x.length; i++){
			System.out.println(x[i]);
		}

		// scan the string.
		for(int i=0; i<x.length; i++)
		{
			try
			{
				int j=Integer.parseInt(x[i]);
				cn++;
			}
			catch(NumberFormatException e)
			{
				cs++;
			}
		}
		// show the numeric and string value after counting.
		System.out.println("Numeric:"+cn+"\nStrings:"+cs);
	}
}
//import java.lang.*;\nclass Test {\n public int calSal(int basic){\n // place the code for the salary calculation \n }\n public static void main(String args[]){\n // code to call the method \n }\n\}\n
