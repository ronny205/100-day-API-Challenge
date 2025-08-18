package com.ronnie.covidstat.service;

import com.ronnie.covidstat.model.CovidStats;
import org.springframework.web.client.RestTemplate;

public class CovidStatsService {

    private static final String GLOABL_URL = "https://disease.sh/v3/covid-19/all";
    private static final String COUNTRY_URL = "https://disease.sh/v3/covid-19/countries/{country}";

    public CovidStats fetchGloabalStats() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(GLOABL_URL, CovidStats.class);
    }

    public CovidStats fetchCountryStats(String Country) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(COUNTRY_URL, CovidStats.class, country);

    }
}
