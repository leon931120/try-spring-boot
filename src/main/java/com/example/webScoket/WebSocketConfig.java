package com.example.webScoket;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * @projectName try-spring-boot
 * @packageName com.example.webScoket
 * @className WebScoketConfig
 * @author： liuwei
 * @version： 1.0
 * @since： 2019-09-18 09:35
 * <p>Description: ${DESCRIPTION} </p>
 * <p>Copyright: Copyright (C) 2012-2019</p>
 * <p>Company: Beijing GS Technology Co., Ltd</p>
 */
@Configuration
public class WebSocketConfig {
    @Bean
    public ServerEndpointExporter  serverEndpointExporter(){
        return new ServerEndpointExporter();
    }
}
