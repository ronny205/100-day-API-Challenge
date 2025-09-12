package com.ronnie.memegenerator.model;

import lombok.Data;

@Data
public class MemeResponse {
    private String postLink;
    private String subreddit;
    private String title;
    private String url;
    private boolean nsfw;
    private boolean spoiler;
    private String author;
    private int ups;
    private int downs;
    private int score;
}
