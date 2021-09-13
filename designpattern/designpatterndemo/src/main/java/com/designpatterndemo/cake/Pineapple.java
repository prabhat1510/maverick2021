package com.designpatterndemo.cake;

public class Pineapple extends Cake {

	Pineapple(){
		setName("Pineapple Gateaux");
		setType("Eggless");
		setPrice(750);
	}

	public void recipe() {
		System.out.println("---Pineapple Recipe---");
		System.out.println("Take some fresh Pineapple");
		System.out.println("Wash them and Grind for 5 minutes");
		System.out.println("Put some groundnuts and bake for 45 minutes");
	}

	public void myFans() {
       System.out.println("Pineapple lovers love me");
	}

}
