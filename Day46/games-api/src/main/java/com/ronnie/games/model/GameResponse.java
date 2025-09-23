package com.ronnie.games.model;

import lombok.Data;

@Data
public class GameResponse {
    private int id;
    private String name;
    private String released;
    private String background_image;
    private double rating;
}
