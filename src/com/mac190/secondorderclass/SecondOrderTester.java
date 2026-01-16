package com.mac190.secondorderclass;

import java.util.Scanner;

public class SecondOrderTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char userChoice = 'y';
        SecondOrder second = new SecondOrder();
        do{
            System.out.println("Please enter the coefficients a, b, and c: ");
            second.setA(sc.nextDouble());
            second.setB(sc.nextDouble());
            second.setC(sc.nextDouble());
           //invoke solve() method
            second.solve();
            System.out.println("Do you want to continue[Y/N]: ");
            userChoice = sc.next().charAt(0);
        }while(Character.toLowerCase(userChoice) == 'y');
    }
}
