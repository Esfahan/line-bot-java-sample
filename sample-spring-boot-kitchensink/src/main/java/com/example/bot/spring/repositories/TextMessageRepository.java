package com.example.bot.spring.repositories;

import com.example.bot.spring.models.TextMessageModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TextMessageRepository extends JpaRepository<TextMessageModel, Integer> {
}
