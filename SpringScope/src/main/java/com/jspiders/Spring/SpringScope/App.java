package com.jspiders.Spring.SpringScope;

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
        Switch s=(Switch)bean.getBean("switchId");
        Switch s1=(Switch)bean.getBean("switchId");
        s.turnOn();
        System.out.println(s);
        System.out.println(s1);
    }
}
