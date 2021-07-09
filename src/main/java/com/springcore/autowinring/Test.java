package com.springcore.autowinring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("com/springcore/autowinring/config.xml");
	Empl bean = ac.getBean("emp1",Empl.class );
	System.out.println(bean);
}
}
