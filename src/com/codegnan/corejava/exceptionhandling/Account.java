package com.codegnan.corejava.exceptionhandling;

public class Account {
	
	 double balance;
	Account(double balance) {
		this.balance=balance;
	}
	
	public void withDraw1(double amount) {

		try {

			if (amount > balance) {
				throw new Exception("Amount must be less than balance");
			}
			System.out.println(amount + " Amount withdrawn successfully");

		} catch (Exception e) {

			System.out.println("Exception occured");
			e.printStackTrace();
		}
	}
	
	
	public void withDraw(double amount) throws InsufficientBalanceException {

		if (amount > balance) {
			//throw new Exception("Amount must be less than balance");
			throw new InsufficientBalanceException("Insufficient Funds");
		}
		System.out.println(amount + " Amount withdrawn successfully");

	}
	

	public void calculateDays(int activeDays, int totalDays) {

		if (totalDays == 0) {
			throw new RuntimeException("total days cannot be zero");
		}

	}
		

	public static void main(String[] args) {

		Account account = new Account(10000.00);
		try {
			account.withDraw(11000.00);
		} catch (InsufficientBalanceException  e) {
		  //	e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}
}
