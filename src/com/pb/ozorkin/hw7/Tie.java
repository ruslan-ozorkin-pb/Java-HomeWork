package com.pb.ozorkin.hw7;

public class Tie extends Clothes implements ManClothes{
    public Tie (Size size, String colour, int price) {
        super(size, colour, price);
    }

    @Override
    public void dressMan() {
        System.out.println("Tie " + getColour() + " colour " + getPrice() + " usd" + " size " + size.getEnumSize());
    }
}
