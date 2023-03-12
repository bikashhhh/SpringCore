package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.ref.A;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ApplicationContext context = new ClassPathXmlApplicationContext("ciconfig.xml");
	       // You did not create Student object---got object from IOC container through context.getBean
	         Person person = (Person )context.getBean("person");	       
	         System.out.println(person);

	}

}
