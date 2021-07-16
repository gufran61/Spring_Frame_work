package com.springcore.sterotypeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("com/springcore/sterotypeAnnotation/config.xml");
Student bean = ac.getBean("ob",Student.class);
System.out.println(bean.hashCode()+"     student bean");
Student bean1 = ac.getBean("ob",Student.class);
System.out.println(bean1.hashCode()+"    student bean1");
Teacher bean2 = ac.getBean("t",Teacher.class);
System.out.println(bean2.hashCode()+"    teacher bean2");
Teacher bean3 = ac.getBean("t",Teacher.class);
System.out.println(bean3.hashCode()+"    teacher bean3");
}
}
