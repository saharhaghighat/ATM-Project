package com.none.exception;

public class AgeException extends RuntimeException{
    public static final String Message = "you are underage!";
    public AgeException(){
        super(Message);
    }
}