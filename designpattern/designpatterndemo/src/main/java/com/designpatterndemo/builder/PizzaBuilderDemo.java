package com.designpatterndemo.builder;

public class PizzaBuilderDemo {
	public static void main(String[] args) {
		Waiter waiter = new Waiter();
		PizzaBuilder italianPizzabuilder = new ItalianPizzaBuilder();
		PizzaBuilder nykPizzaBuilder = new NYKPizzaBuilder();

		waiter.setPizzaBuilder(italianPizzabuilder);
		waiter.constructPizza();

		Pizza pizza = waiter.getPizza();
		System.out.println(pizza.getDough());
		System.out.println(pizza.getSauce());
		
	}
}