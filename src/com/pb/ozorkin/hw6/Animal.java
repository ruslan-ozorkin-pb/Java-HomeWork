package com.pb.ozorkin.hw6;

public class Animal {
    private String food;
    private String location;
    private String name;
    private String noise;



public Animal (String name, String food, String location){
    this.name = name;
    this.food = food;
    this.location= location;

    }

    public String getName(){
        return this.name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }
    public String getNoise() {
        return noise;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public void makeNoise() {
        System.out.println("создает звук");
    }
    public void eat() {
        System.out.println("ест" + food);
    }
    public void sleep() {
        System.out.println("спит");
    }


}
