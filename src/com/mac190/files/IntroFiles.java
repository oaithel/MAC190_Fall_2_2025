package com.mac190.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IntroFiles {
    public static void main(String[] args) {
        //In Java there is object File, that allows you to manipulate files and
        //directories (rename, delete, move, see if it's a directory, is it a file
        // can it be executed, is it readable, find the path, the absolute path,
        //...
        File myFile = new File("C:\\Users\\b331-prof\\Documents");
        System.out.println("Isit a files? " + myFile.isFile());
        System.out.println("is it a directory? " + myFile.isDirectory());
        System.out.println("absolute path: "+ myFile.getAbsolutePath());
        //use myFile to create a text file, empty
       // String path = "C:\\Users\\b331-prof\\Documents\\test.txt";
        String path = "test.txt";
        File textFile = new File(path);
        System.out.println("test.txt exists? " + textFile.exists());
        if(!textFile.exists()){
            //create it
            //createFile may through an exception and it is a checked exception
            //therefore you need a try catch block, it's mandatory
            /*
            try {

                textFile.createNewFile();
                System.out.println("Created the file, test exist: " + textFile.exists());
            }catch(IOException e){
                System.out.println("Caught exception: " + e.getMessage());
                System.exit(1);
            }
            */

            //let's write some text into the file. For that you need to use a FileWriter
            //object and to make writing into the file even easier, you can create
            //bufferedWriter object that allows you to write strings directly into the file.
            //1- create a FileWriter object
            try {
                FileWriter fw = new FileWriter("test.txt");
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write("This is the first line\n");
                bw.write("This is the second line\n");
                bw.write("This is the third line.");
                bw.close();
                int var = 0;
                System.out.println("Dividong by 0 " + (5/var));

            }catch(IOException e){
               // e.printStackTrace();
                System.out.println("Caught exception: " + e.getMessage());
            }catch (Exception e){
                System.out.println("caught something else: " + e.getMessage());
                e.printStackTrace();
            }

        }

    }
}
