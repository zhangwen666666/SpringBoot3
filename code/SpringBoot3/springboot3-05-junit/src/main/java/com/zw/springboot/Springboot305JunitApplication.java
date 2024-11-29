package com.zw.springboot;

import com.zw.springboot.bean.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springboot305JunitApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Springboot305JunitApplication.class, args);
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);
    }

}
