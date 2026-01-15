package com.mac190.calculatorclass;
/*
Change the calculator program to implement it as a class.
We need three member variables: two doubles and one character
One method to calculate and display the result.
 */
public class Calculator {
    double first, second;
    char oper;

    public void evaluate(){
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
    }
}
