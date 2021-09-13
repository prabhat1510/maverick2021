package com.designpatterndemo.cake;

public class CakeFactory implements Factory{
	public Cake createCake(String cakeName){

		Cake cake=null;

		if (cakeName.equals("BlackForest")) {
			cake = new BlackForest();
		} 
		else if (cakeName.equals("BlueBerry")) {
			cake = new BlueBerry();
		} 
		else if (cakeName.equals("LitchiGateaux")) {
			cake = new LitchiGateaux();
		} 
		else if(cakeName.equals("Pineapple")){
			cake=new Pineapple();
		}
		return cake;
	}
}
