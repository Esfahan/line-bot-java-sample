package com.example.bot.spring.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="text_messages")
public class TextMessageModel {
    @Id
    private Integer id;

    public String message;
}
