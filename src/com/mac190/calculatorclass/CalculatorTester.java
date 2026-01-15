package com.mac190.calculatorclass;

import java.util.Scanner;

public class CalculatorTester {
    public static void main(String[] args) {
        //create a scanner
        Scanner sc = new Scanner(System.in);
        char userChoice = 'y';
        Calculator calc = new Calculator();
        do {
            System.out.println("enter an expression in the form A + B:");
            //read a first double
            calc.first = sc.nextDouble();
            //read a character
            calc.oper = sc.next().charAt(0);
            //read the second double
            calc.second = sc.nextDouble();
            calc.evaluate();
            System.out.println("Do you want to continue[Y/N]: ");
            userChoice = sc.next().charAt(0);
        }while(Character.toLowerCase(userChoice) == 'y');

    }
}
