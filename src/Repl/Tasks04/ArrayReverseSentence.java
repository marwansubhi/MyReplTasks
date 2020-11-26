package Repl.Tasks04;

import java.util.Scanner;

public class ArrayReverseSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //TODO: Type your code below

        String[] arr = sentence.split(" ");
        for (int i =arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }

    }
}
