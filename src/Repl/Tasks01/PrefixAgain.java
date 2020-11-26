package Repl.Tasks01;
/*
Given a string, consider the prefix string made of the first n chars of the string.
Does that prefix string appear somewhere else in the string?
Assume that the string is not empty and that n is in the range from 1 till str.length().
 */
import java.util.Scanner;

public class PrefixAgain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();
        String portion = str.substring(0,n);
        int count = 0;
        while (str.contains(portion)){
            str = str.replaceFirst(portion,"");
            count++;
        }
        System.out.println("count = " + count);
        System.out.println( count>1);

    }
}
