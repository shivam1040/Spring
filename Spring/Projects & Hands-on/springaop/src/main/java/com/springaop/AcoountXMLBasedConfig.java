package com.springaop;

public class AcoountXMLBasedConfig {
	private String accountNumber, accountDescription;

	public AcoountXMLBasedConfig(String accountNumber, String accountDescription) {
		super();
		this.accountNumber = accountNumber;
		this.accountDescription = accountDescription;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountDescription() {
		return accountDescription;
	}

	public void setAccountDescription(String accountDescription) {
		this.accountDescription = accountDescription;
	}

	@Override
	public String toString() {
		return "AcoountXMLBasedConfig [accountNumber=" + accountNumber + ", accountDescription=" + accountDescription
				+ "]";
	}
	
	
}
