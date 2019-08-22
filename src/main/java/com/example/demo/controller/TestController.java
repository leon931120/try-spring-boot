package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @projectName try-spring-boot
 * @packageName com.example.demo.controller
 * @className TestController
 * @author： liuwei
 * @version： 1.0
 * @since： 2019-08-23 07:36
 * <p>Description: ${DESCRIPTION} </p>
 * <p>Copyright: Copyright (C) 2012-2019</p>
 * <p>Company: Beijing GS Technology Co., Ltd</p>
 */
@RestController
@Slf4j
@RequestMapping("/com")
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "hello world";
    }
}
