package com.SpringJDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       //ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
       ApplicationContext context=new AnnotationConfigApplicationContext(JDBCConfigWithoutXML.class); //using no xml config for db operations
		/*//not recommended way
		 * JdbcTemplate jdbcTemplate1=(JdbcTemplate) context.getBean("jdbcTemplate1");
		 * String query="insert into student(id, name, city) value(?, ?, ?)"; int
		 * result=jdbcTemplate1.update(query, 111, "SJ1", "DL1");
		 * System.out.println(result); //shows the number of records affected
		 */   
       StudentDao student1=(StudentDao) context.getBean("studentDaoImple1");
       Student student=new Student(333, "SJ2", "DL2");
       //System.out.println(student1.insert(student));
       student=new Student(111, "SJ4", "DL3"); //creating object for record update operations
       //System.out.println(student1.updateById(student));
       //System.out.println(student1.delete(111));  //delete operations by id
       //System.out.println(student1.get(222)); //getting single row data by means of id field in db and rowmapping
       System.out.println(student1.getAll()); //returns all records at once
    }
}
