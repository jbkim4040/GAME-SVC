package com.legacy.gamesvc.chat.dto;


import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ChatDTO {
    @Setter private int chatId;
    private String userId;
    private String message;

    private final String regDate = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy년MM월dd일"));
    private final String regTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH시mm분ss초"));


    @Builder
    public ChatDTO(String userId, String message) {
        this.userId = userId;
        this.message = message;
    }
}