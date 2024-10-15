package com.nkdebug.springcore;

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
       
    //	Car car = new Car();
    //	car.drive();
    	
       //	Vehicle object = new Car();
    //	object.ride();
    	
    
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/nkdebug/springcore/spring.xml");
    	
    	
    	
      	Vehicle object = (Vehicle)context.getBean("car");
    	 object.ride();
    	
    	
    //	Tyre tyre = (Tyre)context.getBean("tyre");
    	//System.out.println(tyre);
    	
    	
    }
}
