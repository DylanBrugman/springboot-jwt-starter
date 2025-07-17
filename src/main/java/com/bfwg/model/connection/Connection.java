package com.bfwg.model.connection;

import com.bfwg.model.User;

import java.time.LocalDateTime;

public class Connection {
    private Long id;
    private String requestMessage;
    private ReplyStatus replyStatus;
    private User sender;
    private User receiver;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
    private LocalDateTime replyDate;
}

