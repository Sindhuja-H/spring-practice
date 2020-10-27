package com.training.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.training.examples.Bank;
import com.training.examples.ExceedingException;
import com.training.examples.NegValueException;

class BankTest {

	Bank bank;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before all testcases");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After all testcases");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before Test");
		bank = new Bank(8000);
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Test");
		bank = null;
	}

	@Test
	void testWithdraw() throws ExceedingException{
		double balance = bank.withdraw(2000);
		assertEquals(6000,balance,"should be 6000");
	}
	@Test
	void testWithdrawExceeding() {
		assertThrows(ExceedingException.class,()->bank.withdraw(4100));
	}
	@Test
	void testWithdrawNeg() {
		assertThrows(NegValueException.class,()->bank.withdraw(-900));
	}
	@Test
	void testWithDrawEq() {
		assertThrows(ExceedingException.class,()->bank.withdraw(8000));
	}
	@Test
	void testDeposit() {
		double balance = bank.deposit(2000);
		assertEquals(10000,balance,"should be 10000");
	}
	@Test
	//@DisplayName("Test deposit")
	void testDepositNeg() {
		assertThrows(NegValueException.class,()->bank.deposit(-900));
	}
	@Test
	void testDepositExceeding() {
		assertThrows(ExceedingException.class,()->bank.deposit(5000));
	}
}
