package com.ronnie.triviaapi.service;

import com.ronnie.triviaapi.model.TriviaQuetionModel;
import com.ronnie.triviaapi.model.TriviaResponseModel;
import org.springframework.web.client.RestTemplate;

public class TriviaService {

    private static final String TRIVIA_API_URL = "https://opentdb.com/api.php?amount=1";

    public TriviaQuetionModel getRandomTrivia() {
        RestTemplate restTemplate = new RestTemplate();
        TriviaResponseModel response = restTemplate.getForObject(TRIVIA_API_URL, TriviaResponseModel.class);

        if(response != null && response.getResults() != null && !response.getResults().isEmpty()){
            return response.getResults().get(0);
        }
        return null;
    }
}
