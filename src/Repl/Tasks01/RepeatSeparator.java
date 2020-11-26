package Repl.Tasks01;

import java.util.Scanner;

/*
Given two strings, word and a separator sep, return a big string made of count occurrences of the word,
separated by the separator string
 */
public class RepeatSeparator {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String word = scan.next();
//        String separator = scan.next();
//        int count = scan.nextInt();
//        String out = "";
//        for (int i = 1; i<=count-2;i++){
//            out += word+separator;
//        }
//        out+=word;
//        System.out.println(out);
       // for (int i =0; i<=100;i++) System.out.println(i);
       // for (int i =100; i>=0; i--) System.out.println(i);
//
//        for (int i =1; i<=20; i++){
//            if (i%3==0) System.out.println(i);
//        }

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine().toLowerCase();
        int count = 0;

        for (int i =1;i<=str.length(); i++){
            if (str.contains("hi")){
                str = str.replaceFirst("hi","");
                count++;
            }
        }
        System.out.println(count);

    }
}
