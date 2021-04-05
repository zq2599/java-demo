package com.bolingcavalry.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Description: (这里用一句话描述这个类的作用)
 * @author: willzhao E-mail: zq2599@gmail.com
 * @date: 2021/4/5 15:46
 */
@RestController
@Slf4j
public class Hello {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        log.info("execute hello");
        return "hello " + new Date();
    }
}
