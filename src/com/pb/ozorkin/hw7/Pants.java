package com.pb.ozorkin.hw7;

public class Pants extends Clothes implements ManClothes, WomenClothes {
    public Pants (Size size, String colour, int price) {
        super(size, colour, price);
    }

    @Override
    public void dressMan() {
        System.out.println("Pants " + getColour() + " colour " + getPrice() + " usd" + " size " + size.getEnumSize());

    }

    @Override
    public void dressWomen() {
        System.out.println("Pants " + getColour() + " colour " + getPrice() + " usd" + " size " + size.getEnumSize());

    }
//    public Pants(int size, String colour, int price) {
//        super(size, colour, price);
//    }
}
