package com.springTransaction;

import org.springframework.jdbc.core.JdbcTemplate;

public class BankDaoImpl implements BankDao {
	private JdbcTemplate jdbcTemplate;
	
	public void withdraw(Account fromAccount, Account toAccount, double Amount) {
		Account accountFromDb=getAccountFromDb(fromAccount.getAccountNumber());
		double accountBalance=accountFromDb.getAccountBalance()-Amount;
		String SQL="update bank set accountBalance=? where accountNumber=?";
		int update=getJdbcTemplate().update(SQL, accountBalance, fromAccount.getAccountNumber());
		if(update>0)
			System.out.println("withdrawn");
		throw new RuntimeException(); //intentionally throwing exception to demo the implemented transaction management in service class
	}

	private Account getAccountFromDb(long accountNumber) {
		
		String SQL="SELECT * FROM bank WHERE accountNumber=?";
		Account account=getJdbcTemplate().queryForObject(SQL, new AccountRowMapper(), accountNumber); //getting data from db by means of account obj and rowmapper implementation for account
		return account;
		
	}

	public void deposit(Account fromAccount, Account toAccount, double Amount) {
		Account accountFromDb=getAccountFromDb(toAccount.getAccountNumber());
		double accountBalance=accountFromDb.getAccountBalance()+Amount;
		String SQL="update bank set accountBalance=? where accountNumber=?";
		int update=getJdbcTemplate().update(SQL, accountBalance, toAccount.getAccountNumber());
		if(update>0)
			System.out.println("deposited");
		
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
}
