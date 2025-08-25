package com.ronnie.launchapi.model;

import java.util.List;

public class LaunchResponse {

    private int count;
    private List<Launch> results;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Launch> getResults() {
        return results;
    }

    public void setResults(List<Launch> results) {
        this.results = results;
    }



}
