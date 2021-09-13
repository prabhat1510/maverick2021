/**
 * 
 */
package com.designpatterndemo.factory;

/**
 * @author Admin
 *
 */
public class Rectangle implements Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle is Drawn");
	}

	public int area(int length,int breadth) {
		// TODO Auto-generated method stub
		return length * breadth;
	}


}
