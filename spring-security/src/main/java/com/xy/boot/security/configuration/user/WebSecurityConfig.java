package com.xy.boot.security.configuration.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * description
 *
 * @author XiaoYi
 * Created on 2022/1/20.
 */

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsService userDetailsService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        /*
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String password = passwordEncoder.encode("2");
        auth.inMemoryAuthentication().withUser("b").password(password).roles("admin");
        */

        auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder());
    }

    @Bean
    public PasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }

   /*
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            // 认证配置
            .authorizeRequests()
            // 任何请求
            .anyRequest()
            // 都需要身份认证
            .authenticated()
            .and()
            // 表单登录
            .formLogin().loginPage("/myLogin.html")
            .loginProcessingUrl("/login")
            .permitAll()
            .and().csrf().disable();
    }
    */
}
