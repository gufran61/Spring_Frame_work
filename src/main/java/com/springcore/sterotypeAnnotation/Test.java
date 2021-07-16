package com.springcore.sterotypeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("com/springcore/sterotypeAnnotation/config.xml");
Student bean = ac.getBean("ob",Student.class);
System.out.println(bean);
System.out.println("-------------------");
System.out.println(bean.getAdress());
System.out.println(bean.getAdress().getClass().getName());
}
}
