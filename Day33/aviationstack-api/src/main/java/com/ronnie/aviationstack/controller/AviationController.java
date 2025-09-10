package com.ronnie.aviationstack.controller;

import com.ronnie.aviationstack.service.AviationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/aviation")
public class AviationController {

    @Autowired
    private AviationService aviationService;

    @GetMapping("/flights")
    public Map<String, Object> getFlights(@RequestParam String accessKey) {
        return aviationService.getFlights(accessKey);
    }
}
