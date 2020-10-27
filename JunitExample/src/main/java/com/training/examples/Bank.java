package com.training.examples;

public class Bank {
	double balance;

	public Bank(double balance) {
		super();
		this.balance = balance;
	}
	public double withdraw(double amount) throws ExceedingException{
		if(amount>=4000 || amount==balance) {
			throw new ExceedingException("amount beyond limit");
		}
		if(amount<=0) {
			throw new NegValueException("amount less than 0");
		}
		balance = balance-amount;
		return balance;
	}
	public double deposit(double amount) {
		 if(amount>=4000) {
	            throw new ExceedingException("Amount beyond limit");
	        }
	        if(amount<=0) {
	            throw new NegValueException("Amount less than 0");
	        }
		balance = balance+amount;
		return balance;
	}
	
}
