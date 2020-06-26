package com.javaLive.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javaLive.beans.list.Country;

public class ListMainClass {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		Country country = (Country) context.getBean("country");
		System.out.println(country.getStatesName());
		System.out.println(country.getStatesList());
		System.out.println(country.getStatesSet());
		context.registerShutdownHook();
	}
}
