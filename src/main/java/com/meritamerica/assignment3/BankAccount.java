package com.meritamerica.assignment3;

import java.text.ParseException;
import java.util.Date;

public class BankAccount {
	private double balance;
	private double interestRate;
	private Date accountOpenedOn;
	private long accountNumber;
	
	public BankAccount() {
	}
	
	public BankAccount(long accountNumber) {
		super();
		this.accountNumber = accountNumber;
	}
	
	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}
	
	public BankAccount(double balance, long accountNumber) {
		super();
		this.balance = balance;
		this.accountNumber = accountNumber;
	}

	public BankAccount(double balance, double interestRate, Date accountOpenedOn) {
		super();
		this.balance = balance;
		this.interestRate = interestRate;
		this.accountOpenedOn = accountOpenedOn;
	}
	
	public BankAccount(double balance, double interestRate, Date accountOpenedOn, long accountNumber) {
		super();
		this.balance = balance;
		this.interestRate = interestRate;
		this.accountOpenedOn = accountOpenedOn;
		this.accountNumber = accountNumber;
	}

	public boolean withdraw(double amount) {
		return false;
	}

	public boolean deposit(double amount) {
		return false;
	}

	public double futureVaue(int years) {
		return 0.0;
	}
	
	public String writeToString() {
		return null;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public Date getAccountOpenedOn() {
		return accountOpenedOn;
	}

	public void setAccountOpenedOn(Date accountOpenedOn) {
		this.accountOpenedOn = accountOpenedOn;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public static BankAccount readFromString(String accountData) throws ParseException {
		return null;

	}

}
