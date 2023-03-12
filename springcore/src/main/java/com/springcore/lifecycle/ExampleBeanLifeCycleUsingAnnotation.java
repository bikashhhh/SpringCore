package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ExampleBeanLifeCycleUsingAnnotation {
	private String Subject;

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}

	public ExampleBeanLifeCycleUsingAnnotation(String subject) {
		super();
		Subject = subject;
	}

	public ExampleBeanLifeCycleUsingAnnotation() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ExampleBeanLifeCycleUsingAnnotation [Subject=" + Subject + "]";
	}
	@PostConstruct
	public void start()
	{
		System.out.println("Start method called using PostContruct annotation");
	}
	@PreDestroy
	public void end()
	{
		System.out.println("End method called using PreDestroy annotation");
	}

}
