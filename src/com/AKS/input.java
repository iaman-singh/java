package com.AKS;

import java.util.Scanner;

public class input {
    public static void main(String[] args){
        //How to take input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println(age);

        System.out.println("Enter your weight: ");
        float weight = sc.nextFloat();
        System.out.println(weight);

        //taking string as input
        System.out.println("Enter your name: ");
        String name = sc.next(); //inputting single word
        System.out.println(name);

        System.out.println("Enter your address:");
        String ad = sc.nextLine(); //inputting whole sentence
        System.out.println(ad);
    }

}
