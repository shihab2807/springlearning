package com.jspiders.Spring.UserManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import com.jspiders.usermanagement.component.User;
import com.jspiders.usermanagement.repositary.UserRepositary;

/**
 * Hello world!
 *
 */
@Controller
public class App 
{
	@Autowired
	static UserRepositary rep;
    public static void main( String[] args )
    {
    	User u1=new User();
    	u1.setuId(101);
    	u1.setuName("Ram");
    	u1.setuPassword(12345678);
    	
    	User u2=new User();
    	u2.setuId(102);
    	u2.setuName("Bheem");
    	u2.setuPassword(87654321);
    	ApplicationContext bean=new ClassPathXmlApplicationContext("spring.xml");
    	
    	rep=bean.getBean(UserRepositary.class);
    	rep.saveUser2(u1);
//    	rep.saveUser1(u2);
    }
}
