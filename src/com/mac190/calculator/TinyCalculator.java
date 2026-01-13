package com.mac190.calculator;

import java.util.Scanner;

/*
Write a java program that accepts a string in the form A + B
A is a double followed by operator (*+-/) the another double.
and evaluates the expression.
-read the inputs as a double followed by a character followed by
another double.
Depending on the operator, perform the appropriate operation and display the result
Use a switch statement.
 */
public class TinyCalculator {
    public static void main(String[] args) {
        //create a scanner
        Scanner sc = new Scanner(System.in);
        char userChoice = 'y';
        do {
            System.out.println("enter an expression in the form A + B:");
            //read a first double
            double first = sc.nextDouble();
            //read a character
            char oper = sc.next().charAt(0);
            //read the second double
            double second = sc.nextDouble();
            double result = 0;
            switch (oper) {
                case '+':
                    result = first + second;
                    System.out.println(first + " + " + second + " = " + result);
                    break;
                case '-':
                    result = first - second;
                    System.out.println(first + " - " + second + " = " + result);
                    break;
                case '*':
                    result = first * second;
                    System.out.println(first + " * " + second + " = " + result);
                    break;
                case '/':
                    result = first / second;
                    System.out.println(first + " / " + second + " = " + result);
                    break;
                default:
                    System.out.println("Invalid operation");
            }
            System.out.println("Do you want to continue[Y/N]: ");
            userChoice = sc.next().charAt(0);
        }while(Character.toLowerCase(userChoice) == 'y');

    }
}
