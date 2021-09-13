package com.designpatterndemo.cake;

public class BlueBerry extends Cake {

	BlueBerry(){
		setName("Blue Berry");
		setType("Egg");
		setPrice(700);
	}

	public void recipe() {
	System.out.println("---BlueBerry Recipe---");
	System.out.println("First prepare Flour and Baking powder mixture");
	System.out.println("Add Milk and Egg yolks");
	System.out.println("Coat Berries");
	System.out.println("Bake for 50 minutes");

	}

	public void myFans() {
		 System.out.println("Moms love me");

	}

}
