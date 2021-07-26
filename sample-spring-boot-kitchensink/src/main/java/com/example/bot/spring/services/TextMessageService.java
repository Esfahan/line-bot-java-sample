package com.example.bot.spring.services;

import com.example.bot.spring.repositories.TextMessageRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TextMessageService {
    private String replyTextMessage;
    private boolean replyFlg;

    @Autowired
    TextMessageRepository textMessageRepository;

    public void fetchReplyTextMessage (String message) {
        log.info("fetchReplyTextMessage is called: {}", message);

        Integer id = replyId(message);
        if (id > 0) {
            this.replyTextMessage = textMessageRepository.findById(id).get().message;
            this.replyFlg = true;
        } else {
            this.replyFlg = false;
        }
    }

    public String getReplyMessage() {
        return this.replyTextMessage;
    }

    public boolean getReplyFlg() {
        return this.replyFlg;
    }

    private Integer replyId(String message) {
        switch (message) {
            case "ハロー": {
                return 1;
            }
            case "hello": {
                return 2;
            }
            default: {
                return 0;
            }
        }
    }
}
