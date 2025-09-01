package com.ronnie.exchangerate.controller;


import com.ronnie.exchangerate.service.ExchangeRateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

@RestController
public class ExchangeRateController {

    @Autowired
    private ExchangeRateService exchangeRateService;

    @GetMapping("/exchange-rate")
    public Map<String, Object> getExchangeRate(@RequestParam String base) {
        return exchangeRateService.getExchangeRate(base);
    }
}
