package com.mac190.animal;

public class AnimalTester {
    public static void main(String[] args) {
        //create A default Animal
        Animal A1 = new Animal();
        System.out.println("A1: " + A1);
        A1.speak();
        A1.setDiet("Omnivore");
        A1.setSpecies("Canine");
        A1.setAge(4);
        A1.setColor("Gray");
        System.out.println("A1: " + A1);
        //make a Dog similar to A1
        Dog D1 = new Dog(4, "Gray", "Shiwawa");
        System.out.println("D1: " + D1);
        System.out.println("Is A1 same as D1? " + A1.equals(D1));//True (A Dog is an instance of Animal
        System.out.println("Is D1 same as A1? " + D1.equals(A1));//False A1 is not instance of Dog
    }
}
