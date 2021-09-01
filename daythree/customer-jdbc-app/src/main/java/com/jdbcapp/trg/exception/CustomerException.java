package com.jdbcapp.trg.exception;

public class CustomerException extends Exception {	
	private static final long serialVersionUID = 1L;

	public CustomerException() {
		super();
	}
	
	public CustomerException(String message) {
		super(message);
	}
	
	public CustomerException(String message,Exception e) {
		super(message,e);
	}
	
	

	@Override
	public String toString() {
		return "CustomerException: "+
				getMessage() + "\n" + 
				getLocalizedMessage()
				+ "\n" + getCause() ;
	}
	
	
}
