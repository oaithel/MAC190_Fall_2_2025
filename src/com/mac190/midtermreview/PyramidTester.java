package com.mac190.midtermreview;

public class PyramidTester {
    public static void main(String[] args) {
        //create a Pyramid with a base Triangle that has a 2 as base and 4 as height,
        //and the height as 6 in one instruction using the constructor that accepts
        //a Triangle and pyramidHeight
        //NOT THIS ONE Pyramid P1 = new Pyramid(2, 4, 6);
        Pyramid P1 = new Pyramid(new Triangle(2, 4), 6);
        System.out.println("P1: " + P1);
        //create a Triangle with 3, 5
        Triangle T1 = new Triangle(3, 5);
        System.out.println("T1: " + T1);
        //create Triangle T2 that is the sum of T1 and the baseTriangle of Pyramid P1
        Triangle T2 = T1.add(P1.getBaseTriangle());
        System.out.println("T2: " + T2);


    }
}
