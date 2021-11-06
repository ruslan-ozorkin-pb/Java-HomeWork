package com.pb.ozorkin.hw6;

import java.util.Objects;

public class Cat extends Animal {
    private String uniq1 = "paws";


   public Cat(String name, String food, String location) {
        super(name, food, location); }

    @Override
    public String toString() {
        return "Cat{" +
                "uniq1='" + uniq1 + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(uniq1, cat.uniq1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uniq1);
    }

    @Override
        public void makeNoise () {
            System.out.println("Cat makes meaow");
        }
        @Override
        public void eat () {
            System.out.println("Cat eat fish");
        }
        @Override
        public void sleep () {
            System.out.println("Cat fall asleep..");
        }

}
