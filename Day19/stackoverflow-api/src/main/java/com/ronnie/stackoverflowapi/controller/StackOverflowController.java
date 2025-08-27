package com.example.stackoverflowapi.controller;

import com.example.stackoverflowapi.model.StackOverflowResponse;
import com.example.stackoverflowapi.service.StackOverflowService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/stackoverflow")
public class StackOverflowController {

    private final StackOverflowService stackOverflowService;

    public StackOverflowController(StackOverflowService stackOverflowService) {
        this.stackOverflowService = stackOverflowService;
    }

    @GetMapping("/questions")
    public StackOverflowResponse getLatestQuestions() {
        return stackOverflowService.getLatestQuestions();
    }
}
