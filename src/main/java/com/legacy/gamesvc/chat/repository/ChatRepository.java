package com.legacy.gamesvc.chat.repository;

import com.legacy.gamesvc.chat.dto.ChatDTO;

import java.util.List;

public interface ChatRepository {

    public void save(ChatDTO chatDTO);

    public List<ChatDTO> findAll();

    public List<ChatDTO> findAllByUserId(String userId);
}
