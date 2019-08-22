package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


/**
 * @projectName try-spring-boot
 * @packageName com.example.demo
 * @className TrySpringBootApplication
 * @author： liuwei
 * @version： 1.0
 * @since： 2019-08-23 07:14
 * <p>Description: ${DESCRIPTION} </p>
 * <p>Copyright: Copyright (C) 2012-2019</p>
 * <p>Company: Beijing GS Technology Co., Ltd</p>
 */
// spring boot 的启动注解 ，内部实现了自动装配 ，内置tomcat
@SpringBootApplication
// 日志注解
@Slf4j
public class TrySpringBootApplication {

    // spring boot 的 启动类
    public static void main(String[] args) {
        ConfigurableApplicationContext application = SpringApplication.run(TrySpringBootApplication.class, args);
        log.info("=======================================");
        log.info("spring boot application run successful!");
        log.info("=======================================");
    }
}
