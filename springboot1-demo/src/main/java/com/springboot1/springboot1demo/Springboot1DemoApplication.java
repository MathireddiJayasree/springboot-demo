package com.springboot1.springboot1demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springboot1.springboot1demo.sub1.SpringComponent;

@SpringBootApplication
public class Springboot1DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext =SpringApplication.run(Springboot1DemoApplication.class, args);
		SpringComponent component = applicationContext.getBean(SpringComponent.class);
		System.out.println(component.getMsg());
	}   

}
