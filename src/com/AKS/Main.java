package com.AKS;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello world"); //print with ln prints a new line after output
        System.out.print("Hello java"); //only print doesn't print new line

        //variables

        String neighbour = "ankit";
        int age = 30;
        System.out.println(" ");


        //java types
        // 1. primitive type --> simple values
        byte height = 58; // byte - 1 [-128 to 128]
        int phone = 1234556789; // int - 4
        long phone2 = 123456789023L; // long - 8
        float pi = 3.14F; // float - 4
        char letter = 'a'; // char - 2
        double number = 4.6848835783678D; // double - 8
        boolean isAdult = true; // boolean - 1
        System.out.println(number);
        // non primitive types --> complex values
        String name = new String("aman");
        String name2 = new String("Ankit");

        // length
        System.out.println(name.length());
        System.out.println(name2.length());

        // concetenate
        String name3 = name + " and " + name2;
        System.out.println(name3);

        //char at
        System.out.println(name.charAt(1)); // will return char at position 1

        // replace
        String name4 = name.replace('a','c');
        System.out.println(name4);

        //sub string
        String demo = new String("aman and palak");
        System.out.println(demo.substring(5,8));


    }
}
