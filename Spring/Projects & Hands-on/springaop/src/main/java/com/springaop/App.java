package com.springaop;

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
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Payment payment1=(Payment) context.getBean("paymentImple1");
        payment1.makePayment(); //this method makepayment is known as joint point, check the result before executing itself aspect method is running
        ApplicationContext context1=new ClassPathXmlApplicationContext("configXMLBased.xml");
        AccountServiceXMLBasedConfig accountServiceImpleXMLBasedConfig1=(AccountServiceXMLBasedConfig) context1.getBean("accountServiceImpleXMLBasedConfig1");
        accountServiceImpleXMLBasedConfig1.updateAccountBalance(new AcoountXMLBasedConfig("1", "A"), (long) 1); //check how accountserviceaspect method is called before execution of this method
    }
}
