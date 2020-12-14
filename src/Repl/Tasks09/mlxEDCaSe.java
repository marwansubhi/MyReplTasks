package Repl.Tasks09;

import java.util.Locale;
import java.util.Scanner;

public class mlxEDCaSe {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        //write your code below

        String str = "";

        for (int i = 0; i < s.length(); i++) {

            if (i % 2 == 0) {
                str += s.toLowerCase().substring(i, i + 1);
            }
            if (i % 2 != 0) {
                str += s.toUpperCase().substring(i , i + 1);
            }


        }
        System.out.println(str);


    }
}
