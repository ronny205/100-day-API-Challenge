package com.ronnie.lastfm.controller;

import com.ronnie.lastfm.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/artist")
public class ArtistController {

    @Autowired
    private ArtistService artistService;

    @GetMapping
    public Map<String, Object> getArtistDetails(@RequestParam String name) {
        return artistService.getArtistDetails(name);
    }
}
