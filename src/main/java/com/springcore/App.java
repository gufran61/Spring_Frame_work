package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext ac=new ClassPathXmlApplicationContext("com/springcore/config.xml");
    	Student bean = (Student) ac.getBean("student1");
        System.out.println( bean );
    }
}
