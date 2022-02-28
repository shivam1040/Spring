package com.springaop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointcutDefinition {
	
	@Pointcut("within(com.springaop.*)") //com.springaop..* //this means spring will consider any number of subdirectories after springaop
	public void web() {
		
	}
	
	
	@Pointcut("within(com.springaop.*)")
	public void service() {
		
	}
	
	@Pointcut("within(com.springaop.*)")
	public void dao() {
	
	}
} 
