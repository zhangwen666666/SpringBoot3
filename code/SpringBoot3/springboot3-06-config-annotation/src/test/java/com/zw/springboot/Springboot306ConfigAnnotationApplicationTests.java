package com.zw.springboot;

import com.zw.springboot.bean.Address;
import com.zw.springboot.bean.User;
import com.zw.springboot.config.App2Config;
import com.zw.springboot.config.AppConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot306ConfigAnnotationApplicationTests {

    @Autowired
    private AppConfig config;

    @Autowired
    private User user;

    @Autowired
    private Address address;

    @Autowired
    private App2Config app2Config;

    @Test
    void test01() {
        System.out.println(config);
    }

    @Test
    void test02(){
        System.out.println(address);
        System.out.println(user);
    }

    @Test
    void test03(){
        System.out.println(app2Config);
    }
}
