package com.legacy.gamesvc.chat.repository;

import com.legacy.gamesvc.chat.dto.ChatDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * packageName    : com.legacy.gamesvc.chat.repository
 * fileName       : ChatRepositoryOnMeomory
 * author         : jbkim
 * date           : 2023-04-15
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-04-15        jbkim       최초 생성
 */
public class ChatRepositoryOnMeomory implements ChatRepository{

    private static int messageId = 1;
    private static List<ChatDTO> chatList = new ArrayList<>();


    @Override
    public void save(ChatDTO chatDTO) {
        chatDTO.setChatId(messageId++);
        chatList.add(chatDTO);
    }

    @Override
    public List<ChatDTO> findAll() {
        return chatList;
    }

    @Override
    public List<ChatDTO> findAllByUserId(String userId) {
        return chatList.stream().filter(dto -> dto.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
