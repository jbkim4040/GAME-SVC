package com.legacy.gamesvc.chat.controller;

import com.legacy.gamesvc.chat.dto.ChatDTO;
import com.legacy.gamesvc.chat.service.ChatService;
import com.legacy.gamesvc.chat.service.ChatServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * packageName    : com.legacy.gamesvc.chat.controller
 * fileName       : ChatController
 * author         : jbkim
 * date           : 2023-04-15
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-04-15        jbkim       최초 생성
 */
@RestController
@RequestMapping("/api/v1/chat")
@RequiredArgsConstructor
public class ChatController {

    private final ChatService chatService;


    @PostMapping("/")
    public void saveMessage(@RequestBody ChatDTO chatDTO) {
        chatService.saveMessage(chatDTO);
    }


    @GetMapping("/")
    public List<ChatDTO> retrieveMessage() {
        return chatService.retrieveMessage();
    }

    @GetMapping("/{userId}")
    public List<ChatDTO> retrieveMessage(@PathVariable String userId) {
        return chatService.retrieveMessage(userId);
    }
}