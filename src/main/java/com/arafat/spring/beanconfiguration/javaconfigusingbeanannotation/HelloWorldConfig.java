package com.arafat.spring.beanconfiguration.javaconfigusingbeanannotation;

import org.springframework.context.annotation.*;

@Configuration
public class HelloWorldConfig {

	@Bean
	public HelloWorld helloWorld() {
		return new HelloWorld();
	}
}