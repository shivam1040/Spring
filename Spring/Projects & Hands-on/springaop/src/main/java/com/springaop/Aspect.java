package com.springaop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.springaop.Auditable.AuditDestination;

@org.aspectj.lang.annotation.Aspect //this annotation is necessary to let the spring know this is an aspect class
public class Aspect {
	
	@Pointcut("execution(* com.springaop.PaymentImple.makePayment())") //this is a method of creating dummy method for pointcut expression when it is common for many advices
	public void selectAll() {
		
	}
	
	//@Before("com.springaop.PointcutDefinition.service()") //this is a way to define loosely coupled pointcut by creating a separte class for pointcuts of different layer
	//@Before("execution(* com.springaop.PaymentImple.makePayment()) && args(account,..)") //multiple pointcut designators can be used like in this statement, args(account,..) means first arguement of method should be named account and then any number of arguements
	//@Before("selectAll()") //making using of dummy pointcut method for expression
	@Before("execution(* com.springaop.PaymentImple.makePayment())") //this annotation tells the spring to run this method before makepayment method of paymentimple, as defined in annotation param, * denotes that this annotation expression is valid for any return type of makepayment method of paymentimple
	//@Before("execution(* com.springaop.PaymentImple.makePayment(..))") // .. in paranthesis means that the given method accepts an arguement
	public void beforJoinPoint() { 
		System.out.println("befor payment");
	}
	
	@After("execution(* com.springaop.PaymentImple.makePayment()) && @annotation(audit)") //making use of custom annotaion as pointcut designator
	public void after(Auditable audit) {
		System.out.println("after");
		System.out.println(audit.value()); //this will return the value set for auditable annnotation in Paymentimple class
	}
}