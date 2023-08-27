package com.jspiders.Spring.Customer;

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
		ApplicationContext bean=new ClassPathXmlApplicationContext("spring.xml");
		Customer cr=(Customer)bean.getBean("customer");
		cr.productDetails();
	}
}
