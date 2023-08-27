package com.jspiders.Spring.SpringCoreDemo;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App 
{
	@SuppressWarnings("deprecation")
	public static void main( String[] args )
	{
		//      XmlBeanFactory xmlBeanFactory=new XmlBeanFactory(new ClassPathResource("spring.xml"));

		//   WheelManufacturing w=(WheelManufacturing)xmlBeanFactory.getBean("wheel");
		ApplicationContext bean=new ClassPathXmlApplicationContext("spring.xml");
		WheelManufacturing w=(WheelManufacturing)bean.getBean("wheel");

		w.manufacture();
	
	}
}
