package com.mac190.inputs;

import java.util.Scanner;

/*
To read data from the keyboard in java we use Scanner object.
- Create a Scanner object
- use the methods .nextInt() for integers, .nextDouble() to read a double etc..
 */
public class Input {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        System.out.println("enter an integer value: ");
        int val = keyb.nextInt();
        System.out.println("You entered: " + val);
        //.nextDouble for doubles .nextFloat for floats
        //.next() reads the text up to the first space (as in cin)
        //.nextLine() reads then entire line into a string
        //To read one character, we extract the first character of the first string
        //.next().charAt(0)
        //Change the previous program so that all the hardcoded values are input from
        //the user.
    }
}
