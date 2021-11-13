package com.pb.ozorkin.hw7;

public class Skirt extends Clothes implements WomenClothes{
    public Skirt (Size size, String colour, int price) {
        super(size, colour, price);
    }

    @Override
    public void dressWomen() {
        System.out.println("Skirt " + getColour() + " colour " + getPrice() + " usd" + " size " + size.getEnumSize());
    }
}
