package com.jspiders.Spring.AutoWireByConstructor;

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
       Vehicles v=(Vehicles) bean.getBean("veh");
       v.showBrand();
    }
}
