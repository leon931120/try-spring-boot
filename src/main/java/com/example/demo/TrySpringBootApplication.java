package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;

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
@SpringBootApplication
@Slf4j
public class TrySpringBootApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext application = SpringApplication.run(TrySpringBootApplication.class, args);
        log.info("=======================================");
        log.info("spring boot application run successful!");
        log.info("=======================================");
    }
}
