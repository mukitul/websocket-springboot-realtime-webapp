package com.app.springwebsocketexp.controller;

import com.app.springwebsocketexp.model.ChatIncomingMessage;
import com.app.springwebsocketexp.model.ChatOutgoingMessage;
import org.springframework.http.MediaType;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(value = "/ws", produces = MediaType.APPLICATION_JSON_VALUE)
public class WsController {

    @MessageMapping("/guestchat")
    @SendTo("/topic/guestchats")
    public ChatOutgoingMessage handleMessaging(ChatIncomingMessage chatIncomingMessage) throws InterruptedException {
        ChatOutgoingMessage chatOutgoingMessage = new ChatOutgoingMessage();
        Thread.sleep(1000);
        chatOutgoingMessage.setContent(chatIncomingMessage.getMessage());
        chatOutgoingMessage.setTimestamp(new Date());
        return chatOutgoingMessage;
    }

    @MessageMapping("/guestupdate")
    @SendTo("/topic/guestupdates")
    public ChatOutgoingMessage handleUserIsTyping(ChatIncomingMessage chatIncomingMessage) throws InterruptedException {
        ChatOutgoingMessage chatOutgoingMessage = new ChatOutgoingMessage();
        chatOutgoingMessage.setContent("Someone is typing...");
        chatOutgoingMessage.setTimestamp(new Date());
        return chatOutgoingMessage;
    }


}
