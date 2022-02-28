package com.springcore3;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
	AbstractApplicationContext context=new ClassPathXmlApplicationContext("config3.xml");
	CarFactoryImplementationForCreatingObjOfOtherClass carFactoryImplementationForCreatingObjOfOtherClass1=(CarFactoryImplementationForCreatingObjOfOtherClass) context.getBean("1"); //static type factory method
	//carFactoryImplementationForCreatingObjOfOtherClass1.drive();
	CarFactoryImplementationForCreatingObjOfOtherClass carFactoryImplementationForCreatingObjOfOtherClass2=(CarFactoryImplementationForCreatingObjOfOtherClass) context.getBean("factory"); //instance type factory method, notice the bean name in xml it's not bean name of StaticApproachFa... class
	//carFactoryImplementationForCreatingObjOfOtherClass2.drive();;
	CarFactoryImplementationForCreatingObjOfOtherClass carFactoryImplementationForCreatingObjOfOtherClass3=(CarFactoryImplementationForCreatingObjOfOtherClass) context.getBean("factoryBeanInterfaceAppproachForFactory1"); //factory method approach using FactoryBean Interface
	//carFactoryImplementationForCreatingObjOfOtherClass3.drive();
	bus objCreationByLookupMethodForInterfaces1=(bus) context.getBean("objCreationByLookupMethodForInterfaces1"); //way to create proxy classes for obj creation
	//System.out.println(objCreationByLookupMethodForInterfaces1.myBusEngine().getClass());
	//System.out.println(objCreationByLookupMethodForInterfaces1.myBusEngine().getName());
	//System.out.println(objCreationByLookupMethodForInterfaces1.getClass().getCanonicalName()); //notice how an obj is created  for class which doesnot exist in directory
	Truk truuk1=(Truk) context.getBean("objCreationByLookupMethodForInterfaces2"); //lookup method for obj creation for concrete classes
	//System.out.println(truuk1.myTrukEngine().getName());
	ConfigurableApplicationContext context2=new ClassPathXmlApplicationContext("config3.xml"); //another method to implement lifecycle
	//context2.close();
	MethodReplace methodReplace1=(MethodReplace) context.getBean("methodReplace1");
	//methodReplace1.deposit(); //notice how replacing method from MethodRep is called
	InjectPropertiesFromFile injectPropertiesFromFile1=(InjectPropertiesFromFile) context.getBean("injectPropertiesFromFile1"); //injecting properties from file
	//System.out.println(injectPropertiesFromFile1);
	context2.stop(); //demo of ioc event listeners
	context2.close(); //destroy all beans
	context2.refresh(); //re-instantiation, these events are mostly used for standard applications
	}
}
