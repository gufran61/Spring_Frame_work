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
    	A bean = (A) ac.getBean("aref");
    	System.out.println(bean.getX()+" "+bean.getB());
    }
}
