package com.mac190.files;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
Wrte a java program that accepts the path and name to a file
and then reads user text for as long as the user type until the user
types in a dot on an empty line. Then the etxt is saved in the file.
Example:
Enter the file name:
C:\\Users\\b331-prof\\Documents\\letter.txt
Enter you text, end it with a dot on empty line:
Hello there,
this my text balbalab
sdlfhsdfhq
asfohof
. sfjghsjghsd
luhglSFG
.
Your text is saved in C:\\Users\\b331-prof\\Documents\\letter.txt
 */
public class FilesExample1 {
    public static void main(String[] args) {
        //create a Scanner
        Scanner sc = new Scanner(System.in);
        //create a string for the fileName
        //get the file name from the user
        System.out.println("enter the file name: ");
        String fileName = sc.nextLine();

        //use try and catch block
        try {
            //create a FileWriter using the FileName
            FileWriter fw = new FileWriter(fileName);
            //create a BufferedWriter using the fileWriter
            BufferedWriter bw = new BufferedWriter(fw);
            //go into a loop, for as long as the input line is not "."
            System.out.println("Enter your text, end it with dot on empty line:");
            String line = sc.nextLine();
            while (!(line.trim()).equals(".")) {
                //write the line to the file
                bw.write(line + "\n");
                //read a line and write it the the file add "\n"
                line = sc.nextLine();
            }
            //end of the loop, close the BufferedWriter.
            System.out.println("Writing your text to the file .....");
            bw.close();
        }catch(FileNotFoundException e){
            System.out.println("File Not foundException: " + e.getMessage());
        }catch(IOException e){
            System.out.println("IOException: " + e.getMessage());
        }catch(Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
