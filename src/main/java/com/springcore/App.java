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
    	Addition bean = (Addition) ac.getBean("add");
    	System.out.println(bean);
    	bean.doSum();
    }
}
