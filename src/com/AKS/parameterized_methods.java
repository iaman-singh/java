package com.AKS;

import java.util.Scanner;

public class parameterized_methods {
    public static void printName(String name){
        System.out.println(name);
    }
    public static void addTwoNums(int a, int b){
        System.out.print("Addition of these two numbers is: ");
        System.out.println(a+b);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String yourName = sc.next();
        printName(yourName);
        addTwoNums(8,5);

    }
}
