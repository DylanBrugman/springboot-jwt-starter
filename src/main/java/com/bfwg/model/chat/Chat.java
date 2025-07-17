package com.bfwg.model.chat;

import java.time.LocalDateTime;
import java.util.List;

public class Chat {
    private Long id;
    private Long connectionId;
    private List<ChatMessage> chatMessages;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
}

