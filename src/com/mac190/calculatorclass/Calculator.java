package com.mac190.calculatorclass;
/*
Change the calculator program to implement it as a class.
We need three member variables: two doubles and one character
One method to calculate and display the result.
 */
public class Calculator {
    private double first, second;
    private char oper;
    //getters
    public double getFirst(){
        return first;
    }
    public double getSecond(){
        return second;
    }
    public char getOper(){
        return oper;
    }
    //setters
    public void setFirst(double a){
        first = a;
    }
    public void setSecond(double a){
        second = a;
    }
    public void setOper(char c){
        oper = c;
    }
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
