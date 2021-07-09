package com.AKS;

public class methods{
    public static void fact(){
        int factorial = 1;
        for(int i=1;i<=5;i++){
            factorial*=i;
        }
        System.out.println(factorial);
    }
    public static void main(String[] args){
        fact();
    }
}
