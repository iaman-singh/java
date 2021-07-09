package com.AKS;

import java.util.Scanner;

public class conditional {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // pen = 10; notebook = 40;
        System.out.println("Enter cash available: ");
        int cash_aval = sc.nextInt();
        if(cash_aval<10){
            System.out.println("cannot buy anything");
        }
        else if(cash_aval>10 && cash_aval<40){
            System.out.println("Can buy one --> pen");
        }
        else if(cash_aval > 40 && cash_aval < 50){
            System.out.println("Can buy notebook");
        }
        else
            System.out.println("Can buy both, yayy!");
    }
}
