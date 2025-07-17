package com.bfwg.model.chat;

import java.time.LocalDateTime;

public class ChatMessage {
    private Long id;
    private Long userId;
    private String message;
    private LocalDateTime createDate;
    private LocalDateTime editDate;
}
