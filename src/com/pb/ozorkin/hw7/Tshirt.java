package com.pb.ozorkin.hw7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes {

    public Tshirt(Size size, String colour, int price) {
        super(size, colour, price);
    }

    @Override
    public void dressMan() {
        System.out.println("Tshirt " + getColour() + " colour " + getPrice() + " usd" + " size " + size.getEnumSize());

    }

    @Override
    public void dressWomen() {
        System.out.println("Tshirt " + getColour() + " colour " + getPrice() + " usd"  + " size " + size.getEnumSize());

    }
}
