package com.pb.ozorkin.hw7;

public abstract class Clothes {
    protected Size size;
    private String colour;
    private int price;

    public Clothes(Size size, String colour, int price) {
        this.size = size;
        this.colour = colour;
        this.price = price;
    }

    public Size getSize() {
        return this.size;
    }

    public String getColour() {
        return this.colour;
    }

    public  int getPrice() {
        return this.price;
    }
}
