package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWiringUsingXml {
	  public static void main(String [] args) {
		  ApplicationContext context= new ClassPathXmlApplicationContext("autoconfig.xml");
// Giving one extra parameter Employee.class so that there is no need of type-casting into Employee object
		  Employee emp = context.getBean("emp", Employee.class);
		  System.out.println(emp);
	  }
}
