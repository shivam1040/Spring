package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml"); //try using absolute path for config
        Student student1=(Student) context.getBean("student1"); //using context obj to get data stored in xml and typecst to student type
        //System.out.println(student1);
        Student student2=(Student) context.getBean("student2"); //using context obj to get data stored in xml and typecst to student type
        //System.out.println(student2);
        EmpCollections empCollections1=(EmpCollections) context.getBean("empcollections1");
        //System.out.println(empCollections1);
        Aref aref1=(Aref) context.getBean("aref");
        //System.out.println(aref1);
        Person person1=(Person) context.getBean("person1");
        //System.out.println(person1);
        AdditionConstructorAmbiguity additionConstructorAmbiguity1=(AdditionConstructorAmbiguity) context.getBean("additionConstructorAmbiguity1");
        //additionConstructorAmbiguity1.doSum();
        AbstractApplicationContext context1=new ClassPathXmlApplicationContext("config.xml");
        SpringLifecycle springlifecycle1=(SpringLifecycle) context1.getBean("springLifecycle1");
        //System.out.println(springlifecycle1);
        context1.registerShutdownHook(); //this will enable execution of destroy method defined in config file for springlifecycle class, shutdownhook method is available in ABstract application context interface
        SpringLifeCycleByInterFaces springLifeCycleByInterfaces=(SpringLifeCycleByInterFaces) context.getBean("springLifeCycleByInterfaces1");
    }
}