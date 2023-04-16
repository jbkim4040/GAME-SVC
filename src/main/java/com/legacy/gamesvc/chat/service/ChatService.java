package com.legacy.gamesvc.chat.service;

import com.legacy.gamesvc.chat.dto.ChatDTO;

import java.util.List;

/**
 * packageName    : com.legacy.gamesvc.chat.service
 * fileName       : ChatService
 * author         : jbkim
 * date           : 2023-04-15
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-04-15        jbkim       최초 생성
 */
public interface ChatService {
    public void saveMessage(ChatDTO chatDTO);

    public List<ChatDTO> retrieveMessage();

    public List<ChatDTO> retrieveMessage(String userId);
}
