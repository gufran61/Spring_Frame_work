package com.springcore.autowinring.annotaion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("com/springcore/autowinring/annotaion/config.xml");
	Empl bean = ac.getBean("emp1",Empl.class );
	System.out.println(bean);
}
}
