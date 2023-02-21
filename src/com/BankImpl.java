package com;

public class BankImpl implements Bank {
	int balance;
	BankImpl(int balance){
		this.balance=balance;
	}
	@Override
	public void deposite(int amount) {
		System.out.println("Deposited amount Rs."+amount);
		balance+=amount;//balance=balance+amount;
		System.out.println("Amount deposited succesfully");
	}
	@Override
	public void withdraw(int  amount) {
		System.out.println("Withdraw amount Rs."+amount);
		if(amount<=balance) {
		balance-=amount;//balance=balance-amount
		System.out.println("Amount withdraw succesfully");
		}
		else
		{
			try {
				throw new InsufficientBalanceExeption("Insuffient balance!!");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
	@Override
	public int getBalance() {
		return balance;
	}

	

}
