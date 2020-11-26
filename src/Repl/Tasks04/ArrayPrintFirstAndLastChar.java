package Repl.Tasks04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPrintFirstAndLastChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};


        //TODO: Write your code below

        String[] firsAndLast = new String[words.length];

        for (int i = 0; i< words.length;i++){
            firsAndLast[i]=words[i].charAt(0)+""+words[i].charAt(words[i].length()-1);
        }
        System.out.println(Arrays.toString(firsAndLast));

    }
}
