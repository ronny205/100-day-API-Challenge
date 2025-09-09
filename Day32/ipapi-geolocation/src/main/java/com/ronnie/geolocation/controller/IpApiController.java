package com.ronnie.geolocation.controller;

import com.ronnie.geolocation.service.IpApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/ip")
public class IpApiController {

    @Autowired
    private IpApiService ipApiService;

    @GetMapping("/geolocation/{ip}")
    public Map<String, Object> getIpGeolocation(@PathVariable String ip) {
        return ipApiService.getIpGeolocation(ip);
    }
}

