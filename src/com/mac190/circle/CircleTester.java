package com.mac190.circle;

import com.mac190.inheritance.ICircle;

public class CircleTester {
    public static void main(String[] args) {
        //create a default Point P1, display it
        Point P1 = new Point();
        System.out.println("P1: " + P1);
        //change it to 1, 3, display it
        P1.setXY(1, 3);
        System.out.println("P1: " + P1);
        //create a second point P2 with 2, 4, display it
        Point P2 = new Point(3, 5);
        System.out.println("P2: " + P2);
        //compute the distance between P1 and P2
        double d = P1.distance(P2);
        System.out.println("the ditance between P1 and P2 is: " + d);
        //Create P3 as the midpoint between P1 and P2 using the static method, display it
        Point P3 = Point.add(P1, P2);
        System.out.println("P3: " + P3);
        //create a Circle with P1 as the center and 4 radius, display it.
        ICircle C1 = new ICircle(P1, 4);
        System.out.println("C1: " + C1);
        //create a Circle C2 with P2 as the center and 5 as radius display it
        ICircle C2 = new ICircle(P2, 5);
        System.out.println("C2: " + C2);
        //add C2 to C1, display it.
        C1 = C1.add(C2);
        System.out.println("C1: " + C1);
        System.out.println("C1 same as C2? " + C1.equals(C2));
        System.out.println("C1 is same as P1? " + C1.equals(P3));
        System.out.println("C1 is same as P1? " + P3.equals(C1));
    }
}
