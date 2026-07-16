package com.udemyy.udemy_larning_sb;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {};
record Address(String FirstLine, String city) {};

@Configuration
public class HelloWordConfiguration {
	@Bean
	public String name() {
		return "Anil";
	}
	
	@Bean
	public String num() {
		return "one and two";
	}
	
	@Bean
	public int age() {
		return 24;
	}
	
	@Bean
	public Person person() {
		return new Person("Gowri", 45, new Address("Parimivari street", "Tanuku"));
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address1());
	}
	
	@Bean
	public Person person3Parameter(String name, int age, Address address4) {
		return new Person(name, age, address4);
	}
	
	@Bean
	@Primary
	public Person person4Parameter(String name, int age, Address address) {
		return new Person(name, age, address);
	}
	
	@Bean
	public Person person5Qualifier(String name, int age, @Qualifier("address4Qualifier")Address address) {
		return new Person(name, age, address);
	}
	
	@Bean
	@Primary
	public Address address1() {
		return new Address("Pallalamma nagar, old town", "Tanuku");
	}
	
	@Bean(name= "address4")
	@Qualifier("address4Qualifier")
	public Address address4() {
		return new Address("street in the chintada", "Chintada");
	}
	
	
	
	

}
