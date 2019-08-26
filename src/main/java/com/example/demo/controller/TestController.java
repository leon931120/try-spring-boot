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
// spring 常用注解之一  标记此类为controller层，把这个类交个spring容器管理，实现ioc与di
@RestController
@Slf4j
/**  spring 常用注解之一 可以实现在类上也可以实现在方法上
 *  为方法提供路径url
 *  服务器地址+端口+类url+方法url 为访问此方法的全路径
 *  example: localhost:8080/com/test
 */
@RequestMapping("/com")
public class TestController {

    // 使用get 方法
    @GetMapping("/test")
    public String test() {
        // return 字d符串
        return "hello world";
    }
}
