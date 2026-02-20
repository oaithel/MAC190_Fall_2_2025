package com.mac190.reviewfinal;
//Checked exception should always extend Exception
//Unchecked exception should extend RuntimeException
public class GameDataException extends Exception{
    public GameDataException(String s){
        super(s);
    }
}
