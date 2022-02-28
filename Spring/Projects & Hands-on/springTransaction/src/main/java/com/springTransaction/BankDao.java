package com.springTransaction;

public interface BankDao {
	public abstract void withdraw(Account fromAccount, Account toAccount, double Amount);
	public abstract void deposit(Account fromAccount, Account toAccount, double Amount);
	
}
