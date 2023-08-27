package com.jspiders.Spring.VehicleSpeed;

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
        Vehicle v=(Vehicle)bean.getBean("bikeSpeed");
        v.findTheSpeed();
        
        Vehicle v1=(Vehicle)bean.getBean("carSpeed");
        v1.findTheSpeed();
        System.out.println(v1);
        Vehicle v2=(Vehicle)bean.getBean("carSpeed");
        v2.findTheSpeed();
        System.out.println(v2);
    }
}
