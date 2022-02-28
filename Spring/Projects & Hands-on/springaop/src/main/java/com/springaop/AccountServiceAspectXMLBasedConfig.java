package com.springaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Pointcut;

public class AccountServiceAspectXMLBasedConfig {
	
	
	public void before(JoinPoint joinPoint) {
		System.out.println(joinPoint.getSignature().getName());
	}
	
	public Object around(ProceedingJoinPoint proceedingJoinPoint) { //around aspect/advice is combination of all other advices
		System.out.println(proceedingJoinPoint.getSignature().getName()); //this works as before advice
		Object object=null; //this type of advice method can be used to calculate execution time of cross concerning method
		try {
			object=proceedingJoinPoint.proceed(); //this will save the obj returned by joint cut/cross concern method, this works as after returning
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); //this works as afterthrowing advice
		}
		return object; //this works as after advice
	}
}
