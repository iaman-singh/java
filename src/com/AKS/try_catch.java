package com.AKS;

public class try_catch {
    public static void main(String[] args){
        // exception handling
        // exceptions are not like errors. we can catch exception
        // by handling them in code itself.

        int[] marks = {97,98,95}; //marks for three subs

        // Now if we want to print that element which is not present in array.
        //--> System.out.println(marks[5]);
        // the error is -->
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
        //	at com.AKS.try_catch.main(try_catch.java:10)

        try{
            System.out.println(marks[5]);
        } catch(Exception exception) {
            //do something after catching
        }
        System.out.println("Rest of the code");
    }
}
