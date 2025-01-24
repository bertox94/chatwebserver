package com.example.chatwebserver;

import com.example.chatwebserver.message.Message;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @PostMapping
    public String sendMessage(@RequestBody Message msg, Model model) {
        return "testSendMessage";
    }

    @GetMapping
    public String getMessages(Model model) {
        model.addAttribute("msgs", "[\"msg1\",\"msg2\",\"msg3\"]");
        return "testGetMessages";
    }
}
