package com.ronnie.railway.model;

import lombok.Data;

import java.util.List;

@Data
public class TrainResponse {

    private String trainName;
    private String trainNumber;
    private List<String> route;

    public List<String> getRoute() {
        return route;
    }

    public void setRoute(List<String> route) {
        this.route = route;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }


}
