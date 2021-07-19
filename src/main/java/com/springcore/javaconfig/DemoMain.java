package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMain {
public static void main(String[] args) {
	ApplicationContext ac=new AnnotationConfigApplicationContext(JavaConfig.class);
	Student st = ac.getBean("gufran",Student.class);
	System.out.println(st);
	st.reading();
}
}
