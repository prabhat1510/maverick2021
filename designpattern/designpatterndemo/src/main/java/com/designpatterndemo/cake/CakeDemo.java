package com.designpatterndemo.cake;

import java.util.Scanner;

public class CakeDemo {

		public static void main(String args[]) {

			Cake cake = null;

			System.out.println("Which Cake you would like to eat BlackForest/BlueBerry/LitchiGateaux/Pineapple : ");
			Scanner scanner = new Scanner(System.in);
			String choice = scanner.nextLine();
			scanner.close();

			CakeFactory cakeFactory=new CakeFactory();
			cake=cakeFactory.createCake(choice);

			cake.aboutCake();

		}

}
