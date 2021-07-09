package com.AKS;

public class try_catch2 {
    public static void main(String[] args){
        try{
            //code that may raise exception
            int data = 100/0;
        } catch(ArithmeticException exception){
            System.out.println(exception);
        }
        System.out.println("rest of the code");
    }
}
