package com.springcore2;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
	{
	    public static void main( String[] args )
	    {
	    	AbstractApplicationContext context=new ClassPathXmlApplicationContext("config2.xml");
	    	context.registerShutdownHook();
	    	SpringLifeCycleByAnnotation springLifeCycleByAnnotation1=(SpringLifeCycleByAnnotation) context.getBean("springLifeCycleByAnnotation1");
	    	//System.out.println(springLifeCycleByAnnotation1);
	    	EmployeeAutowiring employeeAutowiring1=(EmployeeAutowiring) context.getBean("employeeAutowiring1");
	    	//System.out.println(employeeAutowiring1);
	    	PersonStandaloneCollections personStandaloneCollections1=(PersonStandaloneCollections) context.getBean("personStandaloneCollections1");
	    	//System.out.println(personStandaloneCollections1);
	    	//System.out.println(personStandaloneCollections1.getFriends().getClass().getName());
	    	StereoAnnotations stereoAnnotations1=(StereoAnnotations) context.getBean("stereoAnnotations"); //creating obj of StereoAnnotations, while getting the context ensure to use camelCase name of class to get the bean.
	    	//System.out.println(stereoAnnotations1);
	    	Scope scope1=(Scope) context.getBean("scope1");
	    	Scope scope2=(Scope) context.getBean("scope1"); 	
	    	//System.out.println(scope1.hashCode());
	    	//System.out.println(scope2.hashCode());
	    	SpringEL springEL1=(SpringEL) context.getBean("springEL");
	    	//System.out.println(springEL1);
	    	ApplicationContext context1=new AnnotationConfigApplicationContext(ConfigForNoXML.class); //using annotation implementation of application context for creating obj without xml, by refering to passed class
	    	//ConnfigWithoutXML connfigWithoutXML1=(ConnfigWithoutXML) context.getBean("con"); //giving name specified in component tage of connfigwithoutxml to avoid writing camelcase
	    	ConnfigWithoutXML connfigWithoutXML1=(ConnfigWithoutXML) context.getBean("getObj"); //another method to get obj, by using Bean tag defined in ConfigForNoXML, notice the name of passed arguement is method's name below bean tag, in this method need not definig Component tag in ConnfigWithOutXML class for creating obj
	    	//System.out.println(connfigWithoutXML1);
	    	String files[]=new String[]{"carConfig.xml", "engineConfig.xml"};
	    	ApplicationContext context2=new ClassPathXmlApplicationContext(files); //in this case, spring will load two xml files and load the objects accordingly
	    	CarConfigByMultipleXMLS carConfigByMultipleXMLS1=(CarConfigByMultipleXMLS) context2.getBean("carConfigByMultipleXMLS1");
	    	//System.out.println(carConfigByMultipleXMLS1);
	    	StaticVarInjection staticVarInjection1=(StaticVarInjection) context.getBean("staticVarInjection1");
	    	//staticVarInjection1.print();
	    	SingletonDemo singletonDemo1=(SingletonDemo) context.getBean("singletonDemo1");
	    	
	    }
	    
}
