package com.javaLive.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javaLive.beans.map.Bank;

public class MapMainClass {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		Bank bank = (Bank) context.getBean("bank");
		System.out.println("Bank Name :" + bank.getName());
		System.out.println("Bank Timings :" + bank.getTimings());
		System.out.println("Bank Accounts :" + bank.getAccounts());
		context.registerShutdownHook();
	}

}
