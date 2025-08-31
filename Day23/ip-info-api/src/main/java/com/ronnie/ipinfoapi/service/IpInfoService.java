package com.ronnie.ipinfoapi.service;


import com.ronnie.ipinfoapi.model.IpInfo;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class IpInfoService {

    private final String BASE_URL = "https://ipinfo.io/";

    public IpInfo getIpDetails(String ip) {
        String url = BASE_URL + ip + "/json";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, IpInfo.class);
    }
}
