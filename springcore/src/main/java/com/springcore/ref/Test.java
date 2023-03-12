package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.Student;
import com.springcore.collections.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       ApplicationContext context = new ClassPathXmlApplicationContext("refconfig.xml");
	       // You did not create Student object---got object from IOC container through context.getBean
	         A aref = (A )context.getBean("aref");	       
	         System.out.println(aref);
	}

}
