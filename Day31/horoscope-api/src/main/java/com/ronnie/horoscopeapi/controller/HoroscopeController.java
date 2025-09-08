package com.ronnie.horoscopeapi.controller;

import com.ronnie.horoscopeapi.service.HoroscopeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/horoscope")
public class HoroscopeController {

    @Autowired
    private HoroscopeService horoscopeService;

    @PostMapping
    public Map<String, Object> getHoroscope(@RequestParam String sign,
                                            @RequestParam(defaultValue = "today") String day) {
        return horoscopeService.getHoroscope(sign, day);
    }
}
