package com.sandbox.controller;
import com.sandbox.model.SearchRequest;
import com.sandbox.service.ChatGPTService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ChatGPTRestController {

    ChatGPTService chatGPTRestController;

    public ChatGPTRestController(ChatGPTService chatGPTRestController){
        this.chatGPTRestController =  chatGPTRestController;
    }

    @PostMapping("/searchChatGPT")
    public String searchChatGPT(@RequestBody SearchRequest searchRequest) {

        System.out.println("searchChatGPT: Query="+searchRequest.getQuery());
        return chatGPTRestController.processSearch(searchRequest.getQuery());
       //return "Hello ***************";
    }

}

