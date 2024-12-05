package com.zw.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.zw.springboot.mapper")
public class Springboot312PhApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot312PhApplication.class, args);
	}

}
