package com.gfg.jdbl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class   JdblApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(JdblApplication.class, args);
		Calculator calculator=applicationContext.getBean(Calculator.class);
		System.out.println(calculator.mul(3.0f,2.0f));
	}

}
