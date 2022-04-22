package com.app.springwebsocketexp.model;

import lombok.Data;

import java.util.Date;

@Data
public class ChatIncomingMessage {
    private String senderId;
    private String senderName;
    private String message;
    private Date timestamp;

    public ChatIncomingMessage(){
        this.timestamp = new Date();
    }
}