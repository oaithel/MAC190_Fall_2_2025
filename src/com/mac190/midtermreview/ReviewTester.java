package com.mac190.midtermreview;

public class ReviewTester {
    public static void main(String[] args) {
        //create a Rectangle with 2, 4
        Rectangle R1 = new Rectangle(2, 4);
        System.out.println("R1: " + R1 + " R1.perim: " + R1.perim() + " R1.area : " + R1.area());
        Rectangle R2 = R1.add(new Rectangle(3, 5));
        System.out.println("R2: " + R2 + " R2.perim: " + R2.perim() + " R2.area : " + R2.area());
        Cube C1 = new Cube(R1, 6);
        System.out.println("C1: " + C1 + " C1.area : " + C1.area() + " C1.perim: " + C1.perim());
        //create a Cube with R1 + R2 as the base and 6 as the height
        Cube C2 = new Cube(R1.add(R2), 6);
        System.out.println("C2: " + C2 + " C2.area : " + C2.area() + " C2.perim: " + C2.perim());
        //create a Cube C3 that is the sum of C1 and C2 using the static add method
        Cube C3 = Cube.add(C1, C2);
        System.out.println("C3: " + C3 + " C3.area : " + C3.area() + " C3.perim: " + C3.perim());
    }
}
