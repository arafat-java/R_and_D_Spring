package com.arafat.spring.beanconfiguration.javaconfigusingbeanannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainProg {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);

		HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
		System.out.println("HelloWorld returned: " + helloWorld.test());
		((AnnotationConfigApplicationContext)ctx).close();
	}
}