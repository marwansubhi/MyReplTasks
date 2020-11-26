package Repl.Tasks00;

import java.util.Scanner;

public class VerifyContains {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();
        //WRITE YOUR CODE HERE

        boolean isContain = sentence.contains(word)?true:false;
        System.out.println(isContain);
    }
}
