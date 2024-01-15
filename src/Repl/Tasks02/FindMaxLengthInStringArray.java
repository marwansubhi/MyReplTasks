package Repl.Tasks02;

import java.util.Scanner;

public class FindMaxLengthInStringArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();

        }

       String brother =  "Hello Yousef";
        String man = "Hello Marwan";

        //write your code below

        String longWord = words[0];

        for (int i = 0;  i<words.length;i++){

            if (words[i].length()>longWord.length()){
                longWord = words[i];
            }
        }
        System.out.println(longWord);

    }
}
