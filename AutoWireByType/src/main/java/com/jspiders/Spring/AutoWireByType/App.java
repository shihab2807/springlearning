package com.jspiders.Spring.AutoWireByType;

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
        Vehicles1 v=(Vehicles1)bean.getBean("vehi");
        v.showBrand();
    }
}
