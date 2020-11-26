package Repl.Tasks03;

import java.util.Scanner;

public class ArrayReverseSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String reversed = "";
        //TODO: start your code here

        String [] arr = sentence.split(" ");
        for (int i =arr.length-1; i>=0;i--){
            reversed+=arr[i]+" ";

        }reversed=reversed.trim();



        //End your code here. do not modify below statement
        System.out.println(reversed);
    }
}
