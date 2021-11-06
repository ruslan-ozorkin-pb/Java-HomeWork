package com.pb.ozorkin.hw6;

public class Veterinarian {



   public String treatAnimal (Animal animal) {
       System.out.println("Ветеринар принимает " + animal.getName() + "который ест " + animal.getFood() + "из " + animal.getLocation());
//       this.treatAnimal();
       return this.treatAnimal();
    }

    public String treatAnimal() {
        return null;
    }
}

