package com.AKS;

import java.util.Scanner;

public class miniProject {
    public static void main(String[] args) {
        //MINI PROJECT
        Scanner sc = new Scanner(System.in);
        int generatedNum = (int)(Math.random()*100);
        int UserNum = 0;
        int i = 0;
        do {
            System.out.print("Guess my number(1-100) : ");
            UserNum = sc.nextInt();

            if(UserNum == generatedNum) {
                System.out.println("WOOHOO .. CORRECT NUMBER!!!");
                break;
            }
            else if(UserNum > generatedNum) {
                System.out.println("your number is too large");
            }
            else {
                System.out.println("your number is too small");
            }
            i++;
        } while(UserNum >= 0);

        System.out.print("My number was : ");
        System.out.println(generatedNum);
        System.out.print("Total number of tries: ");
        System.out.println(i+1);
    }
}
