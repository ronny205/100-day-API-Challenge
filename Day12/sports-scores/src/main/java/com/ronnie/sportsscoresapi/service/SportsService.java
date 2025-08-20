package com.ronnie.sportsscoresapi.service;

import com.ronnie.sportsscoresapi.model.EventResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SportsService {

    private static final String LEAGUE_EVENTS_URL = "https://www.thesportsdb.com/api/v1/json/3/eventspastleague.php?id={leagueId}";

    public EventResponse getLatestEvents(String leagueId) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(LEAGUE_EVENTS_URL, EventResponse.class, leagueId);
    }
}
