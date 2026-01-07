package com.mac190.intro;

public class Intro {
    public static void main(String[] args) {
        System.out.println("Welcome to Java!" + " It is going to be fun \n");
        //display a diamond of stars
        System.out.println("    *");
        System.out.println("  *   *");
        System.out.println("*       *");
        System.out.println("  *   *");
        System.out.println("    *");

        /*
        Display the following:
        empty line
        tab your first name tab your last name
         */
        System.out.println("\nProf\tOmar");
        int var = 2;
        int var1 = ++var;
        System.out.println("var: " + var + " var1: " + var1);
        int var2 = var1++;
        System.out.println("var2: " + var2 + " var1: " + var1);

    }
}
