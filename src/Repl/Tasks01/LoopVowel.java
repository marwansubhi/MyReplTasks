package Repl.Tasks01;
/*
Write a for loop that will loop through every letter of the input and print out just the vowels. Sample input/outputs
Vowel Letters are : i, e, a, u, o
 */
import java.util.Scanner;

public class LoopVowel {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below
        for (int i =0; i<word.length();i++){
            if (word.charAt(i)=='i'||word.charAt(i)=='u'||word.charAt(i)=='o'||word.charAt(i)=='e'||word.charAt(i)=='a'){
                System.out.print(word.charAt(i)+"");
            }
        }
    }
}
