package com.zw.springboot.config;

import com.zw.springboot.bean.Address;
import com.zw.springboot.bean.User;
import com.zw.springboot.bean.Vip;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


@Component
@ConfigurationProperties("app2")
public class App2Config {
    private String[] hobbies;
    private User[] users;
    private List<Vip> vips;
    private Map<String, Address> addrs;

    @Override
    public String toString() {
        return "App2Config{" +
                "\n hobbies=" + Arrays.toString(hobbies) +
                ",\n users=" + Arrays.toString(users) +
                ",\n vips=" + vips +
                ",\n addrs=" + addrs +
                '}';
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public List<Vip> getVips() {
        return vips;
    }

    public void setVips(List<Vip> vips) {
        this.vips = vips;
    }

    public Map<String, Address> getAddrs() {
        return addrs;
    }

    public void setAddrs(Map<String, Address> addrs) {
        this.addrs = addrs;
    }
}
