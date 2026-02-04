package com.mac190.animal;

import java.util.Objects;

/*
Derive a class Dog from Animal, knowing that a Dog is an Animal
and in addition it has, breed and its diet is Omnivore, and of Canine species.
- setters getters
- default constructor
- constructor that accepts any attribute needed.
- toString, equals
- speak method displays "Waf Waf !".
-Test your classes.
 */
public class Dog extends Animal implements iAnimal{
    private String breed;
    public Dog(){
        super();
        this.setSpecies("Canine");
        this.setDiet("Omnivore");
        this.breed = "N/A";
    }
    public Dog(int a, String c, String b){
        super(a, c, "Omnivore", "Canine");
        this.breed = b;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;//if o is not an instance of Dog return false
        //make a dog out of o
        Dog d = (Dog) o;
        if (!super.equals(d)) return false; //compare the Animals within the Dogs
        return this.breed.equals(d.breed);
    }

    public void speak(){
        System.out.println("Waf! Waf!");
    }

    @Override
    public String getBreed() {
        return breed;
    }

    @Override
    public void setBreed(String s) {
        breed = s;
    }
}
