package com.zw.springboot.bean;

import org.springframework.stereotype.Component;

@Component
public class Vip {
    private Integer id;
    private String name;
    private Character sex;
    private Address address;

    @Override
    public String toString() {
        return "\n\tVip{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", address=" + address +
                '}';
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }
}
