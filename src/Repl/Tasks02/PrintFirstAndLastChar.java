package Repl.Tasks02;
/*
Given a String array words, iterate through each word and print first and last letter of each element in separate lines.
 */

import java.util.Arrays;
import java.util.Scanner;

public class PrintFirstAndLastChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};

        // leave above code alone :)
        // assume you have String array of 5 items
        //and print first and last char of each items in one line

        //TODO: Write your code below

        System.out.println(Arrays.toString(words));

        int i = 0;
        while (i<words.length){
            System.out.println( words[i].charAt(0)+""+words[i].charAt(words[i].length()-1));
            i++;
        }


    }
}
