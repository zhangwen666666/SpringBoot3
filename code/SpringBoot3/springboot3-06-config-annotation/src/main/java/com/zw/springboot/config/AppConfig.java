package com.zw.springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("a")
public class AppConfig {
    private String username;
    private String password;

    @Override
    public String toString() {
        return "AppConfig{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
