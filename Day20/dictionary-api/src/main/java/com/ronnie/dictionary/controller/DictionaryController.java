package com.ronnie.dictionary.controller;


import com.ronnie.dictionary.model.DictionaryResponse;
import com.ronnie.dictionary.service.DictionaryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dictionary")
public class DictionaryController {

    private final DictionaryService dictionaryService;

    public DictionaryController(DictionaryService dictionaryService) {
        this.dictionaryService = dictionaryService;
    }

    @GetMapping("/{word}")
    public List<DictionaryResponse> getMeaning(@PathVariable String word) {
        return dictionaryService.getWordMeaning(word);
    }
}
