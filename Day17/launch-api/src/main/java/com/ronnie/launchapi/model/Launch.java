package com.ronnie.launchapi.model;

public class Launch {
    private String id;
    private String name;
    private String window_start;
    private Status status;
    private Rocket rocket;
    private Pad pad;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWindow_start() {
        return window_start;
    }

    public void setWindow_start(String window_start) {
        this.window_start = window_start;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Rocket getRocket() {
        return rocket;
    }

    public void setRocket(Rocket rocket) {
        this.rocket = rocket;
    }

    public Pad getPad() {
        return pad;
    }

    public void setPad(Pad pad) {
        this.pad = pad;
    }



}
