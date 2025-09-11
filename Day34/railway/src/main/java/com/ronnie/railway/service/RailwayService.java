package com.ronnie.railway.service;

import com.ronnie.railway.model.TrainResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class RailwayService {

    @Value("${railway.api.key}")
    private String apiKey;

    @Value("${railway.api.url}")
    private String baseUrl;

    private final RestTemplate restTemplate = new RestTemplate();

    public TrainResponse getTrainDetails(String tainNumber) {
        String url = baseUrl + "/name-number/train/" + tainNumber + tainNumber
        Map response = restTemplate.getForObject(url, Map.class);

        TrainResponse train = new TrainResponse();
        train.setTrainName((String) response.get("train"));
        train.setTrainNumber(trainNumber);

        return train;
    }
}
