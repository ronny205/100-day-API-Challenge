package com.ronnie.greeting.model;

public class User {
    private String name;
    private int age;
    private double height;
    private boolean active;

    public User(String name, int age, double height, boolean active){
        this.name = name;
        this.age = age;
        this.height = height;
        this.active = active;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public double getHeight(){
        return height;
    }

    public boolean getActive(){
        return active;
    }
}
