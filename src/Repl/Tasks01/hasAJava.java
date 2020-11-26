package Repl.Tasks01;

import java.util.Scanner;

/*
Given a string word, print true if "java" appears starting at index 0 or 1 in the string,
such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The string may be any length, including 0word = .
 */
public class hasAJava {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        if (word.contains("java")){
            if (word.substring(0,4).equalsIgnoreCase("java")||word.substring(1,5).equalsIgnoreCase("java"))
                System.out.println(true);
            else if (word.length()>5&&word.substring(2).contains("java")) System.out.println(false);
        }else System.out.println(exists);
    }
}
