package com.zw.springboot;

import com.zw.springboot.bean.Vip;
import com.zw.springboot.service.VipService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@MapperScan(basePackages = {"com.zw.springboot.repository"})
public class Springboot307MybatisApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(Springboot307MybatisApplication.class, args);
		VipService vipService = applicationContext.getBean(VipService.class);
		vipService.save(new Vip("jack", "1234567890", "1999-10-11"));
		vipService.save(new Vip("lucy", "1234567891", "1998-11-11"));
		vipService.findAll().forEach(System.out::println);
	}

}
