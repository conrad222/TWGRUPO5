package com.mybank.domain;

public class OverdraftException {
	
	private double deficit;

	public OverdraftException(String msg, double deficit) {
		
	}

	public double getDeficit() {
		return deficit;
	}
	
}
