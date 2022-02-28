package com.springcore;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SpringLifeCycleByInterFaces implements InitializingBean, DisposableBean{
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public SpringLifeCycleByInterFaces() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SpringLifeCycleByInterFaces [price=" + price + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("same as init");
		
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy");
	}
	
	//in case of using interface for init destroy, no need to make additions in config file
}