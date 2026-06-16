package com.pragma.chat;

import com.pragma.chat.application.ChatService;
import com.pragma.chat.domain.Message;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ChatServiceTest {
    @Autowired
    private ChatService chatService;

    @Test
    void sendMessageTest() {
        Message message = new Message("sender", "content", "timestamp");
        Message sentMessage = chatService.sendMessage(message);
        assertEquals(message, sentMessage);
    }
}