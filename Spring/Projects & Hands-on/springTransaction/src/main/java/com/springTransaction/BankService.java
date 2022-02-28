package com.springTransaction;

public interface BankService {
	public abstract void transferFund(Account fromAccount, Account toAccount, double Amount);
	public abstract void transferFund1(final Account fromAccount, final Account toAccount, final double Amount);
	public abstract void transferFund2(Account fromAccount, Account toAccount, double Amount);
}
