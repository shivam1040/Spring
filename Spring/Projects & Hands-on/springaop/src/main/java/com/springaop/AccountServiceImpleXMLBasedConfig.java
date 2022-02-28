package com.springaop;

import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpleXMLBasedConfig implements AccountServiceXMLBasedConfig {
	@Override
	public void updateAccountBalance(AcoountXMLBasedConfig account, Long amount) {
		System.out.println(account);
	}
}
