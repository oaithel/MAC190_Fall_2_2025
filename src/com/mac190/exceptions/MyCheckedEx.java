package com.mac190.exceptions;

public class MyCheckedEx extends Exception{
    private int code;
    public MyCheckedEx(int c, String s){
        super(s);
        code = c;
    }
    public String getMessage(){
        return "code: " + code + " msg: " + super.getMessage();
    }
}
