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
    	Emp bean = (Emp) ac.getBean("emp");
    	System.out.println(bean.getName());
    	System.out.println(bean.getAdress());
    	System.out.println(bean.getCourse());
    	System.out.println(bean.getPhones());
    }
}
