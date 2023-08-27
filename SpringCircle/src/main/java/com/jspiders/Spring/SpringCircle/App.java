package com.jspiders.Spring.SpringCircle;

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
      Circle c=(Circle)bean.getBean("circle");
      c.areaOfCircle();
    }
}
