package com.ronnie.triviaapi.model;

import java.util.List;

public class TriviaResponseModel {

    private int responseCode;
    private List<TriviaQuetionModel> results;

    public int getResponseCode(){
        return responseCode;
    }

    public void setResponseCode(int responseCode){
        this.responseCode = responseCode;
    }

    public List<TriviaQuetionModel> getResults() {
        return results;
    }
    public void setResults(List<TriviaQuetionModel> results) {
        this.results = results;
    }
}
