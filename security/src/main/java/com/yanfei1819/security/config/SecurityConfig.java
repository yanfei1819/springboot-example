package com.yanfei1819.security.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by 追梦1819 on 2019-06-27.
 */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

//        super.configure(http);

        // 定制授权规则
        http.authorizeRequests().antMatchers("/").permitAll(). // 所有角色可访问
                antMatchers("/springboot/**").hasAnyRole("admin", "test"). // 只有xx角色才能访问
                antMatchers("/work/**").hasRole("admin"); // 只有xx角色才能访问

        // 开启自动配置的登录功能
        http.formLogin();

//        // 自动配置注销功能
        http.logout()  // 退出并清除session
                .logoutSuccessUrl("/")
                ;  // 定制注销后进入的页面

        http.rememberMe() // 记住功能
                .rememberMeParameter("remember") //自定义rememberMe的name值，默认remember-Me
                .tokenValiditySeconds(10); // 记住时间


    }

    // 定义认证规则
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        super.configure(auth);
//        auth.inMemoryAuthentication()
//                .withUser("admin").password("123456").roles("admin", "test")
//                .and().withUser("test").password("123456").roles("test");

        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder())
                .withUser("admin").password(new BCryptPasswordEncoder().encode("123456")).roles("admin","test")
                .and().passwordEncoder(new BCryptPasswordEncoder())
                .withUser("test").password(new BCryptPasswordEncoder().encode("123456")).roles("test");
    }
}
