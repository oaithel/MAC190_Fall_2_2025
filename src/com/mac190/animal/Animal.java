package com.mac190.animal;

import java.util.Objects;

/*
Design a class Animal that has the following:
age, color, species, diet
- setters getters
- default constructor set age to 0 all strings to "N/A"
- Constructor that accepts all attributes
- toString, equals
- method speak() display don't know how to speak yet!
 */
abstract class Animal {
    private int age;
    private String color, species, diet;
    //default constructor
    public Animal(){
        age = 0;
        color = "N/A";
        species = "N/A";
        diet = "N/A";
    }
    public Animal(int a, String c, String d, String s){
        age = a;
        color = c;
        diet = d;
        species = s;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public String getDiet() {
        return diet;
    }
    public void setDiet(String diet) {
        this.diet = diet;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", color='" + color + '\'' +
                ", species='" + species + '\'' +
                ", diet='" + diet + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal animal)) return false;
        return age == animal.age && this.color.equals(animal.color) && species.equals(animal.species) && Objects.equals(diet, animal.diet);
    }
    /*
    Very often we don't know how a method will be implemented in a derived class.
    and we don't know how to implement it the base class, but we know it has t be there.
    The method is left unimplemented, but we force the derived class
    to implement. We define the method as abstract (no code).
    Example the speak method in Animal class.
    You can ahve as many abstract methods as you want in a class.
    If one method is abstract in a class then the class should be declared
    abstract.
     */
    abstract void speak();
}
