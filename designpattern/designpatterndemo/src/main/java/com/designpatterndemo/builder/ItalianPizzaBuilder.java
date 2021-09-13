package com.designpatterndemo.builder;

public class ItalianPizzaBuilder extends PizzaBuilder {
	/* "ConcreteBuilder" */
	    public void buildDough() {
	        pizza.setDough("cross");
	    }

	    public void buildSauce() {
	        pizza.setSauce("italian");
	    }

	    public void buildTopping() {
	        pizza.setTopping("ham+pineapple");
	    }

}
