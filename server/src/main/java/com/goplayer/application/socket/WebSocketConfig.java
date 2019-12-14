package com.goplayer.application.socket;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.server.standard.ServletServerContainerFactoryBean;

@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {
	
	private final int SIZE_CONTAINER = 512*2048;
	private final Long TIMEOUT = (long) 60*60*1000;
	
	@Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(myHandler(), "/wsgoplayer").setAllowedOrigins("*");
    }

    @Bean
    public WebSocket myHandler() {
        return new WebSocket();
    }
    
    @Bean
    public ServletServerContainerFactoryBean createWebSocketContainer() {
        ServletServerContainerFactoryBean container = new ServletServerContainerFactoryBean();
        container.setMaxTextMessageBufferSize(SIZE_CONTAINER);
        container.setMaxBinaryMessageBufferSize(SIZE_CONTAINER);
        container.setMaxSessionIdleTimeout(TIMEOUT);
        container.setAsyncSendTimeout(TIMEOUT);
        return container;
    }
}