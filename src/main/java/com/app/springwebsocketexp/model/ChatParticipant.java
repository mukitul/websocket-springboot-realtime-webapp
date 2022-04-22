package com.app.springwebsocketexp.model;

import com.app.springwebsocketexp.common.ParticipantType;
import lombok.Data;

@Data
public class ChatParticipant {
    private String firstName;
    private String lastName;
    private String shortName;
    private ParticipantType participantType;
}