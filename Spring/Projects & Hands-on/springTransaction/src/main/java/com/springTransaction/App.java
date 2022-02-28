package com.springTransaction;


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
        //System.out.println( "Hello World!" );
    	AbstractApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    	BankService bankService=(BankService) context.getBean("bankServiceImpl1");
    	Account fromAccount=new Account(1, "SJ", 22, "S"); //defining the entire variable for account is not required in this case since we re getting data from DB by id so just define account number
    	Account toAccount=new Account(2, "SJ1", 33, "C");
    	bankService.transferFund(fromAccount, toAccount, 1);
    	//bankService.transferFund1(fromAccount, toAccount, 1); //notice in DB how no deposit is made after error since transaction management is enabled, this type of transactionManagement is programmatic approach since transaction code is inserted into program's code
    	//bankService.transferFund2(fromAccount, toAccount, 1); //for xml based transaction management using aop
    	context.close();
    }
}
