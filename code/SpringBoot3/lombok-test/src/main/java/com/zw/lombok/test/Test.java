package com.zw.lombok.test;

import com.zw.lombok.bean.User;

public class Test {
    public static void main(String[] args) {
/*        User user = new User();
        user.setName("张三");
        user.setAge(20);
        user.setId(111);
        System.out.println(user);

        User lisi = new User("lisi", 18, 222);
        System.out.println(lisi);

        User user1 = new User("jlfasj", 1, 39178);
        User user2 = new User("faskldj;", 1, 71429);
        System.out.println(user1.equals(user2));*/

        User user = User.builder().id(1).age(10).name("张三").build();
        System.out.println(user);
    }
}
