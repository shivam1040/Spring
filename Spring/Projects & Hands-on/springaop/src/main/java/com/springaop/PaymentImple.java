package com.springaop;

import com.springaop.Auditable.AuditDestination;

public class PaymentImple implements Payment {
	
	@Auditable(AuditDestination.DATABASE)
	@Override
	public void makePayment() {
		// TODO Auto-generated method stub
		System.out.println("payment");
		
	}

}
