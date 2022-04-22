package com.app.springwebsocketexp.model;

import lombok.Data;

import java.util.Date;

@Data
public class ChatOutgoingMessage {
    private String content;
    private String groupName;
    private Date timestamp;
}