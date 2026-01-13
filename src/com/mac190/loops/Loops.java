package com.mac190.loops;

import java.util.Scanner;

/*
There are three different kind of loops: while, for and do-while.
All of them are basically the same. The more natural loop is the while loop.

initialization;
while(condition){
    statements;
    increment;
}
As long as the condition is true, execute statements. increment is anything that would
change the condition to false at some point otherwise you have an infinite.
Initialization is any intial value for the increment.
1. int i = 3;
2. int Total = 4;
3. while(i <= 9){
4.    Total = 2*Total/3 + i;
5.    i += 3;
}

What is initialization in this case? line 1. line 2 is not
an initialization because Total is not involved in the condition
What is the condition? i <= 9.
What is the increment? line 5. Not 4.
line 4 would be statements.

Trace the loop.
1. i = 3
2. Total = 4
3. while(3 <= 9) True
	4. Total = 2*4/3 + 3 = 2 + 3 = 5
	5. i = 6
3. while(6 <= 9) True
	4. Total = 2*5/3 + 6 = 3 + 6 = 9
	5. i = 6+3 = 9
3. while(9 <= 9) True
	4. Total = 2*9/3 + 9 = 6 + 9 = 15
	5. i = 9+3 = 12
3. while(12 <= 9) False, the loop stops

Write a java program that gets numbers from the user for as long as the input
is positive (the program will stop when the input is negative). Keep the count of
the number of even numbers

//read a first number into num.
//as long as num is positive
    //do what you need to do with the number(if even count it, if not skip it)
    //read a new number
 */
public class Loops {
    public static void main(String[] args) {
        int num;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        while(num >= 0) {
            //check if the number is even
            if(num%2 == 0){
                //count it.
                count++;
            }
            System.out.println("Enter a number: ");
            num = sc.nextInt();
        }
        //after the loop
        System.out.println("You entered " + count +" even numbers");
    }
}
