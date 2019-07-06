package com.arafat.spring.beanconfiguration.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/arafat/spring/beanconfiguration/xmlconfig/Beans.xml");

		HelloWorld helloWorldBean = (HelloWorld) ctx.getBean(HelloWorld.class);
		System.out.println("HelloWorld - " + helloWorldBean.getMessage());

		((ClassPathXmlApplicationContext)ctx).close();
	}
}