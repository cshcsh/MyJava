package com.java5200.date0531;

public class OverdraftException extends RuntimeException {

	private double deficit;
	
	
	public double getDeficit() {
		return deficit;
	}


	public OverdraftException(String message,double deficit){
		super(message);
		this.deficit=deficit;
	}
}
