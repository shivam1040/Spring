package com.springcore3;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycleImpleUsingConfigurableAppContext implements InitializingBean, DisposableBean{

	
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("desr");
	}

	@Override
	public void afterPropertiesSet() throws Exception { //acts as init method
		// TODO Auto-generated method stub
		System.out.println("init");
	}

}
