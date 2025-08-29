package com.ronnie.synonymsapi.controller;

import com.ronnie.synonymsapi.server.SynonymService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/synonyms")
public class SynonymController {

    private final SynonymService synonymService;

    public SynonymController(SynonymService synonymService) {
        this.synonymService = synonymService;
    }

    @GetMapping("/{word}")
    public ResponseEntity<?> getSynonyms(@PathVariable String word) {
        return ResponseEntity.ok(synonymService.fetchSynonyms(word));
    }
}

