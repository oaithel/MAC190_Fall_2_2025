package com.mac190.loops;

import java.util.Scanner;

/*
Trace the following loop:
1. int i = 1;
2. int Total = 3;
3. while(i <= 3) {
4.    int j = 1;
5.    while(j <= i){
6.        Total = Total - j + i;
7.        j++;// j = j +1;
8.    }
9.    i++;
10. }
 Trace the loop, by hand
1. i = 1
2. Total = 3
3. while(1 <= 3) True
	4. j = 1
	5. while(1 <= 1) True
		6. Totsl = 3 - 1 + 1 = 3
		7. j = 1+1 = 2
	5. while(2 <= 1) false
	9.i = 1+1 = 2
3.while(2 <= 3) true
	4. j = 1
	5. while(1 <= 2) True
		6. Total = 3 - 1 + 2 = 4
		7. j = 1+1 = 2
	5. while(2 <= 2) True
		6. Total = 4 - 2 + 2 = 4
		7. j = 2+1 = 3
	5.while(3 <= 2) False
	9. i = 2+1 = 3
3.while(3 <= 3) True
	4. j = 1
	5. while(1 <= 3) True
		6. Total = 4 - 1 + 3 = 6
		7. j = 1+1 = 2
	5.while(2 <= 3) True
		6. Total = 6 - 2 + 3 = 7
		7. j = 2 + 1 = 3
	5. while(3 <= 3) True
		6. Total = 7 - 3 + 3 = 7
		7. j = 3+1 = 4
	5. while(4 <= 3) false
	9. i = 3+1 = 4
3. while(4 <= 3) false. END.

Write a java program that reads an integers from the user for
the number of lines to display. Then displays the lines
int the following shape:
Assume the input is 5.
*
**
***
****
*****

//For every line, think how many stars to display, display the stars using a loop
that displays one star at a time.
line (i loop)  stars (j)
0               1
1               2
2               3
3               4
4               5
i goes from 0 to line-1 (0-4)
j = i+1, j loops i+1 times and each time it displays one star.
 */
public class LoopsExample1 {
    public static void main(String[] args) {
        //create a scanner
        Scanner sc = new Scanner(System.in);
        //read the number of lines to display from the user
        System.out.println("Enter the number of lines ");
        int lines = sc.nextInt();
        //loop number of lines times (loop i) Use for loop
        for(int i = 0; i < lines; i++) {
            //loop i+1 times (loop j)
            for(int j=0; j< i+1; j++) {
                //display one start on the same line
                System.out.print("*");
            }
            // go to next line to display stars of the next line
            System.out.println("");
        }

        //TODO: HW2 add code to display the following shape
        /*

         *****
         ****
         ***
         **
         *

         If you can add th other shapes
             *    //4 spaces followed by 1 star (one loop for spaces, then after a loop for stars
            **   // 3 spaces followed by 2 stars
           ***   // 2 spaces,  3 stars
          ****    // 1 space 4 stars
         *****   //0 space 5 stars
         */

    }
}
