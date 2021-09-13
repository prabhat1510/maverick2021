package com.designpatterndemo.adapter;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Rectangle");
	}

	@Override
	public void resize() {
		// TODO Auto-generated method stub
		System.out.println("Resizing Rectangle");
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return "Rectangle object";
	}

	@Override
	public boolean isHide() {
		// TODO Auto-generated method stub
		return false;
	}

}
