package Repl.Tasks04;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDiving {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float[] score = new float[7];
        //WRITE YOUR CODE HERE
        for (int i =0; i<7;i++){
            System.out.println("Enter score for judge"+(i+1)+":");
            score[i] = input.nextFloat();
        }

        float min = score[0];
        float max = score[0];
        float sum = 0;

        for (float each : score) {
            sum += each;
            if (each>max)max=each;
            if (each<min)min=each;
        }
        sum = sum -(min+max);

        System.out.println("Enter difficulty:");
        float difficulty = input.nextFloat();
        input.close();
        double total = sum*difficulty*0.6;


        // FINAL OUTPUT
        System.out.printf("Total: %.2f", +total);
    }
}
/*
        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
 */