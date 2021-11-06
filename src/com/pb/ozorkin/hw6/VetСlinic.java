package com.pb.ozorkin.hw6;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class VetСlinic {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        Cat animal1 = new Cat("Cat  ","fish  ", "europe");
        animal1.makeNoise(); animal1.eat();animal1.sleep();
        Dog animal2 = new Dog("Dog  ","meat  "  , "usa");
        animal2.makeNoise(); animal2.eat();animal2.sleep();
        Horse animal3 = new Horse("Horse  ","grass  ","asia");
        animal3.makeNoise(); animal3.eat();animal3.sleep();

        System.out.println("Hashcode1 " + animal1.hashCode());
        System.out.println("Hashcode2 " + animal2.hashCode());
        System.out.println("Hashcode3 " + animal3.hashCode());

        Animal[] animals = new Animal [] {animal1, animal2, animal3};
        Veterinarian veterinarian = new Veterinarian();

        for (Animal nextAnimal :animals ) {
            veterinarian.treatAnimal(nextAnimal);
        Class aClass = veterinarian.getClass();
        System.out.println(aClass.getName());
        System.out.println(Arrays.toString(aClass.getMethods()));
        System.out.println("--------------------------------");

        Class bClass = Class.forName("com.pb.ozorkin.hw6.Veterinarian");
        Constructor  constr = bClass.getConstructor(new Class [] {String.class});
        Object obj = constr.newInstance();
        if (obj instanceof Veterinarian) {
            for (Animal newAnimal : animals) {
                ((Veterinarian) obj).treatAnimal(newAnimal);
            }
        }


            }
    }
}






