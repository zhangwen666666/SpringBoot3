package com.zw.lombok.test;

import com.zw.lombok.bean.User;

public class Test {
    public static void main(String[] args) {
        User user = new User();
        user.setName("张三");
        user.setAge(20);
        user.setId(111);
        System.out.println(user);

        User lisi = new User("lisi", 18, 222);
        System.out.println(lisi);
    }
}
