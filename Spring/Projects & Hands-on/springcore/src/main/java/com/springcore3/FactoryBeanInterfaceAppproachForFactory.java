package com.springcore3;

import org.springframework.beans.factory.FactoryBean;

public class FactoryBeanInterfaceAppproachForFactory implements FactoryBean {

	private String carName;
	
	
	public void setCarName(String carName) {
		this.carName = carName;
	}
	
	
	@Override
	public Object getObject() throws Exception {
		CarFactoryImplementationForCreatingObjOfOtherClass c=(CarFactoryImplementationForCreatingObjOfOtherClass) Class.forName(carName).newInstance();
		return c;
	}

	@Override
	public Class getObjectType() {
		// TODO Auto-generated method stub
		return CarFactoryImplementationForCreatingObjOfOtherClass.class;
	}
	
	public boolean isSingleton() {
		return true; //this will create only singleton type objects
	}
}
