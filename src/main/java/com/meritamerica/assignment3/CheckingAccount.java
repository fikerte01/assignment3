package com.meritamerica.assignment3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.meritamerica.assignment3.MeritBank;

public class CheckingAccount extends BankAccount{
	
	public CheckingAccount(double openBalance){
		super(openBalance, MeritBank.getNextAccountNumber());
		setInterestRate(0.0001);
	}

	public CheckingAccount(){
		super();
	}

			//balance;
			//interestRate;
			//accountOpenedOn;:-  
			//accountNumber;
	public static CheckingAccount readFromString(String accountData) throws ParseException {
		//50.50,0.001,03-16-2020,3546789 :-- accountData
		String[] data = accountData.split(",");
		//["50.50", "0.001", "03-16-2020", "3456789"]:-- data
		CheckingAccount checkingAccount = new CheckingAccount();
		try{
			//reading elements from the array and parsing it to respective data types
			double currentBalance = Double.parseDouble(data[0]);		
			double currentInterest = Double.parseDouble(data[1]);
			SimpleDateFormat formatter = new SimpleDateFormat("MM-DD-yyyy");
			Date openedDate = formatter.parse(data[2]);
			long accountNumber = Long.parseLong(data[3]);
			
			//setting checking accounts attributed
			checkingAccount.setBalance(currentBalance);
			checkingAccount.setInterestRate(currentInterest);
			checkingAccount.setAccountOpenedOn(openedDate);
			checkingAccount.setAccountNumber(accountNumber);

			//checkingAccount.setAccountNumber(Long.parseLong(data[3]));

		} catch (Exception e) {
			throw new ParseException(e.getMessage(), 3);
		}
		
		
		return checkingAccount;
	}
	
	public boolean withdraw(double amount) {
		if(amount > 0 && amount <= getBalance()) {
			//this.balance = balance - amount;
			setBalance(getBalance() - amount);
			System.out.println("Withdrawn amount: " + amount);
			System.out.println("Remaining balance: " + getBalance());
			return true;
		}
		return false;
	}

	public boolean deposit(double amount) {
		if (amount > 0) {
			//this.balance = balance + amount;
			setBalance(getBalance() + amount);
			System.out.println("Deposited amount: " + amount);
			System.out.println("Total balance: " + getBalance());
			return true;
		}
		return false;		
	}

	public double futureValue(int years) {
		return getBalance() * Math.pow(1 + getInterestRate(), years);
	}
	

	public String toString() {
		return  "Checking Account Balance: $" + getBalance() + "\n" + 
				"Checking Account Interest Rate: " + getInterestRate() + "\n" + 
				"Checking Account Balance in 3 years: $" + futureValue(3);
		
	}

}
