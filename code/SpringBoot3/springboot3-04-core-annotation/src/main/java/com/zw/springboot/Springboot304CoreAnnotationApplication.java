package com.zw.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springboot304CoreAnnotationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(Springboot304CoreAnnotationApplication.class, args);
		Object sqlSessionFactory = applicationContext.getBean("sqlSessionFactory");
		System.out.println(sqlSessionFactory);
		Object transactionManager = applicationContext.getBean("transactionManager");
		System.out.println(transactionManager);

	}

}
