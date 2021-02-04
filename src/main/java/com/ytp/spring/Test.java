package com.ytp.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com.ytp.spring/Collections/collection.xml");
		Collections collection1=(Collections) context.getBean("collection1");
		
		System.out.println(collection1.getName());
		System.out.println(collection1.getAddresses());
		System.out.println(collection1.getCourses());
	
	}

}
