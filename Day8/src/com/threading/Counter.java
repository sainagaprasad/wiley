package com.threading;

public class Counter {
    private int counter;
 
    public int getValue(){
        return counter;
    }
 
    public  int increment(){
        return counter++;
    }
}