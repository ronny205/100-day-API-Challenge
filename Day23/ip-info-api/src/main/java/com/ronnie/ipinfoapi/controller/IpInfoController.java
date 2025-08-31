package com.ronnie.ipinfoapi.controller;


import com.ronnie.ipinfoapi.model.IpInfo;
import com.ronnie.ipinfoapi.service.IpInfoService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ipinfo")
public class IpInfoController {

    private final IpInfoService ipInfoService;

    public IpInfoController(IpInfoService ipInfoService) {
        this.ipInfoService = ipInfoService;
    }

    @GetMapping("/{ip}")
    public IpInfo getIpDetails(@PathVariable String ip) {
        return ipInfoService.getIpDetails(ip);
    }
}
