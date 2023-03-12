package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestStereoTypeAnnotation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       ApplicationContext context = new ClassPathXmlApplicationContext("stereoconfig.xml");
	       // You did not create Student object---got object from IOC container through context.getBean
	      Student s1= context.getBean("obj",Student.class);    
	      Student s2= context.getBean("obj",Student.class);  
		/*
		 * System.out.println(s1); System.out.println(s1.getAddress());
		 * System.out.println(s1.getAddress().getClass().getName());
		 */
	      
	      System.out.println(s1.hashCode());
	      
	      System.out.println(s2.hashCode());
	}
}
