package com.mac190.minmax;

public class MinMaxTester {
    public static void main(String[] args) {
        //create a default MinMax M1
        MinMax M1 = new MinMax();
        System.out.println("M1: "  + M1);
        //set it to 2, 4, display it
        M1.setMinMax(2, 4);
        System.out.println("M1: "  + M1);
        //create MinMax M2 with 3, 5, display it
        MinMax M2 = new MinMax(3, 5);
        System.out.println("M2: " + M2);
        //create a copy of M2 as M3, display it
        MinMax M3 = new MinMax(M2); //copy constructor
        System.out.println("M3: " + M3);
        //compare M2 and M3
        System.out.println("M2 is equal to M3? " + M2.equals(M3));
        //add 3 to M1
        M1.add(3);
        System.out.println("M1: " + M1); //M1 is not going to change because add does
        //not change the object on which it's invoked it returns a new object, use it
        //create M4 as M1 + M2 display it
        //to add 3 to M1 you do this:
        M1 = M1.add(3);
        System.out.println("M1: " + M1);
        //multiply M3 by -2, display it
        M3 = M3.multiply(-2);
        System.out.println("M3: " + M3);
        //Perform the following in one instruction M3 = 2*M1 + M2, display it
        M3 = (M1.multiply(2)).add(M2);
        System.out.println("M3: " + M3);
        //use the static method to add 4 to M1;
        M1 = MinMax.add(M1, 4);
        System.out.println("M1: " + M1);
        //use the static method to add M1 to M3
        M3 = MinMax.add(M1, M3);
        System.out.println("M3: " + M3);
    }
}
