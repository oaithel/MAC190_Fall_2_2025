package com.mac190.exceptions;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class IntroExceptions {

    public static void throwMeAnUncheckedException(int a){
        if(a > 10){
            throw new IllegalArgumentException("not a good argument");
        }else if (a < 0){
            throw new MyUncheckedEx(10, "the value is less than 10");
        }else{
            System.out.println("No throwing!!");
        }
    }
    public static void throwMeCheckedException(int a) throws FileNotFoundException, MyCheckedEx{
        if(a > 10){
            throw new FileNotFoundException("not a good argument");
        }else if (a < 0){
            throw new MyCheckedEx(10, "the value is less than 10");
        }else{
            System.out.println("No throwing!!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        try {
            throwMeAnUncheckedException(num);
        }catch(IllegalArgumentException e){
            System.out.println("Illegal Argument: " + e.getMessage());
        }catch(MyUncheckedEx e){
            System.out.println("MyUnchecked: " + e.getMessage());
        }finally{ //finally will always execute.
            System.out.println("This will always execute no matter if there is an aexception or not");
        }
        try {
            throwMeCheckedException(num);
        } catch (FileNotFoundException e) {
            System.out.println("Caught FileNot found: " + e.getMessage());
        } catch (MyCheckedEx e) {
            System.out.println("Caught my checked exception: " + e.getMessage());
        }catch(Exception e){
            System.out.println("Caught Exception: " + e.getMessage());
        }

    }
}
