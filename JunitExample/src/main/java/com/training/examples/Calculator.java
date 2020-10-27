package com.training.examples;

public class Calculator {
	
	public int sum(int x, int y) {
		return x+y;
	}
	public int difference(int x, int y) {
		return x-y;
	}
	public int divide(int x, int y) {
		return x/y;
	}
	public double average(int x, int y, int z) {
		if(x<0||y<0||z<0) {
			 throw new NegValueException("Value less than 0");
		}
		return (x+y+z)/3;
		
	}
}
