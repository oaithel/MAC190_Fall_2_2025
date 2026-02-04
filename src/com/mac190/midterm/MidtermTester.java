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
    }
}
