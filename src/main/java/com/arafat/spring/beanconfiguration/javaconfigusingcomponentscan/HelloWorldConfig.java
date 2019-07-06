package com.arafat.spring.beanconfiguration.javaconfigusingcomponentscan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.arafat.spring.beanconfiguration.javaconfigusingcomponentscan"})
public class HelloWorldConfig {

}