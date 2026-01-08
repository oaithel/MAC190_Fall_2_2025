package com.mac190.variables;

import java.math.BigDecimal;
import java.util.Scanner;

/*
A variable is a memory location associated with an identifier/name.
Variables have to be declared before used. To define a variable we use
type variableName = initialValue;
type is either a primitive type or a class. Primitive types: int, boolean, char, float,
double, short, long, ...
types that are classes: String, Double, Integer, Character, Float, BigDecimal, ...
variable names must not: start with a digit, contain a special character (space is one of them)
be one of the reserved words: public, private, class, static, void, main, if, else
while, do, import, ...
Do the following:

 */
public class Variables {
    public static void main(String[] args) {
        //define a variable to contain the number of students in the class
        //there are 20. Display it
        //define a variable to contain the change in your pockect
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the change in your pocket: ");
        float changeInPocket = sc.nextFloat();
        //you have $14 and 57 cents. Display it
        System.out.println("I have $" + changeInPocket + " in my pocket");
        //define a variable to contain your name, give your name. Display it
        System.out.println("Enter you entire name: ");
        //always empty the buffer before reading a string if you read a number first
        sc.nextLine();
        String name = sc.nextLine(); //will read everything including space
        System.out.println("My name is: " + name);
        //define a variable to contain a response of y for yes and n for no, the
        //answer is no. display it
        System.out.println("Enter you answer: ");
        char answer = sc.next().charAt(0);
        System.out.println("The answer is: " + answer);
        //define a variable to contain the dollar amount in your pocket, find it
        //from change in your pocket find it and display it
        //to extract the integer part of adouble we cast
        int dollarsInPocket = (int) changeInPocket;

        System.out.println("I have " + dollarsInPocket + " dollars in my pocket");
        //define a variable to contain the number of cents in your pocket. find it
        // from change in your pocket variable and display it
        int numberOfCents = (int)(((double)changeInPocket - dollarsInPocket)*100);
        System.out.println("I have " + numberOfCents + " cents in my pocket");
        //create a String with the variable of your name and tab and the variable
        // that  contains the answer (Y/N).
        String nameAnswer = name + "\t" + answer;
        System.out.println("nameAnswer is: " + nameAnswer);
    }

}
