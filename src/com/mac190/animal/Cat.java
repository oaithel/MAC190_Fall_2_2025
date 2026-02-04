package com.mac190.animal;

public class Cat extends Animal{
    private String breed;
    public Cat(){
        super();
        this.setSpecies("Cats");
        this.setDiet("Carnivore");
        this.breed = "N/A";
    }
    public Cat(int a, String c, String b){
        super(a, c, "Carnivore", "Cats");
        this.breed = b;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;//if o is not an instance of Dog return false
        //make a dog out of o
        Cat c = (Cat) o;
        if (!super.equals(c)) return false; //compare the Animals within the Dogs
        return this.breed.equals(c.breed);
    }

    public void speak(){
        System.out.println("Meow! Meow!");
    }
}