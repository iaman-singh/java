package com.AKS;
import java.util.Arrays;

public class arrays {
    public static void main(String[] args){
        //arrays
        int age = 30;
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 94;
        int total = marks[0] + marks[1] + marks[2];
        float average = (total/3F);
        System.out.println(total);
        System.out.println(average);

        //length of array
        System.out.println(marks.length);

        //sorting of arrays
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);

        //2d array

        int[][] finalMarks = {{90,98,95}, {98,94,92}};
        System.out.println(finalMarks[0][1]);

    }
}
