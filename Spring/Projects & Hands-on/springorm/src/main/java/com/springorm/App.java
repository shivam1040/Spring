package com.springorm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml"); //try using absolute path for config
        StudentDAO studentDAO1=(StudentDAO) context.getBean("studentDAO1");
        Student student1=new Student(1, "a", "b");
        //System.out.println(studentDAO1.insert(student1));
        System.out.println(studentDAO1.getAll());
    }
}
