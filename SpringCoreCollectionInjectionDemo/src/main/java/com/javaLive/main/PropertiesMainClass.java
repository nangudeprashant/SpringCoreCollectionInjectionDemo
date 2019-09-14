package com.javaLive.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javaLive.beans.map.Bank;
import com.javaLive.beans.properties.DataSource;

public class PropertiesMainClass {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		DataSource dataSource = (DataSource) context.getBean("datasource");
		System.out.println("List of the properties :" + dataSource.getDbProperties().toString());
		context.registerShutdownHook();
	}
}
