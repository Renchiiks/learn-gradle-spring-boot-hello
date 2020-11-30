package com.gradle.demo;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyClass extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		//System.out.println("started");
		from("file:data/input?noop=true")
		.bean("methodClass", "printMessage")
		.to("file:data/output");
		//System.out.println("ended");
		
	}
}
