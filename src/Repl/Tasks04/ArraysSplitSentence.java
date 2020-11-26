package Repl.Tasks04;

import java.util.Scanner;

public class ArraysSplitSentence {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //type your code below
        String[] arr = sentence.split(" ");
        for (int i =0; i<=arr.length-1;i++){
            System.out.println(arr[i]);
        }
    }
}
