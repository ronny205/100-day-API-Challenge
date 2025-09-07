package com.ronnie.bibleverse.controller;


import com.ronnie.bibleverse.service.BibleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/bible")
public class BibleController {

    @Autowired
    private BibleService bibleService;

    @GetMapping("/verse")
    public Map<String, Object> getVerse(@RequestParam String passage) {
        return bibleService.getVerse(passage);
    }
}
