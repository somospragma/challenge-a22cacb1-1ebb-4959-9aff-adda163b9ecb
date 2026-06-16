package com.pragma.chat.application;

import com.pragma.chat.domain.Message;
import org.springframework.stereotype.Service;

@Service
public class ChatService {
    public Message sendMessage(Message message) {
        // Lógica para enviar el mensaje
        return message;
    }
}