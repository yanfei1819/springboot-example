package com.yanfei1819.configdemo.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 * Created by 追梦1819 on 2019-05-06.
 */
@Configuration
@ConfigurationProperties(prefix = "jdbc.mysql")
//@PropertySource("classpath:jdbc.properties")
//@PropertySource("classpath:jdbc2.properties")

@PropertySources({
        @PropertySource("classpath:jdbc.properties"),
        @PropertySource("classpath:jdbc2.properties")
})
public class JdbcBean {
    private String driverclassname;
    private String url;
    private String username;
    private String password;
    private String ip;

    public String getDriverclassname() {
        return driverclassname;
    }

    public void setDriverclassname(String driverclassname) {
        this.driverclassname = driverclassname;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "JdbcBean{" +
                "driverclassname='" + driverclassname + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", ip='" + ip + '\'' +
                '}';
    }
}
