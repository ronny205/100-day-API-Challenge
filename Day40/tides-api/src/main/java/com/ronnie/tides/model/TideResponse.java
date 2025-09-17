package com.ronnie.tides.model;

import lombok.Data;
import java.util.List;

@Data
public class TideResponse {
    private List<Tide> extremes;
    private double stationLat;
    private double stationLon;

    @Data
    public static class Tide {
        private String type;
        private long date;   // epoch timestamp
        private double height;
    }
}
