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

        //Can I create an Animal out of a Dog?
        Animal A2 = (Animal) D1;
        System.out.println("A2: " + A2);
        A2.speak(); //Will cal speak of Dog because the object is a Dog
                    // in C++ it would call speak of Animal
        //I this going to work or not
        Dog D2 = (Dog) A2;//This works because A2 is a Dog
        System.out.println("D2: " + D2);
        //If youtry to make a Dog out of an Animal object, it will not work
       // Dog D3 = (Dog) A1; //This is not allowed, you cannot make a Dog out of Animal
        //System.out.println("D3: " + D3);

        Cat C1 = new Cat(3, "Gray", "yourCat");
        System.out.println("C1: " + C1);
        A2 = (Animal) C1;
        System.out.println("A2: " + A2);
        A2.speak();
        D2 = (Dog) A2; //You cannot make a Dog out of a Cat even if they
        //have the same attributes (In C++ it would work)
        System.out.println("D2: " + D2);
        //You canot make a bigger object from a smaller one
        //You cannot make an object of a class from a different class not related even if they
        //have the same attributes
        //You can make a smaller object from a derived object .

    }
}
