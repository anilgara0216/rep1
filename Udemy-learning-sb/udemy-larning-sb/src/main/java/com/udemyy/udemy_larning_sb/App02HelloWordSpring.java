package com.udemyy.udemy_larning_sb;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWordSpring {

	public static void main(String[] args) {
		//Launching the spring context(creating spring context)
		var context = new AnnotationConfigApplicationContext(HelloWordConfiguration.class);
		
		//getting all the beans at once defined in the config class
		String[] anil = context.getBeanDefinitionNames();
		for(String i:anil) {
			System.out.println(i);
		}
		System.out.println();
		
		//to get a particular bean(here name is method in config)
		System.out.println(context.getBean("name"));
		
		System.out.println(context.getBean("age"));
		
		System.out.println(context.getBean("person"));
		
		System.out.println(context.getBean("person2MethodCall"));
		
		System.out.println(context.getBean("person3Parameter"));
		
		System.out.println(context.getBean("address1"));
		
		System.out.println(context.getBean(Address.class));
		
		System.out.println(context.getBean(Person.class));
		
		System.out.println(context.getBean("address1", Address.class));
		
		System.out.println(context.getBean("person5Qualifier"));
	
	

	}
}

