package com.bfwg.model.chat;

import com.bfwg.model.User;

import java.time.LocalDateTime;

public class ChatMember {
    private Long id;
    private Long chatId;
    private User user;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
}
