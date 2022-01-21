package com.xy.boot.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 *
 * @author XiaoYi
 * Created on 2022/1/20.
 */

@RestController
public class HelloSecurity {

    @GetMapping("/")
    public String index(){
        return "Hello, Spring Security";
    }
}
