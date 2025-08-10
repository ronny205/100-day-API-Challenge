package com.ronnie.cryptoprices.controller;

import com.ronnie.cryptoprices.service.CryptoPriceService;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class CryptoPricesController {

    private final CryptoPriceService cryptoPriceService;

    public CryptoPricesController(CryptoPriceService cryptoPriceService){
        this.cryptoPriceService = cryptoPriceService;
    }

    public Map<String, Map<String, Double>> getPrices(){
        return cryptoPriceService.getCryptoPrices();
    }
}
