package com.arafat.spring.beanconfiguration.javaconfigusingcomponentscan;

import org.springframework.stereotype.Service;

@Service
public class HelloWorld {

	public String test() {
		return "Bean created via componentscan";
	}
}