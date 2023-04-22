package com.legacy.gamesvc.common.config;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.socket.*;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.time.LocalDateTime;

@Slf4j
public class SocketHandler implements WebSocketHandler {
    private final LocalDateTime now = LocalDateTime.now();

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {

        String user = (String) session.getAttributes().get("user");

        if (user == null) throw new Exception("존재하지 않는 고객 정보입니다.");


        log.info(now + " :: " + user + "님이 입장하셨습니다.");
    }

    @Override
    public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
        String user = (String) session.getAttributes().get("user");

        if (user == null) throw new Exception("존재하지 않는 고객 정보입니다.");
    }

    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {

    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {

        String user = (String) session.getAttributes().get("user");

        if (user == null) throw new Exception("존재하지 않는 고객 정보입니다.");

        log.info(now + " :: " + user + "님이 퇴장하셨습니다.");
    }

    @Override
    public boolean supportsPartialMessages() {
        return false;
    }
}
