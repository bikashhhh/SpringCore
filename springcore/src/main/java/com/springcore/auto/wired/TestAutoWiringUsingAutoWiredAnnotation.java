package com.springcore.auto.wired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWiringUsingAutoWiredAnnotation {
	  public static void main(String [] args) {
		  ApplicationContext context= new ClassPathXmlApplicationContext("autowiredconfig.xml");
// Giving one extra parameter Employee.class so that there is no need of type-casting into Employee object
		  Employee emp = context.getBean("emp", Employee.class);
		  System.out.println(emp);
	  }
}
