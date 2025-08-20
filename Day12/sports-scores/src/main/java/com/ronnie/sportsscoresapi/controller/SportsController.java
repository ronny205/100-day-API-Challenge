package com.ronnie.sportsscoresapi.controller;

import com.ronnie.sportsscoresapi.model.EventResponse;
import com.ronnie.sportsscoresapi.service.SportsService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sports")
public class SportsController {

    private final SportsService sportsService;

    public SportsController(SportsService sportsService){
        this.sportsService = sportsService;
    }

    public EventResponse getLeagueEvents(@PathVariable String id) {
        return sportsService.getLatestEvents(id);
    }
}
