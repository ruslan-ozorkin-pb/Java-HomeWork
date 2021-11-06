package com.pb.ozorkin.hw6;

import java.util.Objects;

public class Dog extends Animal {
    private String uniq2="teeth";
    public Dog (String name, String food, String location) {
        super(name, food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println("Dog makes woof");
    }
    @Override
    public void eat() {
        System.out.println("Dog eat meat");
    }
    @Override
    public void sleep() {
        System.out.println( "Dog fall asleep...");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "uniq2='" + uniq2 + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(uniq2, dog.uniq2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uniq2);
    }
}

