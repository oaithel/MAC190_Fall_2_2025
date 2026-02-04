package com.mac190.animal;
/*
An interface is an abstract class with only methods and no data.
It is used to interface between two codes
An interface can only be used with a class that implements it.
 */
public interface iAnimal {
    int getAge();
    void setAge(int a);
    void setDiet(String s);
    String getDiet();
    void speak();
    String getBreed();
    void setBreed(String s);
}
