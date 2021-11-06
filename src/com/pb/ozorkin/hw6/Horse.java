package com.pb.ozorkin.hw6;

import java.util.Objects;

public class Horse extends Animal {
    private String uniq3= "legs";
public Horse (String name, String food, String location) {
    super(name, food, location);
}
    @Override
    public void makeNoise() {
        System.out.println("Horse makes hrrr");
    }
    @Override
    public void eat() {
        System.out.println("Horse eat grass");
    }
    @Override
    public void sleep() {
        System.out.println( "Horse fall asleep...");
    }

    @Override
    public String toString() {
        return "Horse{" +
                "uniq3='" + uniq3 + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return Objects.equals(uniq3, horse.uniq3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uniq3);
    }
}

