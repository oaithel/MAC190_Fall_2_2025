package com.mac190.midterm;

public class MidtermTester {
    public static void main(String[] args) {
        Device D1 = new Device("Apple", 90);
        System.out.println("D1: " + D1);
        Device D2 = new Device("Samsung");
        System.out.println("D2: " + D2);
        Device D3 = new Device(D2);
        System.out.println("D3: " + D3);
        Device D4 = Device.add(D1, D2);
        System.out.println("D4: " + D4);
        ISmartphone S1 = new ISmartphone(D2, 20);
        System.out.println("S1: " + S1);
        ISmartphone S2 = S1.add(new ISmartphone(D1, 50));
        System.out.println("S2: " + S2);

        //Use Addable interface to create a Addable that is the sum
        //of D1 and D2
        Addable AD1 = D1.add(D2);
        System.out.println("AD1: " + AD1);
        //Use Addable interface to create an Addable that is a sum
        //of D1 and S1, what happens? Why?
        Addable AD2 = D1.add(S1);
        System.out.println("AD2: " + AD2);
        // Use Addable interface to create an Addable that is the sum of
        //S1 and S2, display it
        Addable AD3 = S1.add(S2);
        System.out.println("AD3: " + AD3);
        //Use Addable interface to create an Addable that is the sum of
        //S2 and D2, what happens? Why?
        /*Avoid this one
        Addable AD4 = S2.add( D2);
        System.out.println("AD4: " + AD4);
        
         */

    }
}
