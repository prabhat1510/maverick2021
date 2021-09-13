package com.designpatterndemo.factory;

import java.util.Calendar;

public class FactoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cal = Calendar.getInstance();
				
		System.out.println(cal);
		
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
	}

}
