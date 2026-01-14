package com.mac190.secondorder;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
Write a java program that solves a second order equation in the form
aX^2 + bX + C = 0. a, b, and c coefficients are the inputs to your program.
if a is 0, then we have a first order equation, two cases for b:
    if b is 0, then we have two cases for c
        if c is 0 then (0 = 0), which has infinite number of silutions
        if c is not 0, then no solution
    if b is not 0, then it's a first order equation with one solution -c/b.
if a is not 0, then we compute D the dicriminant as D = b^2 - 4ac
    We have three cases:
    D is 0, then there is one double solution -b/2a
    D is larger than 0,we have two distinct solutions -b +- squareroot of D /2a
    D is negative, then no real solutions.
 */
public class SecondOrderEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char userChoice = 'y';
        do{
        System.out.println("Please enter the coefficients a, b, and c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if(a == 0) {
            if(b == 0){
                if(c == 0){
                    System.out.println("This is 0 = 0, infinite number of solutions");
                }else{
                    //c not 0
                    System.out.println("C = 0, no solution");
                }
            }else{
                //b is not 0
                System.out.println("This is a first order equation solution: "+ (-c/b));
            }
        }else{
            //a not 0
            //compute the discriminant
            double D = Math.pow(b, 2) - 4*a*c;
            if(D == 0){
                System.out.println("there is one double solution: " + (-b/(2*a)));
            }else if(D > 0) {
                double X1 = (-b + Math.sqrt(D))/(2*a);
                double X2 = (-b - Math.sqrt(D))/(2*a);
                System.out.println("there are two solutions: \nX1 = " + X1 + "\nX2 = " + X2);
            }else{
                //D < 0
                System.out.println("there are no solutions");
            }
        }
            System.out.println("Do you want to continue[Y/N]: ");
            userChoice = sc.next().charAt(0);
        }while(Character.toLowerCase(userChoice) == 'y');
    }
}
