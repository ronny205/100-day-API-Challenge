package com.ronnie.tides.controller;

import com.ronnie.tides.model.TideResponse;
import com.ronnie.tides.service.TideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TideController {

    @Autowired
    private TideService tideService;

    @GetMapping("/api/tides")
    public TideResponse getTides(@RequestParam double lat, @RequestParam double lon) {
        return tideService.getTides(lat, lon);
    }
}
