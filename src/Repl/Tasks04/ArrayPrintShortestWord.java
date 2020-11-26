package Repl.Tasks04;

import java.util.Scanner;

public class ArrayPrintShortestWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(), scan.next(), scan.next(), scan.next()};
        //String [] str ={"aaa", "bbbbb", "wh", "longg" , "jaaaaavvaaaaaaaaaa"};

        // using regular loop
        String shortest = str[0];
        for (int i = 0; i <= str.length - 1; i++) {
            if (str[i].length() < shortest.length()) {
                shortest = str[i];
            }
        }
        System.out.println(shortest);

        // using for each loop
        for (String each : str) {
            if (each.length() < shortest.length()) {
                shortest = each;
            }

        }
        System.out.println(shortest);

    }
}
