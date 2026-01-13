package com.mac190.selection;

import java.util.Scanner;

/*
Write a java program that converts a fahrenheit temperature into celcius and or
the other way around.
1- ask the user which conversion he/she wishes to make: Enter C for celcius to Fahrenheit
enter F for fahrenheit to celcius.
2- read the temperature from the user, depending on the which of the user
make the appropriate coversion, display it.

The switch statement is a different way of coding if-else. It works as follows
switch(variable){
    case value1:
        code1;
        break;
    case value2:
       code 2;
       break;
       .....
    default:
        The last else.
}
 */
public class Temperature {
    public static void main(String[] args) {
        char choice;
        double temperature;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter C to convert from Celcius to Fahrenheit and F the other way: ");
        choice = sc.next().charAt(0);
        System.out.println("Enter the temperature: ");
        temperature = sc.nextDouble();
        /*
        if(Character.toLowerCase(choice) == 'c'){
            double fah = (temperature*(9.0/5.0) + 32);
            System.out.println(temperature + " in celcius is " + fah + " in fahrenheit");
        }else if(Character.toLowerCase(choice) == 'f'){
            double celcius = (temperature - 32)*(5.0/9.0);
            System.out.println(temperature + " in fahrenheit is " + celcius + " in celcius");
        }else{
            System.out.println("Invlaid choice");
        }
        */
        //using a switch statement:
        switch(choice){
            case 'f':
            case 'F':
                double celcius = (temperature - 32)*(5.0/9.0);
                System.out.println(temperature + " in fahrenheit is " + celcius + " in celcius");
                break;
            case 'c':
            case 'C':
                double fah = (temperature*(9.0/5.0) + 32);
                System.out.println(temperature + " in celcius is " + fah + " in fahrenheit");
                break;
            default:
                System.out.println("Invalid choice");
        }

    }
}
