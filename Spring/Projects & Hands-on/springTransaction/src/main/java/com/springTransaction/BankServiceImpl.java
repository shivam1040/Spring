package com.springTransaction;


import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

public class BankServiceImpl implements BankService {
	private BankDao bankDao;
	private TransactionTemplate transactionTemplate;
	
	
	public TransactionTemplate getTransactionTemplate() {
		return transactionTemplate;
	}
	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}
	
	@Transactional //declarative type transaction management , we can use attributes of annotation to define propogation, scope, isolation etc.
	public void transferFund(Account fromAccount, Account toAccount, double Amount) {
		getBankDao().withdraw(fromAccount, toAccount, Amount); //withdraw and then deposit
		getBankDao().deposit(fromAccount, toAccount, Amount);

	}
	
	public void transferFund1(final Account fromAccount, final Account toAccount, final double Amount) {
	
		transactionTemplate.execute(new TransactionCallback<Void>() { //implementing definitionof anonymous classgiven by execute method

			public Void doInTransaction(TransactionStatus status) {
				getBankDao().withdraw(fromAccount, toAccount, Amount); //withdraw and then deposit
				getBankDao().deposit(fromAccount, toAccount, Amount); //to make methods on which we want transaction management can be put here, do make the paramteres final for this method to work
				return null;
			}
		});
	}
	
	public void transferFund2(Account fromAccount, Account toAccount, double Amount) { //XML based configuration for transaction management, check in config xml for implementation
		getBankDao().withdraw(fromAccount, toAccount, Amount); //withdraw and then deposit
		getBankDao().deposit(fromAccount, toAccount, Amount);

	}
	
	public BankDao getBankDao() {
		return bankDao;
	}
	public void setBankDao(BankDao bankDao) {
		this.bankDao = bankDao;
	}
	
	

}
