package com.mac190.files;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
Input file is a file from which we want to read data.
It's an existing file already.
- Get the filename
- create a File object that allows you to check if the file exists
or not.
- if it exists, create a FileReader object using the File object
- Either you use BufferedReader or Scanner. I use Scanner, it's
easier to read
//example open the letter.txt file and display all the lines
 */
public class InputFiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name to read:");
        String fileName = sc.nextLine();
        //create a File object
        File inFile = new File(fileName);
        if(!inFile.exists()){
            System.out.println(fileName + " dos not exist!!");
            System.exit(1);
        }
        //use the try-catch block to read all the lines
        try{
            //create a FileReader
            FileReader fr = new FileReader(fileName);
            Scanner scanFile = new Scanner(fr);
            while(scanFile.hasNext()){
                String line = scanFile.nextLine();
                System.out.println(line);
            }
            scanFile.close();
        }catch(IOException e){
            System.out.println("Caught IO Exception: " + e.getMessage());
        }catch(Exception e){
            System.out.println("Caught IO Exception: " + e.getMessage());
        }
    }
}
