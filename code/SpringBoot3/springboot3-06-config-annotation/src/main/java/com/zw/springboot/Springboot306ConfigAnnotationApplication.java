package com.zw.springboot;

import com.zw.springboot.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties(AppConfig.class)
public class Springboot306ConfigAnnotationApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Springboot306ConfigAnnotationApplication.class, args);
        AppConfig appConfig = applicationContext.getBean(AppConfig.class);
        System.out.println(appConfig);
    }

}
