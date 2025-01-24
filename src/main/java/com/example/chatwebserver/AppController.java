package com.example.chatwebserver;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@RestController
public class AppController {
    public Map<String, String> msgStored = new ConcurrentHashMap<>();

    @PostMapping
    public String sendMessage(@RequestBody Msg msg, Model model) {
        return "view";
    }
}
