package com.mac190.Temperature;

import java.util.Scanner;

public class TemperatureTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter C to convert from Celcius to Fahrenheit and F the other way: ");
        char choice = sc.next().charAt(0);
        System.out.println("Enter the temperature: ");
        Temperature temp = new Temperature();
        temp.setTemperature(sc.nextDouble());
        System.out.println("The temperature now is: " + temp.getTemperature());
        if (Character.toLowerCase(choice) == 'c') {
            temp.toFahrenheit();
        } else if (Character.toLowerCase(choice) == 'f') {
            temp.toCelcius();
        } else {
            System.out.println("Invlaid choice");
        }
    }
}
