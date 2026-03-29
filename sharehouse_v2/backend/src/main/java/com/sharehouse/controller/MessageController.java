package com.sharehouse.controller;

import com.sharehouse.model.PrivateMessage;
import com.sharehouse.repository.PrivateMessageRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    @Autowired
    private PrivateMessageRepository privateMessageRepository;

    @GetMapping("/private")
    public List<PrivateMessage> getPrivateMessages(HttpSession session) {
        Long userId = (Long) session.getAttribute("userid");
        if (userId == null) return null;
        return privateMessageRepository.findByUseridOrSenderid(userId, userId);
    }

    @PostMapping("/private")
    public PrivateMessage sendPrivateMessage(@RequestBody PrivateMessage message, HttpSession session) {
        Long userId = (Long) session.getAttribute("userid");
        if (userId == null) return null;
        message.setSenderid(userId);
        message.setSendTime(new Date());
        return privateMessageRepository.save(message);
    }
}
