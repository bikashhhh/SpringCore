package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.collections.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml","collectionconfig.xml");
     // You did not create Student object---got object from IOC container through context.getBean
       Student student1 = (Student )context.getBean("student1");
        Student student2 = (Student )context.getBean("student2");
        Employee employee1 = (Employee)context.getBean("employee1");
       System.out.println(student1);
       System.out.println(student2);
        System.out.println(employee1);
        System.out.println(employee1.getCourses());
        System.out.println(employee1.getName());
        System.out.println(employee1.getAddress());
    }
}
