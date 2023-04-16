package com.legacy.gamesvc.chat.service;

import com.legacy.gamesvc.chat.dto.ChatDTO;
import com.legacy.gamesvc.chat.repository.ChatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ChatServiceImpl implements ChatService{

    private final ChatRepository chatRepository;

    @Override
    public void saveMessage(ChatDTO chatDTO) {
        chatRepository.save(chatDTO);
    }

    @Override
    public List<ChatDTO> retrieveMessage() {
        return chatRepository.findAll();
    }

    @Override
    public List<ChatDTO> retrieveMessage(String userId){ return chatRepository.findAllByUserId(userId); }
}