package com.ronnie.newsapi.controller;


import com.ronnie.newsapi.service.NewsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/news")
public class NewsController {

    private final NewsService newsService;

    public NewsController(NewsService newsService){
        this.newsService = newsService;
    }

    @GetMapping("/top-headlines")
    public String getTopHeadlines(@RequestParam(defaultValue = "us") String country) {
        return newsService.getTopHeadlines(country);
    }

}
