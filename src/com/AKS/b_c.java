package com.AKS;

public class b_c {
    public static void main(String[] args){
        //break
        // use to come out of the loop
        //continue
        //if we don't want to print only 3 in this loop,
        //we will continue it when i == 3
        int i = 0;
        while(true){
            if(i==3){
                i++; //this will make i = 4
                continue;
            }
            System.out.println(i);
            i++;
            if(i>10) break;
        }
    }
}
