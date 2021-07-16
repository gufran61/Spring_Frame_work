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
    	System.out.println(bean);
    	System.out.println(bean.getFriends().getClass().getName());
    	System.out.println("---------------------------------------");
    	System.out.println(bean.getFeesStructure());
    	System.out.println(bean.getFeesStructure().getClass().getName());
    	System.out.println("-------------------------------");
    	System.out.println(bean.getProp());
    	System.out.println(bean.getProp().getClass().getName());
    }
}
