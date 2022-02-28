package com.springcore2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class SpringLifeCycleByAnnotation {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public SpringLifeCycleByAnnotation() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SpringLifeCycleByAnnotation [subject=" + subject + "]";
	}
	
	@PostConstruct //init by annotation method
	public void start() {
		System.out.println("start");
	}
	
	@PreDestroy //destroy by annotation method
	public void end() {
		System.out.println("end");
	}
}
