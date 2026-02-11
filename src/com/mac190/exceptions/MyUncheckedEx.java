package com.mac190.exceptions;

public class MyUncheckedEx extends RuntimeException{
    private int code;
    public MyUncheckedEx(int c, String s){
        super(s);
        code = c;
    }
    public String getMessage(){
        return "code: " + code + " msg: " + super.getMessage();
    }
}
