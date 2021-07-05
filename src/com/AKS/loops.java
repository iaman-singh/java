package com.AKS;

import java.util.Scanner;

public class loops {
    public static void main(String[] args){
        //for loop

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = sc.nextInt();
        System.out.println("your table is below: ");
        for(int i=1; i<=10;i++){

            System.out.println(n*i);
        }

        //while loop
        int i = 1;
        while(i<=10){
            System.out.println(n*i);
            i++;
        }

        //do while loop --> it will run at least once
        do{
            System.out.println(n*i);
            i++;
        } while(i<=10);

    }
}
