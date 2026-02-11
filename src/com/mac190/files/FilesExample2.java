package com.mac190.files;

/*
Using notepad, create a file nam as you want.
Wite the folowing data to the file:

time 34.56  distance 20  date 2/3/2026

//write a program that opens the file and reads eachof the following
in a separate variable. the time, distance and date.

 */

import java.util.Scanner;
import java.io.*;
public class FilesExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name:");
        String fileName = sc.nextLine();
        //create a File object
        File inFile = new File(fileName);
        if(!inFile.exists()){
            System.out.println("The file does not exist");
            System.exit(1);
        }
        try{
            FileReader fr = new FileReader(inFile);
            Scanner scanFile = new Scanner(fr);
            while(scanFile.hasNext()){
                String t = scanFile.next();
                double time = scanFile.nextDouble();
                String d = scanFile.next();
                int distance = scanFile.nextInt();
                String dt = scanFile.next();
                String date = scanFile.nextLine();
                System.out.println("input: " + t + " " + time + " " + d +" " + distance +" " + dt + " " + date);
            }

        }catch(IOException e){
            System.out.println("Caught IOException: " + e.getMessage());
        }catch(Exception e){
            System.out.println("Exception: " + e.getMessage());
        }

    }
}
