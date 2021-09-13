package com.designpatterndemo.cake;

public class LitchiGateaux extends Cake {

	LitchiGateaux(){
		setName("Litchi Gateaux");
		setType("Eggless");
		setPrice(750);
	}

	public void recipe() {
		System.out.println("---LitchiGateaux Recipe---");
		System.out.println("Take some fresh Litchies");
		System.out.println("Wash them and Grind for 5 minutes");
		System.out.println("Put some groundnuts and bake for 45 minutes");
	}

	public void myFans() {
       System.out.println("Litchi lovers love me");
	}

}
