package com.mac190.reviewfinal2;

public class TransportTester {
    public static void main(String[] args) {
        Car a = new Car("Ford", "Focus", 10.0, 28.0);
        Car b = new Car("Ford", "Focus", 6.0, 24.0);
        Car combo = (Car) a.combine(b); // (1) combine a and b
        System.out.println("First Car Range: " + a.computeRange());
        System.out.println("Combined Car: " + combo);
        try {
            Ebike eb1 = new Ebike("Giant", "E+", 2.0, 15.0);
            Ebike eb2 = new Ebike("Specialized", "Turbo", 1.0, 18.0);
            Ebike mix = (Ebike) eb1.combine(eb2); // (2) combine eb1 and eb2
            System.out.println("Ebike Range: " + eb1.computeRange());
            System.out.println("Combined Ebike: " + mix);
            Ebike badEbike = new Ebike("Bad", "Zero", 0.0, 10.0); // (3) triggers exception
        } catch (PowerException e) { // (4) catch the correct exception
            System.out.println("Battery error detected.  " + e.getMessage());
        }
        try {
            Combinable errorTest = a.combine(new Ebike("UFO", "ScaryOne")); // (5) try illegal combine
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid combine operation. " + e.getMessage());
        }
    }

}
