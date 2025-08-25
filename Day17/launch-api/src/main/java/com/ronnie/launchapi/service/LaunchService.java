package com.ronnie.launchapi.service;

import com.ronnie.launchapi.model.Launch;
import com.ronnie.launchapi.model.LaunchResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class LaunchService {
    private static final String UPCOMING_URL = "https://ll.thespacedevs.com/2.2.0/launch/upcoming?limit=5";

    public List<Launch> getUpcomingLaunches() {
        RestTemplate restTemplate = new RestTemplate();
        LaunchResponse response = restTemplate.getForObject(UPCOMING_URL, LaunchResponse.class);

        return response != null ? response.getResults() : null;
    }
}
