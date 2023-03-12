package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.stereotype.Student;

public class TestSpringExpressionLanguage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spelconfig.xml");
		// You did not create Student object---got object from IOC container through
		// context.getBean
		Demo s1 = context.getBean("obj", Demo.class);

		 System.out.println(s1); 

	}

}
