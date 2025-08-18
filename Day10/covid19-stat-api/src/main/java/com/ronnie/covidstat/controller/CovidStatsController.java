package com.ronnie.covidstat.controller;

import com.ronnie.covidstat.model.CovidStats;
import com.ronnie.covidstat.service.CovidStatsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/covid")
public class CovidStatsController {

    private final CovidStatsService covidStatsService;

    public CovidStatsController( CovidStatsService covidStatsService){
        this.covidStatsService = covidStatsService;
    }

    @GetMapping("/global")
    public CovidStats getGlobalStats() {
        return covidStatsService.fetchGloabalStats();
    }

    @GetMapping("/country/{name}")
    public CovidStats getCountryStats(@PathVariable String name){
        return covidStatsService.fetchCountryStats(name);
    }

}
