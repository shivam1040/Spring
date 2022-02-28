package com.springcore3;

public class StaticApproachFactoryImplementationForCreatingObjOfOtherClass {
	public static String carName;
	public String car;
	
	public static void setCarName(String carName) {
		StaticApproachFactoryImplementationForCreatingObjOfOtherClass.carName=carName;
	}
	
	public static CarFactoryImplementationForCreatingObjOfOtherClass getInstance() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		CarFactoryImplementationForCreatingObjOfOtherClass carFactoryImplementationForCreatingObjOfOtherClass1=(CarFactoryImplementationForCreatingObjOfOtherClass) Class.forName(carName).newInstance();
		return carFactoryImplementationForCreatingObjOfOtherClass1;
	}
	
	//below is the way to be used when using instance type factory methods
	public void setCar(String car) {
		this.car = car;
	}
	
	public CarFactoryImplementationForCreatingObjOfOtherClass getInstance1() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		CarFactoryImplementationForCreatingObjOfOtherClass carFactoryImplementationForCreatingObjOfOtherClass1=(CarFactoryImplementationForCreatingObjOfOtherClass) Class.forName(carName).newInstance();
		return carFactoryImplementationForCreatingObjOfOtherClass1;
	}
}
 