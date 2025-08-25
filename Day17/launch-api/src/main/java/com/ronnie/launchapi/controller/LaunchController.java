package com.ronnie.launchapi.controller;

import com.ronnie.launchapi.model.Launch;
import com.ronnie.launchapi.service.LaunchService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/launches")
public class LaunchController {

    private final LaunchService launchService;

    public LaunchController(LaunchService launchService) {
        this.launchService = launchService;
    }

    public List<Launch> getUpcomingLaunches() {
        return launchService.getUpcomingLaunches();
    }

}
