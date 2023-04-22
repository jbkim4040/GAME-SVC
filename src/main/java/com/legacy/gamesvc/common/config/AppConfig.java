package com.legacy.gamesvc.common.config;

import com.legacy.gamesvc.chat.controller.ChatController;
import com.legacy.gamesvc.chat.repository.ChatRepository;
import com.legacy.gamesvc.chat.repository.ChatRepositoryOnMeomory;
import com.legacy.gamesvc.chat.service.ChatService;
import com.legacy.gamesvc.chat.service.ChatServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.handler.TextWebSocketHandler;

/**
 * packageName    : com.legacy.gamesvc.common.config
 * fileName       : AppConfig
 * author         : jbkim
 * date           : 2023-04-15
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-04-15        jbkim       최초 생성
 */

@Configuration
public class AppConfig {

    @Bean
    public ChatRepository chatRepository() {
        return new ChatRepositoryOnMeomory();
    }

    @Bean
    public ChatService chatService() {
        return new ChatServiceImpl(chatRepository());
    }
}
