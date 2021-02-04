package com.ytp.Theme;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	//Vehicle obj=(Vehicle) context.getBean("car");
    	//obj.drive();
    Tyre t=(Tyre)context.getBean("tyre");
    System.out.println(t);
    
    }
    
}
