package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[] args) {
	AbstractApplicationContext ac = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
	ac.registerShutdownHook();
	/*
	 * Samosa bean = (Samosa) ac.getBean("s"); System.out.println(bean.getPrice());
	 */
	
	Pepsi pep = (Pepsi) ac.getBean("p");
	System.out.println(pep);
}
}
